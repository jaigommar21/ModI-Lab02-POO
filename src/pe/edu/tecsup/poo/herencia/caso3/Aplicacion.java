package pe.edu.tecsup.poo.herencia.caso3;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Alumno alumno1 = new Alumno(); // No se puede porque es una clase abstracta

		
		Alumno alumno1 = crearInstancia(); 
		
		alumno1.setNombre("Eduardo");
		alumno1.setEdad(12);
		
		alumno1.mostrarNombre();

	
	}

	private static Alumno crearInstancia() {
		// TODO Auto-generated method stub
		return new AlumnoInterno();
		//return new AlumnoExterno();
	}
	
	
	

}
