package view;

import java.awt.event.ActionEvent;

public class TelaAdmin extends javax.swing.JFrame {

	Login tela = new Login();
	public TelaAdmin() {
		initComponents();
	}

	/**
	 * Este método é chamado a partir do construtor para inicializar o formulário.
	 */
			void initComponents() {

		logoff = new javax.swing.JButton();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenuCadastro = new javax.swing.JMenu();
		jMenuItemAcervo = new javax.swing.JMenuItem();
		jMenuItemAluno = new javax.swing.JMenuItem();
		jMenuItemFuncionario = new javax.swing.JMenuItem();
		jMenuItemCurso = new javax.swing.JMenuItem();
		jMenuReserva = new javax.swing.JMenu();
		jMenuLocação = new javax.swing.JMenu();
		jMenuRenovacao = new javax.swing.JMenu();
		jMenuDevolucao = new javax.swing.JMenu();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		logoff.setText("LOGOFF");
		logoff.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				logoffActionPerformed(evt);
			}
		});
		
		jMenuItemFuncionario.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				funcionarioActionPerformed(evt);
			}
		});
		

		jMenuItemAluno.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				alunoActionPerformed(evt);
			}

			
		});
		jMenuCadastro.setText("Cadastro");
		jMenuItemAluno.setText("Aluno");
		jMenuItemAcervo.setText("Acervo");
		jMenuItemFuncionario.setText("Funcionario");
		jMenuItemCurso.setText("Curso");
		jMenuReserva.setText("Reserva");
		jMenuRenovacao.setText("Renovação");
		jMenuDevolucao.setText("Devolução");
		jMenuLocação.setText("Locação");		

		jMenuCadastro.add(jMenuItemAcervo);
		jMenuCadastro.add(jMenuItemAluno);
		jMenuCadastro.add(jMenuItemFuncionario);
		jMenuCadastro.add(jMenuItemCurso);
		jMenuBar1.add(jMenuCadastro);
		jMenuBar1.add(jMenuReserva);
		jMenuBar1.add(jMenuLocação);
		jMenuBar1.add(jMenuRenovacao);
		jMenuBar1.add(jMenuDevolucao);

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup()
						.addContainerGap(350, Short.MAX_VALUE)
						.addComponent(logoff,
								javax.swing.GroupLayout.PREFERRED_SIZE, 118,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(188, 188, 188)));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup()
						.addContainerGap(428, Short.MAX_VALUE)
						.addComponent(logoff,
								javax.swing.GroupLayout.PREFERRED_SIZE, 61,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(21, 21, 21)));

		pack();
	}// </editor-fold>

	private void logoffActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
		
		
		tela.setVisible(true);
	}

	private void alunoActionPerformed(ActionEvent evt) {
		this.dispose();
		TelaAluno tela = new TelaAluno();
		tela.setVisible(true);
		
	}
	private void funcionarioActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
		TelaCadFunc tela = new TelaCadFunc();
		tela.setVisible(true);
	}
	


	// Declaração Variáveis
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenu jMenuCadastro;
	private javax.swing.JMenu jMenuReserva;
	private javax.swing.JMenu jMenuLocação;
	private javax.swing.JMenu jMenuRenovacao;
	private javax.swing.JMenu jMenuDevolucao;
	private javax.swing.JMenuItem jMenuItemAcervo;
	private javax.swing.JMenuItem jMenuItemAluno;
	private javax.swing.JMenuItem jMenuItemCurso;
	private javax.swing.JMenuItem jMenuItemFuncionario;
		
	private javax.swing.JButton logoff;
	
}