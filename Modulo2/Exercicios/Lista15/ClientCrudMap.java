package Lista15;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ClientCrudMap implements Crud<Client> {
	private int key = 1;
	
	Map<Integer, Client> map = new HashMap<Integer, Client>();

	@Override
	public void cadastrar(Client obj) {
		map.put(key(), obj);
	}

	@Override
	public void excluir(Client obj) {
		Set<Integer> keys = map.keySet();
		for(Integer x : keys)
			if(map.get(x).getId() == obj.getId()) {
				map.remove(x);
				break; //don't know why... // because once you remove something the iterator breaks
			}
	}

	@Override
	public void alterar(Client obj) {
		Set<Integer> keys = map.keySet();
		for(Integer x : keys)
			if(map.get(x).getId() == obj.getId())
				map.put(x, obj);
	}

	@Override
	public Client[] buscarTodos() {
		Set<Integer> keys = map.keySet();
		Client vet[] = new Client[map.size()];
		int i = 0;
		for(Integer x : keys)
			vet[i++] = map.get(x);
		return vet;
	}
	
	private int key() {
		return this.key++;
	}

}
