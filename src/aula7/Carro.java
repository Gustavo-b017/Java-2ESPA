package aula7;

public class Carro {
	
	private String marca;
	private String modelo;
	private int ano;
	private float km;

	public Carro() {
		
	}
	
	public Carro(String marca, String modelo, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}
	
	public Carro(String marca, String modelo, int ano, float km) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.km = km;
		
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public float getKm() {
		return km;
	}

	public void setKm(float km) {
		this.km = km;
	}
	
	int correr() {
		return 0;
	}
	
	int correr(int param1) {
		return 0;
	}
	
	void correr(int param1, int param2) {
		
	}
	
	void correr(double param1, double param2) {
		
	}

}
