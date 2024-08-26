package aula4;

public class Calculadora {
	
	// somar
	public int somar(int a, int b) {
		int resultado = a + b;
		System.out.println("O resultado da soma é: " + resultado);
		return resultado;
	}
	
	public int somar(int a, int b, int c) {
		int resultado = a + b;
		resultado +=  c;
		System.out.println("O resultado da soma entre " + a + " e " + b + " , e depois outra soma com " + c + " é: " + resultado + "\n");
		return resultado;
	}
	
	public int subtrair(int a, int b) {
		int resultado = a - b;
		System.out.println("O resultado da subtracao é: " + resultado);
		return resultado;
	}
	
	public int subtrair(int a, int b, int c) {
		int resultado = a - b;
		resultado -=  c;
		System.out.println("O resultado da subtracao entre " + a + " e " + b + " , e depois outra subtracao com " + c + " é: " + resultado + "\n");
		return resultado;
	}
	
	public float dividir(float a, float b) {
		float resultado = a / b;
		System.out.println("O resultado da divisao é: " + resultado);
		return resultado;
	}
	
	public float dividir(float a, float b, float c) {
		float resultado = a / b;
		resultado /=  c;
		System.out.println("O resultado da divisao entre " + a + " e " + b + " , e depois outra divisao com " + c + " é: " + resultado + "\n");
		return resultado;
	}
	
	public int multiplicar(int a, int b) {
		int resultado = a * b;
		System.out.println("O resultado da multiplicacao é: " + resultado);
		return resultado;
	}
	
	public int multiplicar(int a, int b, int c) {
		int resultado = a * b;
		resultado *=  c;
		System.out.println("O resultado da multiplicacao entre " + a + " e " + b + " , e depois outra multiplicacao com " + c + " é: " + resultado + "\n");
		return resultado;
	}
	public void verificarParOuImpar(int valor) {
		if(valor % 2 == 0) {
			System.out.println("O nemero " + valor + " é par \n");
		}
		else {
			System.out.println("o numero " + valor + " é impar \n");
		}
	}
}
