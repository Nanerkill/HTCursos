package Lista13;

import sistema.banco.Correntista;

public class ContaPoupanca extends Conta {
	public static final double PERC_RENDIMENTO_CONTA_POUPANCA = 1;
	
	public ContaPoupanca(double saldo, Correntista correntista) {
		super(saldo, correntista);
		//this.saldo = saldo; ??
	}

	@Override
	public void atualizarSaldo() {
		double umPerc = saldo * (PERC_RENDIMENTO_CONTA_POUPANCA / 100);
		saldo += umPerc;
	}
	
	@Override
	public String toString() {
		return "ContaPoupanca [" + saldo + ", " + correntista.toString() + "]";
	}

}
