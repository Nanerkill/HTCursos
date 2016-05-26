package Aula04;

public class Computador {
	
	private static int qtd = 0;
	private String marca;
	private double memoria;
	
	public Computador() {
		qtd++;
	}
	
	public Computador(String marca, double memoria) {
		this(); //chama o contrutor padrao
		this.marca = marca;
		this.memoria = memoria;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Computador) {
			Computador comp = (Computador) obj;
			
			if(!this.marca.equals(comp.marca) || this.memoria != comp.memoria)
				return false;
		}
		
		else
			return false;
		
		return true;
	}
	
	/*@Override
	public int hashCode() {
		int n = marca.length() + (int)memoria;
		return n;
	}*/
	
	public String getMarca() {
		return marca;
	}

	public double getMemoria() {
		return memoria;
	}

	public static int getQtd() {
		return qtd;
	}

}
