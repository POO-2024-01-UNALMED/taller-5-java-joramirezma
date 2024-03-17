package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Reptil extends Animal{
	private static ArrayList<Reptil> listado;
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {
		Reptil.listado.add(this);
	}
	
	public Reptil(String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas, int largoCola) {
		setNombre(nombre);
		setEdad(edad);
		setHabitat(habitat);
		setGenero(genero);
		setZona(zona);
		Reptil.listado.add(this);
		this.colorEscamas=colorEscamas;
		this.largoCola=largoCola;
	}
	
	@Override
	public String movimiento() {
		return "reptar";
	}

	public static ArrayList<Reptil> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Reptil> listado) {
		Reptil.listado = listado;
	}

	public static int getIguanas() {
		return iguanas;
	}

	public static void setIguanas(int iguanas) {
		Reptil.iguanas = iguanas;
	}

	public static int getSerpientes() {
		return serpientes;
	}

	public static void setSerpientes(int serpientes) {
		Reptil.serpientes = serpientes;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getLargoCola() {
		return largoCola;
	}

	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	
	public static Reptil crearIguana(String nombre, int edad, String genero, Zona zona) {
		setIguanas(getIguanas() + 1);
		return new Reptil(nombre,edad,"humedal",genero,zona,"verde",3);
	}
	
	public static Reptil crearSerpiente(String nombre, int edad, String genero, Zona zona) {
		setSerpientes(getSerpientes() + 1);
		return new Reptil(nombre,edad,"jungla",genero,zona,"blanco",1);
	}
	
}
