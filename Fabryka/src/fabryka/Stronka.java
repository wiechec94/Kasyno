/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabryka;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author wiech
 */
public abstract class Stronka {
     public Stronka(String kodZrodlowy) throws IOException {
        try(BufferedWriter mojPlik = Files.newBufferedWriter(Paths.get(toString() + ".html"))) {
            mojPlik.write(kodZrodlowy);
}
     }
}