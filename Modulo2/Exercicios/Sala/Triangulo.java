package Sala;

public class Triangulo extends FiguraGeometrica{
	private double base;
	private double altura;
	private double area;
	
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public double getArea() {
		return area;
	}
	
	@Override
	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public double area() {
		return (base * altura) / 2;
	}
	
	

}
