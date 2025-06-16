package br.dev.matheus.tarefas.ui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import br.dev.matheus.tarefas.model.Funcionario;
import br.dev.matheus.tarefas.model.ListaTarefas;

public class FrameTarefas {
	
	private JButton btnFuncionarios;
	private JButton btnTarefas;
	
	public FrameTarefas() {
		criarTela();
	}
	
	public void criarTela() {
		
		JFrame tela = new JFrame();
		tela.setSize(600, 400);
		tela.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		tela.setTitle("Gerenciador de Tarefas");
		tela.setResizable(false);
		
		Container painel = tela.getContentPane();
		
		
		
		btnFuncionarios = new JButton("Funcionarios");
		btnFuncionarios.setBounds(50, 150, 200, 40);
		btnFuncionarios.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				new FrameFuncionarioList();
				
				
				
			}
		});
		
		
		btnTarefas = new JButton("Tarefas");
		btnTarefas.setBounds(300, 150, 200, 40);
		btnTarefas.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//new (tela);
				//terminar configurações da tela ListarTarefas para que ele reconheça que ela existe
				
			}
		});
		
		painel.add(btnTarefas);
		painel.add(btnFuncionarios);
		
		
		tela.setVisible(true);
	}
	
}
