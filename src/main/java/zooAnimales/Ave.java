package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Ave extends Animal{
	private static ArrayList<Ave> listado;
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave() {
		Ave.listado.add(this);
	}
	
	public Ave(String nombre, int edad, String habitat, String genero, Zona zona, String colorPlumas) {
		setNombre(nombre);
		setEdad(edad);
		setHabitat(habitat);
		setGenero(genero);
		setZona(zona);
		Ave.listado.add(this);
		this.colorPlumas=colorPlumas;
	}
	
	@Override
	public String movimiento() {
		return "volar";
	}

	public static ArrayList<Ave> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Ave> listado) {
		Ave.listado = listado;
	}

	public static int getHalcones() {
		return halcones;
	}

	public static void setHalcones(int halcones) {
		Ave.halcones = halcones;
	}

	public static int getAguilas() {
		return aguilas;
	}

	public static void setAguilas(int aguilas) {
		Ave.aguilas=aguilas;
	}

	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	public static Ave crearAguila(String nombre, int edad, String genero, Zona zona) {
		setAguilas(getAguilas() + 1);
		return new Ave(nombre,edad,"montanas",genero,zona,"blanco y amarillo");
	}
	
	public static Ave crearHalcon(String nombre, int edad, String genero, Zona zona) {
		setHalcones(getHalcones() + 1);
		return new Ave(nombre,edad,"montanas",genero,zona,"cafe glorioso");
	}
	
}
