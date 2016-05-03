package Lista11;

import java.util.Date;

public class Matricula {
	private int codigo = 0;
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

	public Curso getCurso() {
		return curso;
	}

	public Aluno getAluno() {
		return aluno;
	}
	
	@Override
	public String toString() {
		return codigo + "\n" + date + "\n" + curso.toString() + "\n" + aluno.toString(); 
	}
	
	@Override
	public boolean equals(Object obj) {
		Matricula mat;
		if(!(obj instanceof Matricula))
			return false;
		else {
			mat = (Matricula) obj;
			if(this.codigo != mat.codigo || !this.date.equals(mat.date) || !this.curso.equals(mat.curso) || !this.aluno.equals(mat.aluno))
				return false;
		}
		return true;
	}
	
	@Override
	public int hashCode() {
		int hash = 1;
		hash += codigo + date.hashCode() + curso.hashCode() + aluno.hashCode();
		return hash;
	}

}
