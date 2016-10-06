package objetos;

public class Perro extends Animal {
	
	public Perro(String nombre, int edad){
		super(nombre,edad);
		setEspecie("Perro");
		setPatas(4);
	}
	
	public String getSonido(){
		return "Esta especie hace gua gua";
	}
	
	
	
}
