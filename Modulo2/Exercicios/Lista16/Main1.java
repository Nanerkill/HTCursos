package Lista16;

public class Main1 {
	public static void main(String[] args) {
		
		try {
			System.out.println(Calculator.divide(10, 2));
			System.out.println(Calculator.divide(10, 0));
		} catch(CalculoException e) {
			System.out.println("Numero indefinido");
		}
	}

}
