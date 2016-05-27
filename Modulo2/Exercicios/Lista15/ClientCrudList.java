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
		for(int i  = 0; i < clientes.size(); i++)
			if(clientes.get(i).getId() == obj.getId())
				clientes.remove(i);
	}

	@Override
	public void alterar(Client obj) { //can i use contains??
		for(int i  = 0; i < clientes.size(); i++) {
			if(clientes.get(i).getId() == obj.getId())
				clientes.set(i, obj);
		}
	}

	@Override
	public Client[] buscarTodos() { //easier way to do?
		return clientes.toArray(new Client[clientes.size()]);
	}

}
