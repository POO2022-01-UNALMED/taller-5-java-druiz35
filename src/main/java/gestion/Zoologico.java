package gestion;
import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<Zona>();
	
	public Zoologico() {}
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	public ArrayList<Zona> getZona() {
		return this.zonas;
	}
		
	public String getNombre() {
		return this.nombre;
	}
	
	public String getUbicacion() {
		return this.ubicacion;
	}
	
	public void agregarZonas(Zona nuevaZona) {
		this.zonas.add(nuevaZona);
	}
	
	public int cantidadTotalAnimales() {
		int count = 0;
		int n = zonas.size();
		for(int i = 0; i<n; i++) {
			Zona zonaActual = this.zonas.get(i);
			count = count + zonaActual.cantidadAnimales();
		}
		return count;
	}
}
