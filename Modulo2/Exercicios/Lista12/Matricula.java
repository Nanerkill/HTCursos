package Lista12;

import java.util.Date;

public class Matricula {
	public static final double DESCONTO_PADRAO = 15;
	public static final double VALOR_PADRAO = 700;
	private Aluno aluno;
	private Curso curso;
	private Date date;
	
	public Matricula(Aluno aluno, Curso curso, Date date) {
		this.aluno = aluno;
		this.curso = curso;
		this.date = date;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public double calcularDesconto(double desc) {
		double valorPadrao = VALOR_PADRAO;
		return valorPadrao -= valorPadrao * (desc/100);
	}
	
	@Override
	public String toString() {
		return "Aluno:" + aluno.toString() +"\n" 
				+ "Curso:" + curso.toString() + "\n" 
				+ "Data:" + date.toString();
	}

}
