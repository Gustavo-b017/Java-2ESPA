package aula1;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {	
		
		System.out.println("Iniciando aqui...");
		
		// para pegar info do terminal
		Scanner entrada = new  Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Fala o nome do animal");
		aluno.nome = entrada.next();
		
		System.out.println("Fala a matricula do animal");
		aluno.matricula=entrada.next();
		
		System.out.println("Fala o idade do animal");
		aluno.idade=entrada.nextShort();
		
		System.out.println("Fala o genero (biologico) do animal");
		aluno.genero=entrada.next();
		aluno.estudarFiap();
		aluno.comer("salada");
		
		
		Aluno nathan = new Aluno();
		nathan.nome="Nathan";
		nathan.matricula="XXXX";
		nathan.idade=99;
		nathan.genero="XXX";
		nathan.estudarFiap();
		nathan.comer("chocolate");
		
		
		Mesa mesa = new Mesa();
		mesa.altura = 100;
		mesa.comprimento = 300;
		mesa.largura = 100;
		mesa.cor="Branco";
		mesa.material="Madeira";
		mesa.apoiar();
		mesa.calcularArea();
		
		entrada.close();
		
		System.out.println("Finalizando aqui...");
		
	}

}
