package Lista13;

import sistema.banco.Correntista;

public abstract class Conta {
	
	protected double saldo;
	protected Correntista correntista;
	
	public abstract void atualizarSaldo();
	
	public Conta(double saldo, Correntista correntista) {
		this.saldo = saldo;
		this.correntista = correntista;
	}
	
	@Override
	public abstract String toString();

}
