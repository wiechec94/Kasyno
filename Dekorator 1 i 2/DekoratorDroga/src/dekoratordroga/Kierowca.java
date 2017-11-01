/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dekoratordroga;

/**
 *
 * @author Admin
 */
public class Kierowca extends UzytkownikDrogi {
     public Kierowca(String kimJestem, int szybkoscUżytkownika, char znaczek) {
        super(kimJestem, szybkoscUżytkownika, znaczek);
     }
public Kierowca() {
        super("Kierowca", 3, 'K');

    }  
 @Override
    public String getKimJestem() {
        return kimJestem;
    }

   @Override
    public int getSzybkoscUżytkownika() {
        return szybkoscUżytkownika;
    }

   @Override
    public char getZnaczek() {
        return znaczek;
    }

    
}
