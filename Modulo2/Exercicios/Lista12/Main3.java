package Lista12;

import java.util.Date;

public class Main3 {
	public static void main(String[] args) {
		
		Matricula matricula = new Matricula(new Aluno("Jao da Silva"), new Curso("Fábrica de Programador"), new Date());
		System.out.println(matricula);
		
		
		
		//Saida +-
		//Aluno:Jao da Silva
		//Curso:Fábrica de Programador
		//Data:Fri May 09 15:08:35 AMT 2014

	}

}
