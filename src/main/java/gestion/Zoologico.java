package gestion;

import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas;
	
	public Zoologico() {
	}
	
	public Zoologico(String nombre, String ubicacion, ArrayList<Zona> zonas) {
		this.nombre=nombre;
		this.ubicacion=ubicacion;
		this.zonas=zonas;
	}

	public void agregarZonas(Zona...zonas ) {
		for (Zona zona:zonas) {
			this.zonas.add(zona);
		}
		
	}
	
	public int cantidadTotalAnimales() {
		int contador = 0;
		for(Zona zona: zonas) {
			contador = contador + zona.cantidadAnimales();
		}
		return contador;
	}
	
}
