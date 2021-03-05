package pe.edu.tecsup.poo.herencia.caso4;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Trabajador t = new Trabajador("Jaime","Gomez");
		
		System.out.println(t.obtener_info());

		
		Profesor p = new Profesor("Maria","Ordonez","1001");
		
		System.out.println(p.obtener_info());
		
		// Ejercio
		ProfesorTC tc = new ProfesorTC("Eduardo","Farfan","1111");
		System.out.println(tc.obtener_info());
		
		
		//
		Empleado emp = new EmpAdministrativos();
		
		int nroHoras = emp.calcularHorasDeTrabajo();
		
		System.out.println(nroHoras);
		
		// Hacer lo mismo para la clase EmplTemporales
		
	}

}
