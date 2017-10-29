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
 * @author Krzysztof Wiecheć IO 3 rok
 */
public class GraczWJednorękiegoBandytę {

    
    
    public void graczwjednorękiegobandytę(){
       
    Scanner klawiatura=new Scanner(System.in);
           System.out.println("Wybiesz o jaką stawke grasz:\n "
                   + "1-Normalna Stawka 50\n"
                   + "2-Podwójna stawka 100\n"
                   + "3-Potrójna stawka!!! 150\n");
           
           int stawka=klawiatura.nextInt();
           System.out.println("Wybrałeś stawke "+stawka+" !!!");
      
    Random losowanie=new Random();
     int rzad1=losowanie.nextInt(6)+1;
     int rzad2=losowanie.nextInt(6)+1;
     int rzad3=losowanie.nextInt(6)+1;
    
        System.out.println(rzad1+"||"+rzad2+"||"+rzad3);
        
        if(rzad1==rzad2&&rzad1==rzad3){
            if(rzad1==1&&rzad2==1&&rzad3==1)
            {System.out.println("WYGRANA 6 STOPNIA!!!");
            KasynoBank.inst().ksiegowanie(50,stawka);
            System.out.println("Gracz wygrał "+(50*stawka)+" W banku kasyna pozostało "+KasynoBank.inst().getBank());
           }
            else if(rzad1==2&&rzad2==2&&rzad3==2)
                {System.out.println("WYGRANA 5 STOPNIA!!!");
                 KasynoBank.inst().ksiegowanie(100,stawka);
                 System.out.println("Gracz wygrał "+(100*stawka)+" W banku kasyna pozostało "+KasynoBank.inst().getBank());
                 }
             else if(rzad1==3&&rzad2==3&&rzad3==3)
                {System.out.println("WYGRANA 4 STOPNIA!!!");
                 KasynoBank.inst().ksiegowanie(150,stawka);
                 System.out.println("Gracz wygrał "+(150*stawka)+" W banku kasyna pozostało "+KasynoBank.inst().getBank());
                }
             else if(rzad1==4&&rzad2==4&&rzad3==4)
                {System.out.println("WYGRANA 3 STOPNIA!!!");
                 KasynoBank.inst().ksiegowanie(200,stawka);
                 System.out.println("Gracz wygrał "+(200*stawka)+" W banku kasyna pozostało "+KasynoBank.inst().getBank());
                }
             else if(rzad1==5&&rzad2==5&&rzad3==5)
                {System.out.println("WYGRANA 2 STOPNIA!!!");
                 KasynoBank.inst().ksiegowanie(250,stawka);
                 System.out.println("Gracz wygrał "+(250*stawka)+" W banku kasyna pozostało "+KasynoBank.inst().getBank());
                 }
             else if(rzad1==6&&rzad2==6&&rzad3==6)
                {System.out.println("GŁÓWNA WYGRANA!!");
                 KasynoBank.inst().ksiegowanie(300,stawka);
                 System.out.println("Gracz wygrał "+(300*stawka)+" W banku kasyna pozostało "+KasynoBank.inst().getBank());
               }
            
            
            
            
            
       }
        else
        {System.out.println("PRZEGRANA!!!");
         KasynoBank.inst().ksiegowanie(-50,stawka);
        System.out.println("Gracz przegrał "+(50*stawka)+" W banku kasyna od teraz jest "+KasynoBank.inst().getBank());}
  
   
        
    }
}
