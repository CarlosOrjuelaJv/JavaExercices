package Clientes;

public class Clientes {
	
	private long cedula;
	private String nombre;
	
	
	public Clientes(String nom,long ced){
        
        nombre=nom;
        cedula=ced;
        
        }
	
	public long getCedula() {
		return cedula;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	
	
	
	
}
