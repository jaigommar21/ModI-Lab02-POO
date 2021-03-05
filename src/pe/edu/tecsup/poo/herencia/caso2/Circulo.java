package pe.edu.tecsup.poo.herencia.caso2;

public class Circulo extends Figura{

	private Integer radio;
	
	public Circulo(String etiqueta, String color, Integer centroX, Integer centroY, Integer radio) {
		super(etiqueta, color, centroX, centroY);
		this.radio = radio;
	}

	public Integer getRadio() {
		return radio;
	}

	public void setRadio(Integer radio) {
		this.radio = radio;
	}

	@Override
	public Double calcularPerimetro() {
		return 2 * Math.PI * this.radio;
	}

	@Override
	public Double calcularArea() {
		return Math.PI * Math.pow(this.radio, 2);
	}

	
}
