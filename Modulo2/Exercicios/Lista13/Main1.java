package Lista13;

public class Main1 {
	public static void main(String[] args) {
		
		InstrumentoMusical sax = new Sax();
		//implementa��o do m�todo abstrato tocar
		sax.tocar();
		
		InstrumentoMusical violao = new Violao();
		//implementa��o do m�todo abstrato tocar
		violao.tocar();
	}

}
