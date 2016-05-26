package Aula05;

public class Main {
	public static void main(String[] args) {
		
		Analista an1 = new Analista("Analista de negocios");
		Diretor dir1 = new Diretor("Diretor de vendas");
		
		System.out.println(an1.calculoSalario());
		System.out.println(dir1.calculoSalario());
	}

}
