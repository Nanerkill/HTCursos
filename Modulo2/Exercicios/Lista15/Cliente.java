package Lista15;

public class Cliente {
	private int id;
	private String nome;
	private String cpf;
	private String rg;
	private Cidade cidade;
	private char genero;
	
	public Cliente(int id, String nome, String cpf, String rg, Cidade cidade, char genero) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.cidade = cidade;
		this.genero = genero;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getRg() {
		return rg;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public char getGenero() {
		return genero;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + genero;
		result = prime * result + id;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((rg == null) ? 0 : rg.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Cliente))
			return false;
		Cliente newObj = (Cliente) obj;
		if(this.id != newObj.id)
			return false;
		return true;
	}
	
	public String toString() {
		return id + " " + nome + " " + cpf + " " + rg + " " + cidade.toString() + " " + genero;
	}

}
