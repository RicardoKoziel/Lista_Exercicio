package Lista1;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		/*Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa 
pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.*/
		
		Scanner sc = new Scanner(System.in);
		
		int idade, anos, meses, dias;
		
		
		System.out.println("Digite os anos: ");
		anos = sc.nextInt();
		System.out.println("Digite os meses: ");
		meses = sc.nextInt();
		System.out.println("Digite os dias: ");
		dias = sc.nextInt();
		
		idade = anos * 365 + meses * 30 + dias;
		
		System.out.println("Idade em dias = " + idade);
	}

}
