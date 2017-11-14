/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabryka;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author wiech
 */
public class Fabryka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Jaką stronę chcesz wygenerować?  \n0. Galerię  \n1. Informację \n2. Dane Kontaktowe \n3. Aktualności");
        
        StronkaJaka stronkaJaka = StronkaJaka.values()[new Scanner(System.in).nextInt()];
        
        try {
            System.out.println("Wygenerowano stronę: " + FabrykaStronka.stworzStrone(stronkaJaka));
        } catch(IOException ex) {
            System.out.println("Błąd przy zapisie strony");
        }
    }
// TODO code application logic here
    
    
}
