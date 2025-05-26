package br.dev.matheus.tarefas.dao;

import java.io.IOException;

import br.dev.matheus.tarefas.factory.FileFactory;
import br.dev.matheus.tarefas.model.Funcionario;

public class FuncionarioDAO {
	
	private Funcionario funcionario;
	public FuncionarioDAO() {
	}
	public FuncionarioDAO(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	public void gravar() {
		try {
			FileFactory ff = new FileFactory();
			ff.getBufferedWriter().write(funcionario.toString());
			ff.getBufferedWriter().flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
