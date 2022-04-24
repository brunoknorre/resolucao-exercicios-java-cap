package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		/*
		 * Faça um algoritmo que receba dois números e exiba o resultado da sua soma;
		 * 
		 * */
		
		Locale.setDefault(Locale.US);
		
		double numero1, numero2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o número 1: ");
		numero1 = sc.nextDouble();
		
		System.out.println("Informe o número 2: ");
		numero2 = sc.nextDouble();
		
		System.out.println("A soma de "+numero1+" com "+numero2+" é : "+(numero1+numero2));
		sc.close();
	}

}
