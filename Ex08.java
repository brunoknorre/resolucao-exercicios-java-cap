package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		/*
		 * 8. Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em
		 * dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também aquantidade de dólares
		 * disponíveis com o usuário;
		 * */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double cotacaoDolar, dolaresUsuario;
		
		System.out.println("Informe a cotação atual do dólar em relação ao real");
		cotacaoDolar = sc.nextDouble();
		
		System.out.println("Informe a quantidade de dólares desejada para conversão");
		dolaresUsuario = sc.nextDouble();
		
		System.out.println("$ "+dolaresUsuario+" convertidos para real equilavem a R$ "+(dolaresUsuario*cotacaoDolar));
		
		sc.close();
	}

}
