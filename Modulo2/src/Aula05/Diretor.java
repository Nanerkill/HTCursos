package Aula05;

public class Diretor extends Funcionario {
	
	public Diretor(String cargo) {
		this.setCargo(cargo);
	}

	@Override
	public double calculoSalario() {
		return getSalario() +(getSalario() * 0.10);
	}

}
