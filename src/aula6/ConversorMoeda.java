package aula6;

import java.util.Scanner;

public class ConversorMoeda {

	public static void main(String[] args) {
			
		Scanner leitura = new Scanner(System.in);
		
		System.out.println(" Insira o valor em real ");
		double  real = leitura.nextDouble();
				
		double dolar = real * 5 ;
		
		System.out.println(" Seu dinheiro resultante do cambio de real para dolar : " + dolar);
		
		leitura.close();
	}
}
