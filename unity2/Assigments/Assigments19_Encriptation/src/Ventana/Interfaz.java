/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

import Coleccion.Usuario;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2User = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldUsser = new javax.swing.JTextField();
        jPasswordPassword = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1fondo = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));
        getContentPane().add(jLabel2User, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USUARIO:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 130, 160));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PASSWORD: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jTextFieldUsser.setBackground(new java.awt.Color(0, 0, 51));
        jTextFieldUsser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldUsser.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextFieldUsser, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 190, 30));

        jPasswordPassword.setBackground(new java.awt.Color(0, 0, 51));
        jPasswordPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPasswordPassword.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordPasswordActionPerformed(evt);
            }
        });
        jPasswordPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordPasswordKeyPressed(evt);
            }
        });
        getContentPane().add(jPasswordPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 190, 30));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("INICIAR SECION ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 51));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 120, 20));

        jLabel1fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/blue-wallpaper-25.jpg"))); // NOI18N
        jLabel1fondo.setFocusable(false);
        jLabel1fondo.setName(""); // NOI18N
        jLabel1fondo.setOpaque(true);
        getContentPane().add(jLabel1fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPasswordPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordPasswordActionPerformed
        
    }//GEN-LAST:event_jPasswordPasswordActionPerformed

    private void jPasswordPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordPasswordKeyPressed
        
        int var = evt.getKeyCode();
        
        if(var == KeyEvent.VK_ENTER){
            String User = jTextFieldUsser.getText();
            String password = jPasswordPassword.getText();
            
            Usuario u = new Usuario();
           
            JOptionPane.showMessageDialog(null, "Usuario: " + User + "\nPassword: " + u.MD5(password));
            
        }
        
    }//GEN-LAST:event_jPasswordPasswordKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String password = " ";
        String jTextField = jTextFieldUsser.getText();
        int ascii;
        for (int x = 0; x < jTextField.length(); x++) {
            //System.out.println(jTextField.charAt(x) + " = " + jTextField.codePointAt(x));
            ascii = (int) jTextField.charAt(x);
            //System.out.println(ascii + 1);
            char c = (char) (ascii + 1);
            password = password + c;

        };
        jPasswordPassword.setText(password);
        jLabel5.setText(password);
        File estudiante = new File("Password.csv");
        if (!estudiante.exists()) {
            try {
                estudiante.createNewFile();

                PrintWriter mostrar;
                try (FileWriter escribir = new FileWriter(estudiante, true)) {
                    mostrar = new PrintWriter(escribir);
                    mostrar.println("La contraseña encriptada es: " + password);
                }
                mostrar.close();
            } catch (IOException ex) {
            }

        } else {
            try {
                //arch.createNewFile();

                PrintWriter mostrar;
                try (FileWriter escribir = new FileWriter(estudiante, true)) {
                    mostrar = new PrintWriter(escribir);
                    mostrar.println("La contraseña encriptada es: " + password);

                }
                mostrar.close();
            } catch (IOException ex) {
            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1fondo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2User;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordPassword;
    private javax.swing.JTextField jTextFieldUsser;
    // End of variables declaration//GEN-END:variables
}