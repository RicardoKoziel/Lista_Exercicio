package Lista1;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		/*Ler uma temperatura em graus Celsius e apresentá-Ia convertida em graus Fahrenheit. A fórmula de conversão de 
temperatura a ser utilizada é F = (9 * C + 160) / 5, em que a variável F representa é a temperatura em graus 
Fahrenheit e a variável C representa é a temperatura em graus Celsius. */
		
		Scanner sc = new Scanner(System.in);
		
		float celsius, fahrenheit;
		
		System.out.println("Digite uma temperatura em Celsius: ");
		celsius = sc.nextFloat();
		
		fahrenheit = (((9 * celsius) + 160) / 5); 
		
		System.out.println("A temperatura de " + celsius + "ºC em Fahrenheit é de: " + fahrenheit + "F");
	}
}
