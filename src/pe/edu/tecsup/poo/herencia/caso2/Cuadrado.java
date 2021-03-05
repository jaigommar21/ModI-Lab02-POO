package pe.edu.tecsup.poo.herencia.caso2;

public class Cuadrado extends Figura{

	private Integer lado;
	
	public Cuadrado(String etiqueta, String color, Integer centroX, Integer centroY, Integer lado) {
		super(etiqueta, color, centroX, centroY);
		this.lado = lado;
	}

	public Integer getLado() {
		return lado;
	}

	public void setLado(Integer lado) {
		this.lado = lado;
	}

	@Override
	public Double calcularPerimetro() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double calcularArea() {
		// TODO Auto-generated method stub
		return null;
	}

}
