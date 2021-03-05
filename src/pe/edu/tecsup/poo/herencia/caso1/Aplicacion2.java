package pe.edu.tecsup.poo.herencia.caso1;

public class Aplicacion2 {

	/*
	// CASO 1
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bicicleta bicicleta = new Bicicleta();
		bicicleta.cambiarLlantas();
		
		Bicicleta bm = new BicicletaMontanhera();
		bm.cambiarLlantas();

		Bicicleta be = new BicicletaElectrica();
		be.cambiarLlantas();

		Bicicleta bi = new BicicletaInfantil();
		bi.cambiarLlantas();
		
	}
	*/

	/*
	// CASO 2
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bicicleta bici = new Bicicleta();
		bici.cambiarLlantas();
		
		bici = new BicicletaMontanhera();
		bici.cambiarLlantas();

		bici = new BicicletaElectrica();
		bici.cambiarLlantas();

		bici = new BicicletaInfantil();
		bici.cambiarLlantas();
		
	}
	*/

	/*
	// CASO 3
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bicicleta bici = new Bicicleta();
		bici.cambiarLlantas();

		bici = new BicicletaMontanhera();
		ejecutar(bici);

		bici = new BicicletaElectrica();
		ejecutar(bici);

		bici = new BicicletaInfantil();
		ejecutar(bici);
		
	}
	
	
	public static void ejecutar(Bicicleta bi) {
		
		bi.cambiarLlantas();
		
	}
	*/
	
	
	/*
	// CASO 4
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ejecutar(new Bicicleta());
		ejecutar(new BicicletaMontanhera());
		ejecutar(new BicicletaElectrica());
		ejecutar(new BicicletaInfantil());
		
	}
	
	
	public static void ejecutar(Bicicleta bi) {
		
		bi.cambiarLlantas();
		bi.frenar();
		
	}
	*/

	// CASO 5 : usando arreglos con objetos
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bicicleta[] bici = new Bicicleta[4];
		bici[0] =  new Bicicleta();
		bici[1] =  new BicicletaMontanhera("Monark");
		bici[2] =  new BicicletaElectrica();
		bici[3] =  new BicicletaInfantil();
		
		//System.out.println(bici[4]); 
		
		for (int i = 0; i < bici.length; i++) {
			ejecutar(bici[i]);
		}
				
	}
	
	
	public static void ejecutar(Bicicleta bi) {
		
		bi.cambiarLlantas();
		//bi.frenar();
		
	}

	
}
