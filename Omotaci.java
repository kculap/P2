
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
public class Omotaci {
    
    public static void main(String[] args) {
        
        int i = Integer.parseInt("7") ;
        
        System.out.println(i);
        
        int j = 
                Integer.parseInt(
                JOptionPane.showInputDialog("Unesi broj")  //moramo koristiti ctrl + space da se napiše i gore
                );
        System.out.println(j);
    }
}


//DZ: upoznati se s ostalim omotačima primitivnih podataka