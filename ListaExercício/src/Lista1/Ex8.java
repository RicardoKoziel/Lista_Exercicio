package Lista1;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		/*Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula: 
		V = 3.14159 * R * R * A 
		Onde as variáveis: V, R e A representam respectivamente o volume, o raio e a altura. */
		
		Scanner sc = new Scanner (System.in);
		
		double raio, altura, volume, pi = 3.14d;
		 
		
		System.out.println("Informe o raio da lata de óleo: ");
		raio = sc.nextDouble();
		System.out.println("Informe a altura da lata de óleo: ");
		altura = sc.nextDouble();
		
		volume = pi * (raio * raio) * altura;
		
		System.out.println("Volume da lata de óleo: " + volume);
	}

}
