package main;

import objetos.Animal;
import objetos.Perro;
import objetos.Pez;
import objetos.Gato;

public class principal {
	public static void main(String args[]){
		Animal a=new Animal("asdf",7);
		Perro p=new Perro("Firulais",4);
		Pez x=new Pez("Nemo", 2);
		Gato y=new Gato("Nick", 3);
		
		System.out.println(a.getSonido());
		System.out.println(p.getSonido());
		System.out.println(x.getSonido());
		System.out.println(y.getSonido());

		
		
		
	}
	
}
