package Sala;

public class Main {
	public static void main(String[] args) {
		Geometria geo = new Geometria();
		
		geo.add(new Triangulo(10, 2));
		geo.add(new Retangulo(2, 3));
		geo.add(new Circulo(3));
		
		FiguraGeometrica[] calc = geo.getFiguraGeoComArea();
		
		for(FiguraGeometrica x : calc)
			System.out.println(x.area());
		
	}

}
