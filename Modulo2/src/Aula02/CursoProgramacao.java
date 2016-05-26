package Aula02;

public class CursoProgramacao extends Curso {
	private Linguagem linguagem;
	
	public CursoProgramacao(int cargaHoraria, String nome, Linguagem linguagem) {
		super(cargaHoraria, nome);
		this.linguagem = linguagem;
	}
	
	//get & set
	public Linguagem getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(Linguagem linguagem) {
		this.linguagem = linguagem;
	}
	
	@Override
	public String toString() {
		return this.getNome() + "\n" + this.getCargaHoraria() + "\n" + linguagem.toString();
	}
		
}
