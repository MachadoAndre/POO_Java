package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import model.Cliente;
import model.ContaCorrente;

import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.border.BevelBorder;

public class ViewListaDados extends JFrame {

	private JPanel contentPane;

	public ViewListaDados(List<ContaCorrente> contas) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 807, 466);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				voltar();
			}
		});
		
		btnVoltar.setBounds(10, 11, 89, 23);
		contentPane.add(btnVoltar);
		
		int a = 46, b = 75, c = 696 , d = 23;
		// somar sempre 25 no b
		
		for(ContaCorrente conta : contas) {
			JLabel lbl = new JLabel("Nome: " + conta.getTitular().getNomeCompleto() + " CPF: " + conta.getTitular().getCpf() + " Contato: " + conta.getTitular().getTelefone() + " Data da Abertura:" + conta.getDataDeAbertura());
			lbl.setBounds(a,b,c,d);
			contentPane.add(lbl);
			b += 25;
		}
		
	}
	
	public void voltar() {
		this.setVisible(false);
	}
}
