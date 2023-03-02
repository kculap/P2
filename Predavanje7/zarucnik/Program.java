/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.zarucnik;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Korisnik
 */
public class Program {
    
    List<Zarucnik> zarucnici;
    
    
    public Program(){
        zarucnici = new ArrayList<>();
        do{
            System.out.println("Radim");
        }while(!Unos.unosString("q za prekid").equals("q"));
        
        
        for(Zarucnik z : zarucnici){
            System.out.println(z.isEkstroventno());
        } 
        
    
        int suma=0;
        for(Zarucnik z : zarucnici){
            if(!z.getOstavljen().isAscoijalno()){
                continue;
        }
                suma+=z.isEkstroventno()? 1 : 0;
                suma+=z.isIndiferentno()? 1 : 0;
                suma+=z.isIntrovertno()? 1 : 0;
            }
            System.out.println(suma);
        }
    
    
    
    
    
    public static void main(String[] args) {
        new Program();
    }
    
    
  private void unesiZarucnika(){
      Zarucnik z = new Zarucnik();
      z.setPrstena(Unos.unosInt("Unesi broj prstena"));
      z.setEkstroventno(Unos.unosBoolean("Jesi li ekstrovertan"));
      z.setIndiferentno(Unos.unosBoolean("Jesi li indiferentan"));
      z.setKuna(Unos.unosDouble("Koliko imaš kuna za svatove"));
      
      Ostavljen o = new Ostavljen();
      o.setSifra(Unos.unosInt("Unesi šifru ostavljenog"));
      o.setAscoijalno(Unos.unosBoolean("Da li si asocijalan"));
      o.setStilFrizure(Unos.unosString("Gustoća suza nakon rastanka"));
      o.setHlace(Unos.unosString("Vrsta hlača"));
      o.setMajica(Unos.unosString("Vrsta majice"));
      
      
      z.setOstavljen(o);
  }  
    
}
