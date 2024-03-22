/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package collaborativeDev;

import java.awt.List;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;

/**
 *
 * @author Alberto Peinador Blanco
 * 
 * JFrame to display the UI for creating notes
 */
public class FormCreateItem extends javax.swing.JFrame {

    /**
     * Creates new form FormCreateNote
     */
    public FormCreateItem() {
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

        btnSubmitItem = new javax.swing.JButton();
        lblDate = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbType = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtItemName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(600, 300));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnSubmitItem.setText("Submit");
        btnSubmitItem.setToolTipText("Submit Item");
        btnSubmitItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitItemActionPerformed(evt);
            }
        });

        lblDate.setText("jLabel1");

        lblUser.setText("jLabel2");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Item Creation");

        cbType.setToolTipText("Select a Customer");

        jLabel2.setText("Select Type:");

        jLabel3.setText("Name:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 314, Short.MAX_VALUE)
                .addComponent(lblDate)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSubmitItem, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(151, 151, 151))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate)
                    .addComponent(lblUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addComponent(btnSubmitItem)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        lblDate.setText(LocalDate.now().toString());
        lblUser.setText(LoggedUser.userName);
        
        IReadData iItemType = new ItemList();
        ReadDataInjector readItemTypes = new ReadDataInjector(iItemType);

       
        List listCustomer = readItemTypes.dataRead("");
        int counter = 0;
        int listCustomerLength = listCustomer.getItemCount();
        
        
        while(listCustomerLength > counter){
            
            cbType.addItem(listCustomer.getItem(counter));
            counter++;
        }
        
    }//GEN-LAST:event_formWindowOpened

    private void btnSubmitItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitItemActionPerformed
        // TODO add your handling code here:
        
        if(txtItemName.getText().equals("")){
            
        JOptionPane.showMessageDialog(null, "Empty Note!\n Please write a note in the text field.");

        }
        else{
            
            int dataCheck = JOptionPane.showConfirmDialog(null, "Please ensure that you are inputing the correct data.\n"
                    + "Type = " + cbType.getSelectedItem().toString() + "\n"
                    + "Note = " + txtItemName.getText() , "Confirm Data!", JOptionPane.YES_NO_OPTION);
            
            
            if(dataCheck == JOptionPane.YES_OPTION){
                
                ICreateData iCreateItem = new CreateItem();
                CreateDataInjector createItem = new CreateDataInjector(iCreateItem);
                
                String type = null;
                
                if(cbType.getSelectedItem().equals("Laptop")){
                    type = "1";
                }
                if(cbType.getSelectedItem().equals("Tablet")){
                    type = "2";
                }
                if(cbType.getSelectedItem().equals("Mouse")){
                    type = "3";
                }
                if(cbType.getSelectedItem().equals("Keyboard")){
                    type = "4";
                }
                if(cbType.getSelectedItem().equals("Screen")){
                    type = "5";
                }
                if(cbType.getSelectedItem().equals("Gamepad")){
                    type = "6";
                }
                if(cbType.getSelectedItem().equals("Headset")){
                    type = "7";
                }
                if(cbType.getSelectedItem().equals("VR")){
                    type = "8";
                }
                if(cbType.getSelectedItem().equals("Speakers")){
                    type = "9";
                }
                if(cbType.getSelectedItem().equals("Microphone")){
                    type = "10";
                }
                
                String itemData = txtItemName.getText() + "_" + type + "_" + "1";
                
                createItem.dataCreate(itemData);

                JOptionPane.showMessageDialog(null, "Item created!");
                
                txtItemName.setText("");
            }
            
            
            
        }
        
    }//GEN-LAST:event_btnSubmitItemActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        
        FormItems fI = new FormItems();
        fI.setVisible(true);
        
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(FormCreateItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCreateItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCreateItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCreateItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCreateItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmitItem;
    private javax.swing.JComboBox<String> cbType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblUser;
    private javax.swing.JTextField txtItemName;
    // End of variables declaration//GEN-END:variables
}
