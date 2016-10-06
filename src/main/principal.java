package main;

import objetos.Animal;
import objetos.Perro;
import objetos.Pez;
import objetos.Gato;

public class principal {
	public static void main(String args[]){
		Animal a=new Animal("asdf",7);
		Perro firulais=new Perro("Firulais",4);
		Pez nemo=new Pez("Nemo", 2);
		Gato nick=new Gato("Nick", 3);
		
		a.setEspecie("No se conoce");
		
		System.out.println("Los animales que " + a.getEspecie() + "n hacen " + a.getSonido());
		System.out.println("Los " + firulais.getEspecie() + " hacen " + firulais.getSonido());
		System.out.println("Los " + nemo.getEspecie() + " hacen " + nemo.getSonido());
		System.out.println("Los " + nick.getEspecie() + " hacen " + nick.getSonido());

		
		
		
	}
	
}
