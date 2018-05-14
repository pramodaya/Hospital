/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.reception;

import hospital.*;
import java.awt.Toolkit;

/**
 *
 * @author pramodaya jayalath
 */
public class reception_page extends javax.swing.JFrame {

    /**
     * Creates new form reception_page
     */
    public reception_page() {
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
        btnpatientinformation = new javax.swing.JButton();
        btndischarge = new javax.swing.JButton();
        btnpatientregisteration = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnmarkattendence1 = new javax.swing.JButton();
        btnlogoff = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(null);

        btnpatientinformation.setBackground(new java.awt.Color(51, 255, 102));
        btnpatientinformation.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnpatientinformation.setText("Patient Information");
        btnpatientinformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpatientinformationActionPerformed(evt);
            }
        });
        jPanel1.add(btnpatientinformation);
        btnpatientinformation.setBounds(90, 340, 350, 60);

        btndischarge.setBackground(new java.awt.Color(51, 255, 102));
        btndischarge.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btndischarge.setText("Discharge");
        btndischarge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndischargeActionPerformed(evt);
            }
        });
        jPanel1.add(btndischarge);
        btndischarge.setBounds(90, 530, 350, 60);

        btnpatientregisteration.setBackground(new java.awt.Color(51, 255, 102));
        btnpatientregisteration.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnpatientregisteration.setText("Patient Registration");
        btnpatientregisteration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpatientregisterationActionPerformed(evt);
            }
        });
        jPanel1.add(btnpatientregisteration);
        btnpatientregisteration.setBounds(90, 240, 350, 60);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("UCLA Medical Center");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(230, 70, 440, 80);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/img/C--fakepath-CoolClips_vc019694.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(760, 200, 510, 460);

        btnmarkattendence1.setBackground(new java.awt.Color(51, 255, 102));
        btnmarkattendence1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnmarkattendence1.setText("Mark Attendence");
        btnmarkattendence1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmarkattendence1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnmarkattendence1);
        btnmarkattendence1.setBounds(90, 440, 350, 60);

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/img/spring_bokeh_vivid_green-wallpaper-1366x768.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1366, 768);

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

    private void btnpatientregisterationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpatientregisterationActionPerformed
        //dispose this and go to patient registratin frame:
        this.dispose();
        patient_registration_frame patientregistration=new patient_registration_frame();
        patientregistration.setVisible(true);
    }//GEN-LAST:event_btnpatientregisterationActionPerformed

    private void btnpatientinformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpatientinformationActionPerformed
        // dispose this and go to patient information frame:
        this.dispose();
        show_patient_information p_information= new show_patient_information();
        p_information.setVisible(true);
        
    }//GEN-LAST:event_btnpatientinformationActionPerformed

    private void btndischargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndischargeActionPerformed
        // hide this and go to patint discharge frame:
        this.hide();
        patient_discharge patientdischarge =new patient_discharge();
        patientdischarge.setVisible(true);
    }//GEN-LAST:event_btndischargeActionPerformed

    private void btnlogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoffActionPerformed
        // hide this and go to login frame:
        this.hide();
        Login log=new Login();
        log.setVisible(true);
    }//GEN-LAST:event_btnlogoffActionPerformed

    private void btnmarkattendence1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmarkattendence1ActionPerformed
        //hide this and go to mark_attendence frame:
        this.hide();
        mark_attendence attend=new mark_attendence();
        attend.setVisible(true);
    }//GEN-LAST:event_btnmarkattendence1ActionPerformed

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
            java.util.logging.Logger.getLogger(reception_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reception_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reception_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reception_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reception_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndischarge;
    private javax.swing.JButton btnlogoff;
    private javax.swing.JButton btnmarkattendence1;
    private javax.swing.JButton btnpatientinformation;
    private javax.swing.JButton btnpatientregisteration;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
