package zooAnimales;


public class Pez extends Animal {
	private static Pez[] listado;
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez() {
		super();
	}
	
	public Pez (String nombre, 
			int edad, 
			String habitat, 
			String genero, 
			String colorEscamas,
			int cantidadAletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
	}
	
	public String getColorEscamas() {
		return this.colorEscamas;
	}
	
	public int getCantidadAletas() {
		return this.cantidadAletas;
	}
	
	public static int cantidadPeces() {
		return listado.length;
	}
	public String movimiento() {
		return "saltar";
	}
	public Pez crearSalmon(String nombre, int edad, String genero) {
		Pez salmon = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
		salmones++;
		return salmon;
	}
	public Pez crearBacalao(String nombre, int edad, String genero) {
		Pez bacalao = new Pez(nombre, edad, "oceano", genero, "gris", 6);
		bacalaos++;
		return bacalao;
	}
}