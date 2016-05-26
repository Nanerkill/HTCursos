package Aula05;

public class Analista extends Funcionario {
	
	public Analista(String cargo) {
		this.setCargo(cargo);
	}

	@Override
	public double calculoSalario() {
		return getSalario() + (getSalario()*0.05);
	}

}
