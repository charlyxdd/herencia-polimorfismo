package objetos;

public class Pez extends Animal {
	
	public Pez(String nombre, int edad){
		super(nombre,edad);
		setEspecie("Pez");
		setPatas(0);
	}
	
	public String getSonido(){
		return "Esta especie hace glu glu";
	}
	
	
	
}
