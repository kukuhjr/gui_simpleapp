/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.DefaultListModel;

/**
 *
 * @author USER
 */
public class Gui_4 extends javax.swing.JFrame {
    
    DefaultListModel<String> dlm;
    DefaultListModel<String> dlm1;
    DefaultListModel<String> dlm2;
    DefaultListModel<String> dlm3;
    List<String> listItem = new ArrayList<>();
    Map<Integer,String> listMap = new HashMap<>();
    Set<String> listSet = new HashSet<>();

    /**
     * Creates new form Gui
     */
    public Gui_4() {
        initComponents();
        this.dlm = new DefaultListModel<>();
        this.dlm1 = new DefaultListModel<>();
        this.dlm2 = new DefaultListModel<>();
        this.dlm3 = new DefaultListModel<>();
        this.jListNamaItem.setModel(dlm);
        this.jListlist.setModel(dlm1);
        this.jListset.setModel(dlm2);
        this.jListMap.setModel(dlm3);
        
        jButtonUpdate.setEnabled(false);                
    }
    
    private void addItem(String namaItem){
        dlm.addElement(namaItem);
        jButtonUpdate.setEnabled(true);
    }
    
    private void DelItem(){
        int index = jListNamaItem.getSelectedIndex();
        dlm.removeElementAt(index);
        jTextFieldNamaItem.setText("");
        if(dlm.getSize() == 0){
            jButtonUpdate.setEnabled(false);
        }
    }
    
    private void update(){
        int index = jListNamaItem.getSelectedIndex();
        String dipilih = jTextFieldNamaItem.getText();
        dlm.setElementAt(dipilih, index);
        jTextFieldNamaItem.setText("");
    }  
    
    private void clearAll(){
        dlm.clear();
        jButtonUpdate.setEnabled(false);
    }
    
    private void jumDataTersimpan1(){
        jLabelList.setText("Data tersimpan = " +listItem.size());
    }
    
    private void jumDataTersimpan2(){
        jLabelSet.setText("Data tersimpan = " +listSet.size());
    }
    
    private void jumDataTersimpan3(){
        jLabelMap.setText("Data tersimpan = " +listMap.size());

    }
    
    private void saveList(){
        if(!listItem.isEmpty()){
            listItem.clear();
        }
        for(int i=0; i<dlm.getSize();i++){
            listItem.add(dlm.getElementAt(i));
        }
        if(!dlm1.isEmpty()){
            dlm1.clear();
        }
        for (String ahoy : listItem){
            dlm1.addElement(ahoy);
        }
        jumDataTersimpan1();
    }
    
    private void insertList(){
        for (String ahoy : listItem){
            dlm.addElement(ahoy);
        }
    }
    
    private void saveMap(){
        if(!listMap.isEmpty()){
            listMap.clear();
        }
        for(int i=0; i<dlm.getSize();i++){
            listMap.put(i,dlm.getElementAt(i));
        }
        if(!dlm3.isEmpty()){
            dlm3.clear();
        }
        Set<Integer> kunci = listMap.keySet();
        for(Integer ahay : kunci){
            dlm3.addElement(listMap.get(ahay));
        }
        jumDataTersimpan3();
    }
    
    private void insertMap(){
        Set<Integer> keys = listMap.keySet();
        for(Integer ahay : keys){
            dlm.addElement(listMap.get(ahay));
        }
    }
    
    private void saveSet(){
        if(!listSet.isEmpty()){
            listItem.clear();
        }
        for(int i=0; i<dlm.getSize();i++){
            listSet.add(dlm.getElementAt(i));
        }
        if(!dlm2.isEmpty()){
            dlm2.clear();
        }
        for (String ahoy : listSet){
            dlm2.addElement(ahoy);
        }
        jumDataTersimpan2();
    }
    
