package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		
		int numeroConta = 0, opcao = 0;
		String nomeTitular = "", deposito = "";
		double saldo = 0.00;
		Conta conta;
		
		System.out.println("Banco do Yuri");
		
		System.out.print("Digite o número da conta: ");
		numeroConta = scan.nextInt();
		
		System.out.print("Digite seu nome completo: ");
		nomeTitular = scan.next();
		
		do {
			
			System.out.print("Haverá deposito inicial? (\"sim\", \"nao\"): ");
			deposito = scan.next().toLowerCase();
			
			if(!deposito.equals("sim") && !deposito.equals("nao")) {
				System.out.println("Por favor, digite uma opção válida");
			}
			
		} while(!deposito.equals("sim") && !deposito.equals("nao"));
		
		if(deposito.equals("sim")) {
			System.out.print("Digite o saldo inicial: R$");
			saldo = scan.nextDouble();
			conta = new Conta(numeroConta, nomeTitular, saldo);
		}
		
		else {
			conta = new Conta(numeroConta, nomeTitular);
		}
		
				
		do {
			System.out.println("");
			System.out.println("Menu de opções: ");
			System.out.println("1) Fazer depósito de valor; ");
			System.out.println("2) Sacar valor; ");
			System.out.println("0) Sair da aplicação. ");
			System.out.println("");
			System.out.print("Digite a opção desejada: ");
			opcao = scan.nextInt();

			System.out.println("");
			
			switch(opcao) {
				case 1:
					System.out.print("Digite o valor do depósito: R$");
					saldo = scan.nextDouble();
					
					conta.deposito(saldo);
					break;
				case 2:
					System.out.print("Digite o valor do saque: R$");
					saldo = scan.nextDouble();
					
					conta.saque(saldo);
					break;
				case 0:
					System.out.println("Aplicação encerrada!");
					break;
				default:
					System.out.println("Digite uma opção válida!");
			}

			System.out.println("");

			System.out.println(conta.toString());
		} while(opcao != 0);
		
		scan.close();

	}

}
