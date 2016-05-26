package Aula03;

public class Pintor extends Funcionario {
	
	@Override
	public double calcularSalario() {
		return ((salario * 0.1) + salario);
	}
	

}
