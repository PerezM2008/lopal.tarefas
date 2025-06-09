package br.dev.matheus.tarefas.ui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameTarefas {
	
	private JButton btnFuncionarios;
	private JButton btnTarefas;
	
	public FrameTarefas() {
		criarTela();
	}
	
	public void criarTela() {
		
		JFrame tela = new JFrame();
		tela.setSize(600, 600);
		tela.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		tela.setTitle("Gerenciador de Tarefas");
		tela.setResizable(false);
		
		//Container painel = tela.getContentPane();
		
		
		
		btnFuncionarios = new JButton("Funcionarios");
		btnFuncionarios.setBounds(50, 380, 200, 40);
		btnFuncionarios.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		btnTarefas = new JButton("Tarefas");
		btnTarefas.setBounds(80, 50, 70, 150);
		btnTarefas.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		
		
		tela.setVisible(true);
	}
	
}
