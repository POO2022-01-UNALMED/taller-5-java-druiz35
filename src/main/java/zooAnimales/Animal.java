package zooAnimales;

import gestion.Zona;
import java.util.ArrayList;

public class Animal {
	private static int totalAnimales;
	protected String nombre;
	protected int edad;
	protected String habitat;
	protected String genero;
	protected ArrayList<Zona> zona = new ArrayList<Zona>();
	
	public Animal() {}
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		Animal.totalAnimales++;
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
						
		if(this.zona.size() == 0) {
			String mensaje_1 = "Mi nombre es " + this.nombre + 
					", tengo una edad de " + this.edad + 
					", habito en " + this.habitat + 
					" y mi genero es " + this.genero;
			return mensaje_1;
		}
		else {
			String mensaje_2 = "Mi nombre es " + this.nombre + 
					", tengo una edad de " + this.edad + 
					", habito en " + this.habitat + 
					" y mi genero es " + this.genero +
					", la zona en la que me ubico es " + this.zona.get(0) +
					", en el " + this.zona.get(0).getZoo().getNombre();
			return mensaje_2;
		}
	}
}
