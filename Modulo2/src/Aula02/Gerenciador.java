package Aula02;

public class Gerenciador {
	Matricula[] matriculas = new Matricula[3];
	private int cont = 0;
	
	
	public void add(Matricula matriculaX) {
		if(cont == matriculas.length)
			resize();
		matriculas[cont] = matriculaX;
		cont++;
	}
	
	public void remove() {
		//To-Do
	}
	
	
	
	
	
	private void resize() {
		Matricula[] newMat = new Matricula[matriculas.length*2];
		int i = 0;
		for(Matricula x : matriculas)
			newMat[i++] = x;
		matriculas = newMat;
	}
	
	@Override
	public String toString() {
		String returning = "";
		for(Matricula x : matriculas)
			returning += x.toString() + "\n" ;
		return returning;
	}

}
