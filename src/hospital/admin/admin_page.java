/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.admin;

import hospital.Login;


import hospital.reception.show_patient_information;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author pramodaya jayalath
 */
public class admin_page extends javax.swing.JFrame {

    /**
     * Creates new form admin_page
     */
    public admin_page() {
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

        jPanel1 = new javax.swing.JPanel();
        btnshowemployeedetails = new javax.swing.JButton();
        btnaddemployee = new javax.swing.JButton();
        btnpatientregistrarion = new javax.swing.JButton();
        btnpatientinformation = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btncreatesalary = new javax.swing.JButton();
        btnmarkattendence = new javax.swing.JButton();
        btnlogoff = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btndischargepatient = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setSize(new java.awt.Dimension(1366, 768));

        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(null);

        btnshowemployeedetails.setBackground(new java.awt.Color(102, 255, 102));
        btnshowemployeedetails.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnshowemployeedetails.setText("Show Employee Details");
        btnshowemployeedetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowemployeedetailsActionPerformed(evt);
            }
        });
        jPanel1.add(btnshowemployeedetails);
        btnshowemployeedetails.setBounds(30, 520, 270, 70);

        btnaddemployee.setBackground(new java.awt.Color(102, 255, 102));
        btnaddemployee.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnaddemployee.setText("Add Employees");
        btnaddemployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddemployeeActionPerformed(evt);
            }
        });
        jPanel1.add(btnaddemployee);
        btnaddemployee.setBounds(30, 430, 270, 70);

        btnpatientregistrarion.setBackground(new java.awt.Color(102, 255, 102));
        btnpatientregistrarion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnpatientregistrarion.setText("Patient Registration");
        btnpatientregistrarion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpatientregistrarionActionPerformed(evt);
            }
        });
        jPanel1.add(btnpatientregistrarion);
        btnpatientregistrarion.setBounds(30, 70, 270, 70);

        btnpatientinformation.setBackground(new java.awt.Color(102, 255, 102));
        btnpatientinformation.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnpatientinformation.setText("Patient Information");
        btnpatientinformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpatientinformationActionPerformed(evt);
            }
        });
        jPanel1.add(btnpatientinformation);
        btnpatientinformation.setBounds(30, 160, 270, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/img/hos3.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(430, 210, 700, 460);

        btncreatesalary.setBackground(new java.awt.Color(102, 255, 102));
        btncreatesalary.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btncreatesalary.setText("Create Salary");
        btncreatesalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreatesalaryActionPerformed(evt);
            }
        });
        jPanel1.add(btncreatesalary);
        btncreatesalary.setBounds(30, 610, 270, 70);

        btnmarkattendence.setBackground(new java.awt.Color(102, 255, 102));
        btnmarkattendence.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnmarkattendence.setText("Mark Attendence");
        btnmarkattendence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmarkattendenceActionPerformed(evt);
            }
        });
        jPanel1.add(btnmarkattendence);
        btnmarkattendence.setBounds(30, 340, 270, 70);

        btnlogoff.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnlogoff.setForeground(new java.awt.Color(255, 0, 0));
        btnlogoff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/img/13165939071654987882logout-md.png"))); // NOI18N
        btnlogoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoffActionPerformed(evt);
            }
        });
        jPanel1.add(btnlogoff);
        btnlogoff.setBounds(1250, 30, 70, 70);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("UCLA Medical Center");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(450, 30, 500, 90);

        btndischargepatient.setBackground(new java.awt.Color(102, 255, 102));
        btndischargepatient.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btndischargepatient.setText("Discharge Patients");
        btndischargepatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndischargepatientActionPerformed(evt);
            }
        });
        jPanel1.add(btndischargepatient);
        btndischargepatient.setBounds(30, 250, 270, 70);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/img/green_background_2-wallpaper-1366x768.jpg"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, -30, 1370, 770);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/img/green_background_2-wallpaper-1366x768.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1370, 770);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnpatientregistrarionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpatientregistrarionActionPerformed
        // dispose this and go to patient registration frame:
        this.dispose();
        patient_registration_admin_frame p_registration =new patient_registration_admin_frame();
        p_registration.setVisible(true);
    }//GEN-LAST:event_btnpatientregistrarionActionPerformed

    private void btnaddemployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddemployeeActionPerformed
        // dispose this and go to employee registration admin frame:
        this.dispose();
        employee_registration_admin_frame emp_reg_frame=new employee_registration_admin_frame();
        emp_reg_frame.setVisible(true);
    
    }//GEN-LAST:event_btnaddemployeeActionPerformed

    private void btnpatientinformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpatientinformationActionPerformed
        // dispose this and go to patient information frame:
        this.dispose();
        show_patient_information_admin showpatientinformation=new show_patient_information_admin();
        showpatientinformation.setVisible(true);
    }//GEN-LAST:event_btnpatientinformationActionPerformed

    private void btnshowemployeedetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowemployeedetailsActionPerformed
        // dispose this and go to show employee details frame:
        this.dispose();
        show_employee_information employeeinformation=new show_employee_information();
        employeeinformation.setVisible(true);
        
    
    }//GEN-LAST:event_btnshowemployeedetailsActionPerformed

    private void btncreatesalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreatesalaryActionPerformed
        // hide this and go to create salary frame:
        this.hide();
        create_salary_admin salary=new create_salary_admin();
        salary.setVisible(true);
    }//GEN-LAST:event_btncreatesalaryActionPerformed

    private void btnmarkattendenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmarkattendenceActionPerformed
        // hide this and go to mark_attendence frame:
        this.hide();
        mark_attendence_admin attendence=new mark_attendence_admin();
        attendence.setVisible(true);
    }//GEN-LAST:event_btnmarkattendenceActionPerformed

    private void btnlogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoffActionPerformed
        // hide this and go to login frame with logout :
        this.hide();
        Login log=new Login();
        log.setVisible(true);
    }//GEN-LAST:event_btnlogoffActionPerformed

    private void btndischargepatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndischargepatientActionPerformed
        //hide this and go to patient_discharge_admin frame:
        this.hide();
        patient_discharge_admin discharge=new patient_discharge_admin();
        discharge.setVisible(true);
    }//GEN-LAST:event_btndischargepatientActionPerformed

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
            java.util.logging.Logger.getLogger(admin_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //show this frame
                new admin_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddemployee;
    private javax.swing.JButton btncreatesalary;
    private javax.swing.JButton btndischargepatient;
    private javax.swing.JButton btnlogoff;
    private javax.swing.JButton btnmarkattendence;
    private javax.swing.JButton btnpatientinformation;
    private javax.swing.JButton btnpatientregistrarion;
    private javax.swing.JButton btnshowemployeedetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}