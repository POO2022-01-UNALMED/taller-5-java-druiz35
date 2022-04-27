package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal{
	private static ArrayList<Anfibio> listado;
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {
	}
	
	public Anfibio (String nombre, 
			int edad, 
			String habitat, 
			String genero, 
			String colorPiel,
			boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		Anfibio.listado.add(this);
	}
	
	public String getColorPiel() {
		return this.colorPiel;
	}
	
	public boolean isVenenoso() {
		return this.venenoso;
	}
	
	public static int cantidadAnfibios() {
		return Anfibio.listado.size();
	}
	public String movimiento() {
		return "saltar";
	}
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		Anfibio rana = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
		Anfibio.ranas++;
		return rana;
	}
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		Anfibio salamandra = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
		Anfibio.salamandras++;
		return salamandra;
	}
}
