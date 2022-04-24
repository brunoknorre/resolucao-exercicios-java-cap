package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		/*
		 * 17. Leia 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) e 150
		 * (inclusive)
		 * */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double numero;
		int aux = 0;
		
		for(int i = 1; i <= 80; i++) {
			System.out.println("Digite um número");
			numero = sc.nextDouble();
			
			if(numero >= 10 && numero <= 150) {
				aux += 1;
			}
		}
		
		System.out.println(aux+" números estão no intervalo entre 10 e 150");
		
		sc.close();
	}

}
