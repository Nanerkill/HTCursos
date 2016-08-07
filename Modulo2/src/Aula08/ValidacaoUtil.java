package Aula08;

public class ValidacaoUtil {
	
	public static void validaCPF(String cpf) throws ValidacaoException {
		if(cpf == null || cpf.length() != 11)
			throw new ValidacaoException();
		}

}
