package zooAnimales;


public class Mamifero extends Animal{
	private static Mamifero[] listado;
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
		this.pelaje = pelaje;
		this.patas = patas;
		int n = listado.length;
		Mamifero[] nuevoListado = new Mamifero[n];
		for(int i = 0; i<n; i++) {
			nuevoListado[i] = listado[i];
		}
		nuevoListado[n] = this;
		listado = nuevoListado;
	}
	
	public boolean isPelaje() {
		return this.pelaje;
	}
	
	public int getPatas() {
		return this.patas;
	}
	
	public static int cantidadMamiferos() {
		return listado.length;
	}
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		Mamifero caballo = new Mamifero(nombre, edad, "pradera", genero, true, 4);
		caballos++;
		return caballo;
	}
	
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		Mamifero leon = new Mamifero(nombre, edad, "selva", genero, true, 4);
		leones++;
		return leon;
	}
}
