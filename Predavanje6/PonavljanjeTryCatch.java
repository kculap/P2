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
public class PonavljanjeTryCatch {
    public static void main(String[] args) {
        
        int i=0;
        for(;;){
        
        try {
            i = 
                Integer.parseInt(
                JOptionPane.showInputDialog("Unesi broj")
                );
            break;
        } catch (Exception e) {
            System.out.println("Niste unijeli broj");
        }
        }
        
        
        System.out.println(i);
        
        
        
        
        
    }
           
}
