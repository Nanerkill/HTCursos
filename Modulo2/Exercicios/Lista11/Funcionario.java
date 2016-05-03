package Lista11;

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

	public double getSalario() {
		return salario;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" + cargo + "\n" + salario;
	}
	
	@Override
	public boolean equals(Object obj) {
		Funcionario func;
		if(!(obj instanceof Funcionario))
			return false;
		else {
			func = (Funcionario) obj;
			if(!super.equals((PessoaFisica) func) || !this.cargo.equals(func.cargo) || this.salario != func.salario)
				return false;
		}
		return true;
	}
	
	@Override
	public int hashCode() {
		int hash = 1;
		hash += super.hashCode() + cargo.length() + salario;
		return hash;
	}

}
