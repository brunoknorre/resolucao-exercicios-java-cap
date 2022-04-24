package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		/*
		 * 13. Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10;
		 * */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double numero;
		
		System.out.println("Digite um número");
		numero = sc.nextDouble();
		
		if(numero > 10) {
			System.out.println("Número digitado maior que 10");
		}
		
		sc.close();
	}

}
