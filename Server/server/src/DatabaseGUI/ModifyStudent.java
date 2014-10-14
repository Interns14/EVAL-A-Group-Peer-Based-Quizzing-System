/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DatabaseGUI;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author sukalyan
 */
public class ModifyStudent extends javax.swing.JFrame {
    
    

    /**
     * Creates new form ModifyStudent
     */
    

    
     public ModifyStudent() 
     {
        initComponents();
        
        heading.setFont(new java.awt.Font(Essentials.fontURL,1,24));
        heading.setText(Essentials.messages.getString("modifyStudent"));
        
        studentID.setFont(new java.awt.Font(Essentials.fontURL,1,18));
        studentID.setText(Essentials.messages.getString("studentID"));
        
        standard.setFont(new java.awt.Font(Essentials.fontURL,1,18));
        standard.setText(Essentials.messages.getString("standard"));
        
        newPassword.setFont(new java.awt.Font(Essentials.fontURL,1,18));
        newPassword.setText(Essentials.messages.getString("newPassword"));
        
        
        submitButton.setFont(new java.awt.Font(Essentials.fontURL,1,18));
        submitButton.setText(Essentials.messages.getString("submit"));
        
        clearButton.setFont(new java.awt.Font(Essentials.fontURL,1,18));
        clearButton.setText(Essentials.messages.getString("clear"));
        
        backButton.setFont(new java.awt.Font(Essentials.fontURL,1,18));
        backButton.setText(Essentials.messages.getString("back"));
        
        
        String[] standard={"","1","2","3","4","5","6","7","8","9","10","11","12"};
        
        // populating the choices for the standard drop down
        standardField.setModel(new javax.swing.DefaultComboBoxModel(standard));

        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        heading = new javax.swing.JLabel();
        studentID = new javax.swing.JLabel();
        standard = new javax.swing.JLabel();
        newPassword = new javax.swing.JLabel();
        studentIDField = new javax.swing.JTextField();
        newPasswordField = new javax.swing.JTextField();
        standardField = new javax.swing.JComboBox();
        submitButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        heading.setFont(new java.awt.Font("TakaoPGothic", 1, 24)); // NOI18N
        heading.setText("Modify Student Details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(heading)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(heading)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        studentID.setFont(new java.awt.Font("TakaoPGothic", 1, 18)); // NOI18N
        studentID.setText("Student ID:");

        standard.setFont(new java.awt.Font("TakaoPGothic", 1, 18)); // NOI18N
        standard.setText("Standard:");

        newPassword.setFont(new java.awt.Font("TakaoPGothic", 1, 18)); // NOI18N
        newPassword.setText("New Password:");

        newPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPasswordFieldActionPerformed(evt);
            }
        });

        standardField.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        standardField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standardFieldActionPerformed(evt);
            }
        });

        submitButton.setFont(new java.awt.Font("TakaoPGothic", 1, 18)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        clearButton.setFont(new java.awt.Font("TakaoPGothic", 1, 18)); // NOI18N
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("TakaoPGothic", 1, 18)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(standard, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(studentID, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(newPassword, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(newPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(standardField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(studentIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(clearButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(backButton)
                .addGap(111, 111, 111))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {newPasswordField, studentIDField});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {backButton, clearButton, submitButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentID)
                    .addComponent(studentIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(standard)
                    .addComponent(standardField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPassword)
                    .addComponent(newPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(clearButton)
                    .addComponent(backButton))
                .addGap(0, 116, Short.MAX_VALUE))
        );

        setBounds(0, 0, 810, 590);
    }// </editor-fold>//GEN-END:initComponents

    private void newPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newPasswordFieldActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        
        studentIDField.setText("");
        standardField.setSelectedIndex(0);
        newPasswordField.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        if(Essentials.objConfigureStudent==null)
        {
            Essentials.objConfigureStudent=new ConfigureStudents();
        }
        Essentials.objConfigureStudent.setVisible(true);
        Essentials.objModifyStudent.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        
        String rollNumber=studentIDField.getText();
        String std=new String(standardField.getSelectedItem().toString());
        String newPass=newPasswordField.getText();
        
        if(rollNumber.equals("") || std.equals("") || newPass.equals(""))
        {
           JOptionPane.showMessageDialog(this,Essentials.messages.getString("updateFailure"));
           clearButtonActionPerformed(evt);
        }
        else
        {
            try 
            {
                Statement start=(Statement)Essentials.databaseConnection.createStatement();
                String query=new String("UPDATE student_info SET password='"+newPassword+"' WHERE roll_number LIKE '"+rollNumber+"' AND std LIKE '"+standard+"'");
                int res=start.executeUpdate(query);
                if(res==0)
                {
                    JOptionPane.showMessageDialog(this,Essentials.messages.getString("updateFailure"));
                    clearButtonActionPerformed(evt);
                }
                else
                {
                    JOptionPane.showMessageDialog(this,Essentials.messages.getString("updateSuccessful"));
                    
                    clearButtonActionPerformed(evt);                 
                }
            } 
            catch (SQLException ex) 
            {
                JOptionPane.showMessageDialog(this,Essentials.messages.getString("updateFailure"));
                clearButtonActionPerformed(evt);
            }
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void standardFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standardFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_standardFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel heading;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel newPassword;
    private javax.swing.JTextField newPasswordField;
    private javax.swing.JLabel standard;
    private javax.swing.JComboBox standardField;
    private javax.swing.JLabel studentID;
    private javax.swing.JTextField studentIDField;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}