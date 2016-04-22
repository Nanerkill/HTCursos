package Lista12;

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

	public void setName(String name) {
		this.name = name;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	@Override
	public String toString() {
		return name + "\n" + estado.toString();
	}

}
