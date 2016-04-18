package sistema.matricula;

import java.util.Date;

public class Matricula {
	private int codigo;
	private Date date;
	private Curso curso;
	private Aluno aluno;
	
	public Matricula(Date date, Curso curso, Aluno aluno) {
		this.date = date;
		this.curso = curso;
		this.aluno = aluno;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	@Override
	public String toString() {
		return codigo + "\n" + date + "\n" + curso.toString() + "\n" + aluno.toString();
	}

}
