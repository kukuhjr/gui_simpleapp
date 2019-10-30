package id.ac.undip.gui;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import javax.swing.DefaultListModel;

public class JFrameGui extends javax.swing.JFrame {

    FileReader fr;
    List<String> isifiles;
    DefaultListModel<String> dlm;
    List<String> items;

    /**
     * Creates new form JFrameGui
     */
    public JFrameGui() {
        initComponents();
        isifiles = new ArrayList<>();
        items = new ArrayList<>();
        dlm = new DefaultListModel<>();
        jListWords.setModel(dlm);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jListWords = new javax.swing.JList<>();
        jButtonBacaFile = new javax.swing.JButton();
        jTextFieldBilangan = new javax.swing.JTextField();
        jLabelJudulProgram = new javax.swing.JLabel();
        jLabelNamaFile = new javax.swing.JLabel();
        jTextFieldNamaFile = new javax.swing.JTextField();
        jButtonUrutkan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jScrollPane1.setViewportView(jListWords);

        jButtonBacaFile.setText("Baca File");
        jButtonBacaFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBacaFileActionPerformed(evt);
            }
        });

        jTextFieldBilangan.setText("Jumlah item = 0");

        jLabelJudulProgram.setText("PEMBACA FILE");

        jLabelNamaFile.setText("NAMA FILE:");

        jTextFieldNamaFile.setText("animal.txt");
        jTextFieldNamaFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNamaFileActionPerformed(evt);
            }
        });

        jButtonUrutkan.setText("Urutkan");
        jButtonUrutkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUrutkanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabelJudulProgram)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelNamaFile)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldNamaFile, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jButtonBacaFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldBilangan, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(jButtonUrutkan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelJudulProgram)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNamaFile)
                            .addComponent(jTextFieldNamaFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBacaFile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldBilangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonUrutkan))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBacaFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBacaFileActionPerformed
        isifiles = bacaFile(jTextFieldNamaFile.getText());
        dlm.clear();
        for (int i = 0; i < isifiles.size(); i++) {
            String get = isifiles.get(i);
            dlm.addElement(get);
        }

        jTextFieldBilangan.setText("Jumlah item = " + dlm.getSize());

    }//GEN-LAST:event_jButtonBacaFileActionPerformed


    private void jButtonUrutkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUrutkanActionPerformed
        urutkan(dlm);
    }//GEN-LAST:event_jButtonUrutkanActionPerformed

    private void jTextFieldNamaFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNamaFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNamaFileActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JFrameGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBacaFile;
    private javax.swing.JButton jButtonUrutkan;
    private javax.swing.JLabel jLabelJudulProgram;
    private javax.swing.JLabel jLabelNamaFile;
    private javax.swing.JList<String> jListWords;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldBilangan;
    private javax.swing.JTextField jTextFieldNamaFile;
    // End of variables declaration//GEN-END:variables

    /**
     * Membaca file
     * @param namaFile
     * @return list of String
     */
    private List<String> bacaFile(String namaFile) {
        List<String> texts = new ArrayList<>();
        try {
            fr = new FileReader(namaFile);
            Scanner scan = new Scanner(fr);
            while (scan.hasNextLine()) {
                texts.add(scan.nextLine());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File tidak ditemukan : " + ex.getMessage());
        }
        return texts;
    }

    /**
     * Mengurutkan isi JList
     * @param dlm 
     */
    private void urutkan(DefaultListModel<String> dlm) {
        // Check jika list items ada isi maka dikosongkan
        if (!items.isEmpty()) {
            items.clear();
        }

        //tambahkan data dari JList ke list items
        for (int i = 0; i < dlm.getSize(); i++) {
            items.add(dlm.getElementAt(i));
        }
        //urutkan dengan method sort dari Collections
        Collections.sort(items);

        //kosongkan model list dengan clear
        //kemudian isikan data
        dlm.clear();
        for (int i = 0; i < items.size(); i++) {
            dlm.addElement(items.get(i));
        }
    }

}
