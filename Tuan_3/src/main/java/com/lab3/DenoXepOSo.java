/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab3;

/**
 *
 * @author neroooo
 */
public class DenoXepOSo extends javax.swing.JFrame {

    /**
     * Creates new form DenoXepOSo
     */
    public DenoXepOSo() {
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

        pnlMain = new javax.swing.JPanel();
        pnlTop = new javax.swing.JPanel();
        lblTt = new javax.swing.JLabel();
        pnlBottom = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlMain.setLayout(new java.awt.BorderLayout());

        lblTt.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblTt.setText("Tro Choi Xep O So");
        pnlTop.add(lblTt);

        pnlMain.add(pnlTop, java.awt.BorderLayout.PAGE_START);

        pnlBottom.setLayout(new java.awt.GridLayout(4, 4, 3, 3));

        btn1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn1.setText("15");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        pnlBottom.add(btn1);

        btn2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn2.setText("14");
        pnlBottom.add(btn2);

        btn3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn3.setText("13");
        pnlBottom.add(btn3);

        btn4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn4.setText("12");
        pnlBottom.add(btn4);

        btn5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn5.setText("11");
        pnlBottom.add(btn5);

        btn6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn6.setText("10");
        pnlBottom.add(btn6);

        btn7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn7.setText("9");
        pnlBottom.add(btn7);

        btn8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn8.setText("8");
        pnlBottom.add(btn8);

        btn9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn9.setText("7");
        pnlBottom.add(btn9);

        btn10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn10.setText("6");
        pnlBottom.add(btn10);

        btn11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn11.setText("5");
        pnlBottom.add(btn11);

        btn12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn12.setText("4");
        pnlBottom.add(btn12);

        btn13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn13.setText("3");
        pnlBottom.add(btn13);

        btn14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn14.setText("2");
        pnlBottom.add(btn14);

        btn15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn15.setText("1");
        pnlBottom.add(btn15);

        btn16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pnlBottom.add(btn16);

        pnlMain.add(pnlBottom, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn1ActionPerformed

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
            java.util.logging.Logger.getLogger(DenoXepOSo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DenoXepOSo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DenoXepOSo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DenoXepOSo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DenoXepOSo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JLabel lblTt;
    private javax.swing.JPanel pnlBottom;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlTop;
    // End of variables declaration//GEN-END:variables
}
