package Aula02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = -1;
		
		Gerenciador gen = new Gerenciador();
		
		do {
			System.out.println("1 para add aluno.");
			System.out.println("2 para printar tudo.");
			
			ans = sc.nextInt();
			sc.nextLine(); //get enter
			
			switch(ans) {
			case 1:
				gen.add(new Matricula(new Curso(30, "ES"), new Cliente("Renan", "84334", "89238907", new Estado("MS"))));
				break;
				
			case 2:
				//if tem 3 alunos
				gen.toString();
				break;
			
			default:
				System.out.println("Invalido.");
				break;
			}
			
		}while(ans != 0);
		 System.out.println("Bye bye.");
		 
		 sc.close();
	}

}
