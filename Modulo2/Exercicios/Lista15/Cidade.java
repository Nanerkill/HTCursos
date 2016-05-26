package Lista15;

public class Cidade {
	private String name;
	private Estado estado;
	
	public Cidade(String name, Estado estado) {
		this.name = name;
		this.estado = estado;
	}

	public String getName() {
		return name;
	}

	public Estado getEstado() {
		return estado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Cidade))
			return false;
		Cidade newObj = (Cidade) obj;
		if(!this.name.equalsIgnoreCase(newObj.name) || !this.estado.equals(newObj.estado))
			return false;
		return true;
	}
	
	public String toString() {
		return name + " " + estado.toString();
	}

}
