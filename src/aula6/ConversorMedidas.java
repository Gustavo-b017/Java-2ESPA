package aula6;

import java.util.Scanner;

public class ConversorMedidas {
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Insira a qauntidade em metros ");
		double metros = leitura.nextDouble();
		
		System.out.println("Insira para qual medida quer fazer ");
		System.out.println(" 	1 - polegada ");
		System.out.println(" 	2 - centimetro ");
		System.out.println(" 	3 - pes ");
		int escolha = leitura.nextShort();
		
		if(escolha == 1) {
			double polegada = metros / 0.0254;
			System.out.println(" A distancia de metros para polegadas é : " + polegada);
		}
		
		else if (escolha == 2) {
			double centimetro = metros * 100;
			System.out.println("A distancia de metros para centimetros é : " + centimetro);
		}

		else if (escolha == 3) {
			double pes = metros * 3.2808;
			System.out.println("A distancia de metros para pes é : " + pes);
		}
		
	
		leitura.close();
	}
	
}
