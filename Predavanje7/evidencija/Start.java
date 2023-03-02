/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.evidencija;

import ffos.zarucnik.Unos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Korisnik
 */
public class Start {
    
    private List<Evidencija> evidencije;
    
    
    public Start(){
        evidencije = new ArrayList<>();
        do{
            
        }while(!Unos.unosString("x za kraj").equals("x"));
    }
    
    
    private void unosEvidencije(){
        Evidencija e = new Evidencija ();
        e.setNaziv(Unos.unosString("Unesi naziv evidencije"));
        e.setOsoba(Unos.unosString("Unesi ime osobe koja sluša"));
    }
    
    
    private List<Pjesma> unosPjesama(){
        List<Pjesma> pjesme = new ArrayList <>();
        do{
            pjesme.add(unosPjesme());
        }while(!Unos.unosString("x za kraj").equals("x"));
    return pjesme;
    }
    
    
    private Pjesma unosPjesme(){
        Pjesma p = new Pjesma ();
        p.setNaziv(Unos.unosString("Unesi naziv pjesme"));
        p.setIzvodjac(Unos.unosString("unesi izvođača"));
    }
    
    public static void main(String[] args) {
        new Start();
    }
    
}
