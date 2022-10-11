package entities;

import java.util.Date;

public class ContaCorrente extends Conta {
	public ContaCorrente(String nome, float cpf, Date dataNascimento) {
		super(nome, cpf, dataNascimento);
		// TODO Auto-generated constructor stub
	}

	public void imprimirExtrato() {
		System.out.println("===Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}

}
