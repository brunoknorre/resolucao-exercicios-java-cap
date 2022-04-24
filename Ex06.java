package exercicios;

public class Ex06 {

	public static void main(String[] args) {
		
		/*
		 * 6. Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variávelA passe a
		 * possuir o valor da variável B e a variável B passe a possuir o valor da variável A. Apresentar os valores
		 * trocados
		 * */
		
		
		int a, b, aux;
		
		a = 10;
		b = 5;
		aux = 0;
		
		System.out.println("A = "+a+", B = "+b);
		System.out.println("===================");
		
		// aux = 5
		aux = b;
		// b = 10
		b = a;
		// a = 5
		a = aux;
		
		System.out.println("A = "+a+", B = "+b);
	}

}
