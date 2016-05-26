package Sala;

public class Circulo extends FiguraGeometrica {
	private double area;
	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double getArea() {
		return area;
	}

	@Override
	public void setArea(double area) {
		this.area = area;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double area() {
		return (3.14 * (raio * raio));
	}
}
