/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random wybieranie=new Random();
        int[][]karta=new int[4][13];
       int licznik=0;
        for(int i=0;i<karta.length;i++)
            
            for (int j=0; j<9; j++)
                karta[i][j]=j+2;
        
        for(int i=0;i<karta.length;i++)
            
            for (int j=9; j<12; j++)
                karta[i][j]=10;
         for(int i=0;i<karta.length;i++)
            
            for (int j=12; j<13; j++)
                karta[i][j]=11;
         
         
        
        
        
                
            for(int i=0;i<karta.length;i++)
            for (int j=0; j<karta[i].length; j++)
System.out.printf("karta[%d][%d]=%d \n", i, j, karta[i][j]);    
    
    
    srand(time(0))
int wylosowana = tab[rand() % n];}
    
}
