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
public class WhilePetlja {
    public static void main(String[] args) {
        
        //For koristimo kad znamo otkud i do kud
       // while dok se ne ispuni neki uvjet (boolean) ako je true ostajem u petlji, ako ne izlazim
       // do while - osigurava barem jedno izvođenje
       // razlika je oćemo ući ili nećemo, u while i for ne moraš ući, ali u do while moraš ***KOLOKVIJ
       
       boolean uvjet = true;
       int i=1;
       while (uvjet){
       
       while(uvjet){
           System.out.println(i);
           uvjet= ++i<10;
       }
       }
        
        i=0;
        while(i<10){
            System.out.println(i++);
        }
        
        //continue i break jednako kao u for, continue preskoci i ide ispocetka, a break prekida petlju
        
        //beskonacna petlja
        
        while(true){
        break; 
        }
        
        
        
        
        
        
        
    }
}
