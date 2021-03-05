package pe.edu.tecsup.poo.constantes.caso1;

import java.util.Date;

public class TestApp2 {

	public static void main(String[] args) {
		
		String ip = Constantes.DB_IP;
		
		System.out.println(ip);
		
		String fecha = Formato.convertirDateAString(new Date());
		
		System.out.println(fecha);
		
	}
	
}
