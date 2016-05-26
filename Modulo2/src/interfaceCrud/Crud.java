package interfaceCrud;

public interface Crud<E> {
	public void add(E obj);
	public void change(E obj);
	public void del(E obj);
	public E[] getAll(E obj);
	public void resize();

}
