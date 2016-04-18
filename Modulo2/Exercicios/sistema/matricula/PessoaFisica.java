package sistema.matricula;

public class PessoaFisica extends Pessoa {
	private String cpf;
	private String rg;

	public PessoaFisica(int codigo, String nome, Cidade cidade, String cpf, String rg) {
		super(codigo, nome, cidade);
		this.cpf = cpf;
		this.rg = rg;
	}
	
	public PessoaFisica(String nome, String cpf) {
		super(nome);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" + cpf + "\n" + rg;
	}

}
