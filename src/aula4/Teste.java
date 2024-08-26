package aula4;

public class Teste {

	public static void main(String[] arg) {

		System.out.println("Iniciando aqui... \n");
		
		Calculadora calc = new Calculadora();
		calc.somar(10, 3);
		calc.somar(10, 3, 7);
		
		calc.subtrair(10, 3);
		calc.subtrair(10, 3, 1);
		
		calc.dividir(100, 3);
		calc.dividir(100, 3, 2);
		
		calc.multiplicar(10, 3);
		calc.multiplicar(10, 3, 2);
		
		calc.verificarParOuImpar(8);
		
		int valor1 = 10;
		int valor2 = 20;
		int valor3 = 30;
		
		if(valor1 == valor2) {
			System.out.println("o valor " + valor1 + " e " + valor2 + " é iguais");
		}
		if(valor1 != valor2) {
			System.out.println("o valor " + valor1 + " e " + valor2 + " é diferentes");
		}
		if(valor1 < valor2) {
			System.out.println("o valor " + valor1 + " e menor que o " + valor2 );
		}
		if(valor1 > valor2) {
			System.out.println("o valor " + valor1 + " e maior que o " + valor2 );
		}
		
		if(valor1 == valor2 && valor2 == valor3) {
			System.out.println("Todas as condicoes sao verdadeiras");
		}
		
		if(valor1 == valor2 || valor2 == valor3) {
			System.out.println("Uma das condicoes é verdadeiras");
		}
		
		// inverte o valor da funcao ( vdd -> falso; falso -> vdd)
		if(!(valor3 == valor2)) {
			System.out.println("condicao de negacao");
		}
	}
}
