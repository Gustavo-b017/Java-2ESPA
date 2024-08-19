package aula1;

public class Teste {

	public static void main(String[] args) {	
		
		System.out.println("Iniciando aqui...");
		
		Aluno aluno = new Aluno();
		aluno.nome = "Evando";
		aluno.matricula="XXXX";
		aluno.idade=99;
		aluno.genero="masculino";
		aluno.estudar();
		aluno.comer("salada");
		
		
		Aluno nathan = new Aluno();
		nathan.nome="Nathan";
		nathan.matricula="XXXX";
		nathan.idade=99;
		nathan.genero="XXX";
		nathan.estudar();
		nathan.comer("chocolate");
		
		
		Mesa mesa = new Mesa();
		mesa.altura = 100;
		mesa.comprimento = 300;
		mesa.largura = 100;
		mesa.cor="Branco";
		mesa.material="Madeira";
		mesa.apoiar();
		mesa.calcularArea();
		
		System.out.println("Finalizando aqui...");
		
	}

}
