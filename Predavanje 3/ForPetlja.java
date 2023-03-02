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
public class ForPetlja {
    public static void main(String[] args) {
        
        // sintaksa phpa - 
        // for($i=0;$i<10;&i++{
        // echo 'Osijek';
        // }
        
        //ZADATAK - ispisati 10 puta Osijek, for petljom
        
        for(int i=0;i<10;i++){
            System.out.println("Osijek");
        }
        
        
        for (int i=0;i<10;i++){
            System.out.println(i+1); //da nema 1 ispisivao bi od 0, a to nije dobro
        }
        
        //zbroj prvih 100 brojeva 
        
        int suma=0;
        for(int i=1;i<=100;i++){
            //suma=suma+i;
            suma+=i;
        }
        System.out.println(suma);
        
        
    }
}
