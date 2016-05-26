package Lista15;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Client test1 = new Client("Test1", 123);
		Client test2 = new Client("Test2", 354);
		Client test3 = new Client("Test3", 345);
		
		System.out.println("-----ArrayList-----\n");
		
		ClientCrudList list = new ClientCrudList();
		list.cadastrar(test1);
		list.cadastrar(test2);
		list.cadastrar(test3);
		
		System.out.println("Teste buscar todos");
		for(Client x : list.buscarTodos())
			System.out.println(x);
		
		System.out.println("Teste alterar");
		list.alterar(new Client("Renan", 123));
		for(Client x : list.buscarTodos())
			System.out.println(x);
		
		System.out.println("Teste excluir");
		list.excluir(new Client("Test2", 354));
		list.excluir(new Client("sdjhdfs", 345));
		for(Client x : list.buscarTodos())
			System.out.println(x);
		
		System.out.println();
		System.out.println("-----HashSet-----\n");
		ClientCrudSet set = new ClientCrudSet();
		set.cadastrar(test1);
		set.cadastrar(test2);
		set.cadastrar(test3);
		set.cadastrar(test2); //test set duplicate
		
		System.out.println("Teste buscar todos");
		for(Client x : set.buscarTodos())
			System.out.println(x);
		
		System.out.println("Teste alterar");
		set.alterar(new Client("Renan", 123));
		for(Client x : set.buscarTodos())
			System.out.println(x);
		
		System.out.println("Teste excluir");
		set.excluir(new Client("Renan", 354));
		set.excluir(new Client(null, 345));
		for(Client x : set.buscarTodos())
			System.out.println(x);
		
		System.out.println();
		System.out.println("-----HashMap-----\n");
		ClientCrudMap map = new ClientCrudMap();
		map.cadastrar(test1);
		map.cadastrar(test2);
		map.cadastrar(test3);
		
		System.out.println("Teste buscar todos");
		for(Client x : map.buscarTodos())
			System.out.println(x);
		
		System.out.println("Teste alterar");
		map.alterar(new Client("Renan", 123));
		for(Client x : map.buscarTodos())
			System.out.println(x);
		
		System.out.println("Teste excluir");
		map.excluir(new Client("Renan", 354));
		map.excluir(new Client(null, 345));
		for(Client x : map.buscarTodos())
			System.out.println(x);
		
	}

}
