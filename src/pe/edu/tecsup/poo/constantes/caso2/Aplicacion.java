package pe.edu.tecsup.poo.constantes.caso2;

public class Aplicacion {

	public static void main(String[] args) {
		
		Venta venta1 = new Venta(); // instanciar un objeto
		
		/*
		 * Venta es la clase
		 * venta1 es el objeto
		 * 
		 * CAda objeto tiene caracteristicas y comportamiento
		 * 
		 */
		
		 
		venta1.monto = 2500d;        // caracteristicas
		venta1.fecha = "10/10/19";   // caracteristicas
		//venta1.IGV = 18; 
		
		/**
		 * Definir el atributo cantida de tipo entero
		 * en la clase Venta y asigarle el valor de 3 
		 * desde la aplicación
		 * 
		 */
		 venta1.cantidad = 3;
		
		
		Venta venta2  = new Venta();
		venta2.monto = 1800.0;
		venta2.fecha = "16/10/19";
		//venta2.IGV = 19;
		
		
		// ¿Uso una clase o una instancia ( objeto ) para acceder a 
		// la constante?
		System.out.println("venta1 - IGV: " + venta1.IGV);
		System.out.println("venta2 - IGV: " + venta2.IGV);
		
		//venta1.IGV = 20;
		System.out.println("venta1 - IGV: " + venta1.IGV);
		System.out.println("venta2 - IGV: " + venta2.IGV);
		
		//Venta.IGV = 17;

		// ¿Uso una clase o una instancia ( objeto ) para acceder a 
		// la constante?
		System.out.println("Venta - IGV: " + Venta.IGV);
		
	}
	
}
