package Lista15;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans1;
		int id;
		String nome, cpf, rg, cityName, stateName, uf;
		char gender;
		GerenciadorRegistroCliente reg = new GerenciadorRegistroCliente();
		
		reg.salvar(new Cliente(9823, "Cliente test1", "cpf 238923", "rg 328923", new Cidade("Campo Grande", new Estado("Mato Grosso do Sul", "MS")), 'm'));
		reg.salvar(new Cliente(9843, "Cliente test2", "cpf 342545", "rg 523455", new Cidade("Campo Grande", new Estado("Mato Grosso do Sul", "MS")), 'f'));
		reg.salvar(new Cliente(3920, "Cliente test3", "cpf 823930", "rg 849293", new Cidade("Terenos", new Estado("Mato Grosso do Sul", "MS")), 'f'));
		reg.salvar(new Cliente(2039, "Cliente test4", "cpf 203940", "rg 483940", new Cidade("Campo Grande", new Estado("Mato Grosso do Sul", "MS")), 'm'));
		
		do {
			System.out.println("(1)Salvar");
			System.out.println("(2)Excluir");
			System.out.println("(3)Imprimir Homens");
			System.out.println("(4)Imprimir Mulheres");
			System.out.println("(5)Imprimir por Cidade");
			System.out.println("(6)Imprimir Busca por Cliente");
			System.out.println("(7)Imprimir Todos");
			System.out.println("(0)Para encerrar o programa\n");
			
			ans1 = sc.nextInt();
			sc.nextLine();
			
			switch(ans1) {
			case 1: //
				System.out.println("Digite o id, nome, cpf, rg, nome da cidade, nome do estado, uf e genero.");
				
				id = sc.nextInt();
				sc.nextLine();
				nome = sc.nextLine();
				cpf = sc.nextLine();
				rg = sc.nextLine();
				cityName = sc.nextLine();
				stateName = sc.nextLine();
				uf = sc.nextLine();
				gender = sc.nextLine().charAt(0);
				
				reg.salvar(new Cliente(id, nome, cpf, rg, new Cidade(cityName, new Estado(stateName, uf)), gender));
				System.out.println("Cliente salvo.");
				System.out.println();
				break;
				
			case 2: //
				System.out.println("Digite o id do cliente que deseja deletar.");
				id = sc.nextInt();
				sc.nextLine();
				reg.excluir(new Cliente(id, null, null, null, null, (char) 0));
				System.out.println("Cliente excluido.");
				System.out.println();
				break;
				
			case 3: //am i not repeating code? //
				System.out.println("Todos Homens.");
				List<Cliente> menArray = reg.getListaHomens();
				for(Iterator<Cliente> it = menArray.iterator(); it.hasNext();)
					System.out.println(it.next());
				System.out.println();
				break;
				
			case 4: //
				System.out.println("Todas Mulheres.");
				List<Cliente> womenArray = reg.getListaMulheres();
				for(Iterator<Cliente> it = womenArray.iterator(); it.hasNext();)
					System.out.println(it.next());
				System.out.println();
				break;
				
			case 5:
				System.out.println("Digite o nome da cidade, nome do estado e uf para pegar os alunos da cidade");
				cityName = sc.nextLine();
				stateName = sc.nextLine();
				uf = sc.nextLine();
				Cidade city = new Cidade(cityName, new Estado(stateName, uf));
				List<Cliente> arrayCity = reg.getLista(city);
				for(Iterator it = arrayCity.iterator(); it.hasNext();)
					System.out.println(it.next());
				System.out.println();
				//for(Cliente x : arrayCity)
					//System.out.println(x);
				break;
				
			case 6://
				System.out.println("Digite o id do cliente.");
				id = sc.nextInt();
				sc.nextLine(); //get enter
				Cliente cli = new Cliente(id, "", "", "", new Cidade("", new Estado("", "")), 'a');
				cli = reg.pesquisar(cli);
				System.out.println(cli);
				System.out.println();
				break;
				
			case 7://
				System.out.println("Todos clientes");
				reg.imprimirTodos();
				System.out.println();
				break;
				
			case 0:
				System.out.println();
				break;
				
			default :
				System.out.println("Entrada invalida.");
				System.out.println();
				break;
			}
			
		}while(ans1 != 0);
		
		sc.close();
		System.out.println("END");
	}

}// end Main1
