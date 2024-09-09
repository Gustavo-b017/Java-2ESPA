package br.com.fiap.aluno.teste;

import br.com.fiap.aluno.model.Aluno;

// heranca:
// public: 	pode ser acessado de qualquer lugar do codigo;
// protected: ele pode ser acessadp na heranca e dentro do mesmo pacote
// private: so usa dentro do contexto que foi inserido
// default: fica dentro do mesmo pacaote (package)


// classe publica tem que ter obriagoriamente o mesmo nome do arquivo
public class Teste {
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		
		aluno.getIdade();
		
	}

}

class Teste2 {
	
}