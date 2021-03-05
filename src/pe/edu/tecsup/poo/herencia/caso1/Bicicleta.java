package pe.edu.tecsup.poo.herencia.caso1;


public class Bicicleta {

	public static String MARCA_DEFECTO = "SIN MARCA";
	
	protected int velocidadActual;
	protected int velocidadMaxima;
	protected int engranajeActual;
	protected String nroAro;
	protected String marca = MARCA_DEFECTO;
	protected String modelo;

	public void cambiarLlantas() {
		System.out.println("Cambiando llantas");
		//this.imprimir("Cambiando llantas");
	}

	public void frenar() {
		this.imprimir("Frenando");
	}

	public void cambiarVelocidad(int engranajeActual) {
		this.engranajeActual = engranajeActual;
		System.out.println("Cambiando velocidad a " + engranajeActual);
		//this.imprimir("Cambiando velocidad a " + engranajeActual);
	}
	
	private void imprimir(String msg) {		
		System.out.println(msg);
	}
	
	
	public String obtenerMarca() {
		
		return this.marca;
	}

}
