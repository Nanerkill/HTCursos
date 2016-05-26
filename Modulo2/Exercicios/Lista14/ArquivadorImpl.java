package Lista14;

/**
 * Created by renan on 21/05/2016.
 */
public class ArquivadorImpl implements Arquivador {

    @Override
    public boolean procurarCaracter(char c) {
        System.out.println("Procurando por caracter: " + c);
        return false;
    }

    @Override
    public String lerLinha() {
        System.out.println("Lendo linha...");
        return null;
    }

    @Override
    public void lerArquivo(String caminhoArquivo) {
        System.out.println("Lendo o arquivo: " + caminhoArquivo + " ...");
    }

    @Override
    public void gravar(String caminhoArquivo) {
        System.out.println("Gravando Arquivo " + caminhoArquivo + " ...");
    }
}
