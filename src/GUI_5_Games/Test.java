/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_5_Games;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author USER
 */
public class Test extends javax.swing.JFrame {

    String jawaban1 = "apple";
    String jawaban2 = "google drive";
    String jawaban3 = "facebook";
    String jawaban4 = "gagal diskusi";
    String jawaban5 = "lays";
    
    String[] namagambar = {"1.jpg","2.jpg","3.jpg","4.jpg","5.jpg","6.jpg"};
    List<String> listItem = new ArrayList<>();
    DefaultListModel<String> dlm;
   
    static int counter = 0;
    int soal;
    int quiz;
    int pemain = 0;
    
    public Test() {
        initComponents();
        
        this.dlm = new DefaultListModel<>();
        this.jListScore.setModel(dlm);
        
        jButtonOk.setVisible(false);
        jLabelPertanyaan.setVisible(false);
        jTextFieldJawaban.setVisible(false);
        jButtonNext.setVisible(false);
        jQuest1.setText("");
        jQuest3.setText("");
        jQuest2.setText("");
    }

    public void OK(){
        pemain++;
        soal = 0;
        quiz = -1;
        jLabelLetsStart.setText("Yang ke 1");
        jButtonOk.setVisible(true);
        jButtonOk.setEnabled(true);
        jButtonNext.setVisible(true);
        jButtonNext.setEnabled(false);
        jButtonNext.setText("Next");
        jButtonOk.setText("OK");
        jTextFieldJawaban.setVisible(true);
        jLabelPertanyaan.setVisible(true);
        jButtonStart.setVisible(false);
        jLabelPertanyaan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI_5/images/"+namagambar[0])));
        jTextFieldJawaban.setText("");
        jQuest1.setVisible(true);
        jQuest2.setVisible(true);
        jQuest3.setVisible(true);
        jTextFieldJawaban.setEnabled(true);
        jQuest1.setText("Apa Nama");
        jQuest2.setText("Logo Disamping?");
        jQuest3.setText("");        
    }
    
