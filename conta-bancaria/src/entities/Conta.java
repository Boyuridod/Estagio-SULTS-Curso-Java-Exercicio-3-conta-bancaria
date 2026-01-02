package entities;

public class Conta {
	private int numeroConta;
	private String nomeTitular;
	private double saldo;

	public Conta(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		saldo = 0.00;
	}

	public Conta(int numeroConta, String nomeTitular, double saldo) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		deposito(saldo);
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double valor) {
		saldo += valor;
	}

	public void saque(double valor) {
		saldo -= (valor + 5);
	}

	public String toString() {
		return "Conta n°" + numeroConta + "\nSr(a): " + nomeTitular + "\nSaldo disponível: R$" + String.format("%.2f", saldo);
	}
}
