package Lista15;

public interface Crud<E> {
	
	public void cadastrar(E obj);
	public void excluir(E obj);
	public void alterar(E obj);
	public E[] buscarTodos();

}
