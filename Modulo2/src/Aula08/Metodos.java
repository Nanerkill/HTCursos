package Aula08;

public class Metodos {
	
	public void a(String cpf) {
		try {
			b(cpf);
		} catch (ValidacaoException e) {
			e.printStackTrace();
		}
	}
	
	private void b(String cpf) throws ValidacaoException {
		c(cpf);
	}
	
	private void c(String cpf) throws ValidacaoException {
		ValidacaoUtil.validaCPF(cpf);
	}

}
