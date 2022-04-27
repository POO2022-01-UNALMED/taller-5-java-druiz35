package zooAnimales;


public class Reptil extends Animal {
	private static Reptil[] listado;
	public static int iguanas;
	public static int serpientes;
	public String colorEscamas;
	private int largoCola;
	
	public Reptil() {
		super();
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
	}
	
	public String getColorEscamas() {
		return this.colorEscamas;
	}
	
	public int getLargoCola() {
		return this.largoCola;
	}
	
	public static int cantidadReptiles() {
		return listado.length;
	}
	public String movimiento() {
		return "reptar";
	}
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		Reptil iguana = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
		iguanas++;
		return iguana;
	}
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		Reptil iguana = new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
		serpientes++;
		return iguana;
	}
}
