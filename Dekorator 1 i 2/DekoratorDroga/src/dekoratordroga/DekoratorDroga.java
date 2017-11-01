/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dekoratordroga;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class DekoratorDroga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       List uzytkownik = new ArrayList();

            uzytkownik.add(new Pieszy());
            uzytkownik.add(new Pieszy());
            uzytkownik.add(new Kierowca());
            uzytkownik.add(new Kierowca());
            uzytkownik.add(new Rowerzysta());
            uzytkownik.add(new Rowerzysta());
            
        
        
        
 // TODO code application logic here
    }
    
}
