package objetos;

public class Animal{
	private String nombre;
	private String especie;
	private int edad;

	public Animal(String nombre, String especie, int edad){
		this.nombre=nombre;
		this.especie=especie;
		this.edad=edad;
	}

	public Animal(){

	}

	public Animal(String nombre){

	}


	public setNombre(String nombre){
		this.nombre=nombre;
	}

	public getNombre(){
		return nombre;
	}

}