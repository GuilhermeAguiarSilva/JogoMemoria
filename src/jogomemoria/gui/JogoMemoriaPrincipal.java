/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogomemoria.gui;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import jogomemoria.control.JogoMemoriaCtrl;
import jogomemoria.model.PecaTabuleiro;

;

/**
 *
 * @author Aluno
 */
public class JogoMemoriaPrincipal extends javax.swing.JFrame {

    private JogoMemoriaFacil jpf;
    private JogoMemoriaIntermediario jpi;
    private JogoMemoriaDificil jpd;
    private Tabuleiro jpt = new Tabuleiro();
    private JogoMemoriaCtrl controle;

    /**
     * Creates new form JogoMemoriaForm
     */
    public JogoMemoriaPrincipal() {
        initComponents();
        controle = new JogoMemoriaCtrl();
        jpf = new JogoMemoriaFacil(controle);
        jpi = new JogoMemoriaIntermediario(controle);
        jpd = new JogoMemoriaDificil(controle);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sppPrincipal = new javax.swing.JSplitPane();
        pnlPrincipal = new javax.swing.JPanel();
        lblTempo = new javax.swing.JLabel();
        spnTempo = new javax.swing.JSpinner();
        btnIniciar = new javax.swing.JButton();
        cmbNivel = new javax.swing.JComboBox();
        lblNivel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        pnlIntroducao = new javax.swing.JPanel();
        lblTela1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sppPrincipal.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        lblTempo.setText("Tempo Limite:");

        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        cmbNivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Iniciante", "Intermediário", "Difícil" }));
        cmbNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNivelActionPerformed(evt);
            }
        });

        lblNivel.setText("Nível :");

        jButton1.setText("Cancelar");
        jButton1.setMaximumSize(new java.awt.Dimension(63, 23));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spnTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                .addComponent(lblNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(spnTempo)
                                .addComponent(cmbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        sppPrincipal.setLeftComponent(pnlPrincipal);

        pnlIntroducao.setPreferredSize(new java.awt.Dimension(868, 525));

        lblTela1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm19Tela.png"))); // NOI18N

        jLabel1.setText("Fique Feliz Aqui!!");

        javax.swing.GroupLayout pnlIntroducaoLayout = new javax.swing.GroupLayout(pnlIntroducao);
        pnlIntroducao.setLayout(pnlIntroducaoLayout);
        pnlIntroducaoLayout.setHorizontalGroup(
            pnlIntroducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIntroducaoLayout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(pnlIntroducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlIntroducaoLayout.createSequentialGroup()
                        .addComponent(lblTela1, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlIntroducaoLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(395, 395, 395))))
        );
        pnlIntroducaoLayout.setVerticalGroup(
            pnlIntroducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlIntroducaoLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTela1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        sppPrincipal.setRightComponent(pnlIntroducao);

        getContentPane().add(sppPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        int nivelSelec = 0;
        String nivel = (String) cmbNivel.getSelectedItem();

        if (nivel.equals("Iniciante")) {
            nivelSelec = controle.FACIL;
        }
        if (((String) cmbNivel.getSelectedItem()).equals("Intermediário")) {
            nivelSelec = controle.INTERMEDIARIO;
        }
        if (nivel.equals("Difícil")) {
            nivelSelec = controle.DIFICIL;
        }

        int tempoL = (((Integer) spnTempo.getValue()).intValue());
  
        sppPrincipal.setRightComponent(jpt);
                
        controle.iniciarPartida(nivelSelec, tempoL);
        mostrarTabuleiro(true);

        int resp = JOptionPane.showConfirmDialog(this, "Você esta pronto?" , "Confime" , JOptionPane.YES_NO_OPTION);
        
        if(resp == JOptionPane.YES_OPTION){
            mostrarTabuleiro(false);
        } else {
            sppPrincipal.setRightComponent(pnlIntroducao);
        }
        
        
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void cmbNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNivelActionPerformed

    }//GEN-LAST:event_cmbNivelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JogoMemoriaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoMemoriaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoMemoriaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoMemoriaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoMemoriaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JComboBox cmbNivel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblNivel;
    private javax.swing.JLabel lblTela1;
    private javax.swing.JLabel lblTempo;
    private javax.swing.JPanel pnlIntroducao;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JSpinner spnTempo;
    private javax.swing.JSplitPane sppPrincipal;
    // End of variables declaration//GEN-END:variables

    public void mostrarTabuleiro(boolean inicioJogo) {

        PecaTabuleiro pctb[][] = controle.getTabuleiro();
        int idImg;

        ImageIcon imgDuvida = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm0.png"));

        if (controle.getNivelAtual() == controle.FACIL) {
            jpt.setTabuleiro(jpf);
            jpf.mostrar(inicioJogo);
            this.setSize(800, 600);
        }

        if (controle.getNivelAtual() == controle.INTERMEDIARIO) {
            jpt.setTabuleiro(jpi);
            jpi.mostrar(inicioJogo);
            this.setSize(1024, 768);
        }

        if (controle.getNivelAtual() == controle.DIFICIL) {

            jpt.setTabuleiro(jpd);
            jpd.mostrar(inicioJogo);
            this.setSize(1600, 980);
        }
    }
        /**
         * @return the sppPrincipal
         */
    public javax.swing.JSplitPane getSppPrincipal() {
        return sppPrincipal;
    }

    /**
     * @param sppPrincipal the sppPrincipal to set
     */
    public void setSppPrincipal(javax.swing.JSplitPane sppPrincipal) {
        this.sppPrincipal = sppPrincipal;
    }
}
