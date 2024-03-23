package com.omega.ui;

import com.omega.dao.impl.StudentDaoImpl;
import com.omega.dao.StudentDao;
import com.omega.entity.Student;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class AddStudent extends javax.swing.JFrame {

    public AddStudent() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        isMarriedBg = new javax.swing.ButtonGroup();
        genderBg = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        idTf = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nameTf = new javax.swing.JTextField();
        feeTf = new javax.swing.JTextField();
        phoneTf = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Id");

        idTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTfActionPerformed(evt);
            }
        });

        addBtn.setText("Add!");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Gender");

        jLabel3.setText("Name");

        jLabel5.setText("Phone No.");

        jLabel6.setText("Married  ?");

        jLabel7.setText("Fees");

        nameTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTfActionPerformed(evt);
            }
        });

        isMarriedBg.add(jRadioButton1);
        jRadioButton1.setText("Yes");
        jRadioButton1.setActionCommand(jRadioButton1.getText());
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        isMarriedBg.add(jRadioButton2);
        jRadioButton2.setText("No");
        jRadioButton2.setActionCommand(jRadioButton2.getText());

        genderBg.add(jRadioButton3);
        jRadioButton3.setText("Male");
        jRadioButton3.setActionCommand("M");

        genderBg.add(jRadioButton4);
        jRadioButton4.setText("Female");
        jRadioButton4.setActionCommand("F");

        genderBg.add(jRadioButton5);
        jRadioButton5.setText("Others");
        jRadioButton5.setActionCommand("O");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(addBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                                    .addComponent(idTf, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nameTf, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(phoneTf)
                                    .addComponent(feeTf)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButton3)
                                .addGap(12, 12, 12)
                                .addComponent(jRadioButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton5)))))
                .addGap(153, 153, 153))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(feeTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton5))
                .addGap(61, 61, 61)
                .addComponent(addBtn)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTfActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        try {
            int id = Integer.parseInt(idTf.getText());
            String name = nameTf.getText();
            long phoneno = Long.parseLong(phoneTf.getText());
            double fee = Double.parseDouble(feeTf.getText());
            boolean isMarried = false;
            if (isMarriedBg.getSelection().getActionCommand().equals("Yes")) {
                isMarried = true;
            }
            if (isMarriedBg.getSelection().getActionCommand().equals("No")) {
                isMarried = false;
            }
            System.out.println(genderBg.getSelection().getActionCommand());
            char gender = genderBg.getSelection().getActionCommand().charAt(0);

            Student stu = new Student(id, name, phoneno, fee, isMarried, gender);
            StudentDao dao = new StudentDaoImpl();
            int rowsAffected = dao.addStudent(stu);
            if (rowsAffected > 0) {
                new JOptionPane().showMessageDialog(this, "Student Added Succesfully!! \n " + rowsAffected + " rows affected!", "Congrats!!", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException n) {
            new JOptionPane().showMessageDialog(this, "Pls fill all fields or \n input valid values!!", "Error!!", JOptionPane.ERROR_MESSAGE);
        } 
        catch (SQLException s) 
        {
            new JOptionPane().showMessageDialog(this, "Id Already Exist!!\n" + s.getLocalizedMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
        }
        this.dispose();
    }//GEN-LAST:event_addBtnActionPerformed

    private void nameTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTfActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField feeTf;
    private javax.swing.ButtonGroup genderBg;
    private javax.swing.JTextField idTf;
    private javax.swing.ButtonGroup isMarriedBg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JTextField nameTf;
    private javax.swing.JTextField phoneTf;
    // End of variables declaration//GEN-END:variables
}
