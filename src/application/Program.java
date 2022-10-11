package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import entities.Banco;
import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Program {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("=======================================");
		System.out.println("             BANCO DIGITAL             ");
		System.out.println("=======================================");
		
		int menu;
		Banco ContaCorrente;
		do {
			exibirMenu();
			menu = sc.nextInt();

			switch (menu) {
			
			// CADASTRAR
			case 1:
				System.out.println("====> CADASTRO");
				System.out.println("PREENCHA OS DADOS ABAIXO: ");
				System.out.print("NOME: ");
				String nome = sc.next();
				System.out.print("CPF: ");
				float cpf = sc.nextFloat();
				System.out.print("DATA DE NASCIMENTO: ");
				Date data = sdf.parse(sc.next());
				System.out.println("CONTA CORRENTE OU CONTA POUPANÇA? [C/P]");
					char tipoDeConta = sc.next().toUpperCase().charAt(0);
					if (tipoDeConta == 'S') {
						
						//CRIAR OBJETO DA CLASSE
						Conta cc = new ContaCorrente(nome, cpf, data);
						
						//GUARDAR NO ARRAY
						Banco.adicionar(cc);
					} else {
						if (tipoDeConta == 'P') {
							// CRIAR OBJETO DA CLASSE
							Conta cp = new ContaPoupanca(nome, cpf, data);
							
							//GUARDAR NO ARRAY
							Banco.adicionar(cp);
						}
					}
				break;
				
			//VERIFICAR O SALDO NA CONTA DO CLIENTE
			case 2:
				System.out.println("====> LISTAGEM DE CONTAS ");
                System.out.println(Banco.listar());
				
				break;
				
			// PARA REALIZAR DEPÓSITO
			case 3:
				break;
				
			// PARA REALIZAR UMA TRANSFERÊNCIA
			case 4:
				break;
				
			// PARA O CLIENTE EXCLUIR CONTA
			case 5:
				break;
			default:
				System.out.println("OPÇÃO DE MENU INVÁLIDA");
			}
		} while(menu!=6);
}

	static void exibirMenu() throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====> SEJA BEM-VINDO(A) AO BANCO DIGITAL. QUAL OPERAÇÃO DESEJA REALIZAR? ");
		System.out.println("[1] - CADASTRAR");
		System.out.println("[2] - SALDO");
		System.out.println("[3] - DEPÓSITO");
		System.out.println("[4] - TRANSFERÊNCIA");
		System.out.println("[5] - EXCLUIR CONTA");
		System.out.println("[6] - SAIR");
	}
}
