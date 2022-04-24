package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		/*
		 * 14. Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior;
		 * */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numA, numB;
		
		System.out.println("Digite um número inteiro");
		numA = sc.nextInt();
		
		System.out.println("Digite um número inteiro distinto do primeiro");
		numB = sc.nextInt();
		
		if(numA > numB) {
			System.out.println(numA+" é maior que "+numB);
		}else if(numB > numA) {
			System.out.println(numB+" é maior que "+numA);
		}else {
			System.out.println("Erro. Os números digitados são iguais.");
		}
		
		sc.close();
	}

}
