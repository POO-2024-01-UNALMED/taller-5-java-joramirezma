package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Anfibio extends Animal{
	private static ArrayList<Anfibio> listado;
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {
		Anfibio.listado.add(this);
	}
	
	public Anfibio(String nombre, int edad, String habitat, String genero, Zona zona, String colorPiel, boolean venenoso) {
		setNombre(nombre);
		setEdad(edad);
		setHabitat(habitat);
		setGenero(genero);
		setZona(zona);
		Anfibio.listado.add(this);
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
	
	public static Anfibio crearRana(String nombre, int edad, String genero, Zona zona) {
		Anfibio.ranas++;
		return new Anfibio(nombre,edad,"selva",genero,zona,"rojo",true);
	}
	
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		Anfibio.ranas++;
		return new Anfibio(nombre,edad,"selva",genero,null,"rojo",true);
	}
	
	public static Anfibio crearSalamandra(String nombre, int edad, String genero, Zona zona) {
		Anfibio.salamandras++;
		return new Anfibio(nombre,edad,"selva",genero,zona,"negro y amarillo",false);
	}
	
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		Anfibio.salamandras++;
		return new Anfibio(nombre,edad,"selva",genero,null,"negro y amarillo",false);
	}
	
	public static int cantidadAnfibios() {
		return Anfibio.listado.size();
	}
}
