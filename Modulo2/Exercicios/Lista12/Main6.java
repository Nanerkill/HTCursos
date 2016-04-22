package Lista12;

public class Main6 {
	public static void main(String[] args) {
		
		double salarioCalculado = new Funcionario ("Zé", 1000.0).calcularSalario(Funcionario.MARGEM_PADRAO);
		System.out.println(salarioCalculado);
	}

}
