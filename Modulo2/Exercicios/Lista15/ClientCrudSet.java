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
	public void excluir(Client obj) { //why not use contains and remove / clients.remove use hashcode why???
		//if(clientes.contains(obj))
			//clientes.remove(obj);
		for(Iterator<Client> it = clientes.iterator(); it.hasNext();)
			if(it.next().equals(obj))
				it.remove();
	}

	@Override
	public void alterar(Client obj) { //can I do it like this?
		//if contains obj //contains use hashCode
		for(Iterator<Client> it = clientes.iterator(); it.hasNext();) {
			if(it.next().equals(obj)) {
				it.remove();
				clientes.add(obj);
				break; //don't know why
			}
		}
	}

	@Override
	public Client[] buscarTodos() {
		Object vet[] = clientes.toArray();
		Client cli[] = new Client[vet.length];
		for(int i = 0; i < vet.length; i++)
			if(vet[i] instanceof Client)
				cli[i] = (Client) vet[i];
		return cli;
	}

}
