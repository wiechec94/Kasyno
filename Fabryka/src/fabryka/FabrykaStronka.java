/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabryka;

import java.io.IOException;

/**
 *
 * @author wiech
 */
public class FabrykaStronka {
    public static Stronka stworzStrone(StronkaJaka stronkaJaka) throws IOException {
        switch(stronkaJaka) {
            case GALERIA: return new GaleriaStron();
            case INFORMACJE: return new InformacjaStronka();
            case DANEKONTAKTOWE: return new DaneKontaktoweStronka();
            case AKTUALNOSCI: return new AktualnosciStronka();
            default: return null;
        }
    }
}
