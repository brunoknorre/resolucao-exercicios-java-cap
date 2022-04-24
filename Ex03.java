package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		/*
		 * 3. Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância
		 * total percorrida pelo automóvel e o total de combustível gasto;
		 * */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double distanciaPercorrida, combustivelGasto, consumoMedio;
		
		System.out.println("Infomre a distância percorrida pelo automóvel: ");
		distanciaPercorrida = sc.nextDouble();
		
		System.out.println("Informe o total de combustível gasto: ");
		combustivelGasto = sc.nextDouble();
		
		consumoMedio = distanciaPercorrida/combustivelGasto;
		
		System.out.printf("O consumo médio é de %.2f",consumoMedio);
		
		sc.close();
	}

}
