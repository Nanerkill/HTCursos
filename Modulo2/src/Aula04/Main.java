package Aula04;

public class Main {

	public static void main(String[] args) {
		
		Computador c1 = new Computador("Accer", 8);
		Computador c2 = new Computador("Asus", 16);
		Computador c3 = c1;
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		
		if(c1.hashCode() == c3.hashCode())
			System.out.println(c1.hashCode());

	}

}
