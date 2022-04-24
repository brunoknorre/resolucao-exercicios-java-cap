package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		/*
		 * 5. Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre.
		 * No final informar o nome do aluno e a sua média (aritmética);
		 * */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nomeAluno;
		double nota1, nota2, nota3, media;
		
		System.out.println("Por favor, informe o seu nome");
		nomeAluno = sc.nextLine();
		
		System.out.println("Digite a sua nota 1");
		nota1 = sc.nextDouble();
		
		System.out.println("Digite a sua nota 2");
		nota2 = sc.nextDouble();
		
		System.out.println("Digite a sua nota 3");
		nota3 = sc.nextDouble();
		
		media = (nota1 + nota2 + nota3)/3;
		
		System.out.printf("Aluno: "+nomeAluno+" - média: %.1f",media);
		
		sc.close();
	}

}
