package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		/*
		 * 2. Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação
		 * e a divisão  dos dois números lidos
		 * */
		
		Locale.setDefault(Locale.US);
		
		double numero1, numero2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o número 1: ");
		numero1 = sc.nextDouble();
		
		System.out.println("Informe o número 2: ");
		numero2 = sc.nextDouble();
		
		System.out.println("A soma de "+numero1+" com "+numero2+" é : "+(numero1+numero2));
		System.out.println("A subtração de "+numero1+" com "+numero2+" é : "+(numero1-numero2));
		System.out.println("A multiplicação de "+numero1+" com "+numero2+" é : "+(numero1*numero2));
		System.out.printf("A divisão de "+numero1+" com "+numero2+" é : %.2f",(numero1/numero2));
		
		sc.close();
	}

}
