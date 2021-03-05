package pe.edu.tecsup.poo.herencia.caso2;

public abstract class Figura {

	protected String etiqueta;
	
	protected String color;
	
	protected Integer centroX;
	
	protected Integer centroY;

	public Figura(String etiqueta, String color, Integer centroX, Integer centroY) {
		super();
		this.etiqueta = etiqueta;
		this.color = color;
		this.centroX = centroX;
		this.centroY = centroY;
	}

	public abstract Double calcularPerimetro();
	
	public abstract Double calcularArea();
	
	public String getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getCentroX() {
		return centroX;
	}

	public void setCentroX(Integer centroX) {
		this.centroX = centroX;
	}

	public Integer getCentroY() {
		return centroY;
	}

	public void setCentroY(Integer centroY) {
		this.centroY = centroY;
	}
	
	
	
}
