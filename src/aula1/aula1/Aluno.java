package aula1;

public class Aluno {
	
	String nome;
	short idade;
	String genero;
	String matricula;
	
	
	void estudarFiap() {
		System.out.println("O aluno: " + nome + " de " + idade + " anos, sendo " + genero + " com a matricula de " + matricula + " n vai estudar.");
	}
	
	void comer(String comida) {
		System.out.println("Aluno comendo " + comida);
	}
}
