package Sala1;

public abstract class FiguraGeometrica {
	
	public double area;
	
	public void setArea(double area) {
		this.area = area;
	}
	
	public double getArea() {
		return area;
	}
	
	public abstract double calcArea();

}
