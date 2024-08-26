package aula3;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {	
		
		System.out.println("Iniciando aqui...");
		
		Scanner entrada = new Scanner(System.in);
		
		/*Aluno aluno = new Aluno();
		
		
		
		System.out.println("Digite o nome do aluno: ");
		aluno.nome = entrada.next();
		
		System.out.println("Digite o matricula do aluno: ");
		aluno.matricula=entrada.next();
		
		System.out.println("Digite o idade do aluno: ");
		aluno.idade=entrada.nextShort();
		
		System.out.println("Digite o genero do aluno: ");
		aluno.genero=entrada.next();
		
		aluno.estudar();
		aluno.comer("salada");
		aluno.imprimirAlunoFormatado();
		aluno.imprimirEmArquivo();
		
		
		Aluno nathan = new Aluno();
		
		System.out.println("Digite o nome do aluno: ");
		nathan.nome = entrada.next();
		
		System.out.println("Digite o matricula do aluno: ");
		nathan.matricula=entrada.next();
		
		System.out.println("Digite o idade do aluno: ");
		nathan.idade=entrada.nextShort();
		
		System.out.println("Digite o genero do aluno: ");
		nathan.genero=entrada.next();
		
		nathan.estudar();
		nathan.comer("chocolate");*/
		
		Mesa mesa = new Mesa();
		mesa.altura = 100;
		mesa.comprimento = 300;
		mesa.largura = 100;
		mesa.cor="Branco";
		
		mesa.material="Madeira";
		mesa.apoiar();
		mesa.calcularArea();
		String retorno = mesa.imprimirMaterialManipulado();
		System.out.println(retorno);
		
		entrada.close();
		
		System.out.println("Finalizando aqui...");
		
	}

}
