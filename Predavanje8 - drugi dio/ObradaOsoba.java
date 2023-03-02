/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Osoba;

/**
 *
 * @author Korisnik
 */
public class ObradaOsoba {
    
    public Osoba kreirajOsobu(String sifra, String ime, String prezime){ //String zato što od korisnika uzima znak
        Osoba o = new Osoba();
        
        
    
        try {
            o.setSifra(Integer.parseInt(sifra));
        } catch (Exception e) {
                return null;
        }
        if(o.getSifra()<=0){
        return null;
        }
        
        if(ime.isEmpty()){
        return null;
        }
        
        o.setIme(ime);
        
        if(prezime.isEmpty()){
        return null;
        }
        o.setPrezime(prezime);
        
        return o;
    }
    
}
