
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Korisnik
 */
public class Zadatak6 {
    
    //Program od korisnika unosi tri cijela broja
    //Program ispisuje najmanji uneseni broj
    
    public static void main(String[] args) {
        
        int i = Integer.parseInt(
                
        JOptionPane.showInputDialog("Unesi broj")
        );
        
        int j = Integer.parseInt(
                
        JOptionPane.showInputDialog("Unesi broj")
        );
        
        int k = Integer.parseInt(
                
        JOptionPane.showInputDialog("Unesi broj")
        );
        
        
        if (i<j & i<k){
            System.out.println(i);
        } else {
            System.out.println(" ");
        }
        
        if (j<i & j<k){
            System.out.println(j);
        }else {
            System.out.println(" ");
        }
        
        if (k<i & k<j){
            System.out.println(k);
        }else {
            System.out.println(" ");
        }
        
        
        
    }
    
    
    
}
