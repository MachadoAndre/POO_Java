package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import main.Inicio;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewInit extends JFrame {

	private JPanel contentPane;
	
	public ViewInit() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);

		
		JLabel lblBancoUcs = new JLabel("Banco UCS");
		lblBancoUcs.setBounds(153, 11, 90, 37);
		contentPane.add(lblBancoUcs);
		
		JButton btnConsultaDados = new JButton("Consulta Dados");
		btnConsultaDados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ViewListaDados lista = new ViewListaDados(Inicio.getClientes());
				lista.setVisible(true);
			}
		});
		
		btnConsultaDados.setBounds(41, 86, 132, 23);
		contentPane.add(btnConsultaDados);
		
		JButton btnNovoDado = new JButton("Novo Dado");
		btnNovoDado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ViewCadastro viewCadastro = new ViewCadastro();
					viewCadastro.setVisible(true);
				} catch (Exception err) {
					err.printStackTrace();
				}		
			}
		});
		
		btnNovoDado.setBounds(210, 86, 132, 23);
		contentPane.add(btnNovoDado);
	}

}
