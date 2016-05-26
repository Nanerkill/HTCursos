package Aula03;

public class Main {
	public static void main(String[] args) {
		
		Funcionario funcs[] = new Funcionario[2];
		
		Pintor p1 = new Pintor();
		p1.setSalario(1000);
		
		Mecanico m1 = new Mecanico();
		m1.setSalario(1000);
		
		funcs[0] = p1;
		funcs[1] = m1;
		
		for(Funcionario x : funcs) {
			System.out.println(x.calcularSalario());
		}
		
	}

}
