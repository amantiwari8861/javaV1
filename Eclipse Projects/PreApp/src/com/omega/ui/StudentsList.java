package com.omega.ui;

import java.sql.ResultSetMetaData;
import com.omega.dao.StudentDao;
import com.omega.dao.impl.StudentDaoImpl;
import com.omega.entity.Student;
import java.awt.Dimension;
import java.net.URL;
import java.sql.SQLException;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.ImageIcon;

public class StudentsList extends javax.swing.JFrame {

    ResultSetMetaData rsmd;
    StudentDao dao;

    public StudentsList() {
        URL url = getClass().getResource("/img/logo.png");
        ImageIcon img = new ImageIcon(url);
        this.setIconImage(img.getImage());
        this.setTitle("All Users");
        dao = new StudentDaoImpl();
        initComponents();
        initTable();
    }

    private void initTable() {
        List<Student> allStudents = dao.getAllStudents();
        rsmd = dao.getRSMD();

        // Create a TableModel to hold the data
        DefaultTableModel tableModel = new DefaultTableModel();

        // Add columns from ResultSetMetaData
        try {
            int columnCount = rsmd.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                tableModel.addColumn(rsmd.getColumnName(i));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Add rows from the list of Student objects
        for (Student student : allStudents) {
            Object[] rowData = {student.getStudId(), student.getName(), student.getPhoneNo(), student.getFee(), student.isIsMarried(), student.getGender()};
            tableModel.addRow(rowData);
        }
        allStudentsTable.setModel(tableModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        allStudentsTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("All Students List!");

        allStudentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(allStudentsTable);

        jButton1.setText("refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jButton1)))
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        initTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable allStudentsTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
