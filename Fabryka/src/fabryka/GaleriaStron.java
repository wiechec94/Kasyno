/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabryka;

import java.io.IOException;
import java.util.Random;

/**
 *
 * @author wiech
 */
public class GaleriaStron extends Stronka  {
    int g =1;
     public GaleriaStron() throws IOException {
         
         
        super(
                
                "<!DOCTYPE html>" +
                "<html>" +
                    "<head>" +
                        "<meta charset=\"UTF-8\">" +
                    "</head>" +
                    "<body>" +
                      "<img src=\"https://t-eska.cdn.smcloud.net/common/H/q/s/Hq23825881Ond.jpg/ru-0-r-650,0-n-Hq23825881Ond_tornado_w_polsce_specjalisci_ostrzegaja_przed_niebezpiecznymi_zj.jpg\" alt=\"Tornado\">" +
                    "</body>" +
                "</html>"
                
        );
        
         
         
    }

    @Override
    public String toString() {
        return "GALERIA";
    }
}
