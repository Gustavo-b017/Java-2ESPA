package aula7;

public class TesteCarro1 {
	
	
	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.setAno(1982);
		carro.setKm(90);
		carro.setMarca("Fiat");
		carro.setModelo("Uno");
		
		carro.correr();
	}
	

}
