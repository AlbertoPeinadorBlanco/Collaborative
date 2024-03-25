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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alberto Peinador Blanco
 * 
 * JFrame to display UI for reading and manipulating customer subscriptions
 */
public class FormSanitising extends javax.swing.JFrame {

    /**
     * Creates new form Practise
     */
    public FormSanitising() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tbSanitising = new javax.swing.JTable();
        btnDeleteSanitising = new javax.swing.JButton();
        btnUpdateSanitising = new javax.swing.JButton();
        btnCreateSanitising = new javax.swing.JButton();
        lblDate = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(400, 200));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tbSanitising.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Item ID", "Date-in", "Date-out"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbSanitising);

        btnDeleteSanitising.setText("Delete");
        btnDeleteSanitising.setToolTipText("Delete Subscription");
        btnDeleteSanitising.setPreferredSize(new java.awt.Dimension(69, 22));
        btnDeleteSanitising.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSanitisingActionPerformed(evt);
            }
        });

        btnUpdateSanitising.setText("Update");
        btnUpdateSanitising.setToolTipText("Update Subscription");
        btnUpdateSanitising.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateSanitisingActionPerformed(evt);
            }
        });

        btnCreateSanitising.setText("Create");
        btnCreateSanitising.setToolTipText("Create Subscription");
        btnCreateSanitising.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateSanitisingActionPerformed(evt);
            }
        });

        lblDate.setText("jLabel1");

        lblUser.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Sanitising");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnUpdateSanitising, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                    .addComponent(btnCreateSanitising, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDeleteSanitising, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jLabel3)))
                        .addGap(84, 84, 84)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDate)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate)
                    .addComponent(lblUser))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(54, 54, 54)
                        .addComponent(btnDeleteSanitising, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(btnUpdateSanitising)
                        .addGap(58, 58, 58)
                        .addComponent(btnCreateSanitising))
                    .addComponent(jScrollPane1))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    IReadData iReadSanitising =  new ReadSanitising();
    ReadDataInjector readSanitising = new ReadDataInjector(iReadSanitising);
    

    
    //this function loops through the subscriptions in the DB and displays them into a table control, each piece of data in its corresponding cell
    private void readSanitising(){
        
        
        List listSanitising = readSanitising.dataRead("");
        
        int listCounter = listSanitising.getItemCount();
        int row = 0;
        int column = 0;
        
        for(int i = 0; i <= listCounter; i++){
              
            String item = listSanitising.getItem(row);

            String[] cutList = item.split("_");
            
            for (int j = 0; j < cutList.length; j++) {
                
                tbSanitising.setValueAt(cutList[j], row, j);
                
                column++;
                
                if(column ==4){
                    row++;
                    column = 0;
                }
            }
            
               
        }  
        
    }
    
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        lblDate.setText(LocalDate.now().toString());
        lblUser.setText(LoggedUser.userName);
        
        readSanitising();
        
    }//GEN-LAST:event_formWindowOpened

    private void btnDeleteSanitisingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteSanitisingActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel tableModel = (DefaultTableModel) tbSanitising.getModel();

        
        int selectedRow = tbSanitising.getSelectedRow();
        
                  
        if(selectedRow == -1){
            
            JOptionPane.showMessageDialog(null, "Please select a value to delete!");

        }
        else{
            
             int dataCheck = JOptionPane.showConfirmDialog(null, "Please ensure that you are deleting the correct data.\n",
                "Please confirm!"  ,JOptionPane.YES_NO_OPTION);
             
            if(dataCheck == JOptionPane.YES_OPTION){
            
           
                
                IDeleteData iDeleteSanitising = new DeleteSanitising();
                DeleteDataInjector deleteOrder = new DeleteDataInjector(iDeleteSanitising);
                
                String selectedValue = tbSanitising.getValueAt(selectedRow, 0).toString();
                
                deleteOrder.dataDelete(selectedValue);                
                
                
                tableModel.removeRow(selectedRow);
        
            
            
            }  
        }
       
        

    }//GEN-LAST:event_btnDeleteSanitisingActionPerformed

    private void btnUpdateSanitisingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateSanitisingActionPerformed
        // TODO add your handling code here:
        
       
       int selectedRow = tbSanitising.getSelectedRow();
        
       if(selectedRow != -1){
           
           
           String id = tbSanitising.getValueAt(tbSanitising.getSelectedRow(), 0).toString();
           String dateIn = tbSanitising.getValueAt(tbSanitising.getSelectedRow(), 2).toString();
           String dateOut = tbSanitising.getValueAt(tbSanitising.getSelectedRow(), 3).toString();
           
           StaticData.reservedDate = dateIn;
           StaticData.id = id;
           StaticData.desiredDate = dateOut;

           FormUpdateSanitising fUS = new FormUpdateSanitising();
           fUS.setVisible(true);
           
           this.dispose();
       
           
       }
       else{
            
           JOptionPane.showMessageDialog(null, "Please select a value to update!");

       }
            
        
        
    }//GEN-LAST:event_btnUpdateSanitisingActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
        DefaultTableModel tableModel = (DefaultTableModel) tbSanitising.getModel();

        tableModel.fireTableDataChanged();
        
        
    }//GEN-LAST:event_formFocusGained

    private void btnCreateSanitisingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateSanitisingActionPerformed
        // TODO add your handling code here:
        
        
        this.dispose();
        
    }//GEN-LAST:event_btnCreateSanitisingActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        FormAdmin fA = new FormAdmin();
        fA.setVisible(true);
        
        this.dispose();
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
            java.util.logging.Logger.getLogger(FormSanitising.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSanitising.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSanitising.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSanitising.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new FormSanitising().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateSanitising;
    private javax.swing.JButton btnDeleteSanitising;
    private javax.swing.JButton btnUpdateSanitising;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblUser;
    private javax.swing.JTable tbSanitising;
    // End of variables declaration//GEN-END:variables
}
