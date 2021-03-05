package pe.edu.tecsup.poo.constantes.caso2;

/**
 * No se puede extender de la clase Venta , porque
 * es final 
 * @author jgomezm
 *
 */
public class MiVenta extends Venta {

	@Override
	public double calcularIGV() {
		// TODO Auto-generated method stub
		return this.monto*0.12;
	}

}