    private void insertSet(){
        for(String ahay : listSet){
            dlm.addElement(ahay);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jListNamaItem = new javax.swing.JList<>();
        jTextFieldNamaItem = new javax.swing.JTextField();
        jLabelNamaItem = new javax.swing.JLabel();
        jButtonClear = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonSaveList = new javax.swing.JButton();
        jButtonInsertList = new javax.swing.JButton();
        jButtonSaveSet = new javax.swing.JButton();
        jButtonInsertSet = new javax.swing.JButton();
        jButtonSaveMap = new javax.swing.JButton();
        jButtonInsertMap = new javax.swing.JButton();
        jLabelList = new javax.swing.JLabel();
        jLabelSet = new javax.swing.JLabel();
        jLabelMap = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListlist = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListset = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListMap = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(jListNamaItem);

        jLabelNamaItem.setText("Item Name :");

        jButtonClear.setText("Clear all");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jButtonAdd.setText("add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonUpdate.setText("update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonDelete.setText("delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonSaveList.setText("save to List->");
        jButtonSaveList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveListActionPerformed(evt);
            }
        });

        jButtonInsertList.setText("<- insert data List");
        jButtonInsertList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertListActionPerformed(evt);
            }
        });

        jButtonSaveSet.setText("save to Set->");
        jButtonSaveSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveSetActionPerformed(evt);
            }
        });

        jButtonInsertSet.setText("<-insert data Set");
        jButtonInsertSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertSetActionPerformed(evt);
            }
        });

        jButtonSaveMap.setText("save to Map->");
        jButtonSaveMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveMapActionPerformed(evt);
            }
        });

        jButtonInsertMap.setText("<-insert data Map");
        jButtonInsertMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertMapActionPerformed(evt);
            }
        });

        jLabelList.setText("Data tersimpan = 0");

        jLabelSet.setText("Data tersimpan = 0");

        jLabelMap.setText("Data tersimpan = 0");

        jScrollPane2.setViewportView(jListlist);

        jScrollPane3.setViewportView(jListset);

        jScrollPane4.setViewportView(jListMap);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSaveMap, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonInsertMap)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextFieldNamaItem, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonSaveSet, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonInsertSet, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonSaveList, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonInsertList))
                                    .addGap(34, 34, 34))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabelNamaItem)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane3)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                                .addComponent(jLabelList, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelSet, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelMap, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane4)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelList)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonSaveList)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonInsertList)
                                .addGap(117, 117, 117)
                                .addComponent(jButtonSaveSet)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonInsertSet))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(jLabelSet)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabelMap)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jButtonSaveMap)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonInsertMap)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelNamaItem)
                                .addGap(9, 9, 9)))
                        .addComponent(jTextFieldNamaItem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonClear)
                    .addComponent(jButtonAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
       DelItem();
       jTextFieldNamaItem.setText("");
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonSaveListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveListActionPerformed
        saveList();
        jTextFieldNamaItem.setText("");
    }//GEN-LAST:event_jButtonSaveListActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        clearAll();
        jTextFieldNamaItem.setText("");

    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        addItem(jTextFieldNamaItem.getText());
        jTextFieldNamaItem.setText("");
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        update();
        jTextFieldNamaItem.setText("");
        
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonSaveSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveSetActionPerformed
        saveSet();
        jTextFieldNamaItem.setText("");
    }//GEN-LAST:event_jButtonSaveSetActionPerformed

    private void jButtonSaveMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveMapActionPerformed
        saveMap();
        jTextFieldNamaItem.setText("");
    }//GEN-LAST:event_jButtonSaveMapActionPerformed

    private void jButtonInsertListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertListActionPerformed
        insertList();
        jTextFieldNamaItem.setText("");
    }//GEN-LAST:event_jButtonInsertListActionPerformed

    private void jButtonInsertSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertSetActionPerformed
        insertSet();
        jTextFieldNamaItem.setText("");
    }//GEN-LAST:event_jButtonInsertSetActionPerformed

    private void jButtonInsertMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertMapActionPerformed
        insertMap();
        jTextFieldNamaItem.setText("");
    }//GEN-LAST:event_jButtonInsertMapActionPerformed

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
            java.util.logging.Logger.getLogger(Gui_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui_4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonInsertList;
    private javax.swing.JButton jButtonInsertMap;
    private javax.swing.JButton jButtonInsertSet;
    private javax.swing.JButton jButtonSaveList;
    private javax.swing.JButton jButtonSaveMap;
    private javax.swing.JButton jButtonSaveSet;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabelList;
    private javax.swing.JLabel jLabelMap;
    private javax.swing.JLabel jLabelNamaItem;
    private javax.swing.JLabel jLabelSet;
    private javax.swing.JList<String> jListMap;
    private javax.swing.JList<String> jListNamaItem;
    private javax.swing.JList<String> jListlist;
    private javax.swing.JList<String> jListset;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextFieldNamaItem;
    // End of variables declaration//GEN-END:variables
}
