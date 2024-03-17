package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Mamifero extends Animal{
	private static ArrayList<Mamifero> listado;
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {
		Mamifero.listado.add(this);
	}
	
	public Mamifero(String nombre, int edad, String habitat, String genero, Zona zona, boolean pelaje, int patas) {
		setNombre(nombre);
		setEdad(edad);
		setHabitat(habitat);
		setGenero(genero);
		setZona(zona);
		Mamifero.listado.add(this);
		this.pelaje=pelaje;
		this.patas=patas;
	}
	
	

	public static ArrayList<Mamifero> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Mamifero> listado) {
		Mamifero.listado = listado;
	}

	public int getCaballos() {
		return caballos;
	}

	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}

	public int getLeones() {
		return leones;
	}

	public void setLeones(int leones) {
		this.leones = leones;
	}

	public boolean isPelaje() {
		return pelaje;
	}

	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero, Zona zona) {
		return new Mamifero(nombre,edad,"pradera",genero,zona,true,4);
	}
	
	public static Mamifero crearLeon(String nombre, int edad, String genero, Zona zona) {
		return new Mamifero(nombre,edad,"selva",genero,zona,true,4);
	}
	
}
