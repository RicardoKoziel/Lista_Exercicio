package Lista1;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		/* Ler quatro valores numéricos inteiros e apresentar o resultado dois a dois da adição e multiplicação entre os 
		valores lidos, baseando-se na utilização do conceito de propriedade distributiva. Dica: se forem lidas as variáveis 
		A, B, C e D, devem ser somados e multiplicados os valores de A com B, A com C e A com D; depois B com C, B 
		com D e por último C com D. Note que para cada operação serão utilizadas seis combinações. Assim sendo, 
		devem ser realizadas doze operações de processamento, sendo seis para as adições e seis para as 
		multiplicações. */

		
		Scanner sc = new Scanner (System.in);
		
		int numero[] = new int[4];
		
		for (int i = 0; i < 4; i++) {
			System.out.println("Digite o valor " + (i+1) + ": ");
			numero[i] = sc.nextInt();
		}
		
		System.out.println("----------------Resultado: ------------------");
		
		System.out.println("Valor 1 e Valor 2");
		System.out.println(" " + numero[0] + " + " + numero[1] + " = " + (numero[0]+ numero[1]));
		System.out.println(" " + numero[0] + " * " + numero[1] + " = " + (numero[0]* numero[1]));
		
		System.out.println("Valor 1 e Valor 3");
		System.out.println(" " + numero[0] + " + " + numero[2] + " = " + (numero[0]+ numero[2]));
		System.out.println(" " + numero[0] + " * " + numero[2] + " = " + (numero[0]* numero[2]));
		
		System.out.println("Valor 1 e Valor 4");
		System.out.println(" " + numero[0] + " + " + numero[3] + " = " + (numero[0]+ numero[3]));
		System.out.println(" " + numero[0] + " * " + numero[3] + " = " + (numero[0]* numero[3]));
		
		System.out.println("Valor 2 e Valor 3");
		System.out.println(" " + numero[1] + " + " + numero[2] + " = " + (numero[1]+ numero[2]));
		System.out.println(" " + numero[1] + " * " + numero[2] + " = " + (numero[1]* numero[2]));
		
		System.out.println("Valor 2 e Valor 4");
		System.out.println(" " + numero[1] + " + " + numero[3] + " = " + (numero[1]+ numero[3]));
		System.out.println(" " + numero[1] + " * " + numero[3] + " = " + (numero[1]* numero[3]));
		
		System.out.println("Valor 3 e Valor 4");
		System.out.println(" " + numero[2] + " + " + numero[3] + " = " + (numero[2]+ numero[3]));
		System.out.println(" " + numero[2] + " * " + numero[3] + " = " + (numero[2]* numero[3]));
		

	}

}
