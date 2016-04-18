package sistema.matricula;

public class Professor extends Funcionario {
	private Disciplina disciplina;

	public Professor(int codigo, String nome, Cidade cidade, String cpf, String rg, String cargo, double salario, Disciplina disciplina) {
		super(codigo, nome, cidade, cpf, rg, cargo, salario);
		this.disciplina = disciplina;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	public String toString() {
		return super.toString() + "\n" + disciplina.toString();
	}

}
