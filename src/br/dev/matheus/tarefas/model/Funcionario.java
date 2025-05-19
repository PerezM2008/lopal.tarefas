package br.dev.matheus.tarefas.model;

public class Funcionario {
	
	private String nome;
	private int matricula;
	private String cargo;
	
	// método construtor
	public Funcionario(String nome) {
		this.nome = nome;
	}
	
	//Contrutor Padrão / default
	public Funcionario() {
		
	}
	public Funcionario(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	public Funcionario(int matricula, String nome, String cargo) {
		this.matricula = matricula;
		this.nome = nome;
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	@Override
	public String toString() {
		String funcionario = matricula + "," + nome + "," + cargo;
		return funcionario;
	}
	

}
