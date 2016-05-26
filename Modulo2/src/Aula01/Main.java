package Aula01;

public class Main {

	public static void main(String[] args) {
		String n = "Jao";
		Cidade cid = new Cidade();
		cid.setName("CG");
		
		Cliente cli = new Cliente();
		
		cli.setName(n);
		cli.setCidade(cid);

	}

}
