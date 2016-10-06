package objetos;

public class Gato extends Animal {
	
	public Perro(String nombre, int edad){
		super(nombre,edad);
		setEspecie("Gato");
		setPatas(4);
	}
	
	public String getSonido(){
		return "Esta especie hace miau miau";
	}
	
	
	
}
