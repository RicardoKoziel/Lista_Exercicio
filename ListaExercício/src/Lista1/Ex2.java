package Lista1;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		//  Faça um programa que:
		//- Leia a cotação do dólar
		//- Leia um valor em dólares
		//- Converta esse valor para Real
		//- Mostre o resultado 

		
		Scanner sc = new Scanner (System.in);
		
		float dolar, reais = 0.0f;
		float cotacaoAtual = 4.82f;
		
		
		System.out.println("Digite um valor em dólar que deseja converter para real: ");
		dolar = sc.nextFloat();
		
		reais = dolar*cotacaoAtual;
		
		System.out.println("O valor de " + dolar + "dólares convertido para reais dá " + reais + "reais");
	}

}
