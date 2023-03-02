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
public class Start {
    public static void main(String[] args) {
        
        Osoba osoba = new Osoba ();
        osoba.setIme("Katarina");
        osoba.setPrezime("Ćulap");
        osoba.setGodinaRodenja(2000);
        osoba.setStudent(true); //na boolean ide is a ne get
        
        System.out.println(osoba.getPrezime());
        System.out.println(osoba.isStudent());
        
        //prazan constructor
        //POJO - 
        osoba = new Osoba();
        
        osoba.setIme("Marija");
        osoba.setPrezime("Zimska");
        osoba.setGodinaRodenja(2009);
        osoba.setStudent(true);
        
        //puni costructor
        osoba = new Osoba("Ana","Gal",2006,true); //prvo definirati constructor
        
        Racunalo racunalo = new Racunalo();
        racunalo.setMarka( "Dell");
        racunalo.setCijena(4000);
        racunalo.setOperativniSustav("Windows");
        racunalo.getVelicina() .setDuzina(40);
        racunalo.getVelicina() .setSirina(30);
        
        
        Mjesto mjesto = new Mjesto ();
        mjesto.setNaziv("Sibinj");
        mjesto.getOpcina() .setNaziv("Sibinj");
        mjesto.getOpcina() .setNacelnik("Josip Pavić");
        
        //java object doc - u googlu
        Zaposlenik zaposlenik = new Zaposlenik ();
        
        
        Macka macka = new Macka ();
        
       // Zivotinja z = new Zivotinja();
        
    }
}
