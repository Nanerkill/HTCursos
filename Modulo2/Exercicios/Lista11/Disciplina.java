package Lista11;

public class Disciplina {
	private String descricao;
	
	public Disciplina(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
	@Override
	public String toString() {
		return descricao;
	}
	
	@Override
	public boolean equals(Object obj) {
		Disciplina disc;
		if(!(obj instanceof Disciplina))
			return false;
		else {
			disc = (Disciplina) obj;
			if(!this.descricao.equals(disc.descricao))
				return false;
		}
		return true;
	}
	
	@Override
	public int hashCode() {
		int hash = 1;
		hash += descricao.length();
		return hash;
	}

}
