package Lista11;

public class Estado {
	private String nome;
	private String uf;
	
	public Estado(String nome, String uf) {
		this.nome = nome;
		this.uf = uf;
	}

	public String getNome() {
		return nome;
	}

	public String getUf() {
		return uf;
	}
	
	@Override
	public String toString() {
		return nome + "\n" + uf;
	}
	
	@Override
	public boolean equals(Object obj) {
		Estado ob;
		if(!(obj instanceof Estado))
			return false;
		else {
			ob = (Estado) obj;
			if(!this.nome.equals(ob.nome) || !this.uf.equals(ob.uf))
				return false;
		}
		return true;
	}
	
	//preguica de criar u, algoritmo para o hash
	@Override
	public int hashCode() {
		int hash = 1;
		hash += nome.length() + uf.length();
		return hash;
	}

}
