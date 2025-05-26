package br.dev.matheus.tarefas.model;

import br.dev.matheus.tarefas.utils.Utils;

public class Funcionario {
	
	private String nome;
	private String matricula;
	private String cargo;
	private double salario;
	
	// método construtor
	public Funcionario(String nome) {
		this.nome = nome;
		this.matricula = Utils.gerarUUID8();
	}
	
	//Contrutor Padrão / default
	public Funcionario() {
		this.matricula = Utils.gerarUUID8();
		
	}
	public Funcionario(String nome, String cargo) {
		this.nome = nome;
		this.matricula = cargo;
		this.matricula = Utils.gerarUUID8();
	}
	public Funcionario(int matricula, String nome, String cargo, double salario) {
		//this.matricula = matricula;
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public Double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	@Override
	public String toString() {
		String funcionario = matricula + "," + nome + "," + cargo + "," + salario + "\n";
		return funcionario;
	}
	

}
