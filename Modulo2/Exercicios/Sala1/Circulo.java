package Sala1;

public class Circulo extends FiguraGeometrica {
	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	public double getRaio() {
		return raio;
	}

	@Override
	public double calcArea() {
		return (3.14 * (raio * raio));
	}

}
