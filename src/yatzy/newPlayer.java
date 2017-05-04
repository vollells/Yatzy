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
public class newPlayer {
    
    private String namn;
    private int ettor;
    private int tvaor;
    private int treor;
    private int fyror;
    private int femmor;
    private int sexor;
    private int ettPar;
    private int tvaPar;
    private int triss;
    private int fyrtal;
    private int litenStege;
    private int storStege;
    private int kak;
    private int chans;
    private int yatzy;
    private int total;
    private boolean[] discard = new boolean[16];
    private boolean discardEtt = false;
    private boolean discardTva = false;
    private boolean discardTre = false;
    private boolean discardFyra = false;
    private boolean discardFem = false;
    private boolean discardSex = false;
    private boolean discardEttPar = false;
    private boolean discardTvaPar = false;
    private boolean discardTriss = false;
    private boolean discardFyrtal = false;
    private boolean discardLStege = false;
    private boolean discardSStege = false;
    private boolean discardKak = false;
    private boolean discardChans = false;
    private boolean discardYatzy = false;
    
    
    
    public void setDiscard(boolean[] discard) {
        this.discard = discard;
    }

    public boolean[] getDiscard() {
        return discard;
    }

    public void setDiscardEtt(boolean discardEtt) {
        this.discardEtt = discardEtt;
    }

    public void setDiscardTva(boolean discardTva) {
        this.discardTva = discardTva;
    }

    public void setDiscardTre(boolean discardTre) {
        this.discardTre = discardTre;
    }

    public void setDiscardFyra(boolean discardFyra) {
        this.discardFyra = discardFyra;
    }

    public void setDiscardFem(boolean discardFem) {
        this.discardFem = discardFem;
    }

    public void setDiscardSex(boolean discardSex) {
        this.discardSex = discardSex;
    }

    public void setDiscardEttPar(boolean discardEttPar) {
        this.discardEttPar = discardEttPar;
    }

    public void setDiscardTvaPar(boolean discardTvaPar) {
        this.discardTvaPar = discardTvaPar;
    }

    public void setDiscardTriss(boolean discardTriss) {
        this.discardTriss = discardTriss;
    }

    public void setDiscardFyrtal(boolean discardFyrtal) {
        this.discardFyrtal = discardFyrtal;
    }

    public void setDiscardLStege(boolean discardLStege) {
        this.discardLStege = discardLStege;
    }

    public void setDiscardSStege(boolean discardSStege) {
        this.discardSStege = discardSStege;
    }

    public void setDiscardKak(boolean discardKak) {
        this.discardKak = discardKak;
    }

    public void setDiscardChans(boolean discardChans) {
        this.discardChans = discardChans;
    }

    public void setDiscardYatzy(boolean discardYatzy) {
        this.discardYatzy = discardYatzy;
    }

    public boolean isDiscardEtt() {
        return discardEtt;
    }

    public boolean isDiscardTva() {
        return discardTva;
    }

    public boolean isDiscardTre() {
        return discardTre;
    }

    public boolean isDiscardFyra() {
        return discardFyra;
    }

    public boolean isDiscardFem() {
        return discardFem;
    }

    public boolean isDiscardSex() {
        return discardSex;
    }

    public boolean isDiscardEttPar() {
        return discardEttPar;
    }

    public boolean isDiscardTvaPar() {
        return discardTvaPar;
    }

    public boolean isDiscardTriss() {
        return discardTriss;
    }

    public boolean isDiscardFyrtal() {
        return discardFyrtal;
    }

    public boolean isDiscardLStege() {
        return discardLStege;
    }

    public boolean isDiscardSStege() {
        return discardSStege;
    }

    public boolean isDiscardKak() {
        return discardKak;
    }

    public boolean isDiscardChans() {
        return discardChans;
    }

    public boolean isDiscardYatzy() {
        return discardYatzy;
    }


    public newPlayer(String namn) {
        this.namn = namn;
    }

    public String getNamn() {
        return namn;
    }

    public int getEttor() {
        return ettor;
    }

    public int getTvaor() {
        return tvaor;
    }

    public int getTreor() {
        return treor;
    }

    public int getFyror() {
        return fyror;
    }

    public int getFemmor() {
        return femmor;
    }

    public int getSexor() {
        return sexor;
    }

    public int getEttPar() {
        return ettPar;
    }

    public int getTvaPar() {
        return tvaPar;
    }

    public int getTriss() {
        return triss;
    }

    public int getFyrtal() {
        return fyrtal;
    }

    public int getLitenStege() {
        return litenStege;
    }

    public int getStorStege() {
        return storStege;
    }

    public int getKak() {
        return kak;
    }

    public int getChans() {
        return chans;
    }

    public int getYatzy() {
        return yatzy;
    }

    public int getTotal() {
        return total;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public void setEttor(int ettor) {
        this.ettor = ettor;
    }

    public void setTvaor(int tvaor) {
        this.tvaor = tvaor;
    }

    public void setTreor(int treor) {
        this.treor = treor;
    }

    public void setFyror(int fyror) {
        this.fyror = fyror;
    }

    public void setFemmor(int femmor) {
        this.femmor = femmor;
    }

    public void setSexor(int sexor) {
        this.sexor = sexor;
    }

    public void setEttPar(int ettPar) {
        this.ettPar = ettPar;
    }

    public void setTvaPar(int tvaPar) {
        this.tvaPar = tvaPar;
    }

    public void setTriss(int triss) {
        this.triss = triss;
    }

    public void setFyrtal(int fyrtal) {
        this.fyrtal = fyrtal;
    }

    public void setLitenStege(int litenStege) {
        this.litenStege = litenStege;
    }

    public void setStorStege(int storStege) {
        this.storStege = storStege;
    }

    public void setKak(int kak) {
        this.kak = kak;
    }

    public void setChans(int chans) {
        this.chans = chans;
    }

    public void setYatzy(int yatzy) {
        this.yatzy = yatzy;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    

    
}
