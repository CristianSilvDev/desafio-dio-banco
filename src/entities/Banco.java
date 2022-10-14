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
	
	// LISTAR O SALDO 
	
	public static String listar() {
		String saida = "";
		int i = 1;
		for (Conta l: contas) {
			saida += "\n==== CONTA Nº " + (i++) + " ====\n";
			saida += l.imprimirInfosComuns() + "\n";
		}
		
		return saida;
	}
	
	public static String saldo() {
		String saldo = "";
		int i = 1;
		for (Conta l: contas) {
			saldo += "\n==== CONTA Nº " + (i++) + " ====\n";
			saldo += l.getSaldo() + "===\n";
		}
		return saldo;
	}
}
