/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Korisnik
 */
public class VisestrukoGrananjeSwitch {
    
    public static void main(String[] args) {
        
        int ocjena = 5;
        switch (ocjena){
            case 1:
                System.out.println("Nedovoljan");
                break;
            case 2:
                System.out.println("Dovoljan");
                break;
            case 3:
                System.out.println("Dobar");
                break;
            case 4:     
                System.out.println("Vrlo dobar");
                break;
            case 5:    
                System.out.println("Izvrstan");
                break;
            default:
                System.out.println("Nije ocjena");
        }
        
        
        switch(ocjena){
            case 1:
                System.out.println("Pao sam");
                break;
            case 2:
            case 3:
            case 4:
            case 5: 
                System.out.println("Prošao sam");
                break;
            default:
                System.out.println("Nije ocjena");
        }
        
        
        
        
        
        
    }
    
    
    
}
