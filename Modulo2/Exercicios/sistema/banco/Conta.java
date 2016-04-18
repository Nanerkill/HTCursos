package sistema.banco;

public class Conta {
	private int numero;
	private Agencia agencia;
	private Correntista correntista;
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public Agencia getAgencia() {
		return agencia;
	}
	
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	
	public Correntista getCorrentista() {
		return correntista;
	}
	
	public void setCorrentista(Correntista correntista) {
		this.correntista = correntista;
	}
	
	public String toString() {
		String nome = correntista.getNome();
		String banco = agencia.getBanco().getNome();
		String agencia = this.agencia.getNome(); 
		String local = this.agencia.getLogadouro().getRua() + "\n" + this.agencia.getLogadouro().getBairro() +
				"\n" + this.agencia.getLogadouro().getCep() + "\n" + this.agencia.getLogadouro().getCidade().getNome() +
				"\n" + this.agencia.getLogadouro().getCidade().getEstado().getNome() + "\n" +
				this.agencia.getLogadouro().getCidade().getEstado().getUf();
		
		String returning = "Nome: " + nome + "\n" +
				"Banco: " + banco + "\n" +
				"Agencia: " + agencia + "\n" +
				"Local: " + local + "\n";
		
		return returning;
	}

}
