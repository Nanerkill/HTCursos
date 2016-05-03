package Lista11;

import java.util.Date;

public class Main11 {
	public static void main(String[] args) {
		
		Date date = new Date();
		
		Matricula mat1 = new Matricula(date, new Curso("EngSoft", 180), new Aluno(2345, "Renan", new Cidade("CG", new Estado("MatSul", "MS")), "cpf 4234", "rg 3245"));
		Matricula mat2 = new Matricula(date, new Curso("EngSoft", 180), new Aluno(2345, "Renan", new Cidade("CG", new Estado("MatSul", "MS")), "cpf 4234", "rg 3245"));
		
		if(mat1.equals(mat2))
			System.out.println("Mat1 equals Mat2");
		else
			System.out.println("Mat1 !equals Mat2");
		
		if(mat1.hashCode() == mat2.hashCode())
			System.out.println("Mat1 hash == mat2 hash");
		else
			System.out.println("Mat1 hash != mat2 hash");
		
		System.out.println(mat1.hashCode());
		System.out.println(mat2.hashCode());
		
		System.out.println();
		
		mat2 = new Matricula(new Date(), new Curso("EngComp", 100), new Aluno(3893, "Anderson", new Cidade("Sao", new Estado("SaoP", "SP")), "cpf 2345", "rg 4565"));
		
		if(mat1.equals(mat2))
			System.out.println("Mat1 equals Mat2");
		else
			System.out.println("Mat1 !equals Mat2");
		
		if(mat1.hashCode() == mat2.hashCode())
			System.out.println("Mat1 hash == mat2 hash");
		else
			System.out.println("Mat1 hash != mat2 hash");
		
		System.out.println(mat1.hashCode());
		System.out.println(mat2.hashCode());
		
		
		
		
		Matricula mat3 = new Matricula(new Date(), new Curso("Arq", 120), new Aluno(3455, "Gabriela", new Cidade("CG", new Estado("MatSul", "MS")), "cpf 4564", "rg 5436"));
		Matricula mat4 = new Matricula(new Date(), new Curso("Ing", 80), new Aluno(3455, "Gabriela", new Cidade("CG", new Estado("MatSul", "MS")), "cpf 4564", "rg 5436"));
		Matricula mat5 = new Matricula(new Date(), new Curso("Ing", 80), new Aluno(4576, "Armando", new Cidade("CG", new Estado("MatSul", "MS")), "cpf 5678", "rg 4356"));
		
		GerenciadorMatriculas gen = new GerenciadorMatriculas();
		gen.add(mat1);
		gen.add(mat2);
		gen.add(mat3);
		gen.add(mat4);
		gen.add(mat5);
		
		System.out.println();
		System.out.println("Print all");
		
		Matricula mats[] = gen.retAll();
		
		for(Matricula x : mats) {
			System.out.println();
			System.out.println(x);
		}
		
		System.out.println();
		
		Aluno alB = new Aluno(3455, "Gabriela", new Cidade("CG", new Estado("MatSul", "MS")), "cpf 4564", "rg 5436");
		
		mats = gen.buscarMatriculas(alB);
		System.out.println("Matriculas de " + alB.getNome());
		for(Matricula x : mats) {
			System.out.println();
			System.out.println(x);
		}
		
		System.out.println();
		
		Curso curs = new Curso("Ing", 80);
		System.out.println("Matriculas do curso " + curs.getNome());
		mats = gen.buscarMatriculas(curs);
		for(Matricula x : mats) {
			System.out.println();
			System.out.println(x);
		}
		
		
		
		System.out.println();
		System.out.println(mat1.hashCode());
		System.out.println(mat2.hashCode());
		System.out.println(mat3.hashCode());
		System.out.println(mat4.hashCode());
		System.out.println(mat5.hashCode());
	}
}
