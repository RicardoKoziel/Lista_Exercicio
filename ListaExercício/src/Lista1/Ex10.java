package Lista1;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		/* Escrever um programa que leia dois números inteiros e mostre todos os relacionamentos de ordem existentes 
entre eles. Os relacionamentos possíveis são: Igual, Não igual, Maior, Menor, Maior ou igual, Menor ou igual.*/
		
		Scanner sc = new Scanner (System.in);
		
		int numero1, numero2;
		boolean igual, maior, maiorOuIgual;
		
		System.out.println("Digite um número: ");
		numero1 = sc.nextInt();
		System.out.println("Digite outro número: ");
		numero2 = sc.nextInt();
		
		if(numero1 == numero2) igual = true;
		if(numero1 != numero2) igual = false;
		if(numero1 > numero2) maior = true;
		if(numero1 < numero2) maior = false;
		if(numero1 >= numero2) maiorOuIgual = true;
		if(numero1 <= numero2) maiorOuIgual = false;
		
	}

}
