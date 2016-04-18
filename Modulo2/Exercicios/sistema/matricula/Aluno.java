package sistema.matricula;

public class Aluno extends PessoaFisica{

	public Aluno(int codigo, String nome, Cidade cidade, String cpf, String rg) {
		super(codigo, nome, cidade, cpf, rg);
	}
	
	/*public Aluno(String nome, String cpf) { //nao sei se existe
		super(nome, cpf);
	}*/

}
