package Lista1;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
//		Ler dois valores inteiros para as variáveis A e B, efetuar a troca dos valores de modo que a variável A passe a 
//		possuir o valor da variável B, e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados. 
		
		Scanner sc = new Scanner (System.in);
		
		int A, B, C = 0;
		
		System.out.println("Digite o valor de A: ");
		A = sc.nextInt();
		System.out.println("Digite o valor de B: ");
		B = sc.nextInt();
		
		C = A;
		A = B;
		B = C;

		System.out.println("A = " + A);
		System.out.println("B = " + B);
	}

}
