package gestion;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private Animal[] animal;
	
	public Zona(){
	}
	
	public Zona(String nombre, Zoologico zoo, Animal[] animal) {
		this.nombre=nombre;
		this.zoo=zoo;
		this.animal=animal;
	}
}
