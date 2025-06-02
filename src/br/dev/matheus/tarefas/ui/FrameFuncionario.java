package br.dev.matheus.tarefas.ui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.PaintEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.dev.matheus.tarefas.dao.FuncionarioDAO;
import br.dev.matheus.tarefas.model.Funcionario;

public class FrameFuncionario {
	private JLabel labelMatricula;
	private JLabel labelNome;
	private JLabel labelCargo;
	private JLabel labelSalario;
	private JTextField txtMatricula;
	private JTextField txtNome;
	private JTextField txtCargo;
	private JTextField txtSalario;
	private JButton btnSalvar;
	private JButton btnSair;

	public FrameFuncionario(JFrame frame) {
		criarTela(frame);
	}

	private void criarTela(JFrame frame) {
		JDialog tela = new JDialog(frame, true);
		tela.setTitle("Cadastro");
		tela.setSize(400, 400);
		tela.setResizable(false);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		tela.setLocationRelativeTo(frame);

		Container painel = tela.getContentPane();

		labelMatricula = new JLabel("Matricula");
		labelMatricula.setBounds(10, 10, 200, 30);
		txtMatricula = new JTextField();
		txtMatricula.setBounds(10, 40, 150, 30);
		txtMatricula.setEnabled(false);

		labelNome = new JLabel("Nome:");
		labelNome.setBounds(10, 75, 200, 30);
		txtNome = new JTextField();
		txtNome.setBounds(10, 105, 200, 30);

		labelCargo = new JLabel("Cargo:");
		labelCargo.setBounds(10, 140, 200, 30);
		txtCargo = new JTextField();
		txtCargo.setBounds(10, 170, 200, 30);

		labelSalario = new JLabel("Salario:");
		labelSalario.setBounds(10, 205, 150, 30);
		txtSalario = new JTextField();
		txtSalario.setBounds(10, 235, 200, 30);

		btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(10, 280, 100, 40);
		btnSair = new JButton("Sair");
		btnSair.setBounds(120, 280, 100, 40);

		painel.add(labelMatricula);
		painel.add(txtMatricula);
		painel.add(labelNome);
		painel.add(txtNome);
		painel.add(labelCargo);
		painel.add(txtCargo);
		painel.add(labelSalario);
		painel.add(txtSalario);
		painel.add(btnSalvar);
		painel.add(btnSair);

		btnSair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(tela, "Confirma a saida do Sistema?");
				System.out.println("resposta");
				int resposta = JOptionPane.showConfirmDialog(tela, "Confirma a saída do sistema?");
				if (resposta == 0) {
					tela.dispose();
				}
			}
		});

		btnSalvar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Funcionario f = new Funcionario(txtCargo.getText(), txtNome.getText(),
						Double.parseDouble(txtSalario.getText()));
				FuncionarioDAO dao = new FuncionarioDAO(f);
				dao.gravar();
				JOptionPane.showMessageDialog(tela, txtNome.getText() + "\ngravado com sucesso!", "Sucesso",
						JOptionPane.INFORMATION_MESSAGE);
				limparFormulario();

			}
		});

		tela.setVisible(true);

	}

	private void limparFormulario() {
		txtNome.setText(null);
		txtCargo.setText(null);
		txtSalario.setText(null);
		txtNome.requestFocus();
	}

}
