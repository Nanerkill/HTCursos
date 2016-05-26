package Lista14;

/**
 * Created by renan on 21/05/2016.
 */
public interface Arquivador {
    public boolean procurarCaracter(char c);
    public String lerLinha();
    public void lerArquivo(String caminhoArquivo);
    public void gravar(String caminhoArquivo);

}
