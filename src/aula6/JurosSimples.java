package aula6;

import java.util.Scanner;

public class JurosSimples {
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println(" Insira o valor: ");
		double  valor = leitura.nextDouble();
		
		System.out.println(" Insira a taxa de juros: ");
		double  taxa = leitura.nextDouble();
			
		System.out.println(" Insira o número de anos: ");
		int  tempo = leitura.nextInt();
			
		double montante = valor * (1 + taxa * tempo);
			
		System.out.println(" Resultado do montante : " + montante);
		
		leitura.close();
			
	}
}
