package jogomemoria.control;

import java.sql.Timestamp;
import jogomemoria.model.PecaTabuleiro;

public class JogoMemoriaCtrl {

    /* ----------------------- CONSTANTES -----------------------*/
    public static final int FACIL = 0;  //Referencia ao nível Fácil 
    public static final int INTERMEDIARIO = 1; //Referencia ao nível Intermediário 
    public static final int DIFICIL = 2; //Referencia ao nível Difícil    
    public static final int OURO = 0;   //Referência à coluna de pontuações Ouro
    public static final int PRATA = 1;  //Referência a coluna de pontuações prata
    public static final int BRONZE = 2; //Referência a coluna de prontuações Bronze   
    public static final int INDEFINIDO = -1; //Referência a valor que representa algo indefinido em determinado momento e que  
    public static final int JOGADA_CERTA = 0; //Referência a valor que representa jogada válida e certa que marca ponto.
    public static final int JOGADA_ERRADA = 1; //Referência a valor que representa jogada válida e errada, não marcadno ponto.
    public static final int JOGADA_INVALIDA = 2; //Referência a valor que representa jogada inválida. Ou seja, com pelo menos uma posição já ocupada.

    public static final int MAX_IMAGENS_PARTIDA = 18; //Máx. de imagens usadas nas partidas
    public static final int QTDE_IMAGENS_DISPONIVEIS = 20; //Quantidade de imagens disponíveis para o jogo (Sempre maior do que MAX_PECAS_PARTIDA)

    public static final int QTDE_PECAS_TAB_FACIL = 16; //Referência para a qtde de peças do tabuleiro para o nível Fácil
    public static final int MAX_COL_FACIL = 4;  //Qtde de colunas no tabuleiro para o nível Fácil
    public static final int MAX_LIN_FACIL = 4;  //Qtde de linhas no tabuleiro para o nível Fácil      

    public static final int QTDE_PECAS_TAB_INTERMEDIARIO = 36; //Referência para a qtde de peças do tabuleiro para o nível Intermediário
    public static final int MAX_COL_INTERMEDIARIO = 6; //Qtde de colunas no tabuleiro para o nível Intermediário
    public static final int MAX_LIN_INTERMEDIARIO = 6; //Qtde de linhas no tabuleiro para o nível Intermediário    

    public static final int QTDE_PECAS_TAB_DIFICIL = 54; //Referência para a qtde de peças do tabuleiro para o nível Difícil
    public static final int MAX_COL_DIFICIL = 9; //Qtde de colunas no tabuleiro para o nível Difícil
    public static final int MAX_LIN_DIFICIL = 6; //Qtde de linhas no tabuleiro para o nível Difícil

    /* ----------------------- ATRIBUTOS -----------------------*/
    private boolean jogoIniciado; //Booleano que indica se a partida foi iniciada ou não.
    private Timestamp inicioPartida; //Registra o momento do início da partida. Para contagem de tempo.
    private int tempoLimite;      //Tempo limite para a partida em segundos (minutos * 60)
    private int pontuacaoAtual;   //Pontuação da partida atual
    private int nivelAtual;       //Nível da partida atual
    private int tabRecordes[][] = {{0, 0, 0}, //Quadro de melhores pontuações por nível (Recordes)
    {0, 0, 0}, //Linha = Nível e Coluna = Ouro, prata ou bronze.
    {0, 0, 0}};
    private int acertosPartida;   //Quantidade de acertos na partida
    private int[] imgsPartida = new int[MAX_IMAGENS_PARTIDA];//Vetor de imagens sorteadas para a partida atual. Considera o tamanho suficiente para o nível difícil
    private int qtdImgsPartida; //Quantidade de imgens usadas na partida. Controla o uso de células do vetor imgsPartida conforme o nível da partida atual.           
    private int tabuleiro[][] = new int[MAX_LIN_DIFICIL][MAX_COL_DIFICIL]; //Matriz que implementa o tabuleiro do jogo onde as imagens estão distribuidas. Considera o tamanho máximo possível de ser usado que é para o nível difícil. Cada célula contém um número referente à imagem que ocupará a posição.
    private int tabControle[][] = new int[MAX_LIN_DIFICIL][MAX_COL_DIFICIL]; //Será usada em conjunto com a matriz tabuleiro[][]. Implementa um controle das jogadas já realizadas e acertadas. Ajuda a atulizar a tela indicando que imagem estará virada (Valor 0 na célula) e que imagem estará aberta (Valor 1). Considera o tamanho máximo possível de ser usado que é para o nível difícil.

    /* ----------------------- MÉTODOS -----------------------*/
    /**
     * Construtor para a classe
     */
    public JogoMemoriaCtrl() {
        boolean jogoIniciado = false;
        int tempoLimite;
        int acertosPartida;
        int nivelAtual;
        int qtdImgsPartida;
    }

    /**
     * Inicia uma partida do jogo conforme um nível e um tempo limite em
     * minutos.
     *
     * @param nivel - Nível da partida FACIL, INTERMEDIARIO, DIFICIL
     * @param tempoLimMinutos - Tempo limite em MINUTOS para a partida. Isto
     * pois na tela projetamos que o usuário só consegue determinar o tempo em
     * minutos. Contudo, o temporizador será em segundos.
     */
    public void iniciarPartida(int nivel, int tempoLimMinutos) {
        boolean jogoIniciado = true;
        tempoLimMinutos = (tempoLimMinutos * 60);
        int acertosPartida = 0;
        if (nivel == 0) {
            nivel = FACIL;
        } else {
            if (nivel == 1) {
                nivel = INTERMEDIARIO;
            } else {
                if (nivel == 2) {
                    nivel = DIFICIL;
                }
            }
        }
    }
}
