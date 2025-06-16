package br.dev.matheus.tarefas.ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.sql.rowset.RowSetFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import br.dev.matheus.tarefas.dao.FuncionarioDAO;
import br.dev.matheus.tarefas.model.Funcionario;

public class FrameFuncionarioList {

	private JLabel labelTitulo;
	private JButton btnCadastro;
	private JTable tabelaFuncionarios;
	private JScrollPane scrollFuncionarios;
	private DefaultTableModel modelFuncionario;
	private String[] colunas = { "CODIGO", "NOME", "CARGO" };

	public FrameFuncionarioList() {	
		criarTela();
	}

	public void criarTela() {

		JFrame tela = new JFrame();
		tela.setSize(500, 500);
		tela.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		tela.setTitle("Listar Funcionarios");
		tela.setResizable(false);

		Container painel = tela.getContentPane();

		labelTitulo = new JLabel("Cadastro de Funcinarios");
		labelTitulo.setFont(new Font("Arial", Font.BOLD, 24));
		labelTitulo.setForeground(Color.RED);
		labelTitulo.setBounds(10, 10, 400, 40);

		modelFuncionario = new DefaultTableModel(colunas, 5) {
			@Override
			public boolean isCellEditable(int row, int column) {

				return false;
			}
		};

		tabelaFuncionarios = new JTable(modelFuncionario);
		tabelaFuncionarios.getTableHeader().setReorderingAllowed(false);
		scrollFuncionarios = new JScrollPane(tabelaFuncionarios);
		scrollFuncionarios.setBounds(10, 60, 470, 300);
		
		carregarDados();
		
		btnCadastro = new JButton("Cadastro");
		btnCadastro.setBounds(10, 380, 200, 40);
		
		btnCadastro.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				new FrameFuncionario(tela);
				carregarDados();
				
			}
		});
		
		

		painel.add(labelTitulo);
		painel.add(scrollFuncionarios);
		painel.add(btnCadastro);

		tela.setVisible(true);

	}
	
	private void carregarDados() {
		FuncionarioDAO dao = new FuncionarioDAO();
		List<Funcionario> funcionarios = dao.Listar();
		
		Object[][] dados = new Object[funcionarios.size()][3];
		
		int i = 0;
		for (Funcionario f : funcionarios) {
			dados[i][0] = f.getMatricula();
			dados[i][1] = f.getNome();
			dados[i][2] = f.getCargo();
			i++;
		}
		
		modelFuncionario.setDataVector(dados, colunas);
		
		
	}

}
