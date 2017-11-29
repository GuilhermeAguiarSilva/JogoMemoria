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
 * @author Aluno
 */
public class JogoMemoriaIntermediario extends javax.swing.JPanel {

    private JogoMemoriaCtrl controle;
    private int qntdeSelecionados = 0;
    private PecaTabuleiro ptSel1;
    private PecaTabuleiro ptSel2;
    /**
     * Creates new form JogoMemoriaIntermediario2
     */
    public JogoMemoriaIntermediario(JogoMemoriaCtrl ctrl) {
        initComponents();
        controle = ctrl;
    }

    public void mostrar(boolean inicioJogo) {
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
            (getLblimg21()).setIcon(img21);
        } else {
            (getLblimg21()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[2][2].isVirada()) {
            idImg = pctb[2][2].getIdImagem();
            ImageIcon img22 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblimg22()).setIcon(img22);
        } else {
            (getLblimg22()).setIcon(imgDuvida);
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
            (getLblimg25()).setIcon(img25);
        } else {
            (getLblimg25()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[3][0].isVirada()) {
            idImg = pctb[3][0].getIdImagem();
            ImageIcon img30 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblimg30()).setIcon(img30);
        } else {
            (getLblimg30()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[3][1].isVirada()) {
            idImg = pctb[3][1].getIdImagem();
            ImageIcon img31 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblimg31()).setIcon(img31);
        } else {
            (getLblimg31()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[3][2].isVirada()) {
            idImg = pctb[3][2].getIdImagem();
            ImageIcon img32 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblimg32()).setIcon(img32);
        } else {
            (getLblimg32()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[3][3].isVirada()) {
            idImg = pctb[3][3].getIdImagem();
            ImageIcon img33 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblimg33()).setIcon(img33);
        } else {
            (getLblimg33()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[3][4].isVirada()) {
            idImg = pctb[3][4].getIdImagem();
            ImageIcon img34 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblimg34()).setIcon(img34);
        } else {
            (getLblimg34()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[3][5].isVirada()) {
            idImg = pctb[3][5].getIdImagem();
            ImageIcon img35 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblimg35()).setIcon(img35);
        } else {
            (getLblimg35()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[4][0].isVirada()) {
            idImg = pctb[4][0].getIdImagem();
            ImageIcon img40 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblimg40()).setIcon(img40);
        } else {
            (getLblimg40()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[4][1].isVirada()) {
            idImg = pctb[4][1].getIdImagem();
            ImageIcon img41 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblimg41()).setIcon(img41);
        } else {
            (getLblimg41()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[4][2].isVirada()) {
            idImg = pctb[4][2].getIdImagem();
            ImageIcon img42 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblimg42()).setIcon(img42);
        } else {
            (getLblimg42()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[4][3].isVirada()) {
            idImg = pctb[4][3].getIdImagem();
            ImageIcon img43 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblimg43()).setIcon(img43);
        } else {
            (getLblimg43()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[4][4].isVirada()) {
            idImg = pctb[4][4].getIdImagem();
            ImageIcon img44 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblimg44()).setIcon(img44);
        } else {
            (getLblimg44()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[4][5].isVirada()) {
            idImg = pctb[4][5].getIdImagem();
            ImageIcon img45 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblimg45()).setIcon(img45);
        } else {
            (getLblimg45()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[5][0].isVirada()) {
            idImg = pctb[5][0].getIdImagem();
            ImageIcon img50 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblimg50()).setIcon(img50);
        } else {
            (getLblimg50()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[5][1].isVirada()) {
            idImg = pctb[5][1].getIdImagem();
            ImageIcon img51 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblimg51()).setIcon(img51);
        } else {
            (getLblimg51()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[5][2].isVirada()) {
            idImg = pctb[5][2].getIdImagem();
            ImageIcon img52 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblimg52()).setIcon(img52);
        } else {
            (getLblimg52()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[5][3].isVirada()) {
            idImg = pctb[5][3].getIdImagem();
            ImageIcon img53 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblimg53()).setIcon(img53);
        } else {
            (getLblimg53()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[5][4].isVirada()) {
            idImg = pctb[5][4].getIdImagem();
            ImageIcon img54 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblimg54()).setIcon(img54);
        } else {
            (getLblimg54()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[5][5].isVirada()) {
            idImg = pctb[5][5].getIdImagem();
            ImageIcon img55 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".png"));
            (getLblimg55()).setIcon(img55);
        } else {
            (getLblimg55()).setIcon(imgDuvida);

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
     * @return the lblimg21
     */
    public javax.swing.JLabel getLblimg21() {
        return lblimg21;
    }

    /**
     * @param lblimg21 the lblimg21 to set
     */
    public void setLblimg21(javax.swing.JLabel lblimg21) {
        this.lblimg21 = lblimg21;
    }

    /**
     * @return the lblimg22
     */
    public javax.swing.JLabel getLblimg22() {
        return lblimg22;
    }

    /**
     * @param lblimg22 the lblimg22 to set
     */
    public void setLblimg22(javax.swing.JLabel lblimg22) {
        this.lblimg22 = lblimg22;
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
     * @return the lblimg25
     */
    public javax.swing.JLabel getLblimg25() {
        return lblimg25;
    }

    /**
     * @param lblimg25 the lblimg25 to set
     */
    public void setLblimg25(javax.swing.JLabel lblimg25) {
        this.lblimg25 = lblimg25;
    }

    /**
     * @return the lblimg30
     */
    public javax.swing.JLabel getLblimg30() {
        return lblimg30;
    }

    /**
     * @param lblimg30 the lblimg30 to set
     */
    public void setLblimg30(javax.swing.JLabel lblimg30) {
        this.lblimg30 = lblimg30;
    }

    /**
     * @return the lblimg31
     */
    public javax.swing.JLabel getLblimg31() {
        return lblimg31;
    }

    /**
     * @param lblimg31 the lblimg31 to set
     */
    public void setLblimg31(javax.swing.JLabel lblimg31) {
        this.lblimg31 = lblimg31;
    }

    /**
     * @return the lblimg32
     */
    public javax.swing.JLabel getLblimg32() {
        return lblimg32;
    }

    /**
     * @param lblimg32 the lblimg32 to set
     */
    public void setLblimg32(javax.swing.JLabel lblimg32) {
        this.lblimg32 = lblimg32;
    }

    /**
     * @return the lblimg33
     */
    public javax.swing.JLabel getLblimg33() {
        return lblimg33;
    }

    /**
     * @param lblimg33 the lblimg33 to set
     */
    public void setLblimg33(javax.swing.JLabel lblimg33) {
        this.lblimg33 = lblimg33;
    }

    /**
     * @return the lblimg34
     */
    public javax.swing.JLabel getLblimg34() {
        return lblimg34;
    }

    /**
     * @param lblimg34 the lblimg34 to set
     */
    public void setLblimg34(javax.swing.JLabel lblimg34) {
        this.lblimg34 = lblimg34;
    }

    /**
     * @return the lblimg35
     */
    public javax.swing.JLabel getLblimg35() {
        return lblimg35;
    }

    /**
     * @param lblimg35 the lblimg35 to set
     */
    public void setLblimg35(javax.swing.JLabel lblimg35) {
        this.lblimg35 = lblimg35;
    }

    /**
     * @return the lblimg40
     */
    public javax.swing.JLabel getLblimg40() {
        return lblimg40;
    }

    /**
     * @param lblimg40 the lblimg40 to set
     */
    public void setLblimg40(javax.swing.JLabel lblimg40) {
        this.lblimg40 = lblimg40;
    }

    /**
     * @return the lblimg41
     */
    public javax.swing.JLabel getLblimg41() {
        return lblimg41;
    }

    /**
     * @param lblimg41 the lblimg41 to set
     */
    public void setLblimg41(javax.swing.JLabel lblimg41) {
        this.lblimg41 = lblimg41;
    }

    /**
     * @return the lblimg42
     */
    public javax.swing.JLabel getLblimg42() {
        return lblimg42;
    }

    /**
     * @param lblimg42 the lblimg42 to set
     */
    public void setLblimg42(javax.swing.JLabel lblimg42) {
        this.lblimg42 = lblimg42;
    }

    /**
     * @return the lblimg43
     */
    public javax.swing.JLabel getLblimg43() {
        return lblimg43;
    }

    /**
     * @param lblimg43 the lblimg43 to set
     */
    public void setLblimg43(javax.swing.JLabel lblimg43) {
        this.lblimg43 = lblimg43;
    }

    /**
     * @return the lblimg44
     */
    public javax.swing.JLabel getLblimg44() {
        return lblimg44;
    }

    /**
     * @param lblimg44 the lblimg44 to set
     */
    public void setLblimg44(javax.swing.JLabel lblimg44) {
        this.lblimg44 = lblimg44;
    }

    /**
     * @return the lblimg45
     */
    public javax.swing.JLabel getLblimg45() {
        return lblimg45;
    }

    /**
     * @param lblimg45 the lblimg45 to set
     */
    public void setLblimg45(javax.swing.JLabel lblimg45) {
        this.lblimg45 = lblimg45;
    }

    /**
     * @return the lblimg50
     */
    public javax.swing.JLabel getLblimg50() {
        return lblimg50;
    }

    /**
     * @param lblimg50 the lblimg50 to set
     */
    public void setLblimg50(javax.swing.JLabel lblimg50) {
        this.lblimg50 = lblimg50;
    }

    /**
     * @return the lblimg51
     */
    public javax.swing.JLabel getLblimg51() {
        return lblimg51;
    }

    /**
     * @param lblimg51 the lblimg51 to set
     */
    public void setLblimg51(javax.swing.JLabel lblimg51) {
        this.lblimg51 = lblimg51;
    }

    /**
     * @return the lblimg52
     */
    public javax.swing.JLabel getLblimg52() {
        return lblimg52;
    }

    /**
     * @param lblimg52 the lblimg52 to set
     */
    public void setLblimg52(javax.swing.JLabel lblimg52) {
        this.lblimg52 = lblimg52;
    }

    /**
     * @return the lblimg53
     */
    public javax.swing.JLabel getLblimg53() {
        return lblimg53;
    }

    /**
     * @param lblimg53 the lblimg53 to set
     */
    public void setLblimg53(javax.swing.JLabel lblimg53) {
        this.lblimg53 = lblimg53;
    }

    /**
     * @return the lblimg54
     */
    public javax.swing.JLabel getLblimg54() {
        return lblimg54;
    }

    /**
     * @param lblimg54 the lblimg54 to set
     */
    public void setLblimg54(javax.swing.JLabel lblimg54) {
        this.lblimg54 = lblimg54;
    }

    /**
     * @return the lblimg55
     */
    public javax.swing.JLabel getLblimg55() {
        return lblimg55;
    }

    /**
     * @param lblimg55 the lblimg55 to set
     */
    public void setLblimg55(javax.swing.JLabel lblimg55) {
        this.lblimg55 = lblimg55;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblimg00 = new javax.swing.JLabel();
        lblimg01 = new javax.swing.JLabel();
        lblimg02 = new javax.swing.JLabel();
        lblimg03 = new javax.swing.JLabel();
        lblimg04 = new javax.swing.JLabel();
        lblimg05 = new javax.swing.JLabel();
        lblimg10 = new javax.swing.JLabel();
        lblimg11 = new javax.swing.JLabel();
        lblimg12 = new javax.swing.JLabel();
        lblimg13 = new javax.swing.JLabel();
        lblimg14 = new javax.swing.JLabel();
        lblimg15 = new javax.swing.JLabel();
        lblimg20 = new javax.swing.JLabel();
        lblimg21 = new javax.swing.JLabel();
        lblimg22 = new javax.swing.JLabel();
        lblimg23 = new javax.swing.JLabel();
        lblimg24 = new javax.swing.JLabel();
        lblimg25 = new javax.swing.JLabel();
        lblimg30 = new javax.swing.JLabel();
        lblimg31 = new javax.swing.JLabel();
        lblimg32 = new javax.swing.JLabel();
        lblimg33 = new javax.swing.JLabel();
        lblimg34 = new javax.swing.JLabel();
        lblimg35 = new javax.swing.JLabel();
        lblimg40 = new javax.swing.JLabel();
        lblimg41 = new javax.swing.JLabel();
        lblimg42 = new javax.swing.JLabel();
        lblimg43 = new javax.swing.JLabel();
        lblimg44 = new javax.swing.JLabel();
        lblimg45 = new javax.swing.JLabel();
        lblimg50 = new javax.swing.JLabel();
        lblimg51 = new javax.swing.JLabel();
        lblimg52 = new javax.swing.JLabel();
        lblimg53 = new javax.swing.JLabel();
        lblimg54 = new javax.swing.JLabel();
        lblimg55 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(690, 610));
        setLayout(new java.awt.GridLayout(6, 6));

        lblimg00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg00.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg00MouseClicked(evt);
            }
        });
        add(lblimg00);

        lblimg01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg01MouseClicked(evt);
            }
        });
        add(lblimg01);

        lblimg02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg02MouseClicked(evt);
            }
        });
        add(lblimg02);

        lblimg03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg03MouseClicked(evt);
            }
        });
        add(lblimg03);

        lblimg04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg04.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg04MouseClicked(evt);
            }
        });
        add(lblimg04);

        lblimg05.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg05.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg05MouseClicked(evt);
            }
        });
        add(lblimg05);

        lblimg10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg10MouseClicked(evt);
            }
        });
        add(lblimg10);

        lblimg11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg11MouseClicked(evt);
            }
        });
        add(lblimg11);

        lblimg12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg12MouseClicked(evt);
            }
        });
        add(lblimg12);

        lblimg13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg13MouseClicked(evt);
            }
        });
        add(lblimg13);

        lblimg14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg14MouseClicked(evt);
            }
        });
        add(lblimg14);

        lblimg15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg15MouseClicked(evt);
            }
        });
        add(lblimg15);

        lblimg20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg20MouseClicked(evt);
            }
        });
        add(lblimg20);

        lblimg21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg21MouseClicked(evt);
            }
        });
        add(lblimg21);

        lblimg22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg22MouseClicked(evt);
            }
        });
        add(lblimg22);

        lblimg23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg23MouseClicked(evt);
            }
        });
        add(lblimg23);

        lblimg24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg24MouseClicked(evt);
            }
        });
        add(lblimg24);

        lblimg25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg25MouseClicked(evt);
            }
        });
        add(lblimg25);

        lblimg30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg30MouseClicked(evt);
            }
        });
        add(lblimg30);

        lblimg31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg31MouseClicked(evt);
            }
        });
        add(lblimg31);

        lblimg32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg32MouseClicked(evt);
            }
        });
        add(lblimg32);

        lblimg33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg33MouseClicked(evt);
            }
        });
        add(lblimg33);

        lblimg34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg34MouseClicked(evt);
            }
        });
        add(lblimg34);

        lblimg35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg35MouseClicked(evt);
            }
        });
        add(lblimg35);

        lblimg40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg40MouseClicked(evt);
            }
        });
        add(lblimg40);

        lblimg41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg41MouseClicked(evt);
            }
        });
        add(lblimg41);

        lblimg42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg42MouseClicked(evt);
            }
        });
        add(lblimg42);

        lblimg43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg43MouseClicked(evt);
            }
        });
        add(lblimg43);

        lblimg44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg44MouseClicked(evt);
            }
        });
        add(lblimg44);

        lblimg45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg45MouseClicked(evt);
            }
        });
        add(lblimg45);

        lblimg50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg50MouseClicked(evt);
            }
        });
        add(lblimg50);

        lblimg51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg51MouseClicked(evt);
            }
        });
        add(lblimg51);

        lblimg52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg52MouseClicked(evt);
            }
        });
        add(lblimg52);

        lblimg53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg53MouseClicked(evt);
            }
        });
        add(lblimg53);

        lblimg54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg54MouseClicked(evt);
            }
        });
        add(lblimg54);

        lblimg55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"))); // NOI18N
        lblimg55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimg55MouseClicked(evt);
            }
        });
        add(lblimg55);
    }// </editor-fold>//GEN-END:initComponents

    private void lblimg00MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg00MouseClicked
        tentarJogada(0, 0, lblimg00);
    }//GEN-LAST:event_lblimg00MouseClicked

    private void lblimg01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg01MouseClicked
         tentarJogada(0, 1, lblimg01);
    }//GEN-LAST:event_lblimg01MouseClicked

    private void lblimg03MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg03MouseClicked
         tentarJogada(0, 3, lblimg03);
    }//GEN-LAST:event_lblimg03MouseClicked

    private void lblimg04MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg04MouseClicked
         tentarJogada(0, 4, lblimg04);
    }//GEN-LAST:event_lblimg04MouseClicked

    private void lblimg05MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg05MouseClicked
         tentarJogada(0, 5, lblimg05);
    }//GEN-LAST:event_lblimg05MouseClicked

    private void lblimg10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg10MouseClicked
         tentarJogada(1, 0, lblimg10);
    }//GEN-LAST:event_lblimg10MouseClicked

    private void lblimg02MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg02MouseClicked
        tentarJogada(0, 2, lblimg02);
    }//GEN-LAST:event_lblimg02MouseClicked

    private void lblimg11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg11MouseClicked
        tentarJogada(1, 1, lblimg11);
    }//GEN-LAST:event_lblimg11MouseClicked

    private void lblimg12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg12MouseClicked
        tentarJogada(1, 2, lblimg12);
    }//GEN-LAST:event_lblimg12MouseClicked

    private void lblimg13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg13MouseClicked
        tentarJogada(1, 3, lblimg13);
    }//GEN-LAST:event_lblimg13MouseClicked

    private void lblimg14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg14MouseClicked
        tentarJogada(1, 4, lblimg14);
    }//GEN-LAST:event_lblimg14MouseClicked

    private void lblimg15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg15MouseClicked
        tentarJogada(1, 5, lblimg15);
    }//GEN-LAST:event_lblimg15MouseClicked

    private void lblimg20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg20MouseClicked
        tentarJogada(2, 0, lblimg20);
    }//GEN-LAST:event_lblimg20MouseClicked

    private void lblimg24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg24MouseClicked
       tentarJogada(2, 4, lblimg24);
    }//GEN-LAST:event_lblimg24MouseClicked

    private void lblimg25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg25MouseClicked
        tentarJogada(2, 5, lblimg25);
    }//GEN-LAST:event_lblimg25MouseClicked

    private void lblimg30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg30MouseClicked
       tentarJogada(3, 0, lblimg30);
    }//GEN-LAST:event_lblimg30MouseClicked

    private void lblimg31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg31MouseClicked
        tentarJogada(3, 1, lblimg31);
    }//GEN-LAST:event_lblimg31MouseClicked

    private void lblimg32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg32MouseClicked
        tentarJogada(3, 2, lblimg32);
    }//GEN-LAST:event_lblimg32MouseClicked

    private void lblimg21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg21MouseClicked
        tentarJogada(2, 1, lblimg21);
    }//GEN-LAST:event_lblimg21MouseClicked

    private void lblimg33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg33MouseClicked
        tentarJogada(3, 3, lblimg33);
    }//GEN-LAST:event_lblimg33MouseClicked

    private void lblimg34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg34MouseClicked
        tentarJogada(3, 4, lblimg34);
    }//GEN-LAST:event_lblimg34MouseClicked

    private void lblimg35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg35MouseClicked
        tentarJogada(3, 5, lblimg35);
    }//GEN-LAST:event_lblimg35MouseClicked

    private void lblimg40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg40MouseClicked
        tentarJogada(4, 0, lblimg40);
    }//GEN-LAST:event_lblimg40MouseClicked

    private void lblimg41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg41MouseClicked
        tentarJogada(4, 1, lblimg41);
    }//GEN-LAST:event_lblimg41MouseClicked

    private void lblimg22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg22MouseClicked
        tentarJogada(2, 2, lblimg22);
    }//GEN-LAST:event_lblimg22MouseClicked

    private void lblimg42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg42MouseClicked
        tentarJogada(4, 2, lblimg42);
    }//GEN-LAST:event_lblimg42MouseClicked

    private void lblimg43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg43MouseClicked
        tentarJogada(4, 3, lblimg43);
    }//GEN-LAST:event_lblimg43MouseClicked

    private void lblimg44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg44MouseClicked
        tentarJogada(4, 4, lblimg44);
    }//GEN-LAST:event_lblimg44MouseClicked

    private void lblimg45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg45MouseClicked
        tentarJogada(4, 5, lblimg45);
    }//GEN-LAST:event_lblimg45MouseClicked

    private void lblimg50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg50MouseClicked
        tentarJogada(5, 0, lblimg50);
    }//GEN-LAST:event_lblimg50MouseClicked

    private void lblimg23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg23MouseClicked
       tentarJogada(2, 3, lblimg23);
    }//GEN-LAST:event_lblimg23MouseClicked

    private void lblimg51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg51MouseClicked
        tentarJogada(5, 1, lblimg51);
    }//GEN-LAST:event_lblimg51MouseClicked

    private void lblimg52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg52MouseClicked
        tentarJogada(5, 2, lblimg52);
    }//GEN-LAST:event_lblimg52MouseClicked

    private void lblimg53MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg53MouseClicked
       tentarJogada(5, 3, lblimg53);
    }//GEN-LAST:event_lblimg53MouseClicked

    private void lblimg54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg54MouseClicked
       tentarJogada(5, 4, lblimg54);
    }//GEN-LAST:event_lblimg54MouseClicked

    private void lblimg55MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimg55MouseClicked
       tentarJogada(5, 5, lblimg55);
    }//GEN-LAST:event_lblimg55MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblimg00;
    private javax.swing.JLabel lblimg01;
    private javax.swing.JLabel lblimg02;
    private javax.swing.JLabel lblimg03;
    private javax.swing.JLabel lblimg04;
    private javax.swing.JLabel lblimg05;
    private javax.swing.JLabel lblimg10;
    private javax.swing.JLabel lblimg11;
    private javax.swing.JLabel lblimg12;
    private javax.swing.JLabel lblimg13;
    private javax.swing.JLabel lblimg14;
    private javax.swing.JLabel lblimg15;
    private javax.swing.JLabel lblimg20;
    private javax.swing.JLabel lblimg21;
    private javax.swing.JLabel lblimg22;
    private javax.swing.JLabel lblimg23;
    private javax.swing.JLabel lblimg24;
    private javax.swing.JLabel lblimg25;
    private javax.swing.JLabel lblimg30;
    private javax.swing.JLabel lblimg31;
    private javax.swing.JLabel lblimg32;
    private javax.swing.JLabel lblimg33;
    private javax.swing.JLabel lblimg34;
    private javax.swing.JLabel lblimg35;
    private javax.swing.JLabel lblimg40;
    private javax.swing.JLabel lblimg41;
    private javax.swing.JLabel lblimg42;
    private javax.swing.JLabel lblimg43;
    private javax.swing.JLabel lblimg44;
    private javax.swing.JLabel lblimg45;
    private javax.swing.JLabel lblimg50;
    private javax.swing.JLabel lblimg51;
    private javax.swing.JLabel lblimg52;
    private javax.swing.JLabel lblimg53;
    private javax.swing.JLabel lblimg54;
    private javax.swing.JLabel lblimg55;
    // End of variables declaration//GEN-END:variables
}
