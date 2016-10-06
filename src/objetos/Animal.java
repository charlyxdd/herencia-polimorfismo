package objetos;

public class Animal{
	private String nombre;
	private String especie;
	private int edad;
	private int patas;
	
	public Animal(String nombre, int edad){
		this.nombre=nombre;
		this.edad=edad;
	}

	public void setNombre(String nombre){
		this.nombre=nombre;
	}

	public String getNombre(){
		return nombre;
	}
	
	public void setEspecie(String especie){
		this.especie=especie;
	}

	public String getEspecie(){
		return especie;
	}
	
	public void setEdad(int edad){
		this.edad=edad;
	}

	public int getEdad(){
		return edad;
	}
	
	public int getPatas(){
		return patas;
	}
	
	public void setPatas(int patas){
		this.patas=patas;
	}
	
	public String getSonido(){
		return "No se ha podido determinar el sonido";
	}
	
}