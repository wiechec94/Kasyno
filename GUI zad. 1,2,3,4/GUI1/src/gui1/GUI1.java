/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author wiech
 */
public class GUI1 extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        JFrame jFrame = new JFrame();
 String imie = JOptionPane.showInputDialog(jFrame, "Podaj imię: ");

        JOptionPane.showMessageDialog(jFrame, "Witaj " + imie);
        System.exit(0);
// TODO code application logic here
    }
    
}
