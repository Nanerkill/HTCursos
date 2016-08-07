package MehCalc;

public class Calculator {
	
	public static double divide(double a, double b) throws CalculoException {
		if(a == 0 && b == 0 || a != 0 && b == 0)
			throw new CalculoException();
		return a/b;
		
	}

}
