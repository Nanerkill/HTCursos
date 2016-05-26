package Aula02;

public class Matricula {
	private Cliente cliente;
	private Curso curso;
	
	public Matricula(Curso curso, Cliente cliente) {
		this.curso = curso;
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	@Override
	public String toString() {
		return cliente.toString() + "\n" + curso.toString();
	}

}
