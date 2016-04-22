package Lista12;

public class Main2 {
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Edson Silva de Souza", "904.567.973-88","0009264-86 SSP/MS", new Cidade("Campo Grande", new Estado("Mato Grosso do Sul", "MS")));
		Cliente cliente2 = new Cliente("Zé Bento dos Santos", new Cidade("Campo Grande", new Estado("Mato Grosso do Sul", "MS")));
		System.out.println(cliente1);
		System.out.println(cliente2);

	}

}
