package Aula06;

public class Main {
	public static void main(String[] args) {
		
		Veiculo rolema = new CarrinhoRolema();
		rolema.acelerar();
		rolema.frear();
		
		Veiculo passeio = new CarroPasseio();
		passeio.acelerar();
		passeio.frear();
		
		Pessoa jao = new Pessoa();
		jao.veiculo = rolema;
		
		Pessoa maria = new Pessoa();
		maria.veiculo = passeio;
		
		if(maria.veiculo instanceof Automovel) {
			((Automovel)maria.veiculo).ano=200;
		}
		
		
		//classe criada para objetos anonimos
		/*class Anonimo implements Veiculo {
			public void acelerar() {
				System.out.println("Anonimo acelerando");
			}
			public void frear() {
				System.out.println("Anonimo freando");
			}
		}*/
		
		//objetos anonimos
		Veiculo v3 = new Veiculo() {
			public void acelerar() {
				System.out.println("Anonimo acelerando");
			}
			public void frear() {
				System.out.println("Anonimo freando");
			}
		};
		
		v3.acelerar();
		v3.frear();
		
	}

}
