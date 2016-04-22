package Lista13;

public class Main1 {
	public static void main(String[] args) {
		
		InstrumentoMusical sax = new Sax();
		//implementação do método abstrato tocar
		sax.tocar();
		
		InstrumentoMusical violao = new Violao();
		//implementação do método abstrato tocar
		violao.tocar();
	}

}
