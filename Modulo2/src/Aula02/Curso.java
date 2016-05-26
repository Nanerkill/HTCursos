package Aula02;

public class Curso {
	private int cargaHoraria;
	private String nome;
	
	public Curso(int cargaHoraria, String nome) {
		this.cargaHoraria = cargaHoraria;
		this.nome = nome;
	}
	
	//get & set
	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return nome + "\n" + cargaHoraria;
	}

}
