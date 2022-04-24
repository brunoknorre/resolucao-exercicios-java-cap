package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		/*
		 * 7. Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de
		 * conversão é:F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius; 
		 * */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double temperaturaCelsius, temperaturaFahrenheit;
		
		System.out.println("Informe a temperatura em Celsius");
		temperaturaCelsius = sc.nextDouble();
		
		temperaturaFahrenheit = ((9*temperaturaCelsius)+160) / 5;
		
		System.out.println(temperaturaCelsius+"ºC convertido para Fahrenheit é "+temperaturaFahrenheit+"F");
		
		sc.close();
	}

}
