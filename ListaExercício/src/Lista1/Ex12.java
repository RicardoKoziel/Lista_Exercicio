package Lista1;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int numero;
		System.out.println("Digite um número: ");
		numero = sc.nextInt();
		
		if (numero >= 0) {
			System.out.println("O módulo de " + numero + " é " + numero);
		}else {
			System.out.println("O módulo de " + numero + " é " + (numero * (-1)));
		}
	}

}
