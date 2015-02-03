/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihm;

import modele.Partie;

/**
 *
 * @author Rasem
 */
public class PanelNouveauCoup extends javax.swing.JPanel {

     private Partie partie;
    /**
     * Creates new form PanelNouveauCoup
     */
    public PanelNouveauCoup() {
        initComponents();
    }
    public PanelNouveauCoup(Partie partie) {
        this.partie=partie;
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

        AB = new javax.swing.JLabel();
        Coopere2 = new javax.swing.JLabel();
        FaitDefaut2 = new javax.swing.JLabel();
        FaitDefaut1 = new javax.swing.JLabel();
        Coopere1 = new javax.swing.JLabel();
        jButtonCC = new javax.swing.JButton();
        jButtonCD = new javax.swing.JButton();
        jButtonDC = new javax.swing.JButton();
        jButtonDD = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Prochain Coup"));

        AB.setText("A | B");

        Coopere2.setText("Coopère");

        FaitDefaut2.setText("Fait Défaut");

        FaitDefaut1.setText("Fait Défaut");

        Coopere1.setText("Coopère");

        jButtonCC.setText("C C");
        jButtonCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCCActionPerformed(evt);
            }
        });

        jButtonCD.setText("C D");
        jButtonCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCDActionPerformed(evt);
            }
        });

        jButtonDC.setText("D C");
        jButtonDC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDCActionPerformed(evt);
            }
        });

        jButtonDD.setText("D D");
        jButtonDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Coopere1)
                    .addComponent(FaitDefaut1)
                    .addComponent(AB))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Coopere2)
                        .addComponent(jButtonCC))
                    .addComponent(jButtonDC))
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonDD)
                    .addComponent(FaitDefaut2)
                    .addComponent(jButtonCD))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AB)
                    .addComponent(Coopere2)
                    .addComponent(FaitDefaut2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Coopere1)
                    .addComponent(jButtonCC)
                    .addComponent(jButtonCD))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FaitDefaut1)
                    .addComponent(jButtonDC)
                    .addComponent(jButtonDD))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCCActionPerformed
        // TODO add your handling code here:
        partie.cooperer(true, true);
    }//GEN-LAST:event_jButtonCCActionPerformed

    private void jButtonCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCDActionPerformed
        // TODO add your handling code here:
        partie.cooperer(true, false);
    }//GEN-LAST:event_jButtonCDActionPerformed

    private void jButtonDCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDCActionPerformed
        // TODO add your handling code here:
        partie.cooperer(false, true);
    }//GEN-LAST:event_jButtonDCActionPerformed

    private void jButtonDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDDActionPerformed
        // TODO add your handling code here:
        partie.cooperer(false, false);
    }//GEN-LAST:event_jButtonDDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AB;
    private javax.swing.JLabel Coopere1;
    private javax.swing.JLabel Coopere2;
    private javax.swing.JLabel FaitDefaut1;
    private javax.swing.JLabel FaitDefaut2;
    private javax.swing.JButton jButtonCC;
    private javax.swing.JButton jButtonCD;
    private javax.swing.JButton jButtonDC;
    private javax.swing.JButton jButtonDD;
    // End of variables declaration//GEN-END:variables
}
