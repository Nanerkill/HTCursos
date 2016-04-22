package Lista12;

public class Calculadora {
	
	public static double soma(double... args) {
		double soma = 0;
		for(double x : args)
			soma += x;
		return soma;
	}
	
	public static double multiplica(double... args) {
		double mul = 1;
		for(double x : args)
			mul *= x;
		return mul;
	}
	
	public static double subtrair(double... args) {
		double sub = args[0];
		for(int i = 1; i < args.length; i++) {
			sub -= args[i];
		}
		return sub;
	}

}
