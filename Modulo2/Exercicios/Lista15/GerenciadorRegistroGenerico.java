package Lista15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GerenciadorRegistroGenerico<E> implements GerenciadorRegistro<E> {
	
	List<E> arrayList = new ArrayList<E>();

	@Override
	public void salvar(E obj) {
		arrayList.add(obj);
	}

	@Override
	public void excluir(E obj) {
		arrayList.remove(obj);
	}

	@Override
	public E pesquisar(E obj) {
		E newObj;
		for(int i = 0; i < arrayList.size(); i++) {
			//Do I have to check if it's an instanceof E
			newObj = (E) arrayList.get(i);
			if(obj.equals(newObj))
				return newObj;
		}
			
		/*for(Iterator<E> it = arrayList.iterator(); it.hasNext();)
			if(it.next().equals(obj))
				return it.next();*/
		return null;
	}

	@Override
	public void imprimirTodos() {
		for(Iterator<E> it = arrayList.iterator(); it.hasNext();)
			System.out.println(it.next().toString());
	}

	

}
