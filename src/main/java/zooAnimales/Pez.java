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

	public int getSalmones() {
		return salmones;
	}

	public void setSalmones(int salmones) {
		this.salmones = salmones;
	}

	public int getBacalaos() {
		return bacalaos;
	}

	public void setBacalaos(int bacalaos) {
		this.bacalaos = bacalaos;
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
	
	
}
