package entities;

public abstract class Conta implements lConta {
	
	private int agencia;
	private int numero;
	private double saldo;
	private Cliente cliente;
	
	public Conta(int agencia, int numero, double saldo, Cliente cliente) {
		super();
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
		this.cliente = cliente;
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
	
	public void imprimirInfosComuns() {
	System.out.println(String.format("Cliente: %s", this.cliente.getNome()));
	System.out.println(String.format("Agência: %d", this.agencia));
	System.out.println(String.format("Número: %d", this.numero));
	System.out.println(String.format("Saldo: %.2f", this.saldo));
}
	
	

}

