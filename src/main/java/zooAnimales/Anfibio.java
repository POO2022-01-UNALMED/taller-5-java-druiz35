package zooAnimales;


public class Anfibio extends Animal{
	private static Anfibio[] listado;
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {
		super();
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
	}
	
	public String getColorPiel() {
		return this.colorPiel;
	}
	
	public boolean isVenenoso() {
		return this.venenoso;
	}
	
	public static int cantidadAnfibios() {
		return listado.length;
	}
	public String movimiento() {
		return "saltar";
	}
	public Anfibio crearRana(String nombre, int edad, String genero) {
		Anfibio rana = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
		ranas++;
		return rana;
	}
	public Anfibio crearSalamandra(String nombre, int edad, String genero) {
		Anfibio salamandra = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
		salamandras++;
		return salamandra;
	}
}