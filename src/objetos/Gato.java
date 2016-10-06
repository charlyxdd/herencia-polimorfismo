package objetos;

public class Gato extends Animal {
	
	public Gato(String nombre, int edad){
		super(nombre,edad);
		setEspecie("Gatos");
		setPatas(4);
	}
	
	public String getSonido(){
		return "miau miau";
	}
	
	
	
}
