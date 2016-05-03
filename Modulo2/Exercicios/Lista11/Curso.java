package Lista11;

public class Curso {
	private String nome;
	private int cargaHoraria;
	
	public Curso(String nome, int cargaHoraria) {
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
	}

	public String getNome() {
		return nome;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	@Override
	public String toString() {
		return nome + "\n" + cargaHoraria;
	}
	
	@Override
	public boolean equals(Object obj) {
		Curso cur;
		if(!(obj instanceof Curso))
			return false;
		else {
			cur = (Curso) obj;
			if(!this.nome.equals(cur.nome) || this.cargaHoraria != cur.cargaHoraria)
				return false;
		}
		return true;
	}
	
	@Override
	public int hashCode() {
		int hash = 1;
		hash += nome.length() + cargaHoraria;
		return hash;
	}

}
