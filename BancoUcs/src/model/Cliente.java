package model;

public class Cliente {
	private String nome;
	private String sobreNome;
	private String cpf;
	private String telefone;
	private Double salario;
	
	public Cliente(String nome,String sobreNome,String cpf,String telefone,Double salario){
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.salario = salario;
	}
	
	//Getter's and Setter's
	public String getNomeCompleto() { return this.nome + " " +this.sobreNome; }
	public String getCpf() { return this.cpf; }
	public String getTelefone() { return this.telefone; }
	public Double getSalario() { return this.salario; }
	
	public void apresentacao() {
		System.out.println("Nome: "+this.nome);
	}
	
}
