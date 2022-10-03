package entities;

public interface lConta {
	
	public void sacar(double valor);
	
	public void depositar(double valor) ;
	
	public void transferir(double valor, Conta contaDestino);

	void imprimirExtrato();
}
