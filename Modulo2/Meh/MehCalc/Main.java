package MehCalc;

public class Main {
	public static void main(String[] args) {
		
		try {
			System.out.println(Calculator.divide(10, 5));
			System.out.println(Calculator.divide(10, 0));
		} catch (CalculoException e) {
			System.out.println("Nope");
			e.printStackTrace();
		}
	}

}
