package Lista11;

public class GerenciadorMatriculas {
	private Matricula mats[] = new Matricula[2];
	private int codigoSeq = 1;
	private int cont = 0;
	
	public void add(Matricula mat) {
		if(cont == mats.length)
			resize();
		mat.setCodigo(gerarCodigoSequencial());
		mats[cont++] = mat;
	}
	
	public Matricula[] buscarMatriculas(Aluno aluno) {
		int cont = 0;
		Matricula[] retMat = new Matricula[1];
		boolean obj = true;
		for(int i  = 0; i < mats.length && obj; i++) {
			if(mats[i] != null) {
				if(mats[i].getAluno().equals(aluno)) {
					if(cont == retMat.length)
						retMat = resize(retMat);
					retMat[cont++] = mats[i];
				}
			}
			else
				obj = false;
		}
		return retMat;
	}
	
	public Matricula[] buscarMatriculas(Curso curso) {
		Matricula retMat[] = new Matricula[1];
		int cont = 0;
		boolean obj = true;
		for(int i = 0; i < mats.length && obj; i++) {
			if(mats[i] != null) {
				if(mats[i].getCurso().equals(curso)) {
					if(cont == retMat.length)
						retMat = resize(retMat);
					retMat[cont++] = mats[i];
				}
			}
			else
				obj = false;
		}
		return retMat;
	}
	
	public Matricula[] retAll() {
		Matricula[] retMat = new Matricula[1];
		boolean obj = true;
		int cont = 0;
		for(int i = 0; i < mats.length && obj; i++) {
			if(mats[i] != null) {
				if(cont == retMat.length)
					retMat = resize(retMat);
				retMat[cont++] = mats[i];
			}
			else
				obj = false;
		}
		return retMat;
	}
	
	private int gerarCodigoSequencial() {
		return codigoSeq++;
	}
	
	private Matricula[] resize(Matricula[] mat) {
		Matricula newMat[] = new Matricula[mat.length + 1];
		int cont = 0;
		for(Matricula x : mat)
			newMat[cont++] = x;
		return newMat;
	}
	
	private void resize() {
		Matricula newMat[] = new Matricula[mats.length * 2];
		int cont = 0;
		for(Matricula x : mats)
			newMat[cont++] = x;
		mats = newMat;
	}

}
