package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Cliente;
import entities.ContaCorrente;

public class Program {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		exibirMenu();
		
		Cliente cliente = new Cliente();
		//cristian.setNome("Cristian");
		
		//Conta cc = new ContaCorrente(cristian);
		//cc.depositar(100);
		//Conta cp = new ContaPoupanca(cristian);
		//cc.transferir(150, cp);
		
		//cc.imprimirExtrato();
		//cp.imprimirExtrato();
	}
	
	static void exibirMenu() throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("=======================================");
		System.out.println("             BANCO DIGITAL             ");
		System.out.println("=======================================");
		System.out.println("SEJA BEM-VINDO(A) AO BANCO DIGITAL. É A SUA PRIMEIRA VEZ AQUI?");
		char resp = sc.next().charAt(0);
		if (resp == 'S'){
			System.out.println("---------------------------------------------------");
			System.out.println("DIGITE SUAS INFORMAÇÕES PARA CRIARMOS SEU CADASTRO:");
			System.out.println("NOME: ");
			String nome = sc.next();
			System.out.println("CPF: ");
			float cpf = sc.nextFloat();
			System.out.println("DATA DE NASCIMENTO: ");
			Date data = sdf.parse(sc.next());
			System.out.println("CONTA CORRENTE OU CONTA POUPANÇA? [C/P]");
			char conta = sc.next().charAt(0);
		
		}
	}

}
