/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasyno;

/**
 *
 * @author Krzysztof Wiecheć IO 3 rok
 */
public class KasynoBank {
    private static KasynoBank inst;
    public int bank;
    
    public static synchronized KasynoBank inst(){
        if (inst==null){
            
            inst=new KasynoBank();
        }
        return inst;
}
    private KasynoBank() {
        bank = 50000;
    }
    public double getBank() {
        return bank;
        
    }
     public int ksiegowanie(int wartosc,int stawka) {

        return bank = bank + (wartosc*stawka);
}
}
