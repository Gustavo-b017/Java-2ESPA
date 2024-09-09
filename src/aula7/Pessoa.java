package aula7;

public class Pessoa {
	
	private int idade;
	private String nome;
	
	public Pessoa() {
		super();
	}


	public Pessoa(int idade, String nome) {
		super();
		this.idade = idade;
		this.nome = nome;
	}
	
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void imprimir() {
		System.out.println("O nome da pessoa é " + nome + "e a idade é " + idade);
	}
	
	public void imprimir(boolean tudoMaiuscula) {
		String texto = "O nome da pessoa é " + nome + " e a idade é " + idade;
		if(tudoMaiuscula) {
			System.out.println(texto.toUpperCase());
		}else {
			System.out.println(texto);
		}
		
	}
	
	
}
