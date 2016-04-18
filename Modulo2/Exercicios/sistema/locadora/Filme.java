package sistema.locadora;

public class Filme {
	private String nome;
	private Genero genero;
	private Autor autor;
	
	public Filme(String nome, Genero gnr, Autor aut) {
		this.nome = nome;
		this.genero = gnr;
		this.autor = aut;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Genero getGenreo() {
		return genero;
	}
	
	public void setGenreo(Genero genreo) {
		this.genero = genreo;
	}
	
	public Autor getAutor() {
		return autor;
	}
	
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
}
