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
public class DaneKontaktoweStronka extends Stronka{
   public DaneKontaktoweStronka() throws IOException {
        super(
                "<!DOCTYPE html>" +
                "<html>" +
                    "<head>" +
                        "<meta charset=\"UTF-8\">" +
                    "</head>" +
                    "<body>" +
                        "<h1 align="+"center"+">Imie: Krzysztof</h1>"
                        + "<h1 align="+"center"+">Nazwisko: Wiecheć</h1>"
                        +"<h1 align="+"center"+">Telefon: 123456789</h1>"
                        + "<h1 align="+"center"+">E-mail: wiechec@poczta.pl</h1>"+
                        
                    "</body>" +
                "</html>"
        );
    }

    @Override
    public String toString() {
        return "DANE KONTAKTOWE";
    }

    
}
