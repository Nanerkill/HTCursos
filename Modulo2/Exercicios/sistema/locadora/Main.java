package sistema.locadora;

import java.util.Date;


public class Main {

	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Date dateLoc1 = new Date();
		Date dateEnt1 = new Date();
		dateEnt1.setDate(dateLoc1.getDate()+5);;
		
		
		//Primeira locacao
		Genero gen1 = new Genero("Adventure");
		Autor aut1 = new Autor("Tim Burtom");
		Filme filme1 = new Filme("Alice Through the Looking Glass", gen1, aut1);
		Atendente att1 = new Atendente("Jao", "88923322-90");
		Cliente cli1 = new Cliente("Naner", "035555291-78");
		Locacao loc1 = new Locacao(cli1, filme1, dateLoc1, dateEnt1, att1);
		
		//Segunda locacao
		Genero gen2 = new Genero("Comics");
		Autor aut2 = new Autor("Christopher Nolan");
		Filme filme2 = new Filme("The Dark Knight", gen2, aut2);
		Atendente att2 = new Atendente("Maria", "88940322-90");
		Cliente cli2 = new Cliente("Renan", "035555291-78"); 
		Locacao loc2 = new Locacao(cli2, filme2, dateLoc1, dateEnt1, att2);
		
		//Terceira locaca
		Genero gen3 = new Genero("Thrillers");
		Filme filme3 = new Filme("Inception", gen3, aut2); //Mesmo diretor/Autor
		Atendente att3 = new Atendente("Juarito", "50940322-90");
		Cliente cli3 = new Cliente("DiCaprio", "035555981-78");
		Locacao loc3 = new Locacao(cli3, filme3, dateLoc1, dateEnt1, att3);
		
		
		System.out.println(loc1.toString());
		System.out.println(loc2.toString());
		System.out.println(loc3.toString());
		
		
		
		

	}

}
