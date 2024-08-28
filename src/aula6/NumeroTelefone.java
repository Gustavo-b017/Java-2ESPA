package aula6;

import java.util.Scanner;

public class NumeroTelefone {
	public static void main(String[] args) {
			
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Insira o seu telefone: ");
		String telefone = leitura.next();
	
		if ( telefone.length() == 11) {
			System.out.println("Telefone válido");
		}
		else {
			System.out.println("Telefone inválido");
		}
		leitura.close();
	}
}
