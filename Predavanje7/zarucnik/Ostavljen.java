/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.zarucnik;

/**
 *
 * @author Korisnik
 */
public class Ostavljen extends Entitet{
    
    private String stilFrizure;
    private boolean ascoijalno;
    private String majica;
    private String hlace;
    private double gustoca;

    public String getStilFrizure() {
        return stilFrizure;
    }

    public void setStilFrizure(String stilFrizure) {
        this.stilFrizure = stilFrizure;
    }

    public boolean isAscoijalno() {
        return ascoijalno;
    }

    public void setAscoijalno(boolean ascoijalno) {
        this.ascoijalno = ascoijalno;
    }

    public String getMajica() {
        return majica;
    }

    public void setMajica(String majica) {
        this.majica = majica;
    }

    public String getHlace() {
        return hlace;
    }

    public void setHlace(String hlace) {
        this.hlace = hlace;
    }

    public double getGustoca() {
        return gustoca;
    }

    public void setGustoca(double gustoca) {
        this.gustoca = gustoca;
    }
}
