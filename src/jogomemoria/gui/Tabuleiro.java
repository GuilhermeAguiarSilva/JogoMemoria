/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogomemoria.gui;


import javax.swing.JPanel;

/**
 *
 * @author Aluno
 */
public class Tabuleiro extends javax.swing.JPanel {

    /**
     * Creates new form Tabuleiro
     */
    public Tabuleiro() {
        initComponents();
    }

        /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sppTabuleiro = new javax.swing.JSplitPane();
        info2 = new jogomemoria.gui.Info();

        setLayout(new java.awt.BorderLayout());

        sppTabuleiro.setLeftComponent(info2);

        add(sppTabuleiro, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private jogomemoria.gui.Info info2;
    private javax.swing.JSplitPane sppTabuleiro;
    // End of variables declaration//GEN-END:variables



public void setTabuleiro(JPanel pnl){
    sppTabuleiro.setRightComponent(pnl);
}

}
