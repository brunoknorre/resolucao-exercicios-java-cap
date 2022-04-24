package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		/*
		 * 16. Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre. Calcular a
		 * sua média (aritmética), informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e
		 * Recuperação (media entre 5.1 a 6.9);
		 * */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nomeAluno;
		double nota1, nota2, nota3, media;
		
		System.out.println("Olá, qual o seu nome?");
		nomeAluno = sc.nextLine();
		
		System.out.println("Informe a sua nota 1");
		nota1 = sc.nextDouble();
		
		System.out.println("Informe a sua nota 2");
		nota2 = sc.nextDouble();
		
		System.out.println("Informe a sua nota 3");
		nota3 = sc.nextDouble();
		
		media = (nota1 + nota2 + nota3)/3;
		
		if(media >= 7) {
			System.out.println(nomeAluno+" - APROVADO!");
		}else if (media > 5 && media < 7) {
			System.out.println(nomeAluno+" - RECUPERAÇÃO");
		}else {
			System.out.println(nomeAluno+" - REPROVADO!");
		}
		
		sc.close();
	}

}
