package pe.edu.tecsup.poo.herencia.caso4;

public class Profesor extends Trabajador{

	protected String codigo;
	
	
	public Profesor() {
		// TODO Auto-generated constructor stub
	}
	
	public Profesor(String nombre, String apellido, String codigo) {
		super(nombre, apellido); // Constructor de la clase base
		this.codigo = codigo ;
		// TODO Auto-generated constructor stub
	}


	@Override
	public String obtener_info() {
		// TODO Auto-generated method stub
		return this.nombre + " " + this.apellido+ " codigo :" + this.codigo;
		
	}
	
	
}
