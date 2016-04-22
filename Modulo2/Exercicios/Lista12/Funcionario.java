package Lista12;

public class Funcionario {
	public static final double MARGEM_PADRAO = 300;
	public static final double SALARIO_MINIMO = 880;
	private String name;
	private double salario;
	
	public Funcionario(String name, double salario) {
		this.name = name;
		this.salario = salario;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double calcularSalario(double meh, double minimo, double margem) {
		return (meh * minimo) + margem;
	}
	
	public double calcularSalario(double margem) {
		return margem + salario;
	}
	
	

}
