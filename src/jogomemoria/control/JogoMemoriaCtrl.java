
package jogomemoria.control;

import java.sql.Timestamp;

public class JogoMemoriaCtrl {
    public static final int FACIL=1;
    public static final int INTERMEDIARIO=2;
    public static final int DIFICIL=3;
    public static final int MAX_PECAS_PARTIDA=18;
    public static final int MAX_PECAS_DISPONIVEIS=20;
    public static final int QTDE_PECAS_FACIL=16;
    public static final int QTDE_PECAS_INTERMEDIARIO=36;
    public static final int QTDE_PECAS_DIFICIL=54;
    private boolean jogoIniciado; //se jogo esta ou nao iniciado
    private Timestamp inicioJogo; //quando se iniciou o jogo
    private int tempoLimite; //quando acaba o jogo
    private int tabRecords[][] = {{0,0,0},
                                  {0,0,0},
                                  {0,0,0}};//matriz dos recordes e medalhas
    private int potuacaoAtual; //Quantos pontos estao
    private int nivelAtual; // nível jogado da partida atual
    private int acertosPartida; //quantidade de acertos na partida
    private int [] imagensPartida ; //vetor de todas peças sorteadas para partida atual
    private int [] imagensDisponiveis; //vetor de todas peças disponiveis para o jogo
    private int qtdImagensNivel;// quantidade de peças por nivel;
    
    public void JogoMJogoMemoriaCtrl(){
    
    }
    public int tempoConsumido(){
        return 0;   
    }
    public void iniciarJogo(int nivel){
        
    }
    public void sortearPecasJogo(){
        
    }
    
}
