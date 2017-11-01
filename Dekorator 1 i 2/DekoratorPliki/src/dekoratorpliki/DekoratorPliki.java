/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dekoratorpliki;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Krzysztof Wiecheć IO 3 rok
 */
public class DekoratorPliki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws FileNotFoundException, IOException {
        try{
        int licznikWiersze=0;
       int slowa=0;
      File plik = new File( "abc.txt" ); 
      FileReader czyta = new FileReader( plik );
       BufferedReader bufferedReader = new BufferedReader(czyta);
        
        String czytaniePliku = bufferedReader.readLine();
        
       
        int nacisnieciespacji=2;
       int spacja=1;
        do {
    System.out.println(czytaniePliku);
    
for (int i=0; i<czytaniePliku.length(); i++)
{
if (czytaniePliku.charAt(i) == '\u0020'||czytaniePliku.charAt(i) == '\u0009')
     
slowa++;
    }
            System.out.println("słowa "+slowa);
            if(czytaniePliku != null)
slowa+=1;
    
    licznikWiersze++;
             System.out.println("Liczba wierszy = "+licznikWiersze);
    
    czytaniePliku= bufferedReader.readLine();
    System.out.println(slowa);
    
  } while(czytaniePliku != null);
        
           
        System.out.println("Liczba znaków wynosi "+slowa);
        System.out.println("Liczba wieszy wynosi "+licznikWiersze);
        
        }catch(Exception ex){
            System.out.println("plik nie dziala"); }
        
        
          
        
// TODO code application logic here
    }
    
}
