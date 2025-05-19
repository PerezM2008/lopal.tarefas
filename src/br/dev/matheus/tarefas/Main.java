package br.dev.matheus.tarefas;

import br.dev.matheus.tarefas.model.Funcionario;

public class Main {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario("Maria da Silva");
		Funcionario funcionario2 = new Funcionario("Pedro Roberto");
		Funcionario funcionario3 = new Funcionario("Alice Ribeiro");
		Funcionario funcionario4 = new Funcionario("Cleiton Rocha");
		
		System.out.println(funcionario1);
		System.out.println(funcionario2);
		System.out.println(funcionario3);
		System.out.println(funcionario4);
		

	}

}
