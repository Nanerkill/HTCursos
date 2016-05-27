package Lista15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ClientCrudSet implements Crud<Client> {
	Set<Client> clientes = new HashSet<Client>();

	@Override
	public void cadastrar(Client obj) {
		clientes.add(obj);
	}

	@Override
	public void excluir(Client obj) { 
		for(Iterator<Client> it = clientes.iterator(); it.hasNext();) {
			if(it.next().getId() == obj.getId())
				it.remove();
		}
	}

	@Override
	public void alterar(Client obj) {
		for(Iterator<Client> it = clientes.iterator(); it.hasNext();) {
			if(it.next().getId() == obj.getId()) {
				it.remove();
				clientes.add(obj);
				break; //don't know why // because i broke the iterator
			}
		}
	}

	@Override
	public Client[] buscarTodos() {
		return clientes.toArray(new Client[clientes.size()]);
	}

}
