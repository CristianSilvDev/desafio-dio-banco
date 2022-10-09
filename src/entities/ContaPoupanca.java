package entities;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(Cliente cliente) {
		super(Cliente);
	}

	public void imprimirExtrato() {
		System.out.println("===Extrato Conta Poupanca ===");
		super.imprimirInfosComuns();
	}

}
