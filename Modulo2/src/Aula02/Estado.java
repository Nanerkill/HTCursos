package Aula02;

public class Estado {
	private String uf;
	
	public Estado(String uf) {
		this.uf = uf;
	}
	
	
	//get e set
	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
	
	public String toString() {
		return uf;
	}

}
