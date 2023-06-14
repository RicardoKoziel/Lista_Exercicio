package Lista1;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		//Calcule o estoque médio de peças.
		
		Scanner sc = new Scanner (System.in);
		int qtdMin, qtdMax, estoqueMedio;
		
		System.out.println("Qual a quantidade min: ");
		qtdMin = sc.nextInt();
		System.out.println("Qual a quantidade max: ");
		qtdMax = sc.nextInt();
		
		estoqueMedio = (qtdMin - qtdMax) / 2;
		
		System.out.println("Estoque médio de: " + estoqueMedio);
	}

}
