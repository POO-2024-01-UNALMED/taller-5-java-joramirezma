package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Anfibio extends Animal{
	private static ArrayList<Anfibio> listado;
	public int ranas;
	public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {
		Anfibio.listado.add(this);
	}
	
	public Anfibio(String nombre, int edad, String habitat, String genero, Zona zona, int ranas, int salamandras, String colorPiel, boolean venenoso) {
		setNombre(nombre);
		setEdad(edad);
		setHabitat(habitat);
		setGenero(genero);
		setZona(zona);
		Anfibio.listado.add(this);
		this.ranas=ranas;
		this.salamandras=salamandras;
		this.colorPiel=colorPiel;
		this.venenoso=venenoso;
		
	}
	
	@Override
	public String movimiento() {
		return "saltar";
	}

	public static ArrayList<Anfibio> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Anfibio> listado) {
		Anfibio.listado = listado;
	}

	public int getRanas() {
		return ranas;
	}

	public void setRanas(int ranas) {
		this.ranas = ranas;
	}

	public int getSalamandras() {
		return salamandras;
	}

	public void setSalamandras(int salamandras) {
		this.salamandras = salamandras;
	}

	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public boolean isVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	
}
