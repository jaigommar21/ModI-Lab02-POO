package pe.edu.tecsup.poo.herencia.caso2;

public class TestApp {

	public static void main(String[] args) {
		
		Figura[] figuras = new Figura[5];
		
		figuras[0] = new Circulo("Circulo 1", "rojo", 12, 10, 10);
		figuras[1] = new Triangulo("Triangulo 1", "verde", 9, 10, 12, 10);
		
		for (int i = 0; i < figuras.length; i++) {
			System.out.println("Perimetro: " + figuras[i].calcularPerimetro());
		}
		
	}
	
}
