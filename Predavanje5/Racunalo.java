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
public class Racunalo {
    
    private String marka;
    private String operativniSustav;
    private int cijena;
    private int godinaProizvodnje;
    private Velicina velicina;

    public Racunalo() {
    this.velicina = new Velicina();
    }

    
    
    
    
    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getOperativniSustav() {
        return operativniSustav;
    }

    public void setOperativniSustav(String operativniSustav) {
        this.operativniSustav = operativniSustav;
    }

    public int getCijena() {
        return cijena;
    }

    public void setCijena(int cijena) {
        this.cijena = cijena;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public Velicina getVelicina() {
        return velicina;
    }

    public void setVelicina(Velicina velicina) {
        this.velicina = velicina;
    }


    }


