package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal{
	private static ArrayList<Mamifero> listado;
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {
		super();
	}
	
	public Mamifero (String nombre, 
					int edad, 
					String habitat, 
					String genero, 
					boolean pelaje,
					int patas) {
		super(nombre, edad, habitat, genero);
		Mamifero.listado.add(this);
	}
	
	public boolean isPelaje() {
		return this.pelaje;
	}
	
	public int getPatas() {
		return this.patas;
	}
	
	public static int cantidadMamiferos() {
		return Mamifero.listado.size();
	}
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		Mamifero caballo = new Mamifero(nombre, edad, "pradera", genero, true, 4);
		Mamifero.caballos++;
		return caballo;
	}
	
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		Mamifero leon = new Mamifero(nombre, edad, "selva", genero, true, 4);
		Mamifero.leones++;
		return leon;
	}
}
