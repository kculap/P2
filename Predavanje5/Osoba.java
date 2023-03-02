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
public class Osoba extends Object{
    
    protected int sifra;
    
    private String ime;
    private String prezime;
    private int godinaRodenja;
    private boolean student;

    //insert code -> constructor -> ništa označeno
    public Osoba() {
    }

    //insert code -> constructor -> sve označeno
    
    public Osoba(String ime, String prezime, int godinaRodenja, boolean student) {
        this.ime = ime;
        this.prezime = prezime;
        this.godinaRodenja = godinaRodenja;
        this.student = student;
    }

    
    
    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getGodinaRodenja() {
        return godinaRodenja;
    }

    public void setGodinaRodenja(int godinaRodenja) {
        this.godinaRodenja = godinaRodenja;
    }

    public boolean isStudent() {
        return student;
    }

    public void setStudent(boolean student) {
        this.student = student;
    }
    
    
}
