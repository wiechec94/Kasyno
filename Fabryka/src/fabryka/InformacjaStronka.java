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
public class InformacjaStronka extends Stronka{
    public InformacjaStronka() throws IOException {
        super(
                "<!DOCTYPE html>" +
                "<html>" +
                    "<head>" +
                        "<meta charset=\"UTF-8\">" +
                    "</head>" +
                    "<body>" +
                        "-Christiano Ronaldo ma córkę<br><br>" +
                        "-Lewandowski ma sie lepiej. Już trenuje<br><br>" +
                        "-Ronaldo chce odejść z realu.<br><br>"
                        + "-Włochy nie jadą na mundial.<br>" +
                    "</body>" +
                "</html>"
        );
    }

    @Override
    public String toString() {
        return "INFORMACJA";
    }
}

