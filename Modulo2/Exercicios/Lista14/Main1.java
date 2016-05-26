package Lista14;

/**
 * Created by renan on 21/05/2016.
 */
public class Main1 {
    public static void main(String[] args) {

        Arquivador arq1 = new Arquivador() {

            @Override
            public boolean procurarCaracter(char c) {
                return false;
            }

            @Override
            public String lerLinha() {
                return null;
            }

            @Override
            public void lerArquivo(String caminhoArquivo) {

            }

            @Override
            public void gravar(String caminhoArquivo) {

            }
        };

        Arquivador arq2 = new ArquivadorImpl();

        arq2.procurarCaracter('c');
        arq2.lerArquivo("x.doc");
        arq2.lerLinha();
        arq2.gravar("x.doc");

    }
}
