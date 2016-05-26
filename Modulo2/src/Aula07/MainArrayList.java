package Aula07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainArrayList {
	public static void main(String[] args) {
		
		List<Cliente> clientes = new ArrayList<>();
		
		clientes.add(new Cliente("Jão"));
		clientes.add(new Cliente("Zé"));
		clientes.add(new Cliente("Maria"));
		clientes.add(new Cliente("Maria"));
		
		System.out.println("--------Index---------");
		
		for(int i  = 0; i < clientes.size(); i++) {
			System.out.println(clientes.get(i));
		}
		
		System.out.println("------Iterator---------");
		
		//iterator is an object that has all adresses from the collection
		for(Iterator<Cliente> it = clientes.iterator(); it.hasNext();) {
			System.out.println((Cliente) it.next()); //eu tenho que fazer o casting?
		}
		
		//or
		/*
		 * Iterator<Cliente> iterator = clientes.iterator();
		 * while(iterator.hasNext) {
		 * 		SYSO(iterator.next());
		 * }
		 * 
		 */
		
		System.out.println("------For each--------");
		
		for(Cliente x : clientes)
			System.out.println(x);
	}

}
