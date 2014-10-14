/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseGUI;

import com.mysql.jdbc.Connection;

/**
 *
 * @author sukalyan14
 */
public class ConfigureStudents extends javax.swing.JFrame {

   
    /**
     * Creates new form ConfigureStudents
     */
    public ConfigureStudents() {
        initComponents();
        
        heading.setFont(new java.awt.Font(Essentials.fontURL,1,24));
        heading.setText(Essentials.messages.getString("configureStudentDetails"));
        
        addStudentButton.setFont(new java.awt.Font(Essentials.fontURL,1,18));
        addStudentButton.setText(Essentials.messages.getString("addNewStudent"));
        
        modifyStudentButton.setFont(new java.awt.Font(Essentials.fontURL,1,18));
        modifyStudentButton.setText(Essentials.messages.getString("modifyStudent"));
        
        viewStudentButton.setFont(new java.awt.Font(Essentials.fontURL,1,18));
        viewStudentButton.setText(Essentials.messages.getString("viewStudent"));
        
        backButton.setFont(new java.awt.Font(Essentials.fontURL,1,18));
        backButton.setText(Essentials.messages.getString("back"));
               
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
        addStudentButton = new javax.swing.JButton();
        modifyStudentButton = new javax.swing.JButton();
        viewStudentButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        heading.setFont(new java.awt.Font("TakaoPGothic", 1, 24)); // NOI18N
        heading.setText("Configure Student Details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(215, Short.MAX_VALUE)
                .addComponent(heading)
                .addGap(237, 237, 237))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(heading)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        addStudentButton.setFont(new java.awt.Font("TakaoPGothic", 1, 18)); // NOI18N
        addStudentButton.setText("Add a new Student");
        addStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentButtonActionPerformed(evt);
            }
        });

        modifyStudentButton.setFont(new java.awt.Font("TakaoPGothic", 1, 18)); // NOI18N
        modifyStudentButton.setText("Modify Student Details");
        modifyStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyStudentButtonActionPerformed(evt);
            }
        });

        viewStudentButton.setFont(new java.awt.Font("TakaoPGothic", 1, 18)); // NOI18N
        viewStudentButton.setText("View Student Details");
        viewStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewStudentButtonActionPerformed(evt);
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
            .addGroup(layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewStudentButton)
                    .addComponent(modifyStudentButton)
                    .addComponent(addStudentButton))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addStudentButton, modifyStudentButton, viewStudentButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(addStudentButton)
                .addGap(29, 29, 29)
                .addComponent(modifyStudentButton)
                .addGap(28, 28, 28)
                .addComponent(viewStudentButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(backButton)
                .addGap(125, 125, 125))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-800)/2, (screenSize.height-560)/2, 800, 560);
    }// </editor-fold>//GEN-END:initComponents

    private void addStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentButtonActionPerformed
        // TODO add your handling code here:
        
        if(Essentials.objAddStudent==null)
        {
            Essentials.objAddStudent=new AddStudent();
        }
        Essentials.objConfigureStudent.setVisible(false);
        Essentials.objAddStudent.setVisible(true);
    }//GEN-LAST:event_addStudentButtonActionPerformed

    private void modifyStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyStudentButtonActionPerformed
        // TODO add your handling code here:
        
        if( Essentials.objModifyStudent==null)
        {
            Essentials.objModifyStudent=new ModifyStudent();
        }
        Essentials.objModifyStudent.setVisible(true);
        Essentials.objConfigureStudent.setVisible(false);
    }//GEN-LAST:event_modifyStudentButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        if(Essentials.objTeacherOption==null)
        {
            Essentials.objTeacherOption=new TeacherOptions();
        }
        Essentials.objTeacherOption.setVisible(true);
        Essentials.objConfigureStudent.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void viewStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewStudentButtonActionPerformed
        // TODO add your handling code here:
        if(Essentials.objViewStudentDetails==null)
        {
            Essentials.objViewStudentDetails=new ViewStudentDetails();
        }
        Essentials.objViewStudentDetails.setVisible(true);
        Essentials.objConfigureStudent.setVisible(false);
    }//GEN-LAST:event_viewStudentButtonActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStudentButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel heading;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton modifyStudentButton;
    private javax.swing.JButton viewStudentButton;
    // End of variables declaration//GEN-END:variables
}
