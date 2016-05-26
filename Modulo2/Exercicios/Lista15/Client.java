package Lista15;

public class Client {
	private String nome;
	private int id;
	
	public Client(String nome, int id) {
		this.nome = nome;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return nome + " " + id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Client))
			return false;
		Client newObj = (Client) obj;
		if(this.id != newObj.id)
			return false;
		return true;
	}
	
	

}
