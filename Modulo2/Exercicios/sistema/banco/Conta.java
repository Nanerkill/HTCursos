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
		return numero + "\n" + agencia.toString() + "\n" + correntista.toString();
	}

}
