package gestion;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private Zona[] zonas;
	
	public Zoologico() {}
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void agregarZonas(Zona nuevaZona) {
		int n = zonas.length;
		Zona[] nuevaZonas = new Zona[n+1];
		for(int i = 0; i<n; i++) {
			nuevaZonas[i] = zonas[i];
		}
		nuevaZonas[n] = nuevaZona;
		this.zonas = nuevaZonas;
	}
	
	public int cantidadTotalAnimales() {
		int count = 0;
		int n = zonas.length;
		for(int i = 0; i<n; i++) {
			Zona zonaActual = this.zonas[i];
			count = count + zonaActual.cantidadAnimales();
		}
		return count;
	}
}
