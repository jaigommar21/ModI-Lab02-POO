package pe.edu.tecsup.poo.herencia.caso1;

public class Aplicacion {

	public static void main(String[] args) {

		Bicicleta bicicleta = new Bicicleta();
		
		bicicleta.cambiarLlantas(); // llama a un metodo
		
		String m = bicicleta.obtenerMarca();
		System.out.println("El valor de m es " + m);
		
		
		BicicletaMontanhera bm = new BicicletaMontanhera();
		
		bm.cambiarLlantas();
		
		
		//bicicleta.frenar();

		// puede ser accedido porque la clase Aplicacion
		// esta dentro del mismo paquete de la clase Bicicleta
		bicicleta.engranajeActual = 12; 
		
		BicicletaCarrera biclBicicletaCarrera = new BicicletaCarrera();
		biclBicicletaCarrera.cambiarLlantas();

		// puede ser accedido porque la clase Aplicacion
		// esta dentro del mismo paquete de la clase BicicletaCarrera
		biclBicicletaCarrera.engranajeActual = 12;
	
		
		// Crear la Clase BicicletaInfantil, le vamos a modificar
		// el comportamiento de cambiar velocidad,
		// vamos a indicar que no se puede cambiar la velocidad
		// porque es una bicicleta infantil
		
		BicicletaInfantil biciInfantil = new BicicletaInfantil();
		System.out.println("-----------------------");
		biciInfantil.cambiarVelocidad(10);
		 
		// Crear la Clase BicicletaElectrica, que le vamos a modificar
		// el comportamiento de cambiar velocidad,
		// de modo que solo se pueda cambiar velocidades, 
		// si el engranaje esta comprendido entre 5 y 10,
		// caso contrario mostrar un mensaje de que el cambio
		// de engranaje no es soportado
		
		BicicletaElectrica biciElectrica = new BicicletaElectrica();
		System.out.println("-----------------------");
		biciElectrica.cambiarVelocidad(3);
		System.out.println("-----------------------");
		biciElectrica.cambiarVelocidad(7);
		System.out.println("-----------------------");
		biciElectrica.cambiarVelocidad(12);
		
		
		
	}

}
