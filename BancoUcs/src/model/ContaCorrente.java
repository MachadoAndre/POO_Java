package model;

public class ContaCorrente {
	private Cliente titular;
	private static Integer numero = 0;
	private Double saldo;
	private Double limite;
	private Data dataDeAbertura = new Data();
	
	public ContaCorrente(Cliente cliente){
		this.titular = cliente;
		ContaCorrente.numero++;
		this.saldo = 0.0;
		this.limite = cliente.getSalario() * 0.5;
	}
	
	// Getter's e Setter's
	public String getDataDeAbertura() { return this.dataDeAbertura.getDataFormatada();  }
	public Cliente getTitular() { return this.titular; }
	public Double getLimite() { return this.limite; }
	
	public String depositar(Double valor) {
		this.saldo += valor;
		return "Depósito efetuado com sucesso.";
	}
	
	public boolean verificarSaldoParaMovimentacao(Double valor){
		if(valor <= (this.saldo + this.limite)) {
			return true;
		}
		return false;
	}
	
	public String saque(Double valor){
		if(this.verificarSaldoParaMovimentacao(valor)) {
			this.saldo -= valor;
			return "Saque de R$ " + valor + " efetuado com sucesso.";
		} 
		return "Saldo Insuficiente.";
	}
	
	public Double consultaSaldo() {
		return this.limite + this.saldo;
	}
	
	public String transfere(ContaCorrente conta, Double valor){
		if(this.verificarSaldoParaMovimentacao(valor)) {
			this.saldo -= valor;
			conta.saldo += valor;
			return "Transferencia efetuada com sucesso.";
		}
		return "Transferencia não executada.";
	}
}
