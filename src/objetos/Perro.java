package objetos;

public class Perro extends Animal {
	
	public Perro(String nombre, int edad){
		super(nombre,edad);
		setEspecie("Perros");
		setPatas(4);
	}
	
	public String getSonido(){
		return "gua gua";
	}
	
	
	
}

