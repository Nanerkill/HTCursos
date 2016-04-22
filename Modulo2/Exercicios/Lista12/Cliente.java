package Lista12;

public class Cliente {
	private String name;
	private String cpf;
	private String rg;
	private Cidade cidade;
	
	public Cliente(String name, String cpf, String rg, Cidade cidade) {
		this.name = name;
		this.cpf = cpf;
		this.rg = rg;
		this.cidade = cidade;
	}
	
	public Cliente(String name, Cidade cidade) {
		this.name = name;
		this.cpf = "cpf nao registrado";
		this.rg = "rg nao registrado";
		this.cidade = cidade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	@Override
	public String toString() {
		return name + "\n" + cpf + "\n" + rg + "\n" + cidade.toString();
	}

}
