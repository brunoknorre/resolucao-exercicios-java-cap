package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		/*
		 * 11. Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o
		 * preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário;
		 * */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double precoCusto, percentualVenda;
		
		System.out.println("Informe o preço de custo do produto");
		precoCusto = sc.nextDouble();
		
		System.out.println("Informe o percentual de acréscimo");
		percentualVenda = sc.nextDouble();
		
		System.out.println("Valor de venda: R$ "+((precoCusto*(percentualVenda/100))+precoCusto));
		
		sc.close();
	}

}
