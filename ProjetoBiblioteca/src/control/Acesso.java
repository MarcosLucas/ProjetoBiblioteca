package control;
/*
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
*/
import javax.swing.JOptionPane;
/*
import javax.swing.JPasswordField;
import javax.swing.JTextField;
*/
import view.Login;
import view.TelaAdmin;
import view.TelaOper;
import model.Listas;
import model.Funcionario;
import model.Usuario;
public class Acesso {

	Login login1 = new Login();
	TelaAdmin tela = new TelaAdmin();
	TelaOper telaOper = new TelaOper();
	Listas lista = new Listas();
	Usuario usuario = new Usuario();
	
	Funcionario funcionario = new Funcionario(null, 0, 0, 0, null, null, null, false);
	public Acesso() {
		funcionario.setUsuarioAdmin("admin");
		funcionario.setSenhaAdmin("admin");
		funcionario.setUsuarioOper("oper");
		funcionario.setSenhaOper("oper");
		//funcionario.set
	
	}
	
	public void entrar(String usuario, String senha) {
		System.out.println(usuario + " " + senha);
	//	for (int i = 0; i < usuario.length(); i++) {
			
			if (funcionario.getUsuarioAdmin().contains(usuario) == true) {
					funcionario.getUsuarioAdmin().indexOf(usuario);
					if (funcionario.getSenhaAdmin().equals(senha)) {
						
						tela.setVisible(true);	
				}		
			}else if (funcionario.getUsuarioOper().contains(usuario) == true) {
				funcionario.getUsuarioOper().indexOf(usuario);
					if (funcionario.getSenhaOper().equals(senha)) {
						telaOper.setVisible(true);
						System.out.println("menu do operador");
					}
					}else  {
				
						JOptionPane.showMessageDialog(null, "Usúario ou Senha Inválido");
						login1.setVisible(true);
					}
	//	}
	}
	/*public void abrirArquivo()
    {
		File arquivo = new File("Login.txt");
        try
        {
        if (!arquivo.exists()) {
        	//cria um arquivo (vazio)
        	arquivo.createNewFile();
        	System.out.println("entrou no if");
        	lista.admin.add("admin");
        	lista.senhaAdmin.add("admin");
        }
        
        
        }
        catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	
	public void escreverArquivo() {
		
		File arquivo = new File("Login.txt");
		try (FileWriter fw = new FileWriter(arquivo, true)) {
			BufferedWriter bw = new BufferedWriter(fw);
			for (int i = 0; i < lista.admin.size(); i++) {
				bw.write(lista.admin.get(i) + ",");
			}			
			bw.newLine();
			
			for (int i = 0; i < lista.senhaAdmin.size(); i++) {
				bw.write(lista.senhaAdmin.get(i)+ ",");
			}			
			bw.newLine();
			
			for (int i = 0; i < lista.oper.size(); i++) {
				bw.write(lista.oper.get(i)+ ",");
			}			
			bw.newLine();
			
			for (int i = 0; i < lista.senhaOper.size(); i++) {
				bw.write(lista.senhaOper.get(i)+ ",");
			}
			
			bw.flush();
			bw.close();
			fw.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}

	/*public void lerArquivo() {
		File arquivo = new File("Login.txt");
		try (FileReader fr = new FileReader(arquivo)) {
			BufferedReader br = new BufferedReader(fr);
						
			String [] aux = br.readLine().split(",");
			for (int i = 0; i < aux.length; i++) {
				lista.admin.add(aux[i]);
				System.out.println(lista.admin);
			}
			
			aux = br.readLine().split(",");
			for (int i = 0; i < aux.length; i++) {
				lista.senhaAdmin.add(aux[i]);
				System.out.println(lista.senhaAdmin);
			}
			
			aux = br.readLine().split(",");
			for (int i = 0; i < aux.length; i++) {
				lista.oper.add(aux[i]);
				System.out.println(lista.oper);
			}
			
			aux = br.readLine().split(",");
			for (int i = 0; i < aux.length; i++) {
				lista.senhaOper.add(aux[i]);
				System.out.println(lista.senhaOper);
			}
				
			br.close();
			fr.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}*/
	
}
