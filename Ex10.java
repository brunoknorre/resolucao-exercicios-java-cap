package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		/*
		 * 10. A Loja Mamão com Açúcar está vendendo seus produtos em5(cinco)prestações sem juros. Faça um
		 * algoritmo que receba um valor de uma compra e mostre o valor das prestações;
		 * */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valorCompra;
		
		System.out.println("Informe o valor da compra");
		valorCompra = sc.nextDouble();
		
		System.out.println("Compra no valor de R$ "+valorCompra+" com 5 parcelas fixas de R$ "+(valorCompra/5));
		
		sc.close();
	}

}
