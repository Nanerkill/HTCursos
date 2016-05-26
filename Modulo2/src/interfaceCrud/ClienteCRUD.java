package interfaceCrud;

public class ClienteCRUD implements Crud<Cliente> {
	Cliente[] vet = new Cliente[5];
	int cont = 0;

	@Override
	public void add(Cliente obj) {
		//instanceof cliente
		if(cont == vet.length)
			resize();
		vet[cont++] = obj;
		//else
		//don't add up
	}

	@Override
	public void change(Cliente obj) {
		
		
	}

	@Override
	public void del(Cliente obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente[] getAll(Cliente obj) {
		int i = 0;
		Cliente[] newVet = new Cliente[cont]; //do tamanho de quantos ja foram adicionados
		for(Cliente x : vet) {
			if(x instanceof Cliente)
				newVet[i++] = x;
		}
		return newVet;
	}
	
	public void resize() {
		Cliente newVet[] = new Cliente[vet.length * 2];
		int cont = 0;
		for(Cliente x : vet)
			newVet[cont++] = x;
	}
	
}
