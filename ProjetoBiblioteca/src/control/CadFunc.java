package control;

/*import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
*/
import java.util.List;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Funcionario;
import model.Listas;
import view.TelaCadFunc;
public class CadFunc {

	public List<Funcionario> usuario = new ArrayList<>();
	TelaCadFunc tela = new TelaCadFunc();
	
	Listas lista = new Listas();
	public CadFunc() {

	}

	public void salvarLista (String jTextFieldNome, String jTextFieldNasc,
			String jTextFieldRG, String jTextFieldCPF, String jTextFieldEnder,
			String jTextFieldUsuario, String jTextFieldSenha, boolean isAdmin) {

		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome(jTextFieldNome);
		funcionario.setDataNasc(Integer.parseInt(jTextFieldNasc));
		funcionario.setRg(Integer.parseInt(jTextFieldRG));
		funcionario.setCpf(Integer.parseInt(jTextFieldCPF));
		funcionario.setEndereco(jTextFieldEnder);
		
		if (isAdmin) {
			funcionario.setUsuarioAdmin(jTextFieldUsuario);
			funcionario.setSenhaAdmin(jTextFieldSenha);
			System.out.println("Admin");
		}else{
			funcionario.setUsuarioOper(jTextFieldUsuario);
			funcionario.setSenhaOper(jTextFieldSenha);
			System.out.println("oper");
		}
		usuario.add(funcionario);
		
		JOptionPane.showMessageDialog(null, "Dados salvos com sucesso");
		System.out.println((funcionario.getUsuarioAdmin()+funcionario.getUsuarioOper()));
	}
}
