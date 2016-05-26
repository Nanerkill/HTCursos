package Lista15;

import java.util.ArrayList;
import java.util.List;

public class ClientCrudList implements Crud<Client> {
	List<Client> clientes = new ArrayList<Client>();

	@Override
	public void cadastrar(Client obj) {
		clientes.add(obj);
	}

	@Override
	public void excluir(Client obj) {
		//if(clientes.contains(obj)) //do I need this? // clients.remove use equals????????
			clientes.remove(obj); //already checks if it exist
	}

	@Override
	public void alterar(Client obj) { //can i use contains??
		for(int i  = 0; i < clientes.size(); i++) {
			if(clientes.get(i).equals(obj))
				clientes.set(i, obj);
		}
	}

	@Override
	public Client[] buscarTodos() { //easier way to do?
		Object vet[] = clientes.toArray();
		Client[] cli = new Client[vet.length];
		for(int i = 0; i < vet.length; i++)
			if(vet[i] instanceof Client)
				cli[i] = (Client) vet[i];
		return cli;
	}

}
