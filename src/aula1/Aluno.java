package aula1;

import aula2.AlunosInfo;
public class Aluno {
	
	public String nome;
	public short idade;
	public String genero;
	public String matricula;
	
	public void estudar() {
		System.out.println("O aluno "+ nome + " de idade " + idade + " é " + genero + " e sua matricula é " + matricula);
	}
	
	public void comer() {
		System.out.println("nao se esquece de comer");
	}
}
