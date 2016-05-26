package sistema.banco;

public class Agencia {
	private int codigo;
	private String nome;
	private Logadouro logadouro;
	private int numero;
	private Banco banco;
	
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
	public Logadouro getLogadouro() {
		return logadouro;
	}
	public void setLogadouro(Logadouro logadouro) {
		this.logadouro = logadouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Banco getBanco() {
		return banco;
	}
	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	
	public String toString() {
		return codigo + "\n" + nome + "\n" + logadouro.toString() + "\n" + numero + "\n" + banco.toString();
	}
	

}
