package prototype;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SpielDialog2 extends JFrame {

    StartDialog startDialog;
    Spielzustand spielzustand;
    Frage frage;

    public SpielDialog2(StartDialog startDialog) {
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.startDialog = startDialog;
        setSize(1300, 1050);
        setResizable(false);

        spielzustand = new Spielzustand(Fragenkatalog.erzeugeFragen());

        stelleFrage();
    }

    public void stelleFrage() {
        frage = spielzustand.aktuelleFrage();

        List<Antwort> antworten = frage.getAntworten();
        bAntwort1.setText(antworten.get(0).getText());
        bAntwort2.setText(antworten.get(1).getText());
        bAntwort3.setText(antworten.get(2).getText());
        bAntwort4.setText(antworten.get(3).getText());

        lBewertung.setText(frage.fragetext);
        lFrage.setText("");
    }

    public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lFrage = new javax.swing.JLabel();
        bAntwort1 = new javax.swing.JButton();
        bAntwort2 = new javax.swing.JButton();
        bAntwort3 = new javax.swing.JButton();
        bAntwort4 = new javax.swing.JButton();
        bEnde = new javax.swing.JButton();
        lBewertung = new javax.swing.JLabel();
        bWeiter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Frage 1:");

        lFrage.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lFrage.setForeground(new java.awt.Color(255, 0, 0));

        bAntwort1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bAntwort1.setText("jButton1");
        bAntwort1.setToolTipText("");
        bAntwort1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAntwort1ActionPerformed(evt);
            }
        });

        bAntwort2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bAntwort2.setText("jButton1");
        bAntwort2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAntwort2ActionPerformed(evt);
            }
        });

        bAntwort3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bAntwort3.setText("jButton1");
        bAntwort3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAntwort3ActionPerformed(evt);
            }
        });

        bAntwort4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bAntwort4.setText("jButton1");
        bAntwort4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAntwort4ActionPerformed(evt);
            }
        });

        bEnde.setText("Ende");
        bEnde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEndeActionPerformed(evt);
            }
        });

        lBewertung.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lBewertung.setForeground(new java.awt.Color(255, 0, 0));
        lBewertung.setText("Wie gehts?");

        bWeiter.setText("Weiter");
        bWeiter.setEnabled(false);
        bWeiter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bWeiterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bEnde, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lBewertung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(522, Short.MAX_VALUE)
                .addComponent(lFrage, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184)
                .addComponent(bWeiter, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bAntwort4, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                    .addComponent(bAntwort1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bAntwort2, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                    .addComponent(bAntwort3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bEnde, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lBewertung, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAntwort4, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAntwort2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(134, 134, 134)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAntwort3, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAntwort1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bWeiter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lFrage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void antwort(JButton knopf) {
        pruefeAntwort(knopf);

    }
    private void bAntwort1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAntwort1ActionPerformed

        antwort((JButton) evt.getSource());
    }//GEN-LAST:event_bAntwort1ActionPerformed

    private void bAntwort2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAntwort2ActionPerformed
        antwort((JButton) evt.getSource());
    }//GEN-LAST:event_bAntwort2ActionPerformed

    private void bAntwort4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAntwort4ActionPerformed
        antwort((JButton) evt.getSource());
    }//GEN-LAST:event_bAntwort4ActionPerformed

    private void bEndeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEndeActionPerformed
        close();
    }//GEN-LAST:event_bEndeActionPerformed

    private void bWeiterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bWeiterActionPerformed
        spielzustand.erhoeheFrageNr();
        spielzustand.erhoehePunkte();
        jLabel1.setText("Frage " + spielzustand.getFrageNr());
        stelleFrage();
        bWeiter.setEnabled(false);
    }//GEN-LAST:event_bWeiterActionPerformed

    private void bAntwort3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAntwort3ActionPerformed
        antwort((JButton) evt.getSource());
    }//GEN-LAST:event_bAntwort3ActionPerformed

    private void pruefeAntwort(JButton button) {
        String gegebeneAntwort = button.getText();
        String richtigeAntwort = frage.getRichtigeAntwort().getText();

        if (gegebeneAntwort.equals(richtigeAntwort)) {

            lFrage.setText("richtig!");
            bWeiter.setEnabled(true);
           // RückmeldungRichtig r = new RückmeldungRichtig();
            // r.setVisible(true);
        } else {
            lFrage.setText("falsch!");
            bWeiter.setEnabled(true);
           // RückmeldungFalsch pfeife = new RückmeldungFalsch();
            // pfeife.setVisible(true);
        }
        //    this.setVisible(false); 
    }

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
            java.util.logging.Logger.getLogger(SpielDialog2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SpielDialog2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SpielDialog2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SpielDialog2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SpielDialog2(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAntwort1;
    private javax.swing.JButton bAntwort2;
    private javax.swing.JButton bAntwort3;
    private javax.swing.JButton bAntwort4;
    private javax.swing.JButton bEnde;
    private javax.swing.JButton bWeiter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lBewertung;
    private javax.swing.JLabel lFrage;
    // End of variables declaration//GEN-END:variables
}
