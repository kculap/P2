/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos;

import java.util.Arrays;

/**
 *
 * @author Korisnik
 */
public class JednodimenzionalniNiz {
    
    public static void main(String[] args) {
        
     int[] niz;
     
     niz= new int[3]; //pozvati klj. riječ niz koja ima 3 elementa: prvi je na 0, drugi na 1...
     //ako ne znamo koliko je dug - length
     
     niz[0]=1;
     niz[1]=-1;
     niz[niz.length-1]=4;
        
        System.out.println(niz); //niz je isto varijabla
        
        System.out.println(Arrays.toString(niz));
        
        
        
    }
    
}
