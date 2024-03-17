package gestion;

import java.util.ArrayList;

import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales;
	
	public Zona(){
	}
	
	public Zona(String nombre, Zoologico zoo, ArrayList<Animal> animales) {
		this.nombre=nombre;
		this.zoo=zoo;
		this.animales=animales;
	}
	
	public void agregarAnimales() {
		
	}
	
	public int cantidadAnimales() {
		return this.animales.size();
	}
}
