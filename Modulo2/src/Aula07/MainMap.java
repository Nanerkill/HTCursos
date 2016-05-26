package Aula07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainMap {
	public static void main(String[] args) {
		
		Map<Integer, Cliente> clientes = new HashMap<>();
		
		clientes.put(100, new Cliente("Jao"));
		clientes.put(101, new Cliente("Ze"));
		clientes.put(102, new Cliente("Maria"));
		
		System.out.println(clientes.get(101));
		
		//retorna todas as keys do tipo escolido na instanciaçaõ do codigo
		
		Set<Integer> keys = clientes.keySet();
		for(Integer x : keys) {
			System.out.println(clientes.get(x));
		}
		
	}

}
