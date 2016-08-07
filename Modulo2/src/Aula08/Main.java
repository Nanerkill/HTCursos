package Aula08;

public class Main {
	public static void main(String[] args) {
		
		Metodos m = new Metodos();
		
		//ValidacaoUtilException
		m.a("82839402939S");
		
		//NullPointerException
		m = null;
		m.a("82839402939");
		
	}

}