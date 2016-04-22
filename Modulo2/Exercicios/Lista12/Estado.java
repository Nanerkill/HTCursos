package Lista12;

public class Estado {
	private String name;
	private String uf;
	
	public Estado(String name, String uf) {
		this.name = name;
		this.uf = uf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
	
	@Override
	public String toString() {
		return name + "\n" + uf;
	}

}
