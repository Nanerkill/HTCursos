package Lista11;

public class Cidade {
	private String nome;
	private Estado estado;
	
	public Cidade(String nome, Estado estado) {
		this.nome = nome;
		this.estado = estado;
	}

	public String getNome() {
		return nome;
	}

	public Estado getEstado() {
		return estado;
	}
	
	public String toStrig() {
		return nome + "\n" + estado.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		Cidade cit;
		if(!(obj instanceof Cidade))
			return false;
		else {
			cit = (Cidade) obj;
			if(!this.nome.equals(cit.nome) || !this.estado.equals(cit.estado))
				return false;
		}
			
		return true;
	}
	
	@Override
	public int hashCode() {
		int hash = 1;
		hash += nome.length() + estado.hashCode();
		return hash;
	}

}
