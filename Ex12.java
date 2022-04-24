package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		/*
		 * 12. O custo de um carro novo ao consumidor é a soma do custo de fábrica mais o percentual do distribuidor e
		 * dos impostos aplicados (primeiro os impostos são aplicados sobre o custo de fábrica, e depois o percentual
		 * do distribuidor sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos
		 * 45%, escreva um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do
		 * mesmo;
		 * */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double custoFabrica, percentualDistribuidor, impostos, valorFinal;
		
		// Equivale a 28%
		percentualDistribuidor = 1.28;
		// Equivale a 45%
		impostos = 1.45;
		
		System.out.println("Informe o custo de fábrica de um carro");
		custoFabrica = sc.nextDouble();
		
		valorFinal = (custoFabrica*impostos)*percentualDistribuidor;
		
		System.out.println("O valor do carro após os impostos serem aplicados é de R$ "+valorFinal);
		
		sc.close();
	}

}
