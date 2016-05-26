package Sala;

public class Geometria {
	private FiguraGeometrica meh[] = new FiguraGeometrica[5];
	private int cont = 0;
	
	public void add(FiguraGeometrica fig) {
		if(cont == meh.length)
			resize();
		meh[cont++] = fig;
	}
	
	public FiguraGeometrica[] getFiguraGeoComArea() {
		calcArea();
		FiguraGeometrica[] newAr = new FiguraGeometrica[1];
		boolean obj = true; int cont = 0;
		for(int i  = 0; i < meh.length && obj; i ++) {
			if(meh[i] != null) {
				if(cont == newAr.length)
					newAr = resize(newAr);
				newAr[cont++] = meh[i];
			}
			else
				obj = false;
		}
		return newAr;
	}
	
	private void calcArea() {
		for(FiguraGeometrica x : meh)
			if(x != null)
				x.setArea(x.area());
			else
				break;
	}
	
	private void resize() {
		FiguraGeometrica newMeh[] = new FiguraGeometrica[meh.length * 2];
		int i = 0;
		for(FiguraGeometrica x : meh)
			newMeh[i++] = x;
		meh = newMeh;
	}
	
	private FiguraGeometrica[] resize(FiguraGeometrica[] newAr) {
		FiguraGeometrica newMeh[] = new FiguraGeometrica[newAr.length + 1];
		int i = 0;
		for(FiguraGeometrica x : newAr)
			newMeh[i++] = x;
		return newMeh;
	}

}
