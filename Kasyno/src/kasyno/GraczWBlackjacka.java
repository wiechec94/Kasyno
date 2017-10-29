/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasyno;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Krzysztof Wiecheć IO 3 rok
 */
public class GraczWBlackjacka {
    
     
   
    
     public void graczwblackjacka(){
           Scanner klawiatura=new Scanner(System.in);
           System.out.println("Wybiesz o jaką stawke grasz:\n "
                   + "1-Normalna Stawka 50\n"
                   + "2-Podwójna stawka 100\n"
                   + "3-Potrójna stawka!!! 150\n");
           
           int stawka=klawiatura.nextInt();
           System.out.println("Wybrałeś stawke "+stawka+" !!!");
          
        Random losuj=new Random();
        int ik=52;
      List karty52 = new ArrayList(52);
      karty52.add(2);
      karty52.add(3);
      karty52.add(4);
      karty52.add(5);
      karty52.add(6);
      karty52.add(7);
      karty52.add(8);
      karty52.add(9);
      karty52.add(10);
      karty52.add(10);
      karty52.add(10);
      karty52.add(10);
      karty52.add(11);
      karty52.add(2);
      karty52.add(3);
      karty52.add(4);
      karty52.add(5);
      karty52.add(6);
      karty52.add(7);
      karty52.add(8);
      karty52.add(9);
      karty52.add(10);
      karty52.add(10);
      karty52.add(10);
      karty52.add(10);
      karty52.add(11);
      karty52.add(2);
      karty52.add(3);
      karty52.add(4);
      karty52.add(5);
      karty52.add(6);
      karty52.add(7);
      karty52.add(8);
      karty52.add(9);
      karty52.add(10);
      karty52.add(10);
      karty52.add(10);
      karty52.add(10);
      karty52.add(11);
      karty52.add(2);
      karty52.add(3);
      karty52.add(4);
      karty52.add(5);
      karty52.add(6);
      karty52.add(7);
      karty52.add(8);
      karty52.add(9);
      karty52.add(10);
      karty52.add(10);
      karty52.add(10);
      karty52.add(10);
      karty52.add(11);
      System.out.println("ILOŚĆ KART   "+ik);
      System.out.println(""+karty52);
        
        int losowanie1=losuj.nextInt(ik--);
        System.out.println("Wylosowana karta "+losowanie1 );
        int karta1=(int) karty52.get(losowanie1);
        System.out.println("Wylosowana karta to "+karta1);
        karty52.remove(losowanie1);
        
       System.out.println("ILOŚĆ KART   "+ik); 
        System.out.println(""+karty52);
        int losowanie2=losuj.nextInt(ik--);
        System.out.println("Wylosowana karta "+losowanie2 );
        int karta2=(int) karty52.get(losowanie2);
        System.out.println("Wylosowana karta to "+karta2);
        karty52.remove(losowanie2);
        
        int wynikgracz1=karta1+karta2;
               
        System.out.println("Suma kart wynosi="+wynikgracz1);
        System.out.println("Wybiesz 1 jeśli chcesz kolejną karte,0 jeśli pasujesz");
        
        
        int g=klawiatura.nextInt();
        if (g==1){
            System.out.println("Wybrałeś 1 grasz dalej");
        
         int h;
            do{
            
        System.out.println("ILOŚĆ KART   "+ik); 
        System.out.println(""+karty52);
        int losowania=losuj.nextInt(ik--);
        System.out.println("Wylosowana karta  "+losowania );
        int karta=(int) karty52.get(losowania);
        System.out.println("Wylosowana karta to "+karta);
        karty52.remove(losowanie2);
        
            wynikgracz1+=karta;
                System.out.println("Suma kart wynosi="+wynikgracz1);
            
            
            
              System.out.println("Wybiesz 1 jeśli chcesz kolejną karte,0 jeśli pasujesz");
             h =klawiatura.nextInt();
                     if (h==1){
            System.out.println("Wybrałeś 1 grasz dalej");}
        else{
            System.out.println("Wybrałeś 0 nie grasz dalej");
                     }
            }while(h!=0);
        
        
        
        
        }
        else{
            System.out.println("Wybrałeś 0 nie grasz dalej");
        }
        
       System.out.println("Suma gracza wynosi= "+wynikgracz1);
       
       
       
        System.out.println("Gra kupier...");
        int wynikkupiera1=losuj.nextInt(20)+11;
        System.out.println("Suma kupiera wynosi= "+wynikkupiera1);
        
        
        
        if(wynikgracz1>21&&wynikkupiera1>21){
        if(wynikgracz1<wynikkupiera1){
            System.out.println("WYGRANA!!!");
              KasynoBank.inst().ksiegowanie(50,stawka);
              System.out.println("Gracz wygrał "+(50*stawka)+" W banku kasyna pozostało "+KasynoBank.inst().getBank());
          }
        else if(wynikgracz1==wynikkupiera1){
            System.out.println("REMIS!!!");
               KasynoBank.inst().ksiegowanie(0,stawka);
               System.out.println("Remis. W banku kasyna  nadal pozostaje "+KasynoBank.inst().getBank());
          }
        else if(wynikgracz1>wynikkupiera1){
            System.out.println("PRZEGRANA!!!");
              KasynoBank.inst().ksiegowanie(-50,stawka);
               System.out.println("Gracz przegrał "+(50*stawka)+" W banku kasyna od teraz jest "+KasynoBank.inst().getBank());
          }
        
    }
        else if(wynikgracz1<21&&wynikkupiera1<21){
        if(wynikgracz1>wynikkupiera1){
            System.out.println("WYGRANA!!!");
              KasynoBank.inst().ksiegowanie(50,stawka);
             System.out.println("Gracz wygrał "+(50*stawka)+" W banku kasyna pozostało "+KasynoBank.inst().getBank());
          }
        else if(wynikgracz1==wynikkupiera1){
            System.out.println("REMIS!!!");
             KasynoBank.inst().ksiegowanie(0,stawka);
             System.out.println("Remis. W banku kasyna  nadal pozostaje "+KasynoBank.inst().getBank());
          }
        else if(wynikgracz1<wynikkupiera1){
            System.out.println("PRZEGRANA!!!");
               KasynoBank.inst().ksiegowanie(-50,stawka);
               System.out.println("Gracz przegrał "+(50*stawka)+" W banku kasyna od teraz jest "+KasynoBank.inst().getBank());
          }
        
    }
        else if(wynikgracz1<21&&wynikkupiera1>21){
            System.out.println("WYGRANA!!!");
              KasynoBank.inst().ksiegowanie(50,stawka);
              System.out.println("Gracz wygrał "+(50*stawka)+" W banku kasyna pozostało "+KasynoBank.inst().getBank());
    }
        else if(wynikgracz1>21&&wynikkupiera1<21){
         System.out.println("PRZEGRANA!!!");
         KasynoBank.inst().ksiegowanie(-50,stawka);
         System.out.println("Gracz przegrał "+(50*stawka)+" W banku kasyna od teraz jest "+KasynoBank.inst().getBank());
        }
        
        else if(wynikgracz1==21&&wynikkupiera1==21){
            System.out.println("REMIS!!!");
             KasynoBank.inst().ksiegowanie(0,stawka);
             System.out.println("Remis. W banku kasyna  nadal pozostaje "+KasynoBank.inst().getBank());
        }
        
        else if(wynikgracz1==21&&wynikkupiera1!=21){
            System.out.println("WYGRANA!!!");
              KasynoBank.inst().ksiegowanie(150,stawka);
              System.out.println("Gracz wygrał "+(150*stawka)+" W banku kasyna pozostało "+KasynoBank.inst().getBank());
        }
            else if(wynikgracz1!=21&&wynikkupiera1==21){
            System.out.println("PRZEGRANA!!!");
             KasynoBank.inst().ksiegowanie(-150,stawka);
             System.out.println("Gracz przegrał "+(150*stawka)+" W banku kasyna od teraz jest "+KasynoBank.inst().getBank());
            
        }
                
            
  
    }
}
