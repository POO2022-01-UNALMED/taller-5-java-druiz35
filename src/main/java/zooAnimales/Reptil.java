package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal {
	private static ArrayList<Reptil> listado;
	public static int iguanas;
	public static int serpientes;
	public String colorEscamas;
	private int largoCola;
	
	public Reptil() {
	}
	
	public Reptil (String nombre, 
			int edad, 
			String habitat, 
			String genero, 
			String colorEscamas,
			int largoCola) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		Reptil.listado.add(this);
	}
	
	public String getColorEscamas() {
		return this.colorEscamas;
	}
	
	public int getLargoCola() {
		return this.largoCola;
	}
	
	public static int cantidadReptiles() {
		return Reptil.listado.size();
	}
	public String movimiento() {
		return "reptar";
	}
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		Reptil iguana = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
		Reptil.iguanas++;
		return iguana;
	}
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		Reptil iguana = new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
		Reptil.serpientes++;
		return iguana;
	}
}
