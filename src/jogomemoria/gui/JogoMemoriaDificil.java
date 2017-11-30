/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogomemoria.gui;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import jogomemoria.control.JogoMemoriaCtrl;
import jogomemoria.model.PecaTabuleiro;

/**
 *
 * @author brend
 */
public class JogoMemoriaDificil extends javax.swing.JPanel {

    private JogoMemoriaCtrl controle;
     private int qntdeSelecionados = 0;
    private PecaTabuleiro ptSel1;
    private PecaTabuleiro ptSel2;
     private PecaTabuleiro ptSel3;

    public JogoMemoriaDificil(JogoMemoriaCtrl ctrl) {
        initComponents();
        controle = ctrl;
        
    }
    
    public void mostrar(boolean inicioJogo){
        
         PecaTabuleiro pctb[][] = controle.getTabuleiro();
        int idImg;
        ImageIcon imgDuvida = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"));
        
        if (inicioJogo || pctb[0][0].isVirada()) {
            idImg = pctb[0][0].getIdImagem();
            ImageIcon img00 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblimg00()).setIcon(img00);
        } else {
            (getLblimg00()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[0][1].isVirada()) {
            idImg = pctb[0][1].getIdImagem();
            ImageIcon img01 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblimg01()).setIcon(img01);
        } else {
            (getLblimg01()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[0][2].isVirada()) {
            idImg = pctb[0][2].getIdImagem();
            ImageIcon img02 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblimg02()).setIcon(img02);
        } else {
            (getLblimg02()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[0][3].isVirada()) {
            idImg = pctb[0][3].getIdImagem();
            ImageIcon img03 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblimg03()).setIcon(img03);
        } else {
            (getLblimg03()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[0][4].isVirada()) {
            idImg = pctb[0][4].getIdImagem();
            ImageIcon img04 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblimg04()).setIcon(img04);
        } else {
            (getLblimg04()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[0][5].isVirada()) {
            idImg = pctb[0][5].getIdImagem();
            ImageIcon img05 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblimg05()).setIcon(img05);
        } else {
            (getLblimg05()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[0][6].isVirada()) {
            idImg = pctb[0][6].getIdImagem();
            ImageIcon img06 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblimg06()).setIcon(img06);
        } else {
            (getLblimg06()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[0][7].isVirada()) {
            idImg = pctb[0][7].getIdImagem();
            ImageIcon img07 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblimg07()).setIcon(img07);
        } else {
            (getLblimg07()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[0][8].isVirada()) {
            idImg = pctb[0][8].getIdImagem();
            ImageIcon img08 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblImg08()).setIcon(img08);
        } else {
            (getLblImg08()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[1][0].isVirada()) {
            idImg = pctb[1][0].getIdImagem();
            ImageIcon img10 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblimg10()).setIcon(img10);
        } else {
            (getLblimg10()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[1][1].isVirada()) {
            idImg = pctb[1][1].getIdImagem();
            ImageIcon img11 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblimg11()).setIcon(img11);
        } else {
            (getLblimg11()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[1][2].isVirada()) {
            idImg = pctb[1][2].getIdImagem();
            ImageIcon img12 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblimg12()).setIcon(img12);
        } else {
            (getLblimg12()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[1][3].isVirada()) {
            idImg = pctb[1][3].getIdImagem();
            ImageIcon img13 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblimg13()).setIcon(img13);
        } else {
            (getLblimg13()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[1][4].isVirada()) {
            idImg = pctb[1][4].getIdImagem();
            ImageIcon img14 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblimg14()).setIcon(img14);
        } else {
            (getLblimg14()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[1][5].isVirada()) {
            idImg = pctb[1][5].getIdImagem();
            ImageIcon img15 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblimg15()).setIcon(img15);
        } else {
            (getLblimg15()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[1][6].isVirada()) {
            idImg = pctb[1][6].getIdImagem();
            ImageIcon img16 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblimg16()).setIcon(img16);
        } else {
            (getLblimg16()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[1][7].isVirada()) {
            idImg = pctb[1][7].getIdImagem();
            ImageIcon img17 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblimg17()).setIcon(img17);
        } else {
            (getLblimg17()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[1][8].isVirada()) {
            idImg = pctb[1][8].getIdImagem();
            ImageIcon img18 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblImg18()).setIcon(img18);
        } else {
            (getLblImg18()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[2][0].isVirada()) {
            idImg = pctb[2][0].getIdImagem();
            ImageIcon img20 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblimg20()).setIcon(img20);
        } else {
            (getLblimg20()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[2][1].isVirada()) {
            idImg = pctb[2][1].getIdImagem();
            ImageIcon img21 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblImg21()).setIcon(img21);
        } else {
            (getLblImg21()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[2][2].isVirada()) {
            idImg = pctb[2][2].getIdImagem();
            ImageIcon img22 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblImg22()).setIcon(img22);
        } else {
            (getLblImg22()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[2][3].isVirada()) {
            idImg = pctb[2][3].getIdImagem();
            ImageIcon img23 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblimg23()).setIcon(img23);
        } else {
            (getLblimg23()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[2][4].isVirada()) {
            idImg = pctb[2][4].getIdImagem();
            ImageIcon img24 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblimg24()).setIcon(img24);
        } else {
            (getLblimg24()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[2][5].isVirada()) {
            idImg = pctb[2][5].getIdImagem();
            ImageIcon img25 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblImg25()).setIcon(img25);
        } else {
            (getLblImg25()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[2][6].isVirada()) {
            idImg = pctb[2][6].getIdImagem();
            ImageIcon img26 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblImg26()).setIcon(img26);
        } else {
            (getLblImg26()).setIcon(imgDuvida);
        }
        if (inicioJogo || pctb[2][7].isVirada()) {
            idImg = pctb[2][7].getIdImagem();
            ImageIcon img27 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblImg27()).setIcon(img27);
        } else {
            (getLblImg27()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[2][8].isVirada()) {
            idImg = pctb[2][8].getIdImagem();
            ImageIcon img28 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblImg28()).setIcon(img28);
        } else {
            (getLblImg28()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[3][0].isVirada()) {
            idImg = pctb[3][0].getIdImagem();
            ImageIcon img30 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblImg30()).setIcon(img30);
        } else {
            (getLblImg30()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[3][1].isVirada()) {
            idImg = pctb[3][1].getIdImagem();
            ImageIcon img31 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblImg31()).setIcon(img31);
        } else {
            (getLblImg31()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[3][2].isVirada()) {
            idImg = pctb[3][2].getIdImagem();
            ImageIcon img32 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLbImg32()).setIcon(img32);
        } else {
            (getLbImg32()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[3][3].isVirada()) {
            idImg = pctb[3][3].getIdImagem();
            ImageIcon img33 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblImg33()).setIcon(img33);
        } else {
            (getLblImg33()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[3][4].isVirada()) {
            idImg = pctb[3][4].getIdImagem();
            ImageIcon img34 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblImg34()).setIcon(img34);
        } else {
            (getLblImg34()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[3][5].isVirada()) {
            idImg = pctb[3][5].getIdImagem();
            ImageIcon img35 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblImg35()).setIcon(img35);
        } else {
            (getLblImg35()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[3][6].isVirada()) {
            idImg = pctb[3][6].getIdImagem();
            ImageIcon img36 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblImg36()).setIcon(img36);
        } else {
            (getLblImg36()).setIcon(imgDuvida);
        }
        if (inicioJogo || pctb[3][7].isVirada()) {
            idImg = pctb[3][7].getIdImagem();
            ImageIcon img37 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblImg37()).setIcon(img37);
        } else {
            (getLblImg37()).setIcon(imgDuvida);
        }
        if (inicioJogo || pctb[3][8].isVirada()) {
            idImg = pctb[3][8].getIdImagem();
            ImageIcon img38 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblImg38()).setIcon(img38);
        } else {
            (getLblImg38()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[4][0].isVirada()) {
            idImg = pctb[4][0].getIdImagem();
            ImageIcon img40 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblImg40()).setIcon(img40);
        } else {
            (getLblImg40()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[4][1].isVirada()) {
            idImg = pctb[4][1].getIdImagem();
            ImageIcon img41 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblImg41()).setIcon(img41);
        } else {
            (getLblImg41()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[4][2].isVirada()) {
            idImg = pctb[4][2].getIdImagem();
            ImageIcon img42 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblImg42()).setIcon(img42);
        } else {
            (getLblImg42()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[4][3].isVirada()) {
            idImg = pctb[4][3].getIdImagem();
            ImageIcon img43 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblImg43()).setIcon(img43);
        } else {
            (getLblImg43()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[4][4].isVirada()) {
            idImg = pctb[4][4].getIdImagem();
            ImageIcon img44 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblImg44()).setIcon(img44);
        } else {
            (getLblImg44()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[4][5].isVirada()) {
            idImg = pctb[4][5].getIdImagem();
            ImageIcon img45 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblImg45()).setIcon(img45);
        } else {
            (getLblImg45()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[4][6].isVirada()) {
            idImg = pctb[4][6].getIdImagem();
            ImageIcon img46 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblImg46()).setIcon(img46);
        } else {
            (getLblImg46()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[4][7].isVirada()) {
            idImg = pctb[4][7].getIdImagem();
            ImageIcon img47 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblImg47()).setIcon(img47);
        } else {
            (getLblImg45()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[4][8].isVirada()) {
            idImg = pctb[4][8].getIdImagem();
            ImageIcon img48 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblImg48()).setIcon(img48);
        } else {
            (getLblImg45()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[5][0].isVirada()) {
            idImg = pctb[5][0].getIdImagem();
            ImageIcon img50 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblImg50()).setIcon(img50);
        } else {
            (getLblImg50()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[5][1].isVirada()) {
            idImg = pctb[5][1].getIdImagem();
            ImageIcon img51 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblImg51()).setIcon(img51);
        } else {
            (getLblImg51()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[5][2].isVirada()) {
            idImg = pctb[5][2].getIdImagem();
            ImageIcon img52 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblImg52()).setIcon(img52);
        } else {
            (getLblImg52()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[5][3].isVirada()) {
            idImg = pctb[5][3].getIdImagem();
            ImageIcon img53 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblImg53()).setIcon(img53);
        } else {
            (getLblImg53()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[5][4].isVirada()) {
            idImg = pctb[5][4].getIdImagem();
            ImageIcon img54 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblImg54()).setIcon(img54);
        } else {
            (getLblImg54()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[5][5].isVirada()) {
            idImg = pctb[5][5].getIdImagem();
            ImageIcon img55 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblImg55()).setIcon(img55);
        } else {
            (getLblImg55()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[5][6].isVirada()) {
            idImg = pctb[5][6].getIdImagem();
            ImageIcon img56 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblImg56()).setIcon(img56);
        } else {
            (getLblImg56()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[5][7].isVirada()) {
            idImg = pctb[5][7].getIdImagem();
            ImageIcon img57 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblImg57()).setIcon(img57);
        } else {
            (getLblImg57()).setIcon(imgDuvida);
        }
        if (inicioJogo || pctb[5][8].isVirada()) {
            idImg = pctb[5][8].getIdImagem();
            ImageIcon img58 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblImg58()).setIcon(img58);
        } else {
            (getLblImg58()).setIcon(imgDuvida);
        }
    } 
    
      private void tentarJogada(int l, int c, JLabel lbl) {
        PecaTabuleiro pt = controle.getTabuleiro()[l][c];
        int idImg = pt.getIdImagem();
        ImageIcon img = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
        lbl.setIcon(img);
        if (qntdeSelecionados == 0) {
            qntdeSelecionados++;
            ptSel1 = pt;
        } else {
            if (qntdeSelecionados == 1) {
                ptSel2 = pt;
                 qntdeSelecionados++;
                } else {
            if(qntdeSelecionados == 2){
                 ptSel3 = pt;
            
                int res = controle.realizarJogada(ptSel1, ptSel2);
                if (res == controle.JOGADA_CERTA) {
                    JOptionPane.showMessageDialog(this, "Cabra bom!!!", "Muito Bem", JOptionPane.INFORMATION_MESSAGE);
                } else if (res == controle.JOGADA_ERRADA) {
                    JOptionPane.showMessageDialog(this, "Ops, Falho!!!", "Errou", JOptionPane.INFORMATION_MESSAGE);
                } else if (res == controle.JOGADA_INVALIDA) {
                    JOptionPane.showMessageDialog(this, "Se liga Cabra !!!", "Jogada Invalida", JOptionPane.ERROR_MESSAGE);
                }
                mostrar(false);
            }
            qntdeSelecionados = 0;
            ptSel1= null;
            ptSel2= null;
        }
    }

    /**
     * @return the lbImg32
     */
    public javax.swing.JLabel getLbImg32() {
        return lbImg32;
    }

    /**
     * @param lbImg32 the lbImg32 to set
     */
    public void setLbImg32(javax.swing.JLabel lbImg32) {
        this.lbImg32 = lbImg32;
    }

    /**
     * @return the lblImg08
     */
    public javax.swing.JLabel getLblImg08() {
        return lblImg08;
    }

    /**
     * @param lblImg08 the lblImg08 to set
     */
    public void setLblImg08(javax.swing.JLabel lblImg08) {
        this.lblImg08 = lblImg08;
    }

    /**
     * @return the lblImg18
     */
    public javax.swing.JLabel getLblImg18() {
        return lblImg18;
    }

    /**
     * @param lblImg18 the lblImg18 to set
     */
    public void setLblImg18(javax.swing.JLabel lblImg18) {
        this.lblImg18 = lblImg18;
    }

    /**
     * @return the lblImg21
     */
    public javax.swing.JLabel getLblImg21() {
        return lblImg21;
    }

    /**
     * @param lblImg21 the lblImg21 to set
     */
    public void setLblImg21(javax.swing.JLabel lblImg21) {
        this.lblImg21 = lblImg21;
    }

    /**
     * @return the lblImg22
     */
    public javax.swing.JLabel getLblImg22() {
        return lblimg22;
    }

    /**
     * @param lblImg22 the lblImg22 to set
     */
    public void setLblImg22(javax.swing.JLabel lblImg22) {
        this.lblimg22 = lblImg22;
    }

    /**
     * @return the lblImg25
     */
    public javax.swing.JLabel getLblImg25() {
        return lblImg25;
    }

    /**
     * @param lblImg25 the lblImg25 to set
     */
    public void setLblImg25(javax.swing.JLabel lblImg25) {
        this.lblImg25 = lblImg25;
    }

    /**
     * @return the lblImg26
     */
    public javax.swing.JLabel getLblImg26() {
        return lblImg26;
    }

    /**
     * @param lblImg26 the lblImg26 to set
     */
    public void setLblImg26(javax.swing.JLabel lblImg26) {
        this.lblImg26 = lblImg26;
    }

    /**
     * @return the lblImg27
     */
    public javax.swing.JLabel getLblImg27() {
        return lblImg27;
    }

    /**
     * @param lblImg27 the lblImg27 to set
     */
    public void setLblImg27(javax.swing.JLabel lblImg27) {
        this.lblImg27 = lblImg27;
    }

    /**
     * @return the lblImg28
     */
    public javax.swing.JLabel getLblImg28() {
        return lblImg28;
    }

    /**
     * @param lblImg28 the lblImg28 to set
     */
    public void setLblImg28(javax.swing.JLabel lblImg28) {
        this.lblImg28 = lblImg28;
    }

    /**
     * @return the lblImg30
     */
    public javax.swing.JLabel getLblImg30() {
        return lblImg30;
    }

    /**
     * @param lblImg30 the lblImg30 to set
     */
    public void setLblImg30(javax.swing.JLabel lblImg30) {
        this.lblImg30 = lblImg30;
    }

    /**
     * @return the lblImg31
     */
    public javax.swing.JLabel getLblImg31() {
        return lblImg31;
    }

    /**
     * @param lblImg31 the lblImg31 to set
     */
    public void setLblImg31(javax.swing.JLabel lblImg31) {
        this.lblImg31 = lblImg31;
    }

    /**
     * @return the lblImg33
     */
    public javax.swing.JLabel getLblImg33() {
        return lblImg33;
    }

    /**
     * @param lblImg33 the lblImg33 to set
     */
    public void setLblImg33(javax.swing.JLabel lblImg33) {
        this.lblImg33 = lblImg33;
    }

    /**
     * @return the lblImg34
     */
    public javax.swing.JLabel getLblImg34() {
        return lblImg34;
    }

    /**
     * @param lblImg34 the lblImg34 to set
     */
    public void setLblImg34(javax.swing.JLabel lblImg34) {
        this.lblImg34 = lblImg34;
    }

    /**
     * @return the lblImg35
     */
    public javax.swing.JLabel getLblImg35() {
        return lblImg35;
    }

    /**
     * @param lblImg35 the lblImg35 to set
     */
    public void setLblImg35(javax.swing.JLabel lblImg35) {
        this.lblImg35 = lblImg35;
    }

    /**
     * @return the lblImg36
     */
    public javax.swing.JLabel getLblImg36() {
        return lblImg36;
    }

    /**
     * @param lblImg36 the lblImg36 to set
     */
    public void setLblImg36(javax.swing.JLabel lblImg36) {
        this.lblImg36 = lblImg36;
    }

    /**
     * @return the lblImg37
     */
    public javax.swing.JLabel getLblImg37() {
        return lblImg37;
    }

    /**
     * @param lblImg37 the lblImg37 to set
     */
    public void setLblImg37(javax.swing.JLabel lblImg37) {
        this.lblImg37 = lblImg37;
    }

    /**
     * @return the lblImg38
     */
    public javax.swing.JLabel getLblImg38() {
        return lblImg38;
    }

    /**
     * @param lblImg38 the lblImg38 to set
     */
    public void setLblImg38(javax.swing.JLabel lblImg38) {
        this.lblImg38 = lblImg38;
    }

    /**
     * @return the lblImg40
     */
    public javax.swing.JLabel getLblImg40() {
        return lblImg40;
    }

    /**
     * @param lblImg40 the lblImg40 to set
     */
    public void setLblImg40(javax.swing.JLabel lblImg40) {
        this.lblImg40 = lblImg40;
    }

    /**
     * @return the lblImg41
     */
    public javax.swing.JLabel getLblImg41() {
        return lblImg41;
    }

    /**
     * @param lblImg41 the lblImg41 to set
     */
    public void setLblImg41(javax.swing.JLabel lblImg41) {
        this.lblImg41 = lblImg41;
    }

    /**
     * @return the lblImg42
     */
    public javax.swing.JLabel getLblImg42() {
        return lblImg42;
    }

    /**
     * @param lblImg42 the lblImg42 to set
     */
    public void setLblImg42(javax.swing.JLabel lblImg42) {
        this.lblImg42 = lblImg42;
    }

    /**
     * @return the lblImg43
     */
    public javax.swing.JLabel getLblImg43() {
        return lblImg43;
    }

    /**
     * @param lblImg43 the lblImg43 to set
     */
    public void setLblImg43(javax.swing.JLabel lblImg43) {
        this.lblImg43 = lblImg43;
    }

    /**
     * @return the lblImg44
     */
    public javax.swing.JLabel getLblImg44() {
        return lblImg44;
    }

    /**
     * @param lblImg44 the lblImg44 to set
     */
    public void setLblImg44(javax.swing.JLabel lblImg44) {
        this.lblImg44 = lblImg44;
    }

    /**
     * @return the lblImg45
     */
    public javax.swing.JLabel getLblImg45() {
        return lblImg45;
    }

    /**
     * @param lblImg45 the lblImg45 to set
     */
    public void setLblImg45(javax.swing.JLabel lblImg45) {
        this.lblImg45 = lblImg45;
    }

    /**
     * @return the lblImg46
     */
    public javax.swing.JLabel getLblImg46() {
        return lblImg46;
    }

    /**
     * @param lblImg46 the lblImg46 to set
     */
    public void setLblImg46(javax.swing.JLabel lblImg46) {
        this.lblImg46 = lblImg46;
    }

    /**
     * @return the lblImg47
     */
    public javax.swing.JLabel getLblImg47() {
        return lblImg47;
    }

    /**
     * @param lblImg47 the lblImg47 to set
     */
    public void setLblImg47(javax.swing.JLabel lblImg47) {
        this.lblImg47 = lblImg47;
    }

    /**
     * @return the lblImg48
     */
    public javax.swing.JLabel getLblImg48() {
        return lblImg48;
    }

    /**
     * @param lblImg48 the lblImg48 to set
     */
    public void setLblImg48(javax.swing.JLabel lblImg48) {
        this.lblImg48 = lblImg48;
    }

    /**
     * @return the lblImg50
     */
    public javax.swing.JLabel getLblImg50() {
        return lblImg50;
    }

    /**
     * @param lblImg50 the lblImg50 to set
     */
    public void setLblImg50(javax.swing.JLabel lblImg50) {
        this.lblImg50 = lblImg50;
    }

    /**
     * @return the lblImg51
     */
    public javax.swing.JLabel getLblImg51() {
        return lblImg51;
    }

    /**
     * @param lblImg51 the lblImg51 to set
     */
    public void setLblImg51(javax.swing.JLabel lblImg51) {
        this.lblImg51 = lblImg51;
    }

    /**
     * @return the lblImg52
     */
    public javax.swing.JLabel getLblImg52() {
        return lblImg52;
    }

    /**
     * @param lblImg52 the lblImg52 to set
     */
    public void setLblImg52(javax.swing.JLabel lblImg52) {
        this.lblImg52 = lblImg52;
    }

    /**
     * @return the lblImg53
     */
    public javax.swing.JLabel getLblImg53() {
        return lblImg53;
    }

    /**
     * @param lblImg53 the lblImg53 to set
     */
    public void setLblImg53(javax.swing.JLabel lblImg53) {
        this.lblImg53 = lblImg53;
    }

    /**
     * @return the lblImg54
     */
    public javax.swing.JLabel getLblImg54() {
        return lblImg54;
    }

    /**
     * @param lblImg54 the lblImg54 to set
     */
    public void setLblImg54(javax.swing.JLabel lblImg54) {
        this.lblImg54 = lblImg54;
    }

    /**
     * @return the lblImg55
     */
    public javax.swing.JLabel getLblImg55() {
        return lblImg55;
    }

    /**
     * @param lblImg55 the lblImg55 to set
     */
    public void setLblImg55(javax.swing.JLabel lblImg55) {
        this.lblImg55 = lblImg55;
    }

    /**
     * @return the lblImg56
     */
    public javax.swing.JLabel getLblImg56() {
        return lblImg56;
    }

    /**
     * @param lblImg56 the lblImg56 to set
     */
    public void setLblImg56(javax.swing.JLabel lblImg56) {
        this.lblImg56 = lblImg56;
    }

    /**
     * @return the lblImg57
     */
    public javax.swing.JLabel getLblImg57() {
        return lblImg57;
    }

    /**
     * @param lblImg57 the lblImg57 to set
     */
    public void setLblImg57(javax.swing.JLabel lblImg57) {
        this.lblImg57 = lblImg57;
    }

    /**
     * @return the lblImg58
     */
    public javax.swing.JLabel getLblImg58() {
        return lblImg58;
    }

    /**
     * @param lblImg58 the lblImg58 to set
     */
    public void setLblImg58(javax.swing.JLabel lblImg58) {
        this.lblImg58 = lblImg58;
    }

    /**
     * @return the lblimg00
     */
    public javax.swing.JLabel getLblimg00() {
        return lblimg00;
    }

    /**
     * @param lblimg00 the lblimg00 to set
     */
    public void setLblimg00(javax.swing.JLabel lblimg00) {
        this.lblimg00 = lblimg00;
    }

    /**
     * @return the lblimg01
     */
    public javax.swing.JLabel getLblimg01() {
        return lblimg01;
    }

    /**
     * @param lblimg01 the lblimg01 to set
     */
    public void setLblimg01(javax.swing.JLabel lblimg01) {
        this.lblimg01 = lblimg01;
    }

    /**
     * @return the lblimg02
     */
    public javax.swing.JLabel getLblimg02() {
        return lblimg02;
    }

    /**
     * @param lblimg02 the lblimg02 to set
     */
    public void setLblimg02(javax.swing.JLabel lblimg02) {
        this.lblimg02 = lblimg02;
    }

    /**
     * @return the lblimg03
     */
    public javax.swing.JLabel getLblimg03() {
        return lblimg03;
    }

    /**
     * @param lblimg03 the lblimg03 to set
     */
    public void setLblimg03(javax.swing.JLabel lblimg03) {
        this.lblimg03 = lblimg03;
    }

    /**
     * @return the lblimg04
     */
    public javax.swing.JLabel getLblimg04() {
        return lblimg04;
    }

    /**
     * @param lblimg04 the lblimg04 to set
     */
    public void setLblimg04(javax.swing.JLabel lblimg04) {
        this.lblimg04 = lblimg04;
    }

    /**
     * @return the lblimg05
     */
    public javax.swing.JLabel getLblimg05() {
        return lblimg05;
    }

    /**
     * @param lblimg05 the lblimg05 to set
     */
    public void setLblimg05(javax.swing.JLabel lblimg05) {
        this.lblimg05 = lblimg05;
    }

    /**
     * @return the lblimg06
     */
    public javax.swing.JLabel getLblimg06() {
        return lblimg06;
    }

    /**
     * @param lblimg06 the lblimg06 to set
     */
    public void setLblimg06(javax.swing.JLabel lblimg06) {
        this.lblimg06 = lblimg06;
    }

    /**
     * @return the lblimg07
     */
    public javax.swing.JLabel getLblimg07() {
        return lblimg07;
    }

    /**
     * @param lblimg07 the lblimg07 to set
     */
    public void setLblimg07(javax.swing.JLabel lblimg07) {
        this.lblimg07 = lblimg07;
    }

    /**
     * @return the lblimg10
     */
    public javax.swing.JLabel getLblimg10() {
        return lblimg10;
    }

    /**
     * @param lblimg10 the lblimg10 to set
     */
    public void setLblimg10(javax.swing.JLabel lblimg10) {
        this.lblimg10 = lblimg10;
    }

    /**
     * @return the lblimg11
     */
    public javax.swing.JLabel getLblimg11() {
        return lblimg11;
    }

    /**
     * @param lblimg11 the lblimg11 to set
     */
    public void setLblimg11(javax.swing.JLabel lblimg11) {
        this.lblimg11 = lblimg11;
    }

    /**
     * @return the lblimg12
     */
    public javax.swing.JLabel getLblimg12() {
        return lblimg12;
    }

    /**
     * @param lblimg12 the lblimg12 to set
     */
    public void setLblimg12(javax.swing.JLabel lblimg12) {
        this.lblimg12 = lblimg12;
    }

    /**
     * @return the lblimg13
     */
    public javax.swing.JLabel getLblimg13() {
        return lblimg13;
    }

    /**
     * @param lblimg13 the lblimg13 to set
     */
    public void setLblimg13(javax.swing.JLabel lblimg13) {
        this.lblimg13 = lblimg13;
    }

    /**
     * @return the lblimg14
     */
    public javax.swing.JLabel getLblimg14() {
        return lblimg14;
    }

    /**
     * @param lblimg14 the lblimg14 to set
     */
    public void setLblimg14(javax.swing.JLabel lblimg14) {
        this.lblimg14 = lblimg14;
    }

    /**
     * @return the lblimg15
     */
    public javax.swing.JLabel getLblimg15() {
        return lblimg15;
    }

    /**
     * @param lblimg15 the lblimg15 to set
     */
    public void setLblimg15(javax.swing.JLabel lblimg15) {
        this.lblimg15 = lblimg15;
    }

    /**
     * @return the lblimg16
     */
    public javax.swing.JLabel getLblimg16() {
        return lblimg16;
    }

    /**
     * @param lblimg16 the lblimg16 to set
     */
    public void setLblimg16(javax.swing.JLabel lblimg16) {
        this.lblimg16 = lblimg16;
    }

    /**
     * @return the lblimg17
     */
    public javax.swing.JLabel getLblimg17() {
        return lblimg17;
    }

    /**
     * @param lblimg17 the lblimg17 to set
     */
    public void setLblimg17(javax.swing.JLabel lblimg17) {
        this.lblimg17 = lblimg17;
    }

    /**
     * @return the lblimg20
     */
    public javax.swing.JLabel getLblimg20() {
        return lblimg20;
    }

    /**
     * @param lblimg20 the lblimg20 to set
     */
    public void setLblimg20(javax.swing.JLabel lblimg20) {
        this.lblimg20 = lblimg20;
    }

    /**
     * @return the lblimg23
     */
    public javax.swing.JLabel getLblimg23() {
        return lblimg23;
    }

    /**
     * @param lblimg23 the lblimg23 to set
     */
    public void setLblimg23(javax.swing.JLabel lblimg23) {
        this.lblimg23 = lblimg23;
    }

    /**
     * @return the lblimg24
     */
    public javax.swing.JLabel getLblimg24() {
        return lblimg24;
    }

    /**
     * @param lblimg24 the lblimg24 to set
     */
    public void setLblimg24(javax.swing.JLabel lblimg24) {
        this.lblimg24 = lblimg24;
    }

    /**
     * Creates new form JogoMemoriaDificil
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblImg40 = new javax.swing.JLabel();
        lblimg01 = new javax.swing.JLabel();
        lblimg11 = new javax.swing.JLabel();
        lblImg21 = new javax.swing.JLabel();
        lblimg00 = new javax.swing.JLabel();
        lblImg42 = new javax.swing.JLabel();
        lblimg15 = new javax.swing.JLabel();
        lblImg31 = new javax.swing.JLabel();
        lbImg32 = new javax.swing.JLabel();
        lblImg51 = new javax.swing.JLabel();
        lblimg23 = new javax.swing.JLabel();
        lblimg02 = new javax.swing.JLabel();
        lblimg12 = new javax.swing.JLabel();
        lblImg33 = new javax.swing.JLabel();
        lblimg03 = new javax.swing.JLabel();
        lblimg04 = new javax.swing.JLabel();
        lblimg14 = new javax.swing.JLabel();
        lblimg24 = new javax.swing.JLabel();
        lblImg43 = new javax.swing.JLabel();
        lblimg07 = new javax.swing.JLabel();
        lblImg41 = new javax.swing.JLabel();
        lblimg06 = new javax.swing.JLabel();
        lblimg16 = new javax.swing.JLabel();
        lblimg17 = new javax.swing.JLabel();
        lblimg05 = new javax.swing.JLabel();
        lblImg34 = new javax.swing.JLabel();
        lblImg25 = new javax.swing.JLabel();
        lblImg35 = new javax.swing.JLabel();
        lblImg47 = new javax.swing.JLabel();
        lblImg46 = new javax.swing.JLabel();
        lblImg36 = new javax.swing.JLabel();
        lblImg27 = new javax.swing.JLabel();
        lblImg26 = new javax.swing.JLabel();
        lblImg37 = new javax.swing.JLabel();
        lblimg13 = new javax.swing.JLabel();
        lblImg18 = new javax.swing.JLabel();
        lblImg28 = new javax.swing.JLabel();
        lblImg38 = new javax.swing.JLabel();
        lblImg52 = new javax.swing.JLabel();
        lblImg44 = new javax.swing.JLabel();
        lblImg50 = new javax.swing.JLabel();
        lblImg53 = new javax.swing.JLabel();
        lblImg54 = new javax.swing.JLabel();
        lblImg55 = new javax.swing.JLabel();
        lblImg56 = new javax.swing.JLabel();
        lblImg57 = new javax.swing.JLabel();
        lblImg58 = new javax.swing.JLabel();
        lblImg08 = new javax.swing.JLabel();
        lblImg45 = new javax.swing.JLabel();
        lblImg48 = new javax.swing.JLabel();
        lblimg10 = new javax.swing.JLabel();
        lblimg20 = new javax.swing.JLabel();
        lblImg30 = new javax.swing.JLabel();
        lblimg22 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(868, 525));

        lblImg40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblImg40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg40MouseClicked(evt);
            }
        });

        lblimg01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg01MouseClicked(evt);
            }
        });

        lblimg11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg11MouseClicked(evt);
            }
        });

        lblImg21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblImg21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg21MouseClicked(evt);
            }
        });

        lblimg00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg00.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg00MouseClicked(evt);
            }
        });

        lblImg42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblImg42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg42MouseClicked(evt);
            }
        });

        lblimg15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg15MouseClicked(evt);
            }
        });

        lblImg31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblImg31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg31MouseClicked(evt);
            }
        });

        lbImg32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lbImg32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbImg32MouseClicked(evt);
            }
        });

        lblImg51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblImg51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg51MouseClicked(evt);
            }
        });

        lblimg23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg23MouseClicked(evt);
            }
        });

        lblimg02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg02MouseClicked(evt);
            }
        });

        lblimg12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg12MouseClicked(evt);
            }
        });

        lblImg33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblImg33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg33MouseClicked(evt);
            }
        });

        lblimg03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg03MouseClicked(evt);
            }
        });

        lblimg04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg04.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg04MouseClicked(evt);
            }
        });

        lblimg14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg14MouseClicked(evt);
            }
        });

        lblimg24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg24MouseClicked(evt);
            }
        });

        lblImg43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblImg43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg43MouseClicked(evt);
            }
        });

        lblimg07.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg07.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg07MouseClicked(evt);
            }
        });

        lblImg41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N

        lblimg06.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg06.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg06MouseClicked(evt);
            }
        });

        lblimg16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg16MouseClicked(evt);
            }
        });

        lblimg17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg17MouseClicked(evt);
            }
        });

        lblimg05.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg05.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg05MouseClicked(evt);
            }
        });

        lblImg34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblImg34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg34MouseClicked(evt);
            }
        });

        lblImg25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblImg25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg25MouseClicked(evt);
            }
        });

        lblImg35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblImg35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg35MouseClicked(evt);
            }
        });

        lblImg47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblImg47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg47MouseClicked(evt);
            }
        });

        lblImg46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblImg46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg46MouseClicked(evt);
            }
        });

        lblImg36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblImg36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg36MouseClicked(evt);
            }
        });

        lblImg27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblImg27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg27MouseClicked(evt);
            }
        });

        lblImg26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblImg26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg26MouseClicked(evt);
            }
        });

        lblImg37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblImg37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg37MouseClicked(evt);
            }
        });

        lblimg13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg13MouseClicked(evt);
            }
        });

        lblImg18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblImg18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg18MouseClicked(evt);
            }
        });

        lblImg28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblImg28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg28MouseClicked(evt);
            }
        });

        lblImg38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblImg38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg38MouseClicked(evt);
            }
        });

        lblImg52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblImg52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg52MouseClicked(evt);
            }
        });

        lblImg44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblImg44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg44MouseClicked(evt);
            }
        });

        lblImg50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblImg50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg50MouseClicked(evt);
            }
        });

        lblImg53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblImg53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg53MouseClicked(evt);
            }
        });

        lblImg54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblImg54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg54MouseClicked(evt);
            }
        });

        lblImg55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblImg55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg55MouseClicked(evt);
            }
        });

        lblImg56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblImg56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg56MouseClicked(evt);
            }
        });

        lblImg57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblImg57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg57MouseClicked(evt);
            }
        });

        lblImg58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblImg58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg58MouseClicked(evt);
            }
        });

        lblImg08.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblImg08.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg08MouseClicked(evt);
            }
        });

        lblImg45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblImg45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg45MouseClicked(evt);
            }
        });

        lblImg48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblImg48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg48MouseClicked(evt);
            }
        });

        lblimg10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg10MouseClicked(evt);
            }
        });

        lblimg20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg20MouseClicked(evt);
            }
        });

        lblImg30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblImg30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg30MouseClicked(evt);
            }
        });

        lblimg22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg22MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblimg20, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblImg21, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblimg10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblimg11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblimg22, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblimg12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblimg00, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblimg01, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblimg02, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImg50, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblImg40, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblImg30, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblImg41, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblImg42, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblImg31, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbImg32, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblImg51, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblImg52, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(lblImg43, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblImg44, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblImg45)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblImg46, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblImg33, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblImg34, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblImg35, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblImg36, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblimg13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblimg14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblimg15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblimg16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblimg03, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblimg04, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblimg05, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblimg06, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblimg23, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblimg24, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblImg25, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblImg26, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(lblImg37, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblImg38, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(208, 208, 208))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(lblImg27, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lblImg28, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(lblImg47, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblImg48, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(77, 77, 77))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblimg17, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblImg18, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblimg07, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblImg08, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(206, 206, 206))))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblImg53, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblImg54, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblImg55, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblImg56, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblImg57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblImg58, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblimg01, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblimg02, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblimg03, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblimg04, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblimg05, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblimg06, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblimg07, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblImg08, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblimg14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblimg16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblimg11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblimg12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblimg13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblimg15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblimg17, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblImg18, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblimg00, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblimg10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImg27, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImg21, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblimg23, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblimg24, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImg25, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImg26, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImg28, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblimg20, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblimg22, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbImg32, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblImg33, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblImg31, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblImg30, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(lblImg34, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblImg35, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImg42, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblImg41, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblImg40, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
                            .addComponent(lblImg43, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblImg44, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblImg45, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblImg37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblImg38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblImg36, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImg47, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblImg46, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblImg48, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblImg51, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblImg52, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblImg50, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblImg53, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblImg54, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblImg55, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblImg56, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImg57, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImg58, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblimg00MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg00MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblimg00MouseClicked

    private void lblimg01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg01MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblimg01MouseClicked

    private void lblimg02MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg02MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblimg02MouseClicked

    private void lblimg03MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg03MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblimg03MouseClicked

    private void lblimg04MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg04MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblimg04MouseClicked

    private void lblimg05MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg05MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblimg05MouseClicked

    private void lblimg06MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg06MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblimg06MouseClicked

    private void lblimg07MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg07MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblimg07MouseClicked

    private void lblImg08MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg08MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblImg08MouseClicked

    private void lblimg11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblimg11MouseClicked

    private void lblimg12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblimg12MouseClicked

    private void lblimg13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg13MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblimg13MouseClicked

    private void lblimg14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblimg14MouseClicked

    private void lblimg15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg15MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblimg15MouseClicked

    private void lblimg16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg16MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblimg16MouseClicked

    private void lblimg17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg17MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblimg17MouseClicked

    private void lblImg18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg18MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblImg18MouseClicked

    private void lblImg21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg21MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblImg21MouseClicked

    private void lblimg23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg23MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblimg23MouseClicked

    private void lblimg24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg24MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblimg24MouseClicked

    private void lblImg25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg25MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblImg25MouseClicked

    private void lblImg26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg26MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblImg26MouseClicked

    private void lblImg27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg27MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblImg27MouseClicked

    private void lblImg28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg28MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblImg28MouseClicked

    private void lblImg31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg31MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblImg31MouseClicked

    private void lbImg32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbImg32MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbImg32MouseClicked

    private void lblImg33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg33MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblImg33MouseClicked

    private void lblImg34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg34MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblImg34MouseClicked

    private void lblImg35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg35MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblImg35MouseClicked

    private void lblImg36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg36MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblImg36MouseClicked

    private void lblImg37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg37MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblImg37MouseClicked

    private void lblImg38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg38MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblImg38MouseClicked

    private void lblImg40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg40MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblImg40MouseClicked

    private void lblImg42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg42MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblImg42MouseClicked

    private void lblImg43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg43MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblImg43MouseClicked

    private void lblImg44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg44MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblImg44MouseClicked

    private void lblImg45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg45MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblImg45MouseClicked

    private void lblImg46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg46MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblImg46MouseClicked

    private void lblImg47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg47MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblImg47MouseClicked

    private void lblImg48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg48MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblImg48MouseClicked

    private void lblImg50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg50MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblImg50MouseClicked

    private void lblImg51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg51MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblImg51MouseClicked

    private void lblImg52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg52MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblImg52MouseClicked

    private void lblImg53MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg53MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblImg53MouseClicked

    private void lblImg54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg54MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblImg54MouseClicked

    private void lblImg55MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg55MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblImg55MouseClicked

    private void lblImg56MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg56MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblImg56MouseClicked

    private void lblImg57MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg57MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblImg57MouseClicked

    private void lblImg58MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg58MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblImg58MouseClicked

    private void lblimg10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblimg10MouseClicked

    private void lblimg20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg20MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblimg20MouseClicked

    private void lblImg30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg30MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblImg30MouseClicked

    private void lblimg22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg22MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblimg22MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbImg32;
    private javax.swing.JLabel lblImg08;
    private javax.swing.JLabel lblImg18;
    private javax.swing.JLabel lblImg21;
    private javax.swing.JLabel lblImg25;
    private javax.swing.JLabel lblImg26;
    private javax.swing.JLabel lblImg27;
    private javax.swing.JLabel lblImg28;
    private javax.swing.JLabel lblImg30;
    private javax.swing.JLabel lblImg31;
    private javax.swing.JLabel lblImg33;
    private javax.swing.JLabel lblImg34;
    private javax.swing.JLabel lblImg35;
    private javax.swing.JLabel lblImg36;
    private javax.swing.JLabel lblImg37;
    private javax.swing.JLabel lblImg38;
    private javax.swing.JLabel lblImg40;
    private javax.swing.JLabel lblImg41;
    private javax.swing.JLabel lblImg42;
    private javax.swing.JLabel lblImg43;
    private javax.swing.JLabel lblImg44;
    private javax.swing.JLabel lblImg45;
    private javax.swing.JLabel lblImg46;
    private javax.swing.JLabel lblImg47;
    private javax.swing.JLabel lblImg48;
    private javax.swing.JLabel lblImg50;
    private javax.swing.JLabel lblImg51;
    private javax.swing.JLabel lblImg52;
    private javax.swing.JLabel lblImg53;
    private javax.swing.JLabel lblImg54;
    private javax.swing.JLabel lblImg55;
    private javax.swing.JLabel lblImg56;
    private javax.swing.JLabel lblImg57;
    private javax.swing.JLabel lblImg58;
    private javax.swing.JLabel lblimg00;
    private javax.swing.JLabel lblimg01;
    private javax.swing.JLabel lblimg02;
    private javax.swing.JLabel lblimg03;
    private javax.swing.JLabel lblimg04;
    private javax.swing.JLabel lblimg05;
    private javax.swing.JLabel lblimg06;
    private javax.swing.JLabel lblimg07;
    private javax.swing.JLabel lblimg10;
    private javax.swing.JLabel lblimg11;
    private javax.swing.JLabel lblimg12;
    private javax.swing.JLabel lblimg13;
    private javax.swing.JLabel lblimg14;
    private javax.swing.JLabel lblimg15;
    private javax.swing.JLabel lblimg16;
    private javax.swing.JLabel lblimg17;
    private javax.swing.JLabel lblimg20;
    private javax.swing.JLabel lblimg22;
    private javax.swing.JLabel lblimg23;
    private javax.swing.JLabel lblimg24;
    // End of variables declaration//GEN-END:variables
}
