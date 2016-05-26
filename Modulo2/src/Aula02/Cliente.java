package Aula02;

public class Cliente {
	private String nome;
	private String rg;
	private String cpf;
	private Estado estado;
	
	public Cliente(String nome, String rg, String cpf, Estado estado) {
		this.nome = nome;
		this.rg =rg;
		this.cpf = cpf;
		this.estado = estado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	@Override
	public String toString() {
		return nome + "\n" + rg + "\n" + cpf + "\n" + estado;
	}

}
