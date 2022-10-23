package entities;

import java.util.Date;

public abstract class Conta extends Cliente implements lConta {
	
	protected static int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	private int agencia;
	private int numero;
	private double saldo;
	
	public Conta(String nome, float cpf, Date dataNascimento) {
		super(nome, cpf, dataNascimento);
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = 1+1;
	}


	public int getAgencia() {
		return agencia;
	}


	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}


	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}


	@Override
	public void depositar(double valor) {
		saldo += valor;
	}


	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	public String imprimirInfosComuns() {
		
		return "Cliente: " + this.getNome() + "\nAgência: " + this.agencia + "\nNúmero: " + this.numero + String.format("%.2f", this.saldo);
	//System.out.println(String.format("Cliente: ", this.getNome()));
	//System.out.println(String.format("Agência: ", this.agencia));
	//System.out.println(String.format("Número: ", this.numero));
	//System.out.printf(String.format("Saldo: %.2f", this.saldo));
}
	
	

}

