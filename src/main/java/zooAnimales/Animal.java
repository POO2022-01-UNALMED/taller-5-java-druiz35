package zooAnimales;

import gestion.Zona;

public class Animal {
	private static int totalAnimales;
	protected String nombre;
	protected int edad;
	protected String habitat;
	protected String genero;
	protected Zona[] zona;
	
	public Animal() {}
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		totalAnimales++;
	}

	public String getHabitat() {
		return this.habitat;
	}
	
	public String getGenero() {
		return this.genero;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public String movimiento() {
		return "desplazarse";
	}
	
	public static String totalPorTipo() {
		int nMamiferos = Mamifero.cantidadMamiferos();
		int nAves = Ave.cantidadAves();
		int nReptiles = Reptil.cantidadReptiles();
		int nPeces = Pez.cantidadPeces();
		int nAnfibios = Anfibio.cantidadAnfibios();
		String mensaje = "Mamiferos: " + nMamiferos 
				+ "\nAves: " + nAves
				+ "\nReptiles: " + nReptiles
				+ "\nPeces: " + nPeces
				+ "\nAnfibios: " + nAnfibios;
		return mensaje;
	}
	
	@Override
	public String toString() {
		return "";
	}
}
