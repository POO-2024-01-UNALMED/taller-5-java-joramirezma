package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Pez extends Animal{
	private static ArrayList<Pez> listado;
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez() {
		Pez.listado.add(this);
	}
	
	public Pez(String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas, int cantidadAletas) {
		setNombre(nombre);
		setEdad(edad);
		setHabitat(habitat);
		setGenero(genero);
		setZona(zona);
		Pez.listado.add(this);
		this.colorEscamas=colorEscamas;
		this.cantidadAletas=cantidadAletas;
	}
	
	@Override
	public String movimiento() {
		return "nadar";
	}

	public static ArrayList<Pez> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Pez> listado) {
		Pez.listado = listado;
	}
	
	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getCantidadAletas() {
		return cantidadAletas;
	}

	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	
	public static Pez crearBacalao(String nombre, int edad, String genero, Zona zona) {
		Pez.bacalaos++;
		return new Pez(nombre,edad,"oceano",genero,zona,"gris",6);
	}
	
	public static Pez crearSalmon(String nombre, int edad, String genero, Zona zona) {
		Pez.salmones++;
		return new Pez(nombre,edad,"oceano",genero,zona,"rojo",6);
	}
	
	public static int cantidadPeces() {
		return Pez.listado.size();
	}
}
