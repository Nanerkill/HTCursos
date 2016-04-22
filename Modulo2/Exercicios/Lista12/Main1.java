package Lista12;

public class Main1 {
	public static void main(String[] args) {
		
		//2 Sobrecarca do metodo soma
		System.out.println(Calculadora.soma(10,25));
		System.out.println(Calculadora.soma(10.6,25.6, 3.6));
		
		//2 sobrecargas de construtor
		System.out.println(new Cidade("Campo Grande", new Estado("Mato Grosso do Sul", "MS")));


	}

}
