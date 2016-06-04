package Lista16;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o path do arquivo a ser lido...");
		String nome = sc.nextLine();
		
		try {
			LeitorArquivo.imprimirDadosArquivo(nome);
		} catch (LeitorException e) {
			e.printException();
			
		}
	}

}
