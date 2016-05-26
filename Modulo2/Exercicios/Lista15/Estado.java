package Lista15;

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

	public String getUf() {
		return uf;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((uf == null) ? 0 : uf.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Estado))
			return false;
		Estado newObj = (Estado) obj;
		if(!this.name.equalsIgnoreCase(newObj.name) || !this.uf.equalsIgnoreCase(newObj.uf))
			return false;
		return true;
	}
	
	public String toString() {
		return name + " " + uf;
	}

}
