package aula3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Aluno {
	
	String nome;
	short idade;
	String genero;
	String matricula;
	
	
	void estudar() {
		System.out.println("O aluno " + nome + " da idade " + idade + " e genero " + genero + " da matricula " + matricula + " está estudando.");
	}
	
	void comer(String comida) {
		System.out.println("Aluno comendo " + comida);
	}
	
	void imprimirAlunoFormatado() {
		System.out.printf("O aluno %s da idade %d e genero %s da matricula %s está estudando. %n", nome, idade, genero, matricula);
	}
	
	void imprimirEmArquivo() {
		
		try {
			PrintWriter impressao = new PrintWriter(new FileWriter("aluno.txt"));
			impressao.println("O aluno " + nome + " da idade " + idade + " e genero " + genero + " da matricula " + matricula + " está estudando.");
			impressao.printf("O aluno %s da idade %d e genero %s da matricula %s está estudando. %n", nome, idade, genero, matricula);
			impressao.close();
		} catch (IOException e) {
			System.out.println("Erro ao gerar arquivo");
		}
		
		
	}
	
	void imprimir(String...parametros) {
		// método com entrada de vários parametros
	}
}
