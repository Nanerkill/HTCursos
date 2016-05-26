package Aula05;

public abstract class Funcionario {
	private String cargo;
	private double salario = 700;
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}
	
	public String getCargo() {
		return cargo;
	}

	public abstract double calculoSalario();

}
