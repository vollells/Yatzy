/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yatzy;

import java.awt.Color;
import java.awt.Graphics;
import yatzy.yatzy_JFrame;

/**
 *
 * @author victorlells
 */
public class dices_JPanel extends javax.swing.JPanel {
    
    newDice Dice[] = {new newDice(2),new newDice(90),new newDice(359),new newDice(455),new newDice(551)};
    
    /**
     * Creates new form dices_JPanel
     */
    public dices_JPanel() {
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

public void paintshit(){
    repaint();
}

public void paintComponent(Graphics g)
    {   
        super.paintComponent(g);
        
            for (int i= 0; i<=4 ; i++){
                int x = yatzy_JFrame.Dice[i].getX();
                if(yatzy_JFrame.Dice[i].getReroll()){
                    g.setColor(Color.darkGray);
                    g.fillRect(x, 2, 86, 86);
                }else{
                    g.setColor(Color.red);
                    g.fillRect(x, 2, 86, 86);
                }
                
                switch (yatzy_JFrame.Dice[i].getVarde()) {
                    case 1:
                        g.setColor(Color.white);
                        g.fillOval(x+30, 32, 26, 26);
                        break;
                    case 2:
                        g.setColor(Color.white);
                        g.fillOval(x+1, 3, 26, 26);
                        g.fillOval(x+59, 61, 26, 26);
                        break;
                    case 3:
                        g.setColor(Color.white);
                        g.fillOval(x+1, 3, 26, 26);
                        g.fillOval(x+30, 32, 26, 26);
                        g.fillOval(x+59, 61, 26, 26);
                        break;
                    case 4:
                        g.setColor(Color.white);
                        g.fillOval(x+1, 3, 26, 26);
                        g.fillOval(x+59, 3, 26, 26);
                        g.fillOval(x+59, 61, 26, 26);
                        g.fillOval(x+1, 61, 26, 26);
                        break;
                    case 5:
                        g.setColor(Color.white);
                        g.fillOval(x+1, 3, 26, 26);
                        g.fillOval(x+59, 3, 26, 26);
                        g.fillOval(x+30, 32, 26, 26);
                        g.fillOval(x+59, 61, 26, 26);
                        g.fillOval(x+1, 61, 26, 26);
                        break;
                    case 6:
                        g.setColor(Color.white);
                        g.fillOval(x+1, 3, 26, 26);
                        g.fillOval(x+59, 3, 26, 26);
                        g.fillOval(x+30, 3, 26, 26);
                        g.fillOval(x+30, 61, 26, 26);
                        g.fillOval(x+59, 61, 26, 26);
                        g.fillOval(x+1, 61, 26, 26);
                        break;
                }
            }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
