
package jogomemoria.model;

public class PecaTabuleiro {
  private int numero;
  private int idImagem;
  private int linha;
  private int coluna;
  private boolean virada;

   public int getNumero() {
        return numero;
    }

    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
     public int getIdImagem() {
        return idImagem;
    }

    
    public void setIdImagem(int idImagem) {
        this.idImagem = idImagem;
    }
  
    public int getLinha() {
        return linha;
    }

    
    public void setLinha(int linha) {
        this.linha = linha;
    }

    
    public int getColuna() {
        return coluna;
    }

    
    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    /**
     * @return the virada
     */
    public boolean isVirada() {
        return virada;
    }

    /**
     * @param virada the virada to set
     */
    public void setVirada(boolean virada) {
        this.virada = virada;
    }
      
  
}
