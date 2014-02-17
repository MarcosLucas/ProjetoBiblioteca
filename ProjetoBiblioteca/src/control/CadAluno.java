package control;

import java.util.Arrays;

import model.Usuario;
import model.Aluno;
import view.TelaAluno;

public class CadAluno {

	TelaAluno tela = new TelaAluno();
	Usuario usuario = new Usuario();
	Aluno aluno;// = new Aluno(null, 0, null, 0, 0, null, null, null, null, null);
	public void salvarAluno(String jTextFieldMat, String jTextFieldNome,
			String jTextFieldCurso, String jTextFieldRg, String jTextFieldCPF,
			String jTextFieldEnder, String jTextFieldCidade, String jTextField1, String jTextFieldUsuarioAluno, String jTextFieldSenhaAluno) {
		aluno.setMatricula(Integer.parseInt(jTextFieldMat));
		aluno.setNomeAluno(jTextFieldNome);
		aluno.setCurso(jTextFieldCurso);
		aluno.setRgAluno(Integer.parseInt(jTextFieldRg));
		aluno.setCpfAluno(Integer.parseInt(jTextFieldCPF));
		aluno.setEnderecoAluno(jTextFieldEnder);
		aluno.setCidade(jTextFieldCidade);
		aluno.setUf(jTextField1);
		aluno.setUsuarioAluno(jTextFieldUsuarioAluno);
		aluno.setSenhaAluno(jTextFieldSenhaAluno);
		
		usuario.adicionaAluno(aluno);
		//System.out.println(Arrays.toString(usuario.toArray()));
	}
	
}
