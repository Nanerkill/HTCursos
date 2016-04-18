package sistema.banco;

public class Estado {
	private String nome;
	private String uf;
	
	public Estado() { //para lista 9
		
	}
	
	public Estado(String nome, String uf) { //para lista 10
		this.nome = nome;
		this.uf = uf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getUf() {
		return uf;
	}
	
	public void setUf(String uf) {
		this.uf = uf;
	}

}
