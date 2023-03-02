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
public class Zadatak8 {
    //za uneseni tekst ocjene ispišite njezin ekvivalent u broj
    
    public static void main(String[] args) {
        
        String ocjena = JOptionPane.showInputDialog("Unesi ocjenu");
        
        switch (ocjena) {
            case "Nedovoljan": 
                System.out.println(1);
                break;
                
            case "Dovoljan":
                System.out.println(2);
                break;
                
            
            case "Dobar":
                System.out.println(3);
                break;
                
            case "Vrlo dobar":
                System.out.println(4);
                break;
                        
             case "Odličan":
                System.out.println(5);
                break;
                
             default:
                 System.out.println("Nije ocjena");
                 break;
        }
        
        
    }
}
