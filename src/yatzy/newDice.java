/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yatzy;



/**
 *
 * @author victorlells
 */
public class newDice {
    private int varde;
    private int x;
    

    public newDice(int y) {
        x = y;
        this.varde = (int)(Math.random()*6)+1;
    }

    public int getVarde() {
        return varde;
    }

    public int getX() {
        return x;
    }

    public void setVarde() {
        varde = (int)(Math.random()*6)+1;
    }
    

}
