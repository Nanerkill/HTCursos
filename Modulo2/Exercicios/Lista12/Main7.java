package Lista12;

import java.util.Date;

public class Main7 {
	public static void main(String[] args) {
		
		Double valor = new Matricula(new Aluno("Jao"), new Curso("JAVA"), new Date()).calcularDesconto(Matricula.DESCONTO_PADRAO);
		System.out.println(valor);
	}

}
