package Lista16;

public class Calculator {
	
	public static double divide(double n1, double n2) throws CalculoException {
		if(n1 == 0 && n2 == 0 || n1 != 0 && n2 == 0)
			throw new CalculoException();
		return n1/n2;
	}

}
