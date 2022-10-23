package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Banco;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;
import entities.lConta;

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
			Conta objConta = null;
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
				
			//VERIFICAR A LISTA DE CONTAS EXISTENTES 
			case 2:
				System.out.println("====> LISTAGEM DE CONTAS ");
				if (! Banco.getContas().isEmpty()) {
					System.out.println(Banco.listar());
				} else
					System.out.println("NÃO HÁ CONTA CADASTRADA EM NOSSO SISTEMA");
				break;
				
			// PARA REALIZAR DEPÓSITO
			case 3:
				System.out.println("====> DEPÓSITO");
				System.out.println("DIGITE O VALOR DO DEPÓSITO");
				Double valorDeposito = sc.nextDouble();
				objConta.depositar(valorDeposito);
				
				
				break;
				
			case 4:
				// PARA REALIZAR UM SAQUE
				System.out.println("====> SAQUE");
				System.out.println("DIGITE O VALOR DO SAQUE");
				
				Double valorS = sc.nextDouble();
				objConta.sacar(valorS);
				break;
				
			// PARA O CLIENTE EXCLUIR CONTA
			case 5:
				break;
				
			case 6:
				System.out.println("====> SALDO");
				System.out.println("SALDO R$ " + Banco.saldo());
				break;
			case 7:
				System.out.println("ENCERRANDO A SESSÃO");
				break;
			default:
				System.out.println("OPÇÃO DE MENU INVÁLIDA");
			}
		} while(menu!=7);
}

	static void exibirMenu() throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====> SEJA BEM-VINDO(A) AO BANCO DIGITAL. QUAL OPERAÇÃO DESEJA REALIZAR? ");
		System.out.println("[1] - CADASTRAR");
		System.out.println("[2] - LISTAGEM DE CONTA");
		System.out.println("[3] - DEPÓSITO");
		System.out.println("[4] - SAQUE");
		System.out.println("[5] - EXCLUIR CONTA");
		System.out.println("[6] - SALDO");
		System.out.println("[7] - SAIR");
	}
}
