package gestion;

import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private Animal[] animales;
	
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
		int n = animales.length;
		Animal[] nuevaAnimales = new Animal[n+1];
		for(int i = 0; i<n; i++) {
			nuevaAnimales[i] = animales[i];
		}
		nuevaAnimales[n] = nuevoAnimal;
		this.animales = nuevaAnimales;
	}
	
	public int cantidadAnimales() {
		return animales.length;
	}
}
