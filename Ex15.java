package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		/*
		 * 15. Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200;
		 * */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número qualquer");
		numero = sc.nextInt();
		
		if(numero >= 100 && numero <= 200) {
			System.out.println("O número digitado ("+numero+") está entre 100 e 200");
		}else {
			System.out.println("O número digitado ("+numero+") NÃO está entre 100 e 200");
		}
		
		sc.close();
	}

}
