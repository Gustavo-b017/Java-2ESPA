package aula6;

import java.util.Scanner;

public class CalcuradoraIMC {

	public static void main(String[] args) {
			
		Scanner leitura = new Scanner(System.in);
		
		System.out.println(" Insira seu peso em Kg ");
		double  peso = leitura.nextDouble();
		
		System.out.println(" Insira sua atura metros ");
		double  altura = leitura.nextDouble();
		
		double imc = peso /  Math.pow(altura, 2) ;
		
		System.out.println(" o IMC é : " + imc);
	
		leitura.close();
	}
}
