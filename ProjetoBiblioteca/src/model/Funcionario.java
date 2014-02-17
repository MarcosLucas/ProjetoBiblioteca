package model;

//import java.util.ArrayList;

import javax.swing.JTextField;

import view.TelaCadFunc;
/**
 * public static ArrayList<String> nome = new ArrayList<String>();
	public static ArrayList<String> dataNasc = new ArrayList<String>();
	public static ArrayList<String> rg = new ArrayList<String>();
	public static ArrayList<String> cpf = new ArrayList<String>();
	public static ArrayList<String> endereco = new ArrayList<String>();
	public static ArrayList<String> usuario = new ArrayList<String>();
	public static ArrayList<String> senha = new ArrayList<String>();
 * @author Lucas
 *
 */
public class Funcionario {
	
	private String nome;
	private int dataNasc;
	private int rg;
	private int cpf;
	private String endereco;
	private String usuarioAdmin;
	private String senhaAdmin;
	private String usuarioOper;
	private String senhaOper;
	private boolean isAdministrador;
	
	public Funcionario(String nome, int dataNasc, int rg, int cpf, String endereco, String usuario,
						String senha, boolean isAdministrador){
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.rg = rg;
		this.cpf = cpf;
		this.endereco = endereco;
		this.usuarioAdmin = usuario;
		this.senhaAdmin = senha;
		this.usuarioOper = usuario;
		this.senhaOper = senha;
		this.isAdministrador = isAdministrador;
	}
	
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDataNasc(){
		return dataNasc;
	}
	
	public void setDataNasc(int dataNasc) {
		this.dataNasc = dataNasc;
	}

	public int getRg(){
		return rg;
	}
	
	public void setRg(int rg) {
		this.rg = rg;
	}

	public int getCpf(){
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public String getEndereco(){
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getUsuarioAdmin(){
		return usuarioAdmin;
	}
	
	public void setUsuarioAdmin(String usuarioAdmin) {
		this.usuarioAdmin = usuarioAdmin;
	}

	public String getSenhaAdmin(){
		return senhaAdmin;
	}

	public void setSenhaAdmin(String senhaAdmin) {
		this.senhaAdmin = senhaAdmin;
	}
	
	public String getUsuarioOper(){
		return usuarioOper;
	}
	
	public void setUsuarioOper(String usuarioOper) {
		this.usuarioOper = usuarioOper;
	}

	public String getSenhaOper(){
		return senhaOper;
	}

	public void setSenhaOper(String senhaOper) {
		this.senhaOper = senhaOper;
	}

	public boolean isAdministrador() {
		return isAdministrador;
	}

	public void setAdministrador(boolean isAdministrador) {
		this.isAdministrador = isAdministrador;
	}
	
}
