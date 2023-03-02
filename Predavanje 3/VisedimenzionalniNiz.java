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
public class VisedimenzionalniNiz {

    public static void main(String[] args) {

        int matrica[][] = new int[3][3]; //mogu pohraniti 9 vrijednosti s ovom jednom varijablom!  

        matrica[0] [0] =0;
        matrica[0] [1] =0;
        matrica[0] [2] =0;
        
        matrica[1] [0] =0;
        matrica[1] [1] =0;
        matrica[1] [2] =0; 
                
        matrica[2] [0] =0;
        matrica[2] [1] =0;
        matrica[2] [2] =0;
        
        System.out.println(Arrays.toString(matrica[0]));
        System.out.println(Arrays.toString(matrica[1]));
        System.out.println(Arrays.toString(matrica[2]));
        
        int[][][] kocka = new int[10][10][10];

    }

}
