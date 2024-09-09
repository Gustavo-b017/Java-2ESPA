package aula7;

public class TesteCarro {

	public static void main(String[] args) {
		
		//Carro carro = new Carro("Fiat", "Uno", 1981, 100 );
		
		Carro carro = new Carro();
		carro.setAno(1981);
		carro.setKm(100);
		carro.setMarca("Fiat");
		carro.setModelo("Uno");
		
		System.out.println(carro.getMarca());
		
		carro.correr();
	}
}
