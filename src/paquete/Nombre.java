package paquete;

public class Nombre {
	String nom;
	int cont=0;
	
	public Nombre(String nombre){
		nom = nombre;
		cont = 1;
	}
	
	public String getNombre(){
		return nom;
	}
	
	public int getCant(){
		return cont;
	}
	
	public void setNombre(String nombre){
		nom = nombre;
	}

	public void setCero(){
		cont = 0;
	}
	
	public void sumar(){
		cont++;
	}
	
	
}
