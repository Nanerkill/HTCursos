package sistema.matricula;

public class Funcionario extends PessoaFisica {
	private String cargo;
	private double salario;

	public Funcionario(int codigo, String nome, Cidade cidade, String cpf, String rg, String cargo, double salario) {
		super(codigo, nome, cidade, cpf, rg);
		this.cargo = cargo;
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String toString() {
		return super.toString() + "\n" + cargo + "\n" + salario;
	}

}
