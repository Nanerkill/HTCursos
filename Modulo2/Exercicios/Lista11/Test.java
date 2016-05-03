package Lista11;

public class Test {
	public static void main(String[] args) {
		
		PessoaFisica pes1 = new PessoaFisica(123312, "Renan", new Cidade("CG", new Estado("MatSul", "MS")), "cpf 3242", "rg 1232");
		PessoaFisica pes2 = new PessoaFisica(34534, "Anderson", new Cidade("SaoP", new Estado("Sao", "SP")), "cpf 3231", "rg 1345");
		PessoaFisica pes3 = new PessoaFisica(123312, "Renan", new Cidade("CG", new Estado("MatSul", "MS")), "cpf 3242", "rg 1232");
		
		if(!pes1.equals(pes2))
			System.out.println("Yay");
		else
			System.out.println("Nay");
		
		if(pes1.hashCode() != pes2.hashCode())
			System.out.println("Yay");
		else
			System.out.println("Nay");
		
		if(pes1.equals(pes3))
			System.out.println("Yay");
		else
			System.out.println("Nay");
		
		if(pes1.hashCode() == pes3.hashCode())
			System.out.println("Yay");
		else
			System.out.println("Nay");
		
		System.out.println(pes1.hashCode());
		System.out.println(pes2.hashCode());
		System.out.println(pes3.hashCode());
	}

}
