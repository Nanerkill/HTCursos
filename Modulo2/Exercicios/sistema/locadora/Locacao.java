package sistema.locadora;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Locacao {
	private Cliente cliente;
	private Filme filme;
	private Date dataLocacao;
	private Date dataEntrega;
	private Atendente atendente;
	
	public Locacao(Cliente cliente, Filme filme, Date dataLoc, Date dataEnt, Atendente att) {
		this.cliente = cliente;
		this.filme = filme;
		this.dataLocacao = dataLoc;
		this.dataEntrega = dataEnt;
		this.atendente = att;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Filme getFilme() {
		return filme;
	}
	
	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	
	public Date getDataLocacao() {
		return dataLocacao;
	}
	
	public void setDataLocacao(Date dataLocacao) {
		this.dataLocacao = dataLocacao;
	}
	
	public Date getDataEntrega() {
		return dataEntrega;
	}
	
	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	
	public Atendente getAtendente() {
		return atendente;
	}
	
	public void setAtendente(Atendente atendente) {
		this.atendente = atendente;
	}
	
	DateFormat df = new SimpleDateFormat("dd/MM/yy");
	
	public String toString() {
		String cliente = this.cliente.getNome() + "\n" +
				this.cliente.getCpf();
		String filme = "Nome: " + this.filme.getNome() + "\n" + 
				"Diretor: " + this.filme.getAutor().getNome() + "\n" +
				"Genero: " + this.filme.getGenreo().getDescricao();
		String dates = "Data de locacao: " + df.format(dataLocacao) + "\n"
				+ "Data a entregar: " + df.format(dataEntrega);
		String atendente = "Atendente: " + this.atendente.getNome() + "\n"
				+ this.atendente.getCpf();
		
		String returning = "Cliente: " + cliente + "\n"
				+ filme + "\n" + dates + "\n" + atendente + "\n";
		
		return returning;
	}

}
