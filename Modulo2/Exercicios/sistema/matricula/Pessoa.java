package sistema.matricula;

public class Pessoa {
	private int codigo; //codigo quando criar
	private String nome;
	private Cidade cidade;
	
	public Pessoa(int codigo, String nome, Cidade cidade) {
		this.codigo = codigo;
		this.nome = nome;
		this.cidade = cidade;
	}
	
	public Pessoa(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	@Override
	public String toString() {
		return codigo + "\n" + nome + "\n" + cidade.toString();
	}

}
