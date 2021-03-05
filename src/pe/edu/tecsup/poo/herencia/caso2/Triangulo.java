package pe.edu.tecsup.poo.herencia.caso2;

public class Triangulo extends Figura{

	private Integer base;
	
	private Integer altura;
	
	public Triangulo(String etiqueta, String color, Integer centroX, Integer centroY, Integer base, Integer altura) {
		super(etiqueta, color, centroX, centroY); // llama al constructor de la clase base
		this.base = base;
		this.altura = altura;
	}

	public Integer getBase() {
		return base;
	}

	public void setBase(Integer base) {
		this.base = base;
	}

	public Integer getAltura() {
		return altura;
	}

	public void setAltura(Integer altura) {
		this.altura = altura;
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
