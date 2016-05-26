package Aula01;

public class Cliente {
	private String name;
	private Cidade city;
	
	public void setName(String nome) {
		this.name = nome;
	}
	
	public String getName() {
		return name;
	}
	
	public void setCidade(Cidade city) {
		this.city = city;
	}
	
	public Cidade getCidade() {
		return city;
	}

}
