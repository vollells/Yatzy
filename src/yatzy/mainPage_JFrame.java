/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yatzy;

import javax.swing.JOptionPane;

/**
 *
 * @author victorlells
 */
public class mainPage_JFrame extends javax.swing.JFrame {
    
    infoShare main = new infoShare();
    public int numPlayers = 0;
    public String playerName[]  = new String[4];
    
    /**
     * Creates new form mainPage_JFrame
     */
    public mainPage_JFrame() {
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

        lblWelcome = new javax.swing.JLabel();
        txfPlayer3 = new javax.swing.JTextField();
        txfPlayer4 = new javax.swing.JTextField();
        txfPlayer1 = new javax.swing.JTextField();
        txfPlayer2 = new javax.swing.JTextField();
        btnStart = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblWelcome.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        lblWelcome.setText("Welcome to YATZY!");

        txfPlayer3.setFont(new java.awt.Font("Trattatello", 0, 18)); // NOI18N
        txfPlayer3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfPlayer3.setText("Player 3");

        txfPlayer4.setFont(new java.awt.Font("Trattatello", 0, 18)); // NOI18N
        txfPlayer4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfPlayer4.setText("Player 4");

        txfPlayer1.setFont(new java.awt.Font("Trattatello", 0, 18)); // NOI18N
        txfPlayer1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfPlayer1.setText("Player 1");

        txfPlayer2.setFont(new java.awt.Font("Trattatello", 0, 18)); // NOI18N
        txfPlayer2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfPlayer2.setText("Player 2");

        btnStart.setFont(new java.awt.Font("Trattatello", 0, 24)); // NOI18N
        btnStart.setText("START!");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel1.setText("Max 8 Letters");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txfPlayer3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txfPlayer4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txfPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txfPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lblWelcome, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jLabel1)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblWelcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfPlayer3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfPlayer4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        
        if(txfPlayer1.getText().equals("Player 1")){
            
            JOptionPane.showMessageDialog(null, "Please enter atleast one name "
                    , "No Name",JOptionPane.ERROR_MESSAGE);
            
        }else if (txfPlayer1.getText().length() > 7){
            
            JOptionPane.showMessageDialog(null, "Your name is too long!"
                    , "Long Name",JOptionPane.ERROR_MESSAGE);
        }else if(txfPlayer2.getText().equals("Player 2")){
            
            gamePage_JPanel.numPlayers = 0;
            gamePage_JPanel.playerName[0] = txfPlayer1.getText();
            
            new yatzy_JFrame().setVisible(true);
            
        }else if(txfPlayer3.getText().equals("Player 3")){
           
            gamePage_JPanel.numPlayers = 1;
            gamePage_JPanel.playerName[0] = txfPlayer1.getText();
            gamePage_JPanel.playerName[1] = txfPlayer2.getText();
            
            new yatzy_JFrame().setVisible(true);
            
        }else if(txfPlayer4.getText().equals("Player 4")){
            
            gamePage_JPanel.numPlayers = 2;
            gamePage_JPanel.playerName[0] = txfPlayer1.getText();
            gamePage_JPanel.playerName[1] = txfPlayer2.getText();
            gamePage_JPanel.playerName[2] = txfPlayer2.getText();
            
            new yatzy_JFrame().setVisible(true);
        }else{
            
            gamePage_JPanel.numPlayers = 3;
            gamePage_JPanel.playerName[0] = txfPlayer1.getText();
            gamePage_JPanel.playerName[1] = txfPlayer2.getText();
            gamePage_JPanel.playerName[2] = txfPlayer3.getText();
            gamePage_JPanel.playerName[3] = txfPlayer4.getText();
            
            new yatzy_JFrame().setVisible(true);
        }

    }//GEN-LAST:event_btnStartActionPerformed

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
            java.util.logging.Logger.getLogger(mainPage_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainPage_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainPage_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainPage_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JTextField txfPlayer1;
    private javax.swing.JTextField txfPlayer2;
    private javax.swing.JTextField txfPlayer3;
    private javax.swing.JTextField txfPlayer4;
    // End of variables declaration//GEN-END:variables
}