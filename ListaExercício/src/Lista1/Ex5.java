package Lista1;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		/*Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz 
12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto na viagem e a velocidade média. 
Desta forma, será possível obter a distância percorrida com a fórmula DISTANCIA = TEMPO * VELOCIDADE. 
Tendo o valor da distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a 
fórmula: LITROS_USADOS = DISTANCIA / 12. O programa deve apresentar os valores da velocidade média, 
tempo gasto, a distância percorrida e a quantidade de litros utilizada na viagem. Dica: trabalhe com valores reais.*/
		
		Scanner sc  = new Scanner (System.in);
		int tempoGasto;
		double velocidadeMedia;
		
		System.out.println("Qual será a duração da viagem?");
		tempoGasto = sc.nextInt();
		System.out.println("E a velocidade média que andará?");
		velocidadeMedia = sc.nextDouble();
		
		double distancia = (tempoGasto * velocidadeMedia);
		double qtdLitrosViagem = (distancia / 12);
		
		System.out.println("Na velocidade média de: " + velocidadeMedia + " quilometros por hora");
		System.out.println("E com o tempo para chegar de " + tempoGasto + " horas");
		System.out.println("A distância percorrida será de " + distancia + " quilometros");
		System.out.println("E a quantidade de gasolina usada será de " + qtdLitrosViagem + " litros");
	}

}
