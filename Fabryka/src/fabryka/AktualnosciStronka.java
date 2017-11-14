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
public class AktualnosciStronka extends Stronka{
     public AktualnosciStronka() throws IOException {
        super(
                "<!DOCTYPE html>" +
                "<html>" +
                    "<head>" +
                        "<meta charset=\"UTF-8\">" +
                    "</head>" +
                    "<body>" +
                        
                        "<h1 align="+"center"+"><img src=\"http://i.iplsc.com/3-czerwca-1997-roku-stade-de-gerland-w-lyonie-roberto-carlos/0001EFG7AWPVBUFJ-C122-F4.jpg\" alt=\"Roberto Carlos\"></h1>"
                        + "<br><br><br><br><br><br>"+
                         "<h1 align="+"center"+">Roberto Carlos-Życiorys</h1>"
                        +"Roberto Carlos karierę rozpoczął w podrzędnej drużynie União São João. Na początku 1993 roku przeniósł się do Sociedade Esportiva Palmeiras i z tym klubem zdobył mistrzostwo Brazylii w 1993 i 1994.<br> "
                        + " Na początku sezonu 1994/1995 przeniósł się do włoskiego Interu Mediolan. Jednak tego sezonu nie mógł zaliczyć do udanych. <br>"
                        + "Drużyna uznawana za faworyta do Mistrzostwa Włoch nawet nie zdołała toczyć wyrównanej walki o to trofeum.<br> "
                        + " Latem 1996 roku po obrońcę zgłosił się Real Madryt i Brazylijczyk przeszedł do Madrytu za 6 milionów euro.<br> "
                        + "Już wtedy był uważany za jednego z najlepszych lewych obrońców świata. <br>"
                        + "Skutecznie grający wślizgiem, odznaczający się szybkością, zwinnością, potrafiący skonstruować bardzo szybką kontrę i co najważniejsze bardzo mocno uderzyć z dystansu lewą nogą.<br> "
                        + "Rekordowa prędkość jaką nadał piłce wyniosła aż 179 km/h.<br><br>"
                        + "Swoją najsłynniejszą bramkę zdobył w meczu z Francją podczas turnieju towarzyskiego Tournoi de France w 1997 roku.<br>"
                        + " Kopnięta zewnętrzną częścią lewej stopy piłka minęła mur Francuzów (o metr) z prawej strony, a gdy wydawało się, że poleci w trybuny, skręciła nagle i ocierając się o słupek, wpadła do siatki.<br><br>"
                        + "Roberto Carlos jako zawodnik Realu Madryt święcił największe triumfy w karierze.<br> "
                        + "Pięć razy zostawał Mistrzem Hiszpanii, 3 razy zdobywał puchar Ligi Mistrzów.<br>"
                        + " W madryckim klubie przez jedenaście sezonów rozegrał 584 mecze i strzelił w nich 71 goli.<br><br>"
                        + "<h1 align="+"center"+">Roberto Carlos-Sukcesy</h1>"
                        + "Palmeiras:<br>"
                        + "Mistrzostwo Brazylii: 1993, 1994<br>" +
"Puchar Brazylii: 1993, 1994<br><br>" 
                        + "Real Madryt:<br>" 
                        + "Mistrzostwo Hiszpanii: 1997, 2001, 2003, 2007<br>" 
                        + "Superpuchar Hiszpanii: 1997, 2001, 2003<br>" 
                        + "Liga Mistrzów: 1998, 2000, 2002<br>" 
                        + "Superpuchar Europy: 2002<br>" 
                        + "Puchar Interkontynentalny: 1998, 2002<br><br>" 
                        + "Reprezentacja:<br>" 
                        + "Mistrzostwo Świata 2002<br>" 
                        + "2. miejsce na Mistrzostwach Świata 1998<br>" 
                        + "ćwierćfinał Mistrzostw Świata 2006<br>" 
                        + "Copa América: 1997, 1999<br>" 
                        + "3. miejsce na Letnich Igrzyskach Olimpijskich 1996<br>" 
                        + "Puchar Konfederacji : 1997 rok złoto<br><br>"
                        +
                        "</body>" +
                "</html>"
        );
    }

    @Override
    public String toString() {
        return "AKTUALNOSCI";
    }
}
