package pe.edu.tecsup.poo.herencia.caso4;

/**
 * Clase abstracta
 * @author jgomezm
 *
 */
public abstract class Empleado extends Trabajador {

	protected int nroSeguroSocial;
	
	/**
	 * Definiendo un comportamiento sin implementar : metodo abstracto
	 * @return
	 */
	public abstract int calcularHorasDeTrabajo();
	
	
	public void imprimirSaludo() {
		
	}
	
	
}
