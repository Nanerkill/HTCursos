package Lista15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GerenciadorRegistroCliente extends GerenciadorRegistroGenerico<Cliente> {
	
	public List<Cliente> getListaHomens() {
		//arrayList soh com homen
		List<Cliente> arrayMen = new ArrayList<Cliente>();
		for(int i = 0; i < arrayList.size(); i++)
			if(arrayList.get(i).getGenero() == 'M' || arrayList.get(i).getGenero() == 'm')
				arrayMen.add(arrayList.get(i));
		return arrayMen;
	}
	
	public List<Cliente> getListaMulheres() {
		//arrayList soh com mulheres
		List<Cliente> arrayWomen = new ArrayList<Cliente>();
		for(int i = 0; i < arrayList.size(); i++)
			if(arrayList.get(i).getGenero() == 'F' || arrayList.get(i).getGenero() == 'f')
				arrayWomen.add(arrayList.get(i));
		return arrayWomen;
	}
	
	public List<Cliente> getLista(Cidade cidade) {
		List<Cliente> arrayCity = new ArrayList<Cliente>();
		for(int i = 0; i < arrayList.size(); i++)
			if(arrayList.get(i).getCidade().equals(cidade))
				arrayCity.add(arrayList.get(i));
		/*for(Iterator<Cliente> it = arrayList.iterator(); it.hasNext();)
			if(it.next().getCidade().equals(cidade))
				arrayCity.add(it.next());*/
		return arrayCity;
	}

}
