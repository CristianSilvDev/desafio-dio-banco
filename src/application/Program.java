package application;

import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Program {
	public static void main(String[] args) {
		Cliente cristian = new Cliente();
		cristian.setNome("Cristian");
		
		Conta cc = new ContaCorrente(cristian);
		cc.depositar(100);
		Conta cp = new ContaPoupanca(cristian);
		cc.transferir(150, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}

}
