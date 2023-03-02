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
public class Zadatak2 {
    public static void main(String[] args) {
        
        //Ispisati 100 puta Hello World sa zarezom, ali zadnji ne treba imati zarez
        
        for (int i=0; i<100; i++){
        System.out.println("Hello World,");
        if (i==99){
            System.out.println("Hello World");
        }
        else {
            System.out.println("Hello World,");
        } }
        
        for (int i = 0; i <100; i++){
        System.out.println("Hello World"+
                i!=99? "," : "")
                );
    }
        
        
    }
}
