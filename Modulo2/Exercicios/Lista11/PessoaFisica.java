package Lista11;

public class PessoaFisica extends Pessoa {
	private String cpf;
	private String rg;
	
	public PessoaFisica(int codigo, String nome, Cidade cidade, String cpf, String rg) {
		super(codigo, nome, cidade);
		this.cpf= cpf;
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public String getRg() {
		return rg;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" + cpf + "\n" + rg;
	}
	
	//is there a better way to do this?
	@Override
	public boolean equals(Object obj) {
		PessoaFisica pes;
		if(!(obj instanceof PessoaFisica))
			return false;
		else {
			pes = (PessoaFisica) obj;
			if(!super.equals((Pessoa) pes) || !this.cpf.equals(pes.cpf) || !this.rg.equals(pes.rg))
				return false;
		}
		return true;
	}
	
	@Override
	public int hashCode() {
		int hash = 1;
		hash += super.hashCode() + cpf.length() + rg.length();
		return hash;
	}
	
	

}
