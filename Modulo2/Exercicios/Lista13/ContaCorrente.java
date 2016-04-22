package Lista13;

import sistema.banco.Correntista;

public class ContaCorrente extends Conta {
	public static final double JUROS_CONTA_CORRENTE = 10;
	
	public ContaCorrente(double saldo, Correntista correntista) {
		super(saldo, correntista);
	}

	@Override
	public void atualizarSaldo() {
		this.saldo -= saldo * (JUROS_CONTA_CORRENTE / 100);
	}
	
	@Override
	public String toString() {
		return "ContaCorrente [" + saldo + ", " + correntista.toString() + "]";
	}
	

}
