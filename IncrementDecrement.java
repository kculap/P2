/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Korisnik
 */
public class IncrementDecrement {
    
    public static void main(String[] args) {
        
        int i =1; //1
        i = i+1; //2
        i+=1; //3
        i++; //4 - koristi varijablu, pa ju onda uvećava
        ++i; //5 - uvećava varijablu, pa ju onda koristi
        
        int j=0;
        System.out.println("j++"); //0
        System.out.println("++j"); //2
        
        //isti princip na decrement --
        
     
        int t=1, k=0;
        t = k++; // t = 0, k=1
        k = t - k; //t =0, k=-1
        System.out.println("k+t"); //-1
        
        
        
    }
    
    
    
    
}
