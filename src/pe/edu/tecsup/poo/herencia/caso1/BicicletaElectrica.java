package pe.edu.tecsup.poo.herencia.caso1;

public class BicicletaElectrica extends Bicicleta {
    
	
	@Override
    public void cambiarVelocidad(int engranajeNuevo) {
        // TODO Auto-generated method stub
        //super.cambiarVelocidad(engranajeActual);
        if (engranajeNuevo >= 5 && engranajeNuevo <= 10) {
            //System.out.println("Engranaje soportado");
            super.cambiarVelocidad(engranajeNuevo);
        } else {
            System.out.println("Engranaje no soportado");
        }
    }
    
	
	@Override
	public void cambiarLlantas() {
		// TODO Auto-generated method stub
		System.out.println("Cambiar llantas especiales");
	}
	
	
	
	
	/*
	@Override
    public void cambiarVelocidad(int engranajeNuevo) {
        // TODO Auto-generated method stub
        //super.cambiarVelocidad(engranajeActual);
        if(engranajeNuevo>=5 &&engranajeNuevo<=10) {
            super.cambiarVelocidad(engranajeNuevo);
        }else {
            System.out.println("Cambio de engranaje no soportado");
        }
    }
    */
    
}

/*
  
package pe.edu.tecsup.poo.herencia.caso1;
public class BicicletaElectrica extends Bicicleta {
    @Override
    public void cambiarVelocidad(int engranajeActual) {
        // TODO Auto-generated method stub
        
        if (engranajeActual>=5 && engranajeActual<=10)
            super.cambiarVelocidad(engranajeActual);
        else
            System.out.println("El engranaje no es soportado");
    }
    
}
 */


