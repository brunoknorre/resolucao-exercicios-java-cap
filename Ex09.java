package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		/*
		 * 9. Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um
		 * mês.Considere fixo o juro da poupança em 0,07% a. m
		 * */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valorDepositado, juroPoupanca;
		
		// Equivale a 0.07%
		juroPoupanca = 0.0007;
		
		System.out.println("Digite o valor que foi depositado");
		valorDepositado = sc.nextDouble();
		
		System.out.println("O valor com rendimento após um mês será de R$ "+(valorDepositado*juroPoupanca+valorDepositado));
		
		sc.close();
	}

}
