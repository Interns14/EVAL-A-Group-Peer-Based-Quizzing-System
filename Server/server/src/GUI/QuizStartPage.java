/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import com.example.networkPacketFormats.Quiz;

/**
 *
 * @author vamshi
 */
public class QuizStartPage extends javax.swing.JFrame{

    /**
     * Creates new form QuizStartPage
     */
    public QuizStartPage(Quiz q){
        initComponents();
        quiz = q;
        fieldsEntered = false;
        
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
        noOfStudentsinGroupField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        noOfGroupsField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        noOfStudentsinClassField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        standardField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        roundsBox = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome to Quiz!");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(171, 105, 105));
        setFont(new java.awt.Font("Abyssinica SIL", 0, 48)); // NOI18N
        setForeground(new java.awt.Color(189, 172, 172));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        submitButton.setBackground(new java.awt.Color(253, 253, 218));
        submitButton.setFont(new java.awt.Font("TakaoPGothic", 1, 18)); // NOI18N
        submitButton.setForeground(new java.awt.Color(1, 1, 1));
        submitButton.setText("SUBMIT");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("TakaoPGothic", 1, 18)); // NOI18N
        jLabel5.setText("Enter the number of students in each group");

        noOfGroupsField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noOfGroupsFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("TakaoPGothic", 1, 18)); // NOI18N
        jLabel4.setText("Enter the number of groups");

        noOfStudentsinClassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noOfStudentsinClassFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("TakaoPGothic", 1, 18)); // NOI18N
        jLabel3.setText("Enter the number of students in the class");

        standardField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standardFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("TakaoPGothic", 1, 18)); // NOI18N
        jLabel1.setText("Enter the standard");

        jLabel2.setFont(new java.awt.Font("TakaoPGothic", 1, 24)); // NOI18N
        jLabel2.setText("Welcome to the Quiz");

        jLabel6.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 18)); // NOI18N
        jLabel6.setText("Enter no of rounds : ");

        roundsBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundsBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(standardField, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(noOfStudentsinClassField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(177, 177, 177)
                                        .addComponent(noOfGroupsField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(noOfStudentsinGroupField, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                    .addComponent(roundsBox))))))
                .addGap(103, 103, 103))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(standardField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(noOfStudentsinClassField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(noOfGroupsField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(noOfStudentsinGroupField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roundsBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 530));

        setSize(new java.awt.Dimension(810, 560));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        try
        {
            noOfGroups = Byte.parseByte(noOfGroupsField.getText());
            noOfStudentsInGroup = Byte.parseByte(noOfStudentsinGroupField.getText());
            standardOfClass = standardField.getText();
            noOfStudentsInClass = Byte.parseByte(noOfStudentsinClassField.getText());
            noOfRounds = Byte.parseByte(roundsBox.getText());
        }
        catch( NumberFormatException ne )
        {
            /*
            Clear the fields
            */
            noOfGroupsField.setText("");
            noOfStudentsinGroupField.setText("");
            noOfStudentsinClassField.setText("");
            standardField.setText("");
            return;
        }
        /*
        Entered Parameters are correct
        */
        fieldsEntered = true;
    }//GEN-LAST:event_submitButtonActionPerformed

    public byte getGroups()
    {
        return noOfGroups;
    }
    
     public byte getRounds()
    {
        return noOfRounds;
    }
    
    public byte getStudentsInGroup()
    {
        return noOfStudentsInGroup;
    }
    
    public String getStandard()
    {
        return standardOfClass;
    }
    
    public byte getStudents()
    {
        return noOfStudentsInClass;
    }
    
    private void standardFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standardFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_standardFieldActionPerformed

    private void noOfStudentsinClassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noOfStudentsinClassFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noOfStudentsinClassFieldActionPerformed

    private void noOfGroupsFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noOfGroupsFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noOfGroupsFieldActionPerformed

    private void roundsBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundsBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roundsBoxActionPerformed

    public String standardOfClass;
    public byte noOfStudentsInClass;
    public byte noOfGroups;
    public byte noOfStudentsInGroup;
    private Quiz quiz;
    public boolean fieldsEntered;
    public byte noOfRounds;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField noOfGroupsField;
    private javax.swing.JTextField noOfStudentsinClassField;
    private javax.swing.JTextField noOfStudentsinGroupField;
    private javax.swing.JTextField roundsBox;
    private javax.swing.JTextField standardField;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}