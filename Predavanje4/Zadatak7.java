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
public class Zadatak7 {
    public static void main(String[] args) {
        
        //ako je parni osijek, ako je neparni 10 puta jedno pokraj drugog 
        
        int i = 
                Integer.parseInt(
                        JOptionPane.showInputDialog("Unesi broj")
                );
        
        if (i%2==0){
            System.out.println("Osijek");
        }else{
            for(int j=0; j<10; j++){
                System.out.print("Osijek ");
            }
        }
        
        
        
        
    }
}
