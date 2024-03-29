package gestion;

import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas;
	
	public Zoologico() {
		if (this.zonas == null) {
			this.zonas = new ArrayList<>();
		}
	}
	
	public Zoologico(String nombre, String ubicacion, ArrayList<Zona> zonas) {
		this.nombre=nombre;
		this.ubicacion=ubicacion;
		if (this.zonas == null) {
			this.zonas = new ArrayList<>();
		}
		this.zonas=zonas;
		
	}

	public Zoologico(String nombre, String ubicacion) {
		this.nombre=nombre;
		this.ubicacion=ubicacion;
		this.zonas= new ArrayList<>();
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public ArrayList<Zona> getZona() {
		return zonas;
	}

	public void setZonas(ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}
	
}
