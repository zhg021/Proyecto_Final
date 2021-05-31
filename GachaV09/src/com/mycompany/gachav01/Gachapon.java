//v09
package com.mycompany.gachav01;
import java.util.Random;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Gachapon extends javax.swing.JFrame {

    static int SuperScretRare=0;
    static int SuperRare=0;
    static int Rare=0;
    static int Common=0;
    static int tiradas=0;
    static double gastos=0;
    static String Capsulas[]= new String[10];
    public Clip clip;
    public static String ruta = "/main/java/sonidos/";
    
    public Gachapon() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        Ratios = new javax.swing.JLabel();
        RatioSSR = new javax.swing.JLabel();
        RatioSR = new javax.swing.JLabel();
        RatioR = new javax.swing.JLabel();
        RatioC = new javax.swing.JLabel();
        Singular = new javax.swing.JButton();
        Multiples = new javax.swing.JButton();
        Reiniciar = new javax.swing.JButton();
        TotalPulls = new javax.swing.JLabel();
        TotalGasto = new javax.swing.JLabel();
        contssr = new javax.swing.JLabel();
        contsr = new javax.swing.JLabel();
        contr = new javax.swing.JLabel();
        contc = new javax.swing.JLabel();
        pulls = new javax.swing.JLabel();
        costo = new javax.swing.JLabel();
        Resultados = new javax.swing.JLabel();
        c2 = new javax.swing.JLabel();
        c1 = new javax.swing.JLabel();
        c3 = new javax.swing.JLabel();
        c4 = new javax.swing.JLabel();
        c5 = new javax.swing.JLabel();
        c6 = new javax.swing.JLabel();
        c7 = new javax.swing.JLabel();
        c8 = new javax.swing.JLabel();
        c9 = new javax.swing.JLabel();
        c10 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Ratios.setText("Rates");

        RatioSSR.setText("5%    SSR:");

        RatioSR.setText("15%    SR:");

        RatioR.setText("25%      R:");

        RatioC.setText("55%      C:");

        Singular.setText("Single x1");
        Singular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SingularActionPerformed(evt);
            }
        });

        Multiples.setText("Multi x10");
        Multiples.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplesActionPerformed(evt);
            }
        });

        Reiniciar.setText("Reset");
        Reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReiniciarActionPerformed(evt);
            }
        });

        TotalPulls.setText("Total pulls:");

        TotalGasto.setText("Total cost:");

        contssr.setText("0");

        contsr.setText("0");

        contr.setText("0");

        contc.setText("0");

        pulls.setText("0");

        costo.setText("0");

        Resultados.setText("Resultados");

        c2.setBackground(new java.awt.Color(102, 102, 255));
        c2.setText("Unknown");

        c1.setText("Unknown");

        c3.setText("Unknown");

        c4.setText("Unknown");

        c5.setText("Unknown");

        c6.setText("Unknown");

        c7.setText("Unknown");

        c8.setText("Unknown");

        c9.setText("Unknown");

        c10.setText("Unknown");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(RatioSR)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(contsr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(RatioSSR)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(contssr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(Reiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(RatioR)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(contr, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(RatioC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(contc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TotalPulls)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pulls, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TotalGasto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(costo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Singular, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c2, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(c3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(c4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(c5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(c1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(c7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(c8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                            .addComponent(c9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(c10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(c6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(Multiples, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Ratios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Resultados, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ratios)
                    .addComponent(Resultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RatioSSR)
                    .addComponent(contssr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RatioSR)
                    .addComponent(contsr)
                    .addComponent(c1)
                    .addComponent(c6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RatioR)
                    .addComponent(contr)
                    .addComponent(c2)
                    .addComponent(c7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RatioC)
                    .addComponent(contc)
                    .addComponent(c3)
                    .addComponent(c8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TotalPulls)
                    .addComponent(pulls)
                    .addComponent(c4)
                    .addComponent(c9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(costo)
                        .addComponent(c5)
                        .addComponent(c10))
                    .addComponent(TotalGasto))
                .addGap(107, 107, 107)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Singular, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Multiples, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SingularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SingularActionPerformed
        int capsula;
        sonido("InsertSingleCoin");
        Random gen = new Random();
        capsula = (int)(gen.nextInt(101));
        if(capsula <= 5){
            Capsulas[0]="SuperSecretRare";
            SuperScretRare++;
            tiradas++;
            gastos = gastos + 2.5;
            
        }
        else if(capsula >5 && capsula <= 15){
            Capsulas[0]="SuperRare";
            SuperRare++;
            tiradas++;
            gastos = gastos + 2.5;
        }
        else if(capsula >15 && capsula <= 25){
            Capsulas[0]="Rare";
            Rare++;
            tiradas++;
            gastos = gastos + 2.5;
        }
        else{
            Capsulas[0]="Common";
            Common++;
            tiradas++;
            gastos = gastos + 2.5;
        }
        String trans = Integer.toString(SuperScretRare);
        contssr.setText(trans);
        trans = Integer.toString(SuperRare);
        contsr.setText(trans);
        trans = Integer.toString(Rare);
        contr.setText(trans);
        trans = Integer.toString(Common);
        contc.setText(trans);
        trans = Integer.toString(tiradas);
        pulls.setText(trans);
        trans = String.valueOf(gastos);
        costo.setText(trans);
        c1.setText(Capsulas[0]);
        c2.setText("Unknown");
        c3.setText("Unknown");
        c4.setText("Unknown");
        c5.setText("Unknown");
        c6.setText("Unknown");
        c7.setText("Unknown");
        c8.setText("Unknown");
        c9.setText("Unknown");
        c10.setText("Unknown");
    }//GEN-LAST:event_SingularActionPerformed

    private void MultiplesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiplesActionPerformed
        // TODO add your handling code here:
        int capsula;
        sonido("InsertMultiCoin");
        Random gen = new Random();
        
        for(int i=0 ; i<10 ; i++){
            capsula = (int)(gen.nextInt(101));
            if(capsula <= 5){
                SuperScretRare++;
                Capsulas[i]="SuperSecretRare";
                
                
            }
            else if(capsula >5 && capsula <= 15){
                SuperRare++;
                Capsulas[i]="SuperRare";
            }
            else if(capsula >15 && capsula <= 25){
                Rare++;
                Capsulas[i]="Rare";
            }
            else{
                Common++;
                Capsulas[i]="Common";
            }
        }
        tiradas = tiradas + 10;
        gastos = gastos + 25;
        String trans = Integer.toString(SuperScretRare);
        contssr.setText(trans);
        trans = Integer.toString(SuperRare);
        contsr.setText(trans);
        trans = Integer.toString(Rare);
        contr.setText(trans);
        trans = Integer.toString(Common);
        contc.setText(trans);
        trans = Integer.toString(tiradas);
        pulls.setText(trans);
        trans = String.valueOf(gastos);
        costo.setText(trans);
        c1.setText(Capsulas[0]);
        c2.setText(Capsulas[1]);
        c3.setText(Capsulas[2]);
        c4.setText(Capsulas[3]);
        c5.setText(Capsulas[4]);
        c6.setText(Capsulas[5]);
        c7.setText(Capsulas[6]);
        c8.setText(Capsulas[7]);
        c9.setText(Capsulas[8]);
        c10.setText(Capsulas[9]);
    }//GEN-LAST:event_MultiplesActionPerformed

    private void ReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReiniciarActionPerformed
        // TODO add your handling code here:
        sonido("ResetConts");
        SuperScretRare=0;
        SuperRare=0;
        Rare=0;
        Common=0;
        tiradas=0;
        gastos=0;
        String trans = Integer.toString(SuperScretRare);
        contssr.setText(trans);
        trans = Integer.toString(SuperRare);
        contsr.setText(trans);
        trans = Integer.toString(Rare);
        contr.setText(trans);
        trans = Integer.toString(Common);
        contc.setText(trans);
        trans = Integer.toString(tiradas);
        pulls.setText(trans);
        trans = String.valueOf(gastos);
        costo.setText(trans);
        c1.setText("Unknown");
        c2.setText("Unknown");
        c3.setText("Unknown");
        c4.setText("Unknown");
        c5.setText("Unknown");
        c6.setText("Unknown");
        c7.setText("Unknown");
        c8.setText("Unknown");
        c9.setText("Unknown");
        c10.setText("Unknown");
    }//GEN-LAST:event_ReiniciarActionPerformed

    public void sonido(String archivo) {
        try {
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream(ruta + archivo + ".wav")));
            clip.start();
        } catch (Exception e) {
        }
    }
    
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
            java.util.logging.Logger.getLogger(Gachapon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gachapon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gachapon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gachapon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gachapon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Multiples;
    private javax.swing.JLabel RatioC;
    private javax.swing.JLabel RatioR;
    private javax.swing.JLabel RatioSR;
    private javax.swing.JLabel RatioSSR;
    private javax.swing.JLabel Ratios;
    private javax.swing.JButton Reiniciar;
    private javax.swing.JLabel Resultados;
    private javax.swing.JButton Singular;
    private javax.swing.JLabel TotalGasto;
    private javax.swing.JLabel TotalPulls;
    private javax.swing.JLabel c1;
    private javax.swing.JLabel c10;
    private javax.swing.JLabel c2;
    private javax.swing.JLabel c3;
    private javax.swing.JLabel c4;
    private javax.swing.JLabel c5;
    private javax.swing.JLabel c6;
    private javax.swing.JLabel c7;
    private javax.swing.JLabel c8;
    private javax.swing.JLabel c9;
    private javax.swing.JLabel contc;
    private javax.swing.JLabel contr;
    private javax.swing.JLabel contsr;
    private javax.swing.JLabel contssr;
    private javax.swing.JLabel costo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JLabel pulls;
    // End of variables declaration//GEN-END:variables
}

