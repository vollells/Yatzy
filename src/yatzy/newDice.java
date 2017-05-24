/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yatzy;



/**
 * Klass som är ett objekt för Dice!
 * @author victorlells
 */
public class newDice {
   //Medlemsvariabler
    private int varde;
    private int x;
    private boolean reRoll = true;

    /**
     * Metod som sätter det till rätt x position och 
     * sätter ett radom värde påtärningaren  
     * @param y X position på tärning
     */
    public newDice(int y) {
        x = y;
        this.varde = (int)(Math.random()*6)+1;
    }

    /**
     * Metod som returnerar Varde
     * @return Varde
     */
    public int getVarde() {
        return varde;
    }
   
    /**
     * Metod som returnerar x positionen
     * @return x
     */
    public int getX() {
        return x;
    }

    /**
     * Metod som sätter ett random värde på tärningen 
     */
    public void setVarde() {
        varde = (int)(Math.random()*6)+1;
    }
    
    /**
     * Metod som ändrar värdet på ReRoll
     */
    public void setReroll(){
        reRoll = !reRoll;
    }
    
    /**
     * Metod som returnerar värdet på reroll
     * @return reRoll
     */
    public boolean getReroll(){
        return reRoll;
    }
    

}
