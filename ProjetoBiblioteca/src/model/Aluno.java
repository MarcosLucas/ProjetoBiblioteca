package model;

import java.util.ArrayList;

/**
 * public static ArrayList<String> nomeAluno = new ArrayList<String>();
	public static ArrayList<String> matricula = new ArrayList<String>();
	public static ArrayList<String> curso = new ArrayList<String>();
	public static ArrayList<String> rgAluno = new ArrayList<String>();
	public static ArrayList<String> cpfAluno = new ArrayList<String>();
	public static ArrayList<String> enderecoAluno = new ArrayList<String>();
	public static ArrayList<String> cidade = new ArrayList<String>();
	public static ArrayList<String> uf = new ArrayList<String>();
 * @author Lucas
 *
 */
public class Aluno {

	private String nomeAluno;
	private int matricula;
	private String curso;
	private int rgAluno;
	private int cpfAluno;
	private String enderecoAluno;
	private String cidade;
	private String uf;
	private String usuarioAluno;
	private String senhaAluno;
	
	public Aluno(String nomeAluno, int matricula, String curso, int rgAluno, 
			int cpfAluno, String enderecoAluno, String cidade, String uf, String usuarioAluno, String senhaAluno) {

		this.nomeAluno = nomeAluno;
		this.matricula = matricula;
		this.curso = curso;
		this.rgAluno = rgAluno;
		this.cpfAluno = cpfAluno;
		this.enderecoAluno = enderecoAluno;
		this.cidade = cidade;
		this.uf = uf;
		this.usuarioAluno = usuarioAluno;
		this.senhaAluno = senhaAluno;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getRgAluno() {
		return rgAluno;
	}

	public void setRgAluno(int rgAluno) {
		this.rgAluno = rgAluno;
	}

	public int getCpfAluno() {
		return cpfAluno;
	}

	public void setCpfAluno(int cpfAluno) {
		this.cpfAluno = cpfAluno;
	}

	public String getEnderecoAluno() {
		return enderecoAluno;
	}

	public void setEnderecoAluno(String enderecoAluno) {
		this.enderecoAluno = enderecoAluno;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getUsuarioAluno() {
		return usuarioAluno;
	}

	public void setUsuarioAluno(String usuarioAluno) {
		this.usuarioAluno = usuarioAluno;
	}

	public String getSenhaAluno() {
		return senhaAluno;
	}

	public void setSenhaAluno(String senhaAluno) {
		this.senhaAluno = senhaAluno;
	}

	
}
