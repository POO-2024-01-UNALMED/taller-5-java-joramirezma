package zooAnimales;

import gestion.Zona;

public class Reptil extends Animal{
	private Reptil[] listado;
	public int iguanas;
	public int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {
	}
	
	public Reptil(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona zona, Reptil[] listado, int iguanas, int serpientes, String colorEscamas, int largoCola) {
		setTotalAnimales(totalAnimales);
		setNombre(nombre);
		setEdad(edad);
		setHabitat(habitat);
		setGenero(genero);
		setZona(zona);
		this.listado=listado;
		this.iguanas=iguanas;
		this.serpientes=serpientes;
		this.colorEscamas=colorEscamas;
		this.largoCola=largoCola;
	}
}
