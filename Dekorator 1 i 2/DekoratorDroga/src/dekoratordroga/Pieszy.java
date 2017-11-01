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
public class Pieszy extends UzytkownikDrogi {
    public Pieszy(String kimJestem, int szybkoscUżytkownika, char znaczek) {
        super(kimJestem, szybkoscUżytkownika, znaczek);
     }
public Pieszy() {
        super("Pieszy", 1, 'P');

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
