package Lista15;

public interface GerenciadorRegistro<E> {
	public void salvar(E obj);
	public void excluir(E obj);
	public E pesquisar(E obj);
	public void imprimirTodos();

}
