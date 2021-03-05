package pe.edu.tecsup.poo.herencia.caso4;

public class Trabajador {

	protected String nombre;
	
	protected String apellido;
	
	public Trabajador() {
		// TODO Auto-generated constructor stub
	}

	public Trabajador(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}


	/**
	 * 
	 * @return
	 */
	public String obtener_info() {
		
		return this.nombre + " " + this.apellido;
		
	}
	
	
}
