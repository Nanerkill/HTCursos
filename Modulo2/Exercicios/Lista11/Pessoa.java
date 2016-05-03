package Lista11;

public class Pessoa {
	private int codigo;
	private String nome;
	private Cidade cidade;
	
	public Pessoa(int codigo, String nome, Cidade cidade) {
		this.codigo = codigo;
		this.nome = nome;
		this.cidade = cidade;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public Cidade getCidade() {
		return cidade;
	}
	
	@Override
	public String toString() {
		return codigo + "\n" + nome + "\n" + cidade.toStrig();
	}
	
	@Override
	public boolean equals(Object obj) {
		Pessoa ps;
		if(!(obj instanceof Pessoa))
			return false;
		else {
			ps = (Pessoa) obj;
			if(this.codigo != ps.codigo || !this.nome.equals(ps.nome) || !this.cidade.equals(ps.cidade))
				return false;
		}
		return true;
	}
	
	@Override
	public int hashCode() {
		int hash = 1;
		hash += codigo + nome.length() + cidade.hashCode();
		return hash;
	}

}
