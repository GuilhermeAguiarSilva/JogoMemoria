/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogomemoria.gui;

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

        jSplitPane1 = new javax.swing.JSplitPane();
        jogoMemoriaIniciante2 = new jogomemoria.gui.JogoMemoriaIniciante();
        info1 = new jogomemoria.gui.Info();

        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setLeftComponent(jogoMemoriaIniciante2);

        javax.swing.GroupLayout info1Layout = new javax.swing.GroupLayout(info1);
        info1.setLayout(info1Layout);
        info1Layout.setHorizontalGroup(
            info1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 95, Short.MAX_VALUE)
        );
        info1Layout.setVerticalGroup(
            info1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 525, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(info1);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private jogomemoria.gui.Info info1;
    private javax.swing.JSplitPane jSplitPane1;
    private jogomemoria.gui.JogoMemoriaIniciante jogoMemoriaIniciante2;
    // End of variables declaration//GEN-END:variables
}