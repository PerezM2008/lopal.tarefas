package br.dev.matheus.tarefas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import br.dev.matheus.tarefas.dao.FuncionarioDAO;
import br.dev.matheus.tarefas.model.Funcionario;
import br.dev.matheus.tarefas.ui.FrameFuncionario;
import br.dev.matheus.tarefas.ui.FrameFuncionarioList;
import br.dev.matheus.tarefas.utils.Utils;

public class Main {
	
	private static String path = "c:\\Users\\25132972\\ProjetoTarefas\\tarefas.txt";

	public static void main(String[] args) {
		

		
		//new FrameFuncionario();
		
		new FrameFuncionarioList();
		
		FuncionarioDAO dao = new FuncionarioDAO();
		dao.Listar(); 
		
		List<Funcionario> funcionarios = dao.Listar();
		
		for(Funcionario f : funcionarios) {
			
			System.out.println(f.getNome());
			System.out.println(f.getCargo());
			System.out.println("----------");
		}
		
		
//		Funcionario f = new Funcionario();
//		f.setNome("Paulo");
//		f.setCargo("Programador Junior");
//		f.setSalario(4537);
//		
//		FuncionarioDAO dao = new FuncionarioDAO(f);
//		dao.gravar();
//		Funcionario f2 = new Funcionario("Maria da Silva");
//		System.out.println(f.getMatricula());
//		System.out.println(f2.getMatricula());
//		System.out.println(f.getNome());
//		System.out.println(f2.getNome());
//		
//		System.out.println(Utils.gerarUUID8());
//		
//		UUID matriculaUUID = UUID.randomUUID();
//		String matricula = matriculaUUID.toString();
//		String matricula8 = matricula.substring(0,8);
//		System.out.println(matricula8);
		
		//Funcionario funcionario1 = new Funcionario("Maria da Silva");
		//Funcionario funcionario2 = new Funcionario("Pedro Roberto");
		//Funcionario funcionario3 = new Funcionario("Alice Ribeiro");
		//Funcionario funcionario4 = new Funcionario("Cleiton Rocha");
		
		//funcionario2.setMatricula(9);
		//funcionario2.setNome("Maria da Silva");
		//funcionario2.setCargo("Gerente de TI");
		
		
		
//		System.out.println(funcionario1.toString());
//		System.out.println(funcionario2);
//		System.out.println(funcionario3);
//		System.out.println(funcionario4);
		
	}
	
//	private static void gravarArquivo() {
//		FileWriter fw = null;
//		BufferedWriter bw = null;
//		
//		try {
//			fw = new FileWriter(path, true);
//			bw = new BufferedWriter(fw);
//			
//			String novalinha = "Isso é uma nova linha!\n";
//			bw.write(novalinha);
//			bw.flush();
//		} catch (Exception erro) {
//			System.out.println(erro.getMessage());
//		}
//		
//	}
//	
//	private static void lerArquivo() {
//		FileReader fr = null;
//		BufferedReader br = null;
//		
//		try {
//			fr = new FileReader(path);
//			br = new BufferedReader(fr);
//			
//			String linha = br.readLine();
//			
//			while (linha != null) {
//				String registro[] = linha.split(";");
//				System.out.println("nome: " + registro[0]);
//				System.out.println("nome: " + registro[1]);
//				System.out.println("------------");
//				
//				linha = br.readLine();
//				
//			}
//			} catch (FileNotFoundException erro) {
//				}
//			}
		
		

}
