/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui2;

import javax.swing.ButtonGroup;

/**
 *
 * @author wiech
 */
public class Kalkulator extends javax.swing.JFrame {

    /**
     * Creates new form Kalkulator
     */
    public Kalkulator() {
        
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldPierwszaLiczba = new javax.swing.JTextField();
        jTextFieldDrugaLiczba = new javax.swing.JTextField();
        jRadioButtonDodaj = new javax.swing.JRadioButton();
        jRadioButtonOdejmij = new javax.swing.JRadioButton();
        jRadioButtonMnoz = new javax.swing.JRadioButton();
        jRadioButtonDziel = new javax.swing.JRadioButton();
        jLabelWynik = new javax.swing.JLabel();
        jButtonOblicz = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Pierwsza liczba:");

        jLabel2.setText("Druga liczba:");

        jRadioButtonDodaj.setText("Dodawanie");
        jRadioButtonDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonDodajActionPerformed(evt);
            }
        });

        jRadioButtonOdejmij.setText("Odejmowanie");
        jRadioButtonOdejmij.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonOdejmijActionPerformed(evt);
            }
        });

        jRadioButtonMnoz.setText("Mnożenie");
        jRadioButtonMnoz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMnozActionPerformed(evt);
            }
        });

        jRadioButtonDziel.setText("Dzielenie");
        jRadioButtonDziel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonDzielActionPerformed(evt);
            }
        });

        jLabelWynik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelWynik.setText("Wynik");

        jButtonOblicz.setText("Oblicz");
        jButtonOblicz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonObliczActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButtonDodaj)
                    .addComponent(jRadioButtonMnoz)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldDrugaLiczba, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jRadioButtonDziel)
                        .addGap(28, 28, 28))
                    .addComponent(jRadioButtonOdejmij, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldPierwszaLiczba, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(60, 60, 60))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jButtonOblicz))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabelWynik, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldPierwszaLiczba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldDrugaLiczba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonDodaj)
                    .addComponent(jRadioButtonOdejmij))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonMnoz)
                    .addComponent(jRadioButtonDziel))
                .addGap(18, 18, 18)
                .addComponent(jButtonOblicz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jLabelWynik)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonMnozActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMnozActionPerformed
      if(jRadioButtonMnoz.isSelected())
      jRadioButtonDodaj.setSelected(false);
      jRadioButtonOdejmij.setSelected(false);
      jRadioButtonDziel.setSelected(false);
      
      
      
      
    }//GEN-LAST:event_jRadioButtonMnozActionPerformed

    private void jRadioButtonDzielActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonDzielActionPerformed
       if(jRadioButtonDziel.isSelected())
      jRadioButtonDodaj.setSelected(false);
      jRadioButtonOdejmij.setSelected(false);
      jRadioButtonMnoz.setSelected(false);
    }//GEN-LAST:event_jRadioButtonDzielActionPerformed

    private void jRadioButtonDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonDodajActionPerformed
if(jRadioButtonDodaj.isSelected())
      jRadioButtonMnoz.setSelected(false);
      jRadioButtonOdejmij.setSelected(false);
      jRadioButtonDziel.setSelected(false);
                      // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonDodajActionPerformed

    private void jRadioButtonOdejmijActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonOdejmijActionPerformed
      if(jRadioButtonOdejmij.isSelected())
      jRadioButtonDodaj.setSelected(false);
      jRadioButtonMnoz.setSelected(false);
      jRadioButtonDziel.setSelected(false); // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonOdejmijActionPerformed
private void GroupButton(){
   
    add(jRadioButtonDodaj);
    add(jRadioButtonOdejmij);
    add(jRadioButtonMnoz);
    add(jRadioButtonDziel);
    
    
    
    
}

    private void jButtonObliczActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonObliczActionPerformed
 double a = Double.parseDouble(jTextFieldPierwszaLiczba.getText());
                double b = Double.parseDouble(jTextFieldDrugaLiczba.getText());
        
        if(jRadioButtonDodaj.isSelected())  {
jLabelWynik.setText((a+b) + ""); 
}
else if(jRadioButtonOdejmij.isSelected())
        {
        jLabelWynik.setText((a-b) + ""); 
        }
else if(jRadioButtonMnoz.isSelected())
        {
        jLabelWynik.setText((a*b) + ""); 
        }
else if(jRadioButtonDziel.isSelected())
        {
            if(b!=0){
        jLabelWynik.setText((a/b) + ""); 
            }
            else {jLabelWynik.setText("Błąd-Nie dzielimy przez zero!!!"); }
        }

     // TODO add your handling code here:
    }//GEN-LAST:event_jButtonObliczActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonOblicz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelWynik;
    private javax.swing.JRadioButton jRadioButtonDodaj;
    private javax.swing.JRadioButton jRadioButtonDziel;
    private javax.swing.JRadioButton jRadioButtonMnoz;
    private javax.swing.JRadioButton jRadioButtonOdejmij;
    private javax.swing.JTextField jTextFieldDrugaLiczba;
    private javax.swing.JTextField jTextFieldPierwszaLiczba;
    // End of variables declaration//GEN-END:variables
}
