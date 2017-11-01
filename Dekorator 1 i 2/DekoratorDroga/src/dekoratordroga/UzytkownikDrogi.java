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
abstract public class UzytkownikDrogi {
    protected String kimJestem;
    protected int szybkoscUżytkownika;
    protected char znaczek;
    
    
        public UzytkownikDrogi(String kimJestem, int szybkoscUżytkownika, char znaczek) {
        this.kimJestem = kimJestem;
        this.szybkoscUżytkownika = szybkoscUżytkownika;
        this.znaczek = znaczek;
        }
        
        
    abstract String getKimJestem();

   
    abstract int getSzybkoscUżytkownika();

    abstract char getZnaczek();

   
}
