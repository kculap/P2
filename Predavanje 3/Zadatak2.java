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

        //ZADATAK - Program ispisuje sve parne brojeve od 78 do 23
        for (int i = 78; i > 23; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }

        //doma vjezbati: prim broj
        for (int i = 0; i < 10; i++) {

            if (i == 2) {
                continue;
            }
            if (i == 5) {
                break;
            }
            System.out.println(i);

        }

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println("");
        }
        
        //DZ formatirati ispis brojeva, na način jedinice ispod jedinica, desetice ispod desetica i stotica ispod stotica
        //brojevi se poravnavaju desno
        
        
        //Beskonačna petlja
        
        for(;;){
            System.out.println(Math.random());
            
            
            
        }
        
        
        
        
        
        

    }
}
