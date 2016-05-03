package Lista11;

public class Aluno extends PessoaFisica {

	public Aluno(int codigo, String nome, Cidade cidade, String cpf, String rg) {
		super(codigo, nome, cidade, cpf, rg);
	}
	
	@Override
	public String toString() {
		return super.getNome() + "\n" + super.getCpf() + "\n" + super.getRg();
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno al;
		if(!(obj instanceof Aluno))
			return false;
		else {
			al = (Aluno) obj;
			if(!super.equals((PessoaFisica) al))
				return false;
		}
		return true;
	}
	
	@Override
	public int hashCode() {
		int hash = 1;
		hash += super.hashCode();
		return hash;
	}

}
