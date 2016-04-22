package Lista12;

public class Main8 {
	public static void main(String[] args) {
		
		double salarioCalculado = new Funcionario("Zé", 1000.0).calcularSalario(2.5, Funcionario.SALARIO_MINIMO, Funcionario.MARGEM_PADRAO);
		// deve imprimir 2 salários minimos e meio mais a margem padrao
		// (Renan) mas entao para que serve o salario colocado na criacao do funcionario?
		System.out.println(salarioCalculado);
	}

}
