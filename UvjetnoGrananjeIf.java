/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Korisnik
 */
public class UvjetnoGrananjeIf {

    public static void main(String[] args) {

        boolean uvjet = true;

        if (uvjet) {
            System.out.println("Hello");
        }

        boolean prolaz = 3 < 2;

        if (prolaz) {
            System.out.println("Osijek");
        }

        //uobičajni if izraz
        int i = 2;
        if (i < 3) {
            System.out.println("IKI");
        }
        
        // | - označava ili
        //druga sintaksa
        if(i>2 && i<10){ //razlika između && - ako prvi uvjet nije zadovoljen, drugi se neće provjeravati, a ako stavimo & - provjeravat će se i jedan i drugi
            System.out.println("OK");
        }else{
            System.out.println("NE");
               
        }

        //puna sintaksa if
        if (==2){
            System.out.println("Dovoljan");
        }else if (i==3) {
            System.out.println("Dobar");
        }else{
            System.out.println("Nije bilo veće ocjene");
        }        
        
        //loša praksa
        if(i==2)
            System.out.println("Dovoljan");
        else
            System.out.println("Ostalo");
            System.out.println("Osijek"); //ovo će se svejedno ispisati ako nema vitičastih zagrada (KORISTITI IH)
        
        //=== - provjeravamo tip podatka u php-u, u javi toga nema
        if(i==2){
            System.out.println("OK");
        } else {
            System.out.println("NE");
        }
        
        // zadnja verzija if naredbe - inline if
        System.out.println(i==2 ? "OK" : "NE"); //nakon upitnika je true, nakon dvotočke false
        
        
        
        
    }

}
