package pe.edu.tecsup.poo.constantes.caso2;

public class Venta {

	// Caraterisitcas : --> Atributos
	public double monto;
	
	public int cantidad;
	
	public String fecha;
	
	public static final int IGV = 18;

	// Comportamiento : ---> Metodos
	public double calcularIGV() {
		
		return monto*IGV/100;
		
	}
	
	/**
	
	Los tipos de datos nativos, tiene su correspondia en 
	clases en Java , los wrapper
	
	int --->  Integer
	double --> Double
	
	
	**/
}
