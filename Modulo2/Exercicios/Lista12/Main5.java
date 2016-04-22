package Lista12;

public class Main5 {
	public static void main(String[] args) {
		
		double salarioFuncionario = new Funcionario ("Zé", 100.5).getSalario();
		
		double salarioProgramador = new Programador("Jão",1000.4).getSalario();
		
		double diferenca = Calculadora.subtrair(salarioFuncionario, salarioProgramador);
		
		System.out.println(diferenca);
	}

}
