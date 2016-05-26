package Lista14;

/**
 * Created by renan on 22/05/2016.
 */
public class Cobranca {
    private Produto[] product;
    private double[] qtd;
    private int cont = 0;
    private double total;
    private int qtdTotal = 0;

    public Cobranca(int size) {
        product = new Produto[size];
        qtd = new double[size];
    }

    public void adicionar(Produto p, int qtd) {
        if(cont == product.length)
            System.out.println("No space");
        else {
            product[cont] = p;
            this.qtd[cont++] = qtd;
            total += p.getValor() * qtd;
            qtdTotal += qtd;
        }
    }

    public void imprimirRelatorio() {
        System.out.println("Refeições---------\n");

        for(int i  = 0; i < product.length; i++) {
            System.out.println(product[i] + " " + "Quantidade: " + qtd[i]);
        }

        System.out.println();
        System.out.printf("Total: R$ %.1f Quantidade total: %d\n", total, qtdTotal);
    }

    //preguiça de fazer o resize
}
