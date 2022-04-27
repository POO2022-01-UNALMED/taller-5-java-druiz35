package zooAnimales;


public class Ave extends Animal {
	private static Ave[] listado;
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave() {
		super();
	}
	
	public Ave(String nombre, 
			int edad, 
			String habitat, 
			String genero, 
			String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
	}
	
	public String getColorPlumas() {
		return this.colorPlumas;
	}
	
	public static int cantidadAves() {
		return listado.length;
	}
	
	public String movimiento() {
		return "volar";
	}
	
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		Ave halcon = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
		halcones++;
		return halcon;
	}
	
	public static Ave crearAguila(String nombre, int edad, String genero) {
		Ave aguila = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
		aguilas++;
		return aguila;
	}
}
