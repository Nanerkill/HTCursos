package Lista11;

public class Professor extends Funcionario {
	private Disciplina disciplina;

	public Professor(int codigo, String nome, Cidade cidade, String cpf, String rg, String cargo, double salario, Disciplina disciplina) {
		super(codigo, nome, cidade, cpf, rg, cargo, salario);
		this.disciplina = disciplina;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" + disciplina;
	}
	
	@Override
	public boolean equals(Object obj) {
		Professor prof;
		if(!(obj instanceof Professor))
			return false;
		else {
			prof = (Professor) obj;
			if(!super.equals((Funcionario) prof) || !prof.disciplina.equals(this.disciplina))
				return false;
		}
		return true;
	}
	
	@Override
	public int hashCode() {
		int hash = 1;
		hash += super.hashCode() + disciplina.hashCode();
		return hash;
	}

}
