package jogomemoria.control;
//ligar camadas definir do tipo do controlador 

import java.sql.Timestamp;
import java.util.Random;
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
    public static final int QTDE_IMAGENS_DISPONIVEIS = 18; //Quantidade de imagens disponíveis para o jogo (Sempre maior do que MAX_PECAS_PARTIDA)

    public static final int QTDE_IMGS_FACIL = 8;
    public static final int QTDE_IMGS_INTERMEDIARIO = 18;
    public static final int QTDE_IMGS_DIFICIL = 18;

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
    private int linhaMax;
    private int colunaMax;
    private int tabRecordes[][] = {{0, 0, 0}, //Quadro de melhores pontuações por nível (Recordes)
    {0, 0, 0}, //Linha = Nível e Coluna = Ouro, prata ou bronze.
    {0, 0, 0}};
    private int acertosPartida;   //Quantidade de acertos na partida
    private int[] imgsPartida = new int[MAX_IMAGENS_PARTIDA];//Vetor de imagens sorteadas para a partida atual. Considera o tamanho suficiente para o nível difícil
    private int qtdImgsPartida; //Quantidade de imgens usadas na partida. Controla o uso de células do vetor imgsPartida conforme o nível da partida atual.           
    private PecaTabuleiro tabuleiro[][] = new PecaTabuleiro[MAX_LIN_DIFICIL][MAX_COL_DIFICIL]; //Matriz que implementa o tabuleiro do jogo onde as imagens estão distribuidas. Considera o tamanho máximo possível de ser usado que é para o nível difícil. Cada célula contém um número referente à imagem que ocupará a posição.
    private int tabControle[][] = new int[MAX_LIN_DIFICIL][MAX_COL_DIFICIL]; //Será usada em conjunto com a matriz tabuleiro[][]. Implementa um controle das jogadas já realizadas e acertadas. Ajuda a atulizar a tela indicando que imagem estará virada (Valor 0 na célula) e que imagem estará aberta (Valor 1). Considera o tamanho máximo possível de ser usado que é para o nível difícil.
    private int qtdePcasPorImg = INDEFINIDO;

    /* ----------------------- MÉTODOS -----------------------*/
    /**
     * Construtor para a classe
     */
    public JogoMemoriaCtrl() {
        jogoIniciado = false;
        tempoLimite = INDEFINIDO;
        acertosPartida = INDEFINIDO;
        nivelAtual = INDEFINIDO;
        qtdImgsPartida = INDEFINIDO;
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
        setJogoIniciado(true);
        tempoLimite = (tempoLimMinutos * 60);
        setAcertosPartida(0);
        if (nivel == FACIL) {
            setNivelAtual(FACIL);
            qtdImgsPartida = QTDE_IMGS_FACIL;
            linhaMax = MAX_LIN_FACIL - 1;
            colunaMax = MAX_COL_FACIL - 1;
            qtdePcasPorImg = 2;
        } else {
            if (nivel == INTERMEDIARIO) {
                setNivelAtual(INTERMEDIARIO);
                qtdImgsPartida = QTDE_IMGS_INTERMEDIARIO;
                linhaMax = MAX_LIN_INTERMEDIARIO - 1;
                colunaMax = MAX_COL_INTERMEDIARIO - 1;
                qtdePcasPorImg = 2;
            } else {
                if (nivel == DIFICIL) {
                    setNivelAtual(DIFICIL);
                    qtdImgsPartida = QTDE_IMGS_DIFICIL;
                    linhaMax = MAX_LIN_DIFICIL - 1;
                    colunaMax = MAX_COL_DIFICIL - 1;
                    qtdePcasPorImg = 3;
                } else {
                    System.out.println("ERRO"); //lançar exception
                }
            }
        }
        sortearImagensPartida();

        preencherTabuleiro();

        debugTabuleiro();

    }
    //atividade 3

    /**
     * Obtem um numero sorteado e valido no espaço de inicio ate o fim inicio
     * minimo é 0
     *
     * @param inicio e fim
     * @return
     */
    private int obterNumSorteado(int inicio, int fim) {
        int n = INDEFINIDO;
        if ((fim >= inicio) && (inicio >= 0)) {
            n = inicio + (int) (Math.random() * ((fim - inicio) + 1));
        }
        return n;
    }

    private void sortearImagensPartida() {
        boolean achou = false;
        limparImgsPartida();
        int qtdeSorteadas = 0;
        while (qtdeSorteadas < qtdImgsPartida) {
            int i = obterNumSorteado(1, QTDE_IMAGENS_DISPONIVEIS);
            achou = false;
            for (int k = 0; k < qtdeSorteadas; k++) {
                if (imgsPartida[k] == i) {
                    achou = true;
                    break;
                }
            }
            if (!achou) {
                imgsPartida[qtdeSorteadas] = i;
                qtdeSorteadas++;
            }
        }
    }

    private void debugTabuleiro() {
        for (int l = 0; l < qtdImgsPartida; l++) {
            System.out.print(imgsPartida[l] + " ");
        }
        System.out.println();
        for (int l = 0; l <= linhaMax; l++) {
            for (int c = 0; c <= colunaMax; c++) {
                System.out.print(tabuleiro[l][c].getIdImagem() + " ");
            }
            System.out.println();
        }
    }

    private void limparImgsPartida() { //dois for igual matriz
        for (int i = 0; i < MAX_IMAGENS_PARTIDA; i++) {
            imgsPartida[i] = 0;
        }
    }

    //atividade 4
    private void preencherTabuleiro() {
        int num = 0;

        limparTabuleiro();

        for (int i = 0; i < qtdImgsPartida; i++) {
            for (int j = 0; j < qtdePcasPorImg; j++) {
                PecaTabuleiro p = new PecaTabuleiro();
                num++;
                p.setNumero(num);
                p.setIdImagem(imgsPartida[i]);
                p.setVirada(false);
                int l;
                int c;
                boolean sucesso = false;
                while (!sucesso) {
                    l = obterNumSorteado(0, linhaMax);
                    c = obterNumSorteado(0, colunaMax);
                    if (getTabuleiro()[l][c] == null) {
                        p.setLinha(l);
                        p.setColuna(c);
                        getTabuleiro()[l][c] = p;
                        sucesso = true;
                    }
                }
            }
        }
    }

    private void limparTabuleiro() {
        for (int l = 0; l < MAX_LIN_DIFICIL; l++) {
            for (int c = 0; c < MAX_COL_DIFICIL; c++) {
                getTabuleiro()[l][c] = null;
                //tabControle[l][c] = 0;
            }
        }
    }

    /**
     * Tenta realizar uma jogada, envolvendo duas peças de tabuleiro. 
     * Os objetos PecaTabuleiro possuem atributos que representam uma posição 
     * (célula) da matriz referente ao tabuleiro. Estes atributos são Linha e coluna
     * referentes à posição da peça no tabuleiro.
     * A classe PecaTabuleiro do pacote jogomemoria.model representa o tipo dos
     * parâmetros.
     * @param pt1 Primeira peça de tabuleiro (PecaTabuleiro) selecionada.
     * @param pt2 Segunda peça de tabuleiro (PecaTabuleiro) selecionada.
     * @return int Inteiro representando o resultado da tentativa de jogada. Refere-se a JOGADA_CERTA, JOGADA_ERRADA ou JOGADA_INVALIDA. 
     */
    
    public int realizarJogada(PecaTabuleiro pt1, PecaTabuleiro pt2) {
        int resultado = JOGADA_ERRADA;  //O resultado inicia pessimista. Estratégia definida pelo professor.
        if (pt1.getIdImagem() == pt2.getIdImagem()) {
            if ((pt1.getLinha() <= linhaMax) && (pt1.getColuna() <= colunaMax)
                    && (pt2.getLinha() <= linhaMax) && (pt2.getColuna() <= colunaMax)) {
                if ((!pt1.isVirada()) && (!pt2.isVirada()) &&
                        (pt1.getNumero()!= pt2.getNumero())) {
                    resultado = JOGADA_CERTA;
                    setPontuacaoAtual(getPontuacaoAtual() + 1);
                    pt1.setVirada(true);
                    pt2.setVirada(true);
                } else {
                    resultado = JOGADA_INVALIDA;
                }
            }
        }
        return resultado;
    }

    public int realizarJogada(PecaTabuleiro pt1, PecaTabuleiro pt2, PecaTabuleiro pt3) {
        int resultado = JOGADA_ERRADA;  //O resultado inicia pessimista. Estratégia definida pelo professor.
        if (pt1.getIdImagem() == pt2.getIdImagem() && pt1.getIdImagem() == pt3.getIdImagem()) {
            if ((pt1.getLinha() <= linhaMax) && (pt1.getColuna() <= colunaMax)
                    && (pt2.getLinha() <= linhaMax) && (pt2.getColuna() <= colunaMax)
                    && (pt3.getLinha() <= linhaMax) && (pt3.getColuna() <= colunaMax)) {
                if ((!pt1.isVirada()) && (!pt2.isVirada()) && (!pt3.isVirada())) {
                    resultado = JOGADA_CERTA;
                    setPontuacaoAtual(getPontuacaoAtual() + 1);
                    pt1.setVirada(true);
                    pt2.setVirada(true);
                    pt3.setVirada(true);
                } else {
                    resultado = JOGADA_INVALIDA;
                }
            }
        }
        return resultado;
    }

    /**
     * @return the qtdePcasPorImg
     */
    public int getQtdePcasPorImg() {
        return qtdePcasPorImg;
    }

    /**
     * @param qtdePcasPorImg the qtdePcasPorImg to set
     */
    public void setQtdePcasPorImg(int qtdePcasPorImg) {
        this.qtdePcasPorImg = qtdePcasPorImg;
    }

    /**
     * @return the jogoIniciado
     */
    public boolean isJogoIniciado() {
        return jogoIniciado;
    }

    /**
     * @param jogoIniciado the jogoIniciado to set
     */
    public void setJogoIniciado(boolean jogoIniciado) {
        this.jogoIniciado = jogoIniciado;
    }

    /**
     * @return the pontuacaoAtual
     */
    public int getPontuacaoAtual() {
        return pontuacaoAtual;
    }

    /**
     * @param pontuacaoAtual the pontuacaoAtual to set
     */
    public void setPontuacaoAtual(int pontuacaoAtual) {
        this.pontuacaoAtual = pontuacaoAtual;
    }

    /**
     * @return the nivelAtual
     */
    public int getNivelAtual() {
        return nivelAtual;
    }

    /**
     * @param nivelAtual the nivelAtual to set
     */
    public void setNivelAtual(int nivelAtual) {
        this.nivelAtual = nivelAtual;
    }

    /**
     * @return the tabRecordes
     */
    public int[][] getTabRecordes() {
        return tabRecordes;
    }

    /**
     * @param tabRecordes the tabRecordes to set
     */
    public void setTabRecordes(int[][] tabRecordes) {
        this.tabRecordes = tabRecordes;
    }

    /**
     * @return the acertosPartida
     */
    public int getAcertosPartida() {
        return acertosPartida;
    }

    /**
     * @param acertosPartida the acertosPartida to set
     */
    public void setAcertosPartida(int acertosPartida) {
        this.acertosPartida = acertosPartida;
    }

    /**
     * @return the tabuleiro
     */
    public PecaTabuleiro[][] getTabuleiro() {
        return tabuleiro;
    }

    /**
     * @param tabuleiro the tabuleiro to set
     */
    public void setTabuleiro(PecaTabuleiro[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
    }
}


//uma classe usa outra qunndo uma usa a variavel do tipó da outra;
