package sistema.matricula;

public class GerenciadorMatricula {
	private Matricula [] matriculas = new Matricula[10];
	private int codigoSeq = 1;
	private int cont = 0;
	
	public void cadastrar(Matricula mat) {
		if(cont == matriculas.length)
			resize();
		mat.setCodigo(gerarCodigoSequencial());
		matriculas[cont] = mat; 
		cont++;
	}
	
	//vetor comeca com 1 posicao apenas caso ache mais que uma vai adicionando posicao por posicao
	public Matricula[] buscarMatriculas(Aluno aluno) {
		Matricula[] retMat = new Matricula[1];
		int cont2 = 0;
		boolean obj = true;
		for(int i = 0; i < matriculas.length && obj; i++) {
			if(matriculas[i] != null) {
				if(matriculas[i].getAluno().getCodigo() == aluno.getCodigo()) {
					if(cont2 == retMat.length)
						retMat = resize2(retMat);
					retMat[cont2] = matriculas[i];
					cont2++;
				}
			}
			else
				obj = false;
		}
		return retMat;
	}
	
	
	//remove deve retirar e em seguida mover todos a esquerda
	
	
	/**
	 * Retorna um vetor de Matricula
	 * @return
	 */
	public Matricula[] returnMat() {
		boolean obj = true;
		Matricula[] retMat = new Matricula[2]; //comeca com dois para tentar resolver o problema de tmnho
		for(int i = 0; i < matriculas.length && obj; i++) {
			if(matriculas[i] != null) {
				if(i == retMat.length)
					retMat = resize2(retMat);
				retMat[i] = matriculas[i];
			}
			else
				obj = false;
		}
		return retMat;
	}
	
	private int gerarCodigoSequencial() {
		return codigoSeq++;
	}
	
	private void resize() {
		Matricula[] newMat = new Matricula[matriculas.length*2];
		int i = 0;
		for(Matricula x : matriculas)
			newMat[i++] = x;
		matriculas = newMat;
	}
	
	private Matricula[] resize2(Matricula[] mat) {
		Matricula[] newMat = new Matricula[mat.length + 1];
		int i = 0;
		for(Matricula x : mat)
			newMat[i++] = x;
		return newMat;
	}

}
