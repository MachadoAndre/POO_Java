package view;

import java.awt.EventQueue;
import main.Inicio;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Cliente;
import model.ContaCorrente;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JTree;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtSobreNome;
	private JTextField txtCPF;
	private JTextField txtFone;
	private JTextField txtSalario;

	public ViewCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 544);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroDeDados = new JLabel("Cadastro de dados");
		lblCadastroDeDados.setBounds(187, 11, 122, 34);
		contentPane.add(lblCadastroDeDados);
		
		txtNome = new JTextField();
		txtNome.setBounds(98, 100, 212, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtSobreNome = new JTextField();
		txtSobreNome.setBounds(98, 168, 212, 20);
		contentPane.add(txtSobreNome);
		txtSobreNome.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(98, 78, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblSobrenome = new JLabel("Sobrenome:");
		lblSobrenome.setBounds(98, 143, 95, 14);
		contentPane.add(lblSobrenome);
		
		JRadioButton rdPessoaFisica = new JRadioButton("Pessoa Fisica");
		JRadioButton rdPessoaJuridica = new JRadioButton("Pessoa Juridica");
		
		
		rdPessoaFisica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdPessoaJuridica.setSelected(false);
			}
		});
		
		rdPessoaFisica.setBounds(98, 271, 109, 23);
		contentPane.add(rdPessoaFisica);
		
		rdPessoaJuridica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdPessoaFisica.setSelected(false);
			}
		});
		
		rdPessoaJuridica.setBounds(98, 297, 109, 23);
		contentPane.add(rdPessoaJuridica);
		
		JLabel lblCpfcnpj = new JLabel("CPF/CNPJ");
		lblCpfcnpj.setBounds(98, 204, 72, 14);
		contentPane.add(lblCpfcnpj);
		
		txtCPF = new JTextField();
		txtCPF.setBounds(98, 229, 211, 20);
		contentPane.add(txtCPF);
		txtCPF.setColumns(10);
		
		JLabel lblError = new JLabel("                       ");
		lblError.setBounds(98, 40, 329, 34);
		contentPane.add(lblError);
		this.setLocationRelativeTo(null);
		
		JButton btnSalvar = new JButton("Salvar");
		
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				screenLogic(lblError,rdPessoaFisica,rdPessoaJuridica);
			}
		});
		btnSalvar.setBounds(236, 471, 89, 23);
		contentPane.add(btnSalvar);
		
		JLabel lblTelephone = new JLabel("Telefone:");
		lblTelephone.setBounds(98, 331, 72, 20);
		contentPane.add(lblTelephone);
		
		txtFone = new JTextField();
		txtFone.setBounds(98, 362, 211, 20);
		contentPane.add(txtFone);
		txtFone.setColumns(10);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fecharJanela();
			}
		});
		btnVoltar.setBounds(338, 471, 89, 23);
		contentPane.add(btnVoltar);
		
		JLabel lblSalario = new JLabel("Salario:");
		lblSalario.setBounds(98, 405, 58, 20);
		contentPane.add(lblSalario);
		
		txtSalario = new JTextField();
		txtSalario.setBounds(98, 427, 211, 20);
		contentPane.add(txtSalario);
		txtSalario.setColumns(10);
		
	}
	
	private void fecharJanela() {
		this.setVisible(false);
	}
	private void screenLogic(JLabel err,JRadioButton op1,JRadioButton op2) {
			String nome = txtNome.getText().toString();
			String sobrenome = txtSobreNome.getText().toString();
			String cpf = txtCPF.getText().toString();
			String fone = txtFone.getText().toString();
			Double salario = Double.parseDouble(txtSalario.getText());
			
			boolean formularioValido = nome.length() > 2 && sobrenome.length() > 1 && cpf.length() > 5 && fone.length() > 5;
			boolean tipoPessoa = op1.isSelected() || op2.isSelected();
			
			if(formularioValido && tipoPessoa) {
				Cliente pessoa = new Cliente(nome,sobrenome,cpf,fone,salario);
				Inicio.fecharJanelaCadastro(new ContaCorrente(pessoa));
				fecharJanela();
			} else {
				err.setText("Dados Inválidos");
			}			
	}
}
