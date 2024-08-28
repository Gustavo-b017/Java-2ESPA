package aula6;

import java.util.Scanner;

public class ConversorTemperatura {
	public static void main(String[] args) {
    
        Scanner leitura = new Scanner(System.in);
        
        
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = leitura.nextDouble();
        
        
        double fahrenheit = celsius * 9 / 5 + 32;
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
        
        
        leitura.close();
    }
}
