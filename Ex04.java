package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		/*
		 * 4. Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas
	     * por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas
		 * efetuadas, informar o seu nome, o salário fixo e salário no final do mês;
		 * */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nomeVendedor;
		double salarioFixo, totalVendasMes, comissao;
		
		System.out.println("Por favor, digite seu nome: ");
		nomeVendedor = sc.nextLine();
		
		System.out.println("Informe o seu salário fixo: ");
		salarioFixo = sc.nextDouble();
		
		System.out.println("Informe o total de vendas no mês em dinheiro: ");
		totalVendasMes = sc.nextDouble();
		
		comissao = ((totalVendasMes*1.15) - totalVendasMes) + salarioFixo;
		
		System.out.println("Vendedor: "+nomeVendedor+" - Salário Fixo R$"+salarioFixo+" - Salário final do mês R$"+comissao);
		
		sc.close();
	}

}
