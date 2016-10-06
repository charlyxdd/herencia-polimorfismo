package main;

import objetos.Animal;
import objetos.Perro;

public class principal {
	public static void main(String args[]){
		Animal a=new Animal("asdf",7);
		Perro p=new Perro("Firulais",4);
		
		System.out.println(a.getSonido());
		System.out.println(p.getSonido());
		
	}
	
}
