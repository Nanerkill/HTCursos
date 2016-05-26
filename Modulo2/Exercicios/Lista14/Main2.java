package Lista14;

/**
 * Created by renan on 22/05/2016.
 */
public class Main2 {
    public static void main(String[] args) {

        Produto almoco = new Refeicao(TipoProdutoEnum.ALMOCO, 12.0);
        Produto marmita = new Refeicao(TipoProdutoEnum.MARMITA, 10.0);
        Produto suco = new Bebida(TipoProdutoEnum.SUCO, 5.0);
        Produto refrigerante = new Bebida(TipoProdutoEnum.REFRIGERANTE, 6.0);

        Produto almocoPromocional = new Produto() {
            @Override
            public double getValor() {
                return 8.0;
            }
            @Override
            public TipoProdutoEnum getTipo() {
                return TipoProdutoEnum.ALMOCO;
            }

            @Override
            public String toString() {
                return getTipo().toString() + ": R$ " + getValor();
            }
        };

        Cobranca cobranca = new Cobranca(5);

        cobranca.adicionar(almoco, 1);
        cobranca.adicionar(marmita, 2);
        cobranca.adicionar(suco, 1);
        cobranca.adicionar(refrigerante, 1);
        cobranca.adicionar(almocoPromocional, 2);

        cobranca.imprimirRelatorio();


    }
}
