package main;

import java.util.ArrayList;
import java.util.List;

import model.ContaCorrente;
import view.ViewInit;

public class Inicio {
	
	static ViewInit frame;
	static List <ContaCorrente> clientes = new ArrayList<ContaCorrente>();
	
	public static void main(String[] args) {
		frame = new ViewInit();
		frame.setVisible(true);
	
	}
	
	public static void fecharJanelaCadastro(ContaCorrente p1) {
		clientes.add(p1);
	}
	public static List<ContaCorrente> getClientes(){
		return clientes;
	}
}
