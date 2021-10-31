/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib1;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
/**
 *
 * @author KarlJ
 */
public class taBortUtrustning extends javax.swing.JFrame {
    private static InfDB idb;
    /**
     * Creates new form taBortUtrustning
     */
    public taBortUtrustning(InfDB idb) {
        initComponents();
        this.idb = idb;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sökUtrustning = new javax.swing.JTextField();
        sökUtrustningBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        idUtrustningTextField = new javax.swing.JTextField();
        namnUtrustningTextField = new javax.swing.JTextField();
        typTextField = new javax.swing.JTextField();
        typLBL = new javax.swing.JLabel();
        typUtrustningTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        removeBTN = new javax.swing.JButton();
        tbxBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sökUtrustningBTN.setText("Sök");
        sökUtrustningBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sökUtrustningBTNActionPerformed(evt);
            }
        });

        jLabel1.setText("Sök utrustning");

        idUtrustningTextField.setEnabled(false);

        namnUtrustningTextField.setEnabled(false);

        typTextField.setEnabled(false);

        typUtrustningTextField.setEnabled(false);

        jLabel2.setText("UtrustningsId");

        jLabel3.setText("Benämning");

        jLabel4.setText("Typ");

        removeBTN.setText("Ta bort utrustning");
        removeBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBTNActionPerformed(evt);
            }
        });

        tbxBTN.setText("Tillbaka");
        tbxBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbxBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(removeBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tbxBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(typTextField)
                            .addComponent(idUtrustningTextField)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(sökUtrustning)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(namnUtrustningTextField)
                            .addComponent(sökUtrustningBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(typUtrustningTextField)
                            .addComponent(typLBL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sökUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sökUtrustningBTN))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idUtrustningTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namnUtrustningTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(typLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typUtrustningTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removeBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbxBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sökUtrustningBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sökUtrustningBTNActionPerformed
        // TODO add your handling code here:
        if(valideringsklass.tomtFalt(sökUtrustning)){
        String valdUtrustning = sökUtrustning.getText();
        
        try{
            String id = idb.fetchSingle("Select utrustnings_id from utrustning where benamning = " + "'" + valdUtrustning + "'");
            int convertId = Integer.parseInt(id);
            idUtrustningTextField.setText(id);
            
            String namn = idb.fetchSingle("Select benamning from utrustning where utrustnings_id = " + "'" + convertId + "'");
            namnUtrustningTextField.setText(namn);
            
            String kommunikation = idb.fetchSingle("Select utrustnings_id from kommunikation where utrustnings_id = " + "'" + convertId + "'");
            String teknik = idb.fetchSingle("Select utrustnings_id from teknik where utrustnings_id = " + "'" + convertId + "'");
            String vapen = idb.fetchSingle("Select utrustnings_id from vapen where utrustnings_id = " + "'" + convertId + "'");
            String transfer = idb.fetchSingle("Select overforingsteknik from kommunikation where utrustnings_id = " + "'" + convertId + "'");
            String power = idb.fetchSingle("Select kraftkalla from teknik  where utrustnings_id = " + "'" + convertId + "'");
            String kaliber = idb.fetchSingle("Select kaliber from vapen  where utrustnings_id = " + "'" + convertId + "'");
            
            if(kommunikation != null){
                typTextField.setText("Kommunikation");
                typUtrustningTextField.setText(transfer);
                typLBL.setText("Överföringsteknik");
            }
            else if(teknik != null){
                typTextField.setText("Teknik");
                typUtrustningTextField.setText(power);
                typLBL.setText("Kraftkälla");
            }
            else{
                typTextField.setText("Vapen");
                typUtrustningTextField.setText(kaliber);
                typLBL.setText("Kaliber");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Utrustningen hittades inte! Dubbelkolla stavningen");
             System.out.println(e.getMessage());
        }
        
        }
    }//GEN-LAST:event_sökUtrustningBTNActionPerformed

    private void removeBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBTNActionPerformed
        // TODO add your handling code here:
        if(valideringsklass.tomtFalt(idUtrustningTextField)){
        int convertId = Integer.parseInt(idUtrustningTextField.getText());
        int inmatning = JOptionPane.showConfirmDialog(null, "Vill du ta bort utrustningen?", "Ta bort utrustning", 2);
        if(inmatning == 0){
            try{
                idb.delete("Delete from utrustning where utrustnings_id = " + "'" + convertId + "'");
                idb.delete("Delete from innehar_utrustning where utrustnings_id = " + "'" + convertId + "'");
                idb.delete("Delete from kommunikation where utrustnings_id = " + "'" + convertId + "'");
                idb.delete("Delete from vapen where utrustnings_id = " + "'" + convertId + "'");
                idb.delete("Delete from teknik where utrustnings_id = " + "'" + convertId + "'");
                JOptionPane.showMessageDialog(null, "Utrustningen har raderats");
                
                
            }
            catch(Exception e){
             System.out.println(e.getMessage());
            }
        }
        
        }
    }//GEN-LAST:event_removeBTNActionPerformed

    private void tbxBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbxBTNActionPerformed
        // TODO add your handling code here:
        AdminFonster tbx = new AdminFonster(idb);
        tbx.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tbxBTNActionPerformed

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
            java.util.logging.Logger.getLogger(taBortUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(taBortUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(taBortUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(taBortUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new taBortUtrustning(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField idUtrustningTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField namnUtrustningTextField;
    private javax.swing.JButton removeBTN;
    private javax.swing.JTextField sökUtrustning;
    private javax.swing.JButton sökUtrustningBTN;
    private javax.swing.JButton tbxBTN;
    private javax.swing.JLabel typLBL;
    private javax.swing.JTextField typTextField;
    private javax.swing.JTextField typUtrustningTextField;
    // End of variables declaration//GEN-END:variables
}
