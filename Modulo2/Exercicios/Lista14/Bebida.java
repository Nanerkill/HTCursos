package Lista14;

/**
 * Created by renan on 22/05/2016.
 */
public class Bebida implements Produto {
    private double valor;
    private TipoProdutoEnum tipo;

    public Bebida(TipoProdutoEnum tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public TipoProdutoEnum getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return tipo.toString() + ": " + "R$ " + valor;
    }
}
