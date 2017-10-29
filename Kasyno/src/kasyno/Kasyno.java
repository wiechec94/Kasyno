/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasyno;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * 
 */
public class Kasyno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    
    
       
        Scanner klawiatura=new Scanner(System.in);
        int m;
        do{
  m=klawiatura.nextInt();
       System.out.println("Wybierz ponownie czy chcesz zagrać w grę w jednorękiegobantytę (1), lub w blackjacka(2) czy  zakończ grę(3)");
        if(m==1) { 
            
                System.out.println("Wybrałeś grę w jednorękiegobandytę");
    GraczWJednorękiegoBandytę gra1= new GraczWJednorękiegoBandytę();

        gra1.graczwjednorękiegobandytę();
        System.out.println("");
         
        }
        
            else if (m==2)  {    
       
            System.out.println("Wybrałeś grę w blackjacka");
        GraczWBlackjacka gra2=new GraczWBlackjacka();
        gra2.graczwblackjacka();
        }
                    else if (m==3){
        
    System.out.println("Koniec gry");
                    }
         System.out.println("Wybierz ponownie czy chcesz zagrać w grę w jednorękiegobantytę (1), lub w blackjacka(2) czy  zakończ grę(3)");
                    }while(m!=3);
        
        
        System.out.println("Do zobczenia ;)");               
                    
        // TODO code application logic here
    }
    
}

