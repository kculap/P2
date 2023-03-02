/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos;

/**
 *
 * @author Korisnik
 */
public abstract class Zivotinja  {
     
    private long starost;
    private int tezina;

    public long getStarost() {
        return starost;
    }

    public void setStarost(long starost) {
        this.starost = starost;
    }

    public int getTezina() {
        return tezina;
    }

    public void setTezina(int tezina) {
        this.tezina = tezina;
    }
    

}