/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseGUI;

import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import com.mysql.jdbc.Statement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author sukalyan14
 */
public class ViewPerformance extends javax.swing.JFrame {
    
   

    /**
     * Creates new form ViewPerformance
     */
   

    public ViewPerformance() {
        initComponents();
        
        heading.setFont(new java.awt.Font(Essentials.fontURL,1,24));
        heading.setText(Essentials.messages.getString("viewStudentPerformance"));
        
        studentID.setFont(new java.awt.Font(Essentials.fontURL,1,18));
        studentID.setText(Essentials.messages.getString("studentID"));
        
        name.setFont(new java.awt.Font(Essentials.fontURL,1,18));
        name.setText(Essentials.messages.getString("name"));
        
        standard.setFont(new java.awt.Font(Essentials.fontURL,1,18));
        standard.setText(Essentials.messages.getString("standard"));
        
        subject.setFont(new java.awt.Font(Essentials.fontURL,1,18));
        subject.setText(Essentials.messages.getString("subject"));
        
        fromDate.setFont(new java.awt.Font(Essentials.fontURL,1,18));
        fromDate.setText(Essentials.messages.getString("fromDate"));
        
        toDate.setFont(new java.awt.Font(Essentials.fontURL,1,18));
        toDate.setText(Essentials.messages.getString("toDate"));
        
        submitButton.setFont(new java.awt.Font(Essentials.fontURL,1,18));
        submitButton.setText(Essentials.messages.getString("submit"));
        
        clearButton.setFont(new java.awt.Font(Essentials.fontURL,1,18));
        clearButton.setText(Essentials.messages.getString("clear"));
        
        backButton.setFont(new java.awt.Font(Essentials.fontURL,1,18));
        backButton.setText(Essentials.messages.getString("back"));
        
        String[] subject={"",Essentials.messages.getString("english"),Essentials.messages.getString("maths"),Essentials.messages.getString("science"),Essentials.messages.getString("hindi"),Essentials.messages.getString("computer"),Essentials.messages.getString("gk")};
       // String[] subject={"","English","Maths","Science","Hindi","Computer","GK"};
        String[] standard={"","1","2","3","4","5","6","7","8","9","10","11","12"};
        subjectField.setModel(new javax.swing.DefaultComboBoxModel(subject));
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
        name = new javax.swing.JLabel();
        subject = new javax.swing.JLabel();
        standard = new javax.swing.JLabel();
        fromDate = new javax.swing.JLabel();
        toDate = new javax.swing.JLabel();
        rollNumberField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        fromDateField = new javax.swing.JTextField();
        toDateField = new javax.swing.JTextField();
        subjectField = new javax.swing.JComboBox();
        standardField = new javax.swing.JComboBox();
        submitButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        heading.setFont(new java.awt.Font("TakaoPGothic", 1, 24)); // NOI18N
        heading.setText("View Performance of Students");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(heading)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(heading)
                .addGap(25, 25, 25))
        );

        studentID.setFont(new java.awt.Font("TakaoPGothic", 1, 18)); // NOI18N
        studentID.setText("Student ID:");

        name.setFont(new java.awt.Font("TakaoPGothic", 1, 18)); // NOI18N
        name.setText("Name:");

        subject.setFont(new java.awt.Font("TakaoPGothic", 1, 18)); // NOI18N
        subject.setText("Subject:");

        standard.setFont(new java.awt.Font("TakaoPGothic", 1, 18)); // NOI18N
        standard.setText("Standard:");

        fromDate.setFont(new java.awt.Font("TakaoPGothic", 1, 18)); // NOI18N
        fromDate.setText("From Date:");

        toDate.setFont(new java.awt.Font("TakaoPGothic", 1, 18)); // NOI18N
        toDate.setText("To Date:");

        rollNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollNumberFieldActionPerformed(evt);
            }
        });

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        subjectField.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(174, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(toDate)
                            .addComponent(fromDate)
                            .addComponent(subject)
                            .addComponent(name)
                            .addComponent(studentID)
                            .addComponent(standard))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fromDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subjectField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(standardField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rollNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(197, 197, 197))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(submitButton)
                        .addGap(28, 28, 28)
                        .addComponent(clearButton)
                        .addGap(28, 28, 28)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {fromDateField, nameField, rollNumberField, toDateField});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {backButton, clearButton, submitButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rollNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subjectField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subject))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(standardField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(standard, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fromDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fromDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(clearButton)
                    .addComponent(backButton))
                .addGap(78, 78, 78))
        );

        setSize(new java.awt.Dimension(810, 590));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void rollNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rollNumberFieldActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        
        if(Essentials.objTeacherOption==null)
        {
            Essentials.objTeacherOption=new TeacherOptions();
        }
        clearButtonActionPerformed(evt);
        Essentials.objTeacherOption.setVisible(true);
        Essentials.objViewPerformance.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
       try
        {
       
                                                   
            // TODO add your handling code here:
            
            
            // flag variable denotes whether AND should be concatenated before concatenating the next part of the query
            // signal will decide whether a bar chart is to be drawn or a table is to displayed
            // if signal value is 2, it means that roll numer/name and standard has been added and it is fine if a bar chart is displayed
            int flag=0,signal=0;
            
            String rollNumber=new String(rollNumberField.getText());
            String name=new String(nameField.getText());
            String subject=new String(subjectField.getSelectedItem().toString());
            String standard=new String(standardField.getSelectedItem().toString());
            String fromDate=new String(fromDateField.getText());
            String toDate=new String(toDateField.getText());
            
            
            // the parent query
            // further parts of the query and concatenated later
            String query=new String("SELECT * FROM student_performance WHERE");
            
            
            // checking whether the roll number field is filled by the user
            if(!rollNumber.equals(""))
            {
                query=query.concat(" roll_number LIKE '"+rollNumber+"'");
                flag=1;
                signal=1;
            }
            
            // Checking if 'name' field is filled by the user
            if(!name.equals(""))
            {
              
                String roll="";
                Statement nameQuery=(Statement)Essentials.databaseConnection.createStatement();
                String query1=new String("SELECT roll_number FROM student_info WHERE name like '"+name+"'");
                ResultSet res=(ResultSet) nameQuery.executeQuery(query1);
                res.next();
                roll=res.getString("roll_number");
                System.out.println(roll);
                
                if(flag==1)
                {
                    if(rollNumber.equals(roll))
                    {
                        System.out.println("Hello");
                        //query=query.concat(" roll_number LIKE '"+roll+"'");
                        signal=1;
                        
                    }
                    else
                    {
                        System.out.println("Roll and name are not equal!!");
                        throw new Exception("Roll and name not equal!!");
                    }
                    
                }
                else
                {
                    System.out.println("Not ok");
                    query=query.concat(" roll_number LIKE '"+roll+"'");
                    flag=1;
                    signal=1;
                }
                                
            } 
            
           
       
            // checking if the 'subject' has been chosen by the user
            if(!subject.equals(""))
            {
                if(flag==1)
                {
                    query=query.concat(" AND");
                }
                query=query.concat(" subject LIKE '"+subject+"'");
                flag=1;
                
            }
            
            
            
            // checking if the standard option has been selected by the user
            if(!standard.equals(""))
            {
                System.out.println("Standard is: "+signal);
                if(flag==1)
                {
                     query=query.concat(" AND");
                }
                query=query.concat(" standard LIKE '"+standard+"'");
                flag=1;
                signal++;
            }
            
            
            // if both dates are given then the query has to be done for a range
            if(!fromDate.equals("") && !toDate.equals(""))
            {
                    if(flag==1)
                    {
                            query=query.concat(" AND");
                    }
                    query=query.concat(" date between '"+fromDate+"' AND '"+toDate+"'");
            }
            
            // if From Date is given then the parameter is the lower value 
            else if(!fromDate.equals(""))
            {
                    if(flag==1)
                    {
                            query=query.concat(" AND");
                    }
                    query=query.concat(" date > '"+fromDate+"'");
            }
            
            // if To Date is given then the parameter is the higher value
            else if(!toDate.equals(""))
            {
                    if(flag==1)
                    {
                            query=query.concat(" AND");
                    }
                    query=query.concat(" date < '"+toDate+"'");
                    
            }
            
            System.out.println(query);   
            
            // if no field has been entered by the teacher

            
            // if signal=1, then only the roll number or the name or both have been inserted by the teacher for viewing the performace
            // if signal=2, then both standard and the above condition is satisfied and the method for drawing the bar graph will be called
            
            
            if(signal==2)
            {
                try 
                {
                    // calling the method for drawing, saving and finally displaying the bar graph
                    JavaChartDemo_1 obj=new JavaChartDemo_1();
                    obj.draw(rollNumber,standard,subject);
                }
                catch (SQLException ex) 
                {
                   // JOptionPane.showMessageDialog(this,generalServer.Util.messages.getString("pleaseTryAgain"));
                }
            }
            
            else
            {
                ResultSet res;
                try 
                {
                    Statement start=(Statement)Essentials.databaseConnection.createStatement();
                    res = (ResultSet)start.executeQuery(query);
                    ViewPerformanceInTable obj=new ViewPerformanceInTable();
                    obj.displayRecord(null, res);
                    if(res.next())
                    {
                        System.out.println("Yes!!");                
                    }
                    else
                    {
                        System.out.println("No!!");
                    }
                }
                catch (SQLException ex) 
                {
                    JOptionPane.showMessageDialog(this,Essentials.messages.getString("pleaseEnterOneField"));
                    clearButtonActionPerformed(evt);
                }
            }
        }
        catch(Exception e)
        {
            //JOptionPane.showMessageDialog(this,Util.messages.getString("pleaseTryAgain"));
            JOptionPane.showMessageDialog(this,Essentials.messages.getString("rollAndNameSame"));
            clearButtonActionPerformed(evt);
        }
        
             
          
    }//GEN-LAST:event_submitButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        rollNumberField.setText("");
        nameField.setText("");
        subjectField.setSelectedIndex(0);
        standardField.setSelectedIndex(0);
        fromDateField.setText("");
        toDateField.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void standardFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standardFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_standardFieldActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel fromDate;
    private javax.swing.JTextField fromDateField;
    private javax.swing.JLabel heading;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField rollNumberField;
    private javax.swing.JLabel standard;
    private javax.swing.JComboBox standardField;
    private javax.swing.JLabel studentID;
    private javax.swing.JLabel subject;
    private javax.swing.JComboBox subjectField;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel toDate;
    private javax.swing.JTextField toDateField;
    // End of variables declaration//GEN-END:variables
}
