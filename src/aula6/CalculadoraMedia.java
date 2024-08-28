package aula6;

import java.util.Scanner;

public class CalculadoraMedia {
	
	public static void main(String[] args) {
		
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println(" Insira a primeira nota ");
		double  nota1 = leitura.nextDouble();
		
		System.out.println(" Insira a segunda nota ");
		double  nota2 = leitura.nextDouble();
		
		System.out.println(" Insira a terceira nota ");
		double  nota3 = leitura.nextDouble();
		
		double media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println(" A média das notas é : " + media);
		
		leitura.close();
	}
}