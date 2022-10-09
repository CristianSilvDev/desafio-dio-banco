package entities;

import java.util.ArrayList;
import java.util.Date;

public class Banco {
	
	private static ArrayList<Conta> contas = new ArrayList<>();

	public static ArrayList<Conta> getContas() {
		return contas;
	}
	
	// ADICIONAR UM CADASTRO NA LISTA 
	
	static public void adicionar(Conta l) {
		contas.add(l);
	}
	
	// LITAR O SALDO 
	
	public void listar() {
		for (Conta l: contas) {
			l.imprimirInfosComuns();
		}
	}
	

}