    private String aaa(){
        return (""+pemain+" : "+counter);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabelLetsStart = new javax.swing.JLabel();
        jButtonStart = new javax.swing.JButton();
        jButtonOk = new javax.swing.JButton();
        jTextFieldJawaban = new javax.swing.JTextField();
        jLabelPertanyaan = new javax.swing.JLabel();
        jButtonNext = new javax.swing.JButton();
        jQuest1 = new javax.swing.JLabel();
        jQuest2 = new javax.swing.JLabel();
        jQuest3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListScore = new javax.swing.JList<>();
        jScore = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel3.setBackground(new java.awt.Color(89, 245, 175));

        jLabelLetsStart.setFont(new java.awt.Font("Lemon/Milk light", 0, 60)); // NOI18N
        jLabelLetsStart.setForeground(new java.awt.Color(51, 0, 204));
        jLabelLetsStart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLetsStart.setText("Tebak gambar");

        jButtonStart.setBackground(new java.awt.Color(255, 255, 51));
        jButtonStart.setFont(new java.awt.Font("Mouse Deco", 0, 22)); // NOI18N
        jButtonStart.setForeground(new java.awt.Color(0, 0, 255));
        jButtonStart.setText("Start");
        jButtonStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStartActionPerformed(evt);
            }
        });

        jButtonOk.setBackground(new java.awt.Color(255, 255, 51));
        jButtonOk.setFont(new java.awt.Font("Mouse Deco", 0, 18)); // NOI18N
        jButtonOk.setForeground(new java.awt.Color(0, 51, 255));
        jButtonOk.setText("OK");
        jButtonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkActionPerformed(evt);
            }
        });

        jTextFieldJawaban.setFont(new java.awt.Font("Gadugi", 1, 20)); // NOI18N
        jTextFieldJawaban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldJawabanActionPerformed(evt);
            }
        });

        jLabelPertanyaan.setBackground(new java.awt.Color(255, 255, 255));
        jLabelPertanyaan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPertanyaan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI_5_Games/images/1.jpg"))); // NOI18N

        jButtonNext.setBackground(new java.awt.Color(255, 255, 51));
        jButtonNext.setFont(new java.awt.Font("Mouse Deco", 0, 20)); // NOI18N
        jButtonNext.setForeground(new java.awt.Color(0, 0, 255));
        jButtonNext.setText("Next");
        jButtonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextActionPerformed(evt);
            }
        });

        jQuest1.setFont(new java.awt.Font("Lemon/Milk light", 0, 36)); // NOI18N
        jQuest1.setText("apa nama");

        jQuest2.setFont(new java.awt.Font("Lemon/Milk light", 0, 24)); // NOI18N
        jQuest2.setText("Logo disamping?");

        jQuest3.setFont(new java.awt.Font("Lemon/Milk light", 0, 24)); // NOI18N

        jScrollPane1.setViewportView(jListScore);

        jScore.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jScore.setText("Score List :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelLetsStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabelPertanyaan, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jQuest1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jQuest2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jQuest3, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScore)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonStart, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButtonOk, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonNext, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldJawaban, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(42, 42, 42))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabelLetsStart, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jQuest1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jQuest2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jQuest3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabelPertanyaan, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldJawaban, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonNext, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonStart, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonOk, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScore))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStartActionPerformed
        OK();
        
    }//GEN-LAST:event_jButtonStartActionPerformed

    private void jButtonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkActionPerformed
        switch(soal){
            case 0 :
                if(jawaban1.equals(jTextFieldJawaban.getText())){
                    jLabelLetsStart.setText("Benar");
                    jButtonNext.setVisible(true);
                    jButtonOk.setEnabled(false);
                    jButtonNext.setEnabled(true);
                    quiz++;
                    counter += 20;
                    break;
                }else{
                    jLabelLetsStart.setText("Salah");
                    counter -= 2;
                    break;
                }
            case 1 :
                if(jawaban2.equals(jTextFieldJawaban.getText())){
                    jLabelLetsStart.setText("Benar");
                    jButtonNext.setVisible(true);
                    jButtonOk.setEnabled(false);
                    jButtonNext.setEnabled(true);
                    quiz++;
                    counter += 20;
                    break;
                }else{
                    jLabelLetsStart.setText("Salah");
                    counter -= 2;
                    break;
                }
            case 2 :
                if(jawaban3.equals(jTextFieldJawaban.getText())){
                    jLabelLetsStart.setText("Benar");
                    jButtonNext.setVisible(true);
                    jButtonOk.setEnabled(false);
                    jButtonNext.setEnabled(true);
                    quiz++;
                    counter += 20;
                    break;
                }else{
                    jLabelLetsStart.setText("Salah");
                    counter -= 2;                    
                    break;
                }
            case 3 :
                if(jawaban4.equals(jTextFieldJawaban.getText())){
                    jLabelLetsStart.setText("Benar");
                    jButtonNext.setVisible(true);
                    jButtonOk.setEnabled(false);
                    jButtonNext.setEnabled(true);
                    quiz++;
                    counter += 20;
                    break;
                }else{
                    jLabelLetsStart.setText("Salah");
                    counter -= 2;                    
                    break;
                }
            case 4 :
                if(jawaban5.equals(jTextFieldJawaban.getText())){
                    jLabelLetsStart.setText("Benar");
                    jButtonNext.setVisible(true);
                    jButtonOk.setEnabled(false);
                    jButtonNext.setEnabled(true);
                    quiz++;
                    counter += 20;
                    break;
                }else{
                    jLabelLetsStart.setText("Salah");
                    counter -= 2;                    
                    break;
                }
            case 5 :
                jButtonStart.setVisible(true);
                jTextFieldJawaban.setVisible(false);
                jButtonNext.setVisible(false);
                jButtonOk.setVisible(false);
                jLabelPertanyaan.setVisible(false);
                jQuest1.setText("");
                jQuest2.setText("");
                jQuest3.setText("");
                jLabelLetsStart.setText("Tebak Gambar");
                break;
                
        }
    }//GEN-LAST:event_jButtonOkActionPerformed

    private void jTextFieldJawabanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldJawabanActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextFieldJawabanActionPerformed
            
    private void jButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextActionPerformed
            switch(quiz){
            case 0 :
                jLabelLetsStart.setText("Yang ke 2");
                jButtonOk.setVisible(true);
                jButtonOk.setEnabled(true);
                jButtonNext.setEnabled(false);
                jTextFieldJawaban.setVisible(true);
                jLabelPertanyaan.setVisible(true);
                jButtonStart.setVisible(false);
                jLabelPertanyaan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI_5/images/"+namagambar[1])));
                jTextFieldJawaban.setText("");
                soal++;
                break;
            case 1 :
                jLabelLetsStart.setText("Yang ke 3");
                jButtonOk.setVisible(true);
                jButtonOk.setEnabled(true);
                jButtonNext.setEnabled(false);
                jTextFieldJawaban.setVisible(true);
                jLabelPertanyaan.setVisible(true);
                jButtonStart.setVisible(false);
                jLabelPertanyaan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI_5/images/"+namagambar[2])));
                jQuest1.setText("Dia merupakan");
                jQuest2.setText("founder sosial");
                jQuest3.setText("media apa?");
                jTextFieldJawaban.setText("");
                soal++;
                break;
            case 2 :
                jLabelLetsStart.setText("Yang ke 4");
                jButtonOk.setVisible(true);
                jButtonOk.setEnabled(true);
                jButtonNext.setEnabled(false);
                jTextFieldJawaban.setVisible(true);
                jLabelPertanyaan.setVisible(true);
                jButtonStart.setVisible(false);
                jLabelPertanyaan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI_5/images/"+namagambar[3])));
                jQuest1.setText("Apa Arti");
                jQuest2.setText("Gambar Disamping?");
                jQuest3.setText("");
                jTextFieldJawaban.setText("");
                soal++;
                break;

            case 3 :
                jLabelLetsStart.setText("Yang ke 5");
                jButtonOk.setVisible(true);
                jButtonOk.setEnabled(true);
                jButtonNext.setEnabled(false);
                jTextFieldJawaban.setVisible(true);
                jLabelPertanyaan.setVisible(true);
                jButtonStart.setVisible(false);
                jLabelPertanyaan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI_5/images/"+namagambar[4])));                
                jQuest1.setText("Apa Nama");
                jQuest2.setText("Logo Disamping?");
                jQuest3.setText(""); 
                jTextFieldJawaban.setText("");
                soal++;
                break;
            case 4 :
                jLabelLetsStart.setText("Selesai !");;
                jButtonOk.setVisible(true);
                jButtonOk.setEnabled(true);
                jButtonNext.setEnabled(false);
                jButtonNext.setVisible(false);
                jTextFieldJawaban.setVisible(true);
                jTextFieldJawaban.setEnabled(false);
                jLabelPertanyaan.setVisible(true);
                jButtonStart.setVisible(false);
                jTextFieldJawaban.setText("");
                jLabelPertanyaan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI_5/images/"+namagambar[5])));                
                jQuest1.setText("You");
                jQuest2.setText("Are");
                jQuest3.setText("Win !");
                jButtonOk.setText("Menu");
                soal++;
                dlm.addElement(aaa());
                counter = 0;
                break;
            }
    }//GEN-LAST:event_jButtonNextActionPerformed

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
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonNext;
    private javax.swing.JButton jButtonOk;
    private javax.swing.JButton jButtonStart;
    private javax.swing.JLabel jLabelLetsStart;
    private javax.swing.JLabel jLabelPertanyaan;
    private javax.swing.JList<String> jListScore;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jQuest1;
    private javax.swing.JLabel jQuest2;
    private javax.swing.JLabel jQuest3;
    private javax.swing.JLabel jScore;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldJawaban;
    // End of variables declaration//GEN-END:variables
}
