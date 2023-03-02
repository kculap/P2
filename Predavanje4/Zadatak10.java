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
public class Zadatak10 {
    public static void main(String[] args) {
        
        //Korisnik unosi cijele brojeve sve dok se ne unese broj -1
        //Program ispisue sumu svih unesenih brojeva
        
        
        int i;
        int suma = 0;
       
        while(true){
            i=Integer.parseInt(JOptionPane.showInputDialog(suma));
            if(i==-1){
            break;
            }
            suma+=i;
        }System.out.println(suma);
        
        
        
    }
}
