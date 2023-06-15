package Lista1;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		/*
		Faça um programa para pagamento de comissão de vendedores de peças, levando-se em consideração que sua 
		comissão será de 5% do total da venda e que você tem os seguintes dados: 
		- Identificação do vendedor 
		- Código da peça 
		- Preço unitário da peça 
		- Quantidade vendida 
		*/
		
		Scanner sc = new Scanner(System.in);

		float comissao = 0.05f;
		int codigoPeca;
		float precoUnitario;
		int qtdVendida;
		String nomeVendedor;
		float valorRecebidoVendedor;
		
		System.out.println("Qual o nome do vendedor que te atendeu? ");
		nomeVendedor = sc.nextLine();
		System.out.println("Código da peça: ");
		codigoPeca = sc.nextInt();
		System.out.println("Valor da peça: ");
		precoUnitario = sc.nextFloat();
		System.out.println("Quantas peças você vai levar? ");
		qtdVendida = sc.nextInt();
		
		valorRecebidoVendedor = (precoUnitario * qtdVendida) * comissao;
		
		System.out.println("O valor de comissão recebido pelo vendendor " + nomeVendedor + " foi de " + valorRecebidoVendedor + " reais");
		
	}

}
