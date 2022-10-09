package entities;

import java.util.Date;

public class Cliente {
	protected String nome;
	private float cpf;
	private Date dataNascimento;
	

	public Cliente(String nome, float cpf, Date dataNascimento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getCpf() {
		return cpf;
	}

	public void setCpf(float cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	

}
