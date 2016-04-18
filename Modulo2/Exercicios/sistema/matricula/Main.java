package sistema.matricula;

import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GerenciadorMatricula gen = new GerenciadorMatricula();
		
		int cont  = 3;
		
		while(cont > 0) {
			System.out.println("Digite o codigo do Aluno, o nome, o nome da cidade, do estado, seu cpf e rg.");
			int codigo = sc.nextInt();
			sc.nextLine(); //pegar o enter do nextInt()
			Aluno al = new Aluno(codigo, sc.nextLine(), new Cidade(sc.nextLine(), new Estado(sc.nextLine())), sc.nextLine(), sc.nextLine());
			
			System.out.println("Digite o curso e carga horaria.");
			Matricula mat = new Matricula(new Date(), new Curso(sc.nextLine(), sc.nextInt()), al);
			sc.nextLine(); // pegar enter
			gen.cadastrar(mat);
			cont--;
		}
		
		
		System.out.println("Digite um codigo de aluno para buscar as matriculas");
		Matricula[] mats = gen.buscarMatriculas(new Aluno(sc.nextInt(), null, null, null, null));
		if(mats[0] != null) //tem matricula
			for(Matricula x : mats)
				System.out.println(x);
		else
			System.out.println("Aluno inexistente.");
		
		//print all
		for(Matricula x : gen.returnMat())
			System.out.println(x);
		
		sc.close();
	}

}
