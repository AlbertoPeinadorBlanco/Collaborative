/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package collaborativeDev;

import java.awt.List;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Alberto Peinador Blanco
 * 
 * JFrame to display UI for creating customer subscriptions
 */
public class FormCreateReservation extends javax.swing.JFrame {

    /**
     * Creates new form OrderCreationForm
     */
    public FormCreateReservation() {
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

        btnReservation = new javax.swing.JButton();
        lblDate = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        cbItemType = new javax.swing.JComboBox<>();
        txtDate = new javax.swing.JTextField();
        cbItem = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

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

        btnReservation.setText("Submit");
        btnReservation.setToolTipText("Submit Subscription");
        btnReservation.setActionCommand("");
        btnReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservationActionPerformed(evt);
            }
        });

        lblDate.setText("jLabel");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Reservation Creation");

        lblUser.setText("jLable1");

        cbItemType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbItemTypeItemStateChanged(evt);
            }
        });

        txtDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDateKeyTyped(evt);
            }
        });

        jLabel1.setText("Item Type:");

        jLabel3.setText("Item Name:");

        jLabel4.setText("Desired Date:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel5.setText("DD/MM/YYYY");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDate))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbItemType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnReservation)
                                    .addComponent(txtDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbItem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel5)))))
                        .addGap(0, 137, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser)
                    .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbItemType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(35, 35, 35)
                .addComponent(btnReservation)
                .addGap(83, 83, 83))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ICreateData iCreateReservation = new CreateReservation();
    CreateDataInjector createReservation = new CreateDataInjector(iCreateReservation);
    
    
    
    private void btnReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservationActionPerformed
        // TODO add your handling code here:
        
        
            
            int dataCheck = JOptionPane.showConfirmDialog(null, "Please ensure that you are inputing the correct data.\n"
                        + "Item Type =  " + cbItemType.getSelectedItem() +"\n"+ "Item Name = " + 
                    cbItem.getSelectedItem() + "\n" + "Desired Date = " + txtDate.getText()
                        , "Confirm Data!", JOptionPane.YES_NO_OPTION);
            
            
            if(dataCheck == JOptionPane.YES_OPTION){
                
                int id = cbItem.getSelectedIndex()+1;
                String userID =String.valueOf(LoggedUser.userID);
                String itemID = String.valueOf(id);
                String reservation = itemID + "_" + lblDate.getText() + "_" + txtDate.getText() + "_" + userID;
                
                createReservation.dataCreate(reservation);
                
                
                
                JOptionPane.showMessageDialog(null, "Reservation placed!" + "\n" + "Waiting Admin Response.");
                
            }
          
        
    }//GEN-LAST:event_btnReservationActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        IReadData iReadData = new ItemTypeList();
        ReadDataInjector readItemType = new ReadDataInjector(iReadData);
        
        List listItemType = readItemType.dataRead("");
        cbItemType.insertItemAt("↓", 0);

        int counter = 0;
        int listItemLength = listItemType.getItemCount();

        
        while(listItemLength > counter){
            
            cbItemType.addItem(listItemType.getItem(counter));
            counter++;
        }
            
        lblDate.setText(LocalDate.now().toString());
        lblUser.setText(LoggedUser.userName);
        
        
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        if("1".equals(LoggedUser.role)){
             FormReservations fR = new FormReservations();
            fR.setVisible(true);
            this.dispose();
        }
        if("3".equals(LoggedUser.role)){
            this.dispose();
        }
       
        
    }//GEN-LAST:event_formWindowClosed

    private void cbItemTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbItemTypeItemStateChanged
        // TODO add your handling code here:
        int id = cbItemType.getSelectedIndex();
        String idData = String.valueOf(id);
        
        IReadData iReadData = new ItemNameList();
        ReadDataInjector readItemList = new ReadDataInjector(iReadData);
        
        cbItem.removeAllItems();
        
        List listItem = readItemList.dataRead(idData);
        
        int counter = 0;
        int listItemLength = listItem.getItemCount();

        
        while(listItemLength > counter){
            
            cbItem.addItem(listItem.getItem(counter));
            counter++;
        }
        
        listItem.removeAll();

    }//GEN-LAST:event_cbItemTypeItemStateChanged

    private void txtDateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDateKeyTyped
        // TODO add your handling code here:
        
        char c = evt.getKeyChar();
        int counter = txtDate.getText().length();
        String text = txtDate.getText();
        
        
        /*if(!Character.isDigit(c) || evt.getKeyChar() == KeyEvent.VK_DELETE || counter == 10){
            
            evt.consume();  
            
        }*/
        if(!Character.isDigit(c)){
            evt.consume();
        }
        if(counter == 2){
                
            txtDate.setText(text + "/");
            
                        
        }
        if(counter == 5){

            txtDate.setText(text + "/");
            
          
            
        }
        if(counter == 10){
            
            txtDate.setText("");
            
        }
        

    }//GEN-LAST:event_txtDateKeyTyped

        
    
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
            java.util.logging.Logger.getLogger(FormCreateReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCreateReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCreateReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCreateReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCreateReservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReservation;
    private javax.swing.JComboBox<String> cbItem;
    private javax.swing.JComboBox<String> cbItemType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblUser;
    private javax.swing.JTextField txtDate;
    // End of variables declaration//GEN-END:variables
}
