package pe.edu.tecsup.poo.herencia.caso1;

public class BicicletaMontanhera extends Bicicleta {

	/**
	 *  Constructor vacio
	 */
	public BicicletaMontanhera() {
		// TODO Auto-generated constructor stub
	}
			
	
	/**
	 * Constructor con argumentos
	 * @param marca
	 */
	public BicicletaMontanhera(String marca) {
		// TODO Auto-generated constructor stub
		this.marca = marca;
		System.out.println("Inicializando objeto.... con marca :" + this.marca);
	}
	
	
	
	
	
	
	
	
	@Override
	public void cambiarLlantas() {
		// TODO Auto-generated method stub
		System.out.println("----------------------");
		super.cambiarLlantas();  // al metodo de la clase base 
		System.out.println("Cambiar a llantas para montaña");
		System.out.println("----------------------");
	}

	
	
}
