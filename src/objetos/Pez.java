package objetos;

public class Pez extends Animal {
	
	public Pez(String nombre, int edad){
		super(nombre,edad);
		setEspecie("Peces");
		setPatas(0);
	}
	
	public String getSonido(){
		return "glu glu";
	}
	
	
	
}
