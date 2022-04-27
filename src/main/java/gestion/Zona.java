package gestion;

import zooAnimales.Animal;
import java.util.ArrayList;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales;
	
	public Zona() {}
	
	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo = zoo;
	}
	
	public Zoologico getZoo() {
		return this.zoo;
	}

	
	public String getNombre() {
		return this.nombre;
	}
	
	public void agregarAnimales(Animal nuevoAnimal) {
		this.animales.add(nuevoAnimal);
	}
	
	public int cantidadAnimales() {
		return animales.size();
	}
}
