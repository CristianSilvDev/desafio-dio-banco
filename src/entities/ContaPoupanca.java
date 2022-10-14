package entities;

import java.util.Date;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(String nome, float cpf, Date dataNascimento) {
		super(nome, cpf, dataNascimento);
		// TODO Auto-generated constructor stub
	}

	public void imprimirExtrato() {
		System.out.println("===Extrato Conta Poupanca ===");
		super.imprimirInfosComuns();
		System.out.println("CONTA POUPANÇA");
	}

}
