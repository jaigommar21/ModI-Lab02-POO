package pe.edu.tecsup.poo.herencia.caso3;

public abstract class Alumno {

	String nombre;
	int edad;
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// Declaracion de un metodo
	public abstract void mostrarNombre(); /*{
		System.out.println(this.nombre);
	}*/
	
	
}
