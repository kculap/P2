/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos;

import javax.swing.JOptionPane;

/**
 *
 * @author Korisnik
 */
public class Zadatak9 {
    public static void main(String[] args) {
        
        //Sve dok korisnik ne unese broj 5 ispisuje Osijek, Kad unese izađe iz programa
        
        int broj= 22;
        
       
      while(true){
          broj= 
               Integer.parseInt(
               JOptionPane.showInputDialog("Unesi broj")
               );
          if (broj==5){
              break;
          }
          System.out.println("Osijek");
      }
          
       }
        
        
        
    }
    
    
    
}
