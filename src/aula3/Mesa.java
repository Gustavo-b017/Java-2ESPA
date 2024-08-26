package aula3;

public class Mesa {
	
	String cor;
	String material;
	short largura;
	short altura;
	short comprimento;
	
	void apoiar() {
		System.out.println("A cor " + cor);
	}
	
	void calcularArea() {
		int resultado = largura * comprimento;
		System.out.println("o comprimento é: " + resultado);
	}
	
	String imprimirMaterialManipulado() {
		
		String retorno = "A cor da mesa é " + cor + " e o material é " + material;
		
		// Deixar todo o texto em caixa baixa
		retorno = retorno.toLowerCase();
		
		return retorno;
	}

}
