package model;

import java.util.ArrayList;

public class Usuario {
	public static ArrayList<Funcionario> lstFuncionario;
	public static ArrayList<Aluno> lstAluno;
	
	public Usuario() {
 
		
		this.lstFuncionario = new ArrayList<Funcionario>();
		this.lstAluno = new ArrayList<Aluno>();
	}

	public static ArrayList<Funcionario> getFuncionario() {
		return lstFuncionario;
	}

	public void adicionaFuncionario(Funcionario funcionario){
		this.lstFuncionario.add(funcionario);
	}

	public static ArrayList<Aluno> getAluno() {
		return lstAluno;
	}

	public void adicionaAluno(Aluno aluno){
		this.lstAluno.add(aluno);
	}
	
}
