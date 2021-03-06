/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.individual;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Aluno
 */
public class Tela extends javax.swing.JFrame {
    
    DadosTela cpu = new DadosTela();
    DadosTela disco = new DadosTela();
    DadosTela memoria = new DadosTela();
    
    void constante(){
        
        pgrBarra1.setValue(cpu.random.intValue());
        pgrBarra1.setString(String.format("%.2f", cpu.random)+"%");
        lbMedia1.setText(String.valueOf(String.format("%.2f", cpu.media)+"%"));
        lbMin1.setText(String.valueOf(String.format("%.2f", cpu.min)+"%"));
        lbMax1.setText(String.valueOf(String.format("%.2f", cpu.max)+"%"));
        
        pgrBarra2.setValue(disco.random.intValue());
        pgrBarra2.setString(String.format("%.2f", disco.random / 5)+"%");
        lbMedia2.setText(String.valueOf(String.format("%.2f", disco.media)+" GB"));
        lbMin2.setText(String.valueOf(String.format("%.2f", disco.min)+" GB"));
        lbMax2.setText(String.valueOf(String.format("%.2f", disco.max)+" GB"));
        
        pgrBarra3.setValue(memoria.random.intValue());
        pgrBarra3.setString(String.format("%.2f", memoria.random / 8)+"%");
        lbMedia3.setText(String.valueOf(String.format("%.2f", memoria.media / 100)+" GB"));
        lbMin3.setText(String.valueOf(String.format("%.2f", memoria.min / 100)+" GB"));
        lbMax3.setText(String.valueOf(String.format("%.2f", memoria.max / 100)+" GB"));
    }
    
    void Aleatorio1(DadosTela cdm){
        cdm.random = ThreadLocalRandom.current().nextDouble(0, 100);
        tudo(cpu);        
    }
    void Aleatorio2(DadosTela cdm){
        cdm.random = ThreadLocalRandom.current().nextDouble(0, 500);
        tudo(disco);        
    }   
    void Aleatorio3(DadosTela cdm){
        cdm.random = ThreadLocalRandom.current().nextDouble(0, 800);
        tudo(memoria);
    }
    
    void tudo(DadosTela cdm){
        if(cdm.min.equals(0.0)){
           cdm.min=cdm.random;
        }else if(cdm.min>cdm.random){
           cdm.min = cdm.random;
        }
        if (cdm.max<cdm.random) {
            cdm.max=cdm.random;
        }
            cdm.somas+=cdm.random;
            cdm.cont++;
            cdm.media=cdm.somas/cdm.cont;
    }
    
    public Tela() {
        initComponents();
        pgrBarra1.setStringPainted(true);
        pgrBarra2.setStringPainted(true);
        pgrBarra2.setMaximum(400);
        pgrBarra3.setStringPainted(true);
        pgrBarra3.setMaximum(800);
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
        pgrBarra1 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        pgrBarra2 = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        pgrBarra3 = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbMax1 = new javax.swing.JLabel();
        lbMin1 = new javax.swing.JLabel();
        lbMedia1 = new javax.swing.JLabel();
        lbMax3 = new javax.swing.JLabel();
        lbMax2 = new javax.swing.JLabel();
        lbMin2 = new javax.swing.JLabel();
        lbMedia2 = new javax.swing.JLabel();
        lbMin3 = new javax.swing.JLabel();
        lbMedia3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });

        jLabel1.setText("CPU");

        jLabel2.setText("DISCO");

        jLabel3.setText("MEMORIA");

        jLabel4.setText("INFORMAÇÕES DA MAQUINA");

        jButton1.setText("FAZER LEITURA DE DADOS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("MAX:");

        jLabel6.setText("MIN:");

        jLabel7.setText("MEDIA:");

        jLabel8.setText("MAX:");

        jLabel9.setText("MIN:");

        jLabel10.setText("MEDIA:");

        jLabel11.setText("MAX:");

        jLabel12.setText("MIN:");

        jLabel13.setText("MEDIA:");

        lbMax1.setText("0.0");

        lbMin1.setText("0.0");

        lbMedia1.setText("0.0");

        lbMax3.setText("0.0");

        lbMax2.setText("0.0");

        lbMin2.setText("0.0");

        lbMedia2.setText("0.0");

        lbMin3.setText("0.0");

        lbMedia3.setText("0.0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbMax2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbMin2)
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel10)
                                        .addGap(3, 3, 3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbMax1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbMin1)
                                        .addGap(35, 35, 35)
                                        .addComponent(jLabel7)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(lbMedia2))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(lbMedia1))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbMax3)
                                        .addGap(46, 46, 46)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbMin3)
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel13)))
                                .addGap(18, 18, 18)
                                .addComponent(lbMedia3)))
                        .addGap(0, 167, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pgrBarra3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                            .addComponent(pgrBarra2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pgrBarra1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pgrBarra1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(lbMax1)
                    .addComponent(lbMin1)
                    .addComponent(lbMedia1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pgrBarra2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(lbMedia2)
                    .addComponent(lbMin2)
                    .addComponent(lbMax2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pgrBarra3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(lbMax3)
                    .addComponent(lbMin3)
                    .addComponent(lbMedia3))
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Aleatorio1(cpu);
        Aleatorio2(disco);
        Aleatorio3(memoria);
        
        constante();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentAdded

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbMax1;
    private javax.swing.JLabel lbMax2;
    private javax.swing.JLabel lbMax3;
    private javax.swing.JLabel lbMedia1;
    private javax.swing.JLabel lbMedia2;
    private javax.swing.JLabel lbMedia3;
    private javax.swing.JLabel lbMin1;
    private javax.swing.JLabel lbMin2;
    private javax.swing.JLabel lbMin3;
    private javax.swing.JProgressBar pgrBarra1;
    private javax.swing.JProgressBar pgrBarra2;
    private javax.swing.JProgressBar pgrBarra3;
    // End of variables declaration//GEN-END:variables
}
