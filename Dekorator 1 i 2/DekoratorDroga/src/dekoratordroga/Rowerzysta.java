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
public class Rowerzysta extends UzytkownikDrogi{
    
     public Rowerzysta(String kimJestem, int szybkoscUżytkownika, char znaczek) {
        super(kimJestem, szybkoscUżytkownika, znaczek);
     }
public Rowerzysta() {
        super("Rowerzysta", 2, 'R');

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
