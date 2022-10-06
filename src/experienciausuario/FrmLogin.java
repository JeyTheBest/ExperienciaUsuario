/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experienciausuario;

import MetodosSQL.MetodosSQL;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import static javafx.scene.paint.Color.color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;



/**
 *
 * @author javie
 */
public class FrmLogin extends javax.swing.JFrame {

    /**
     * Creates new form FrmLogin
     */
    public FrmLogin() {
         
        initComponents();
        
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel6,"src/imagenes/UXx.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel5,"src/imagenes/usuario.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel7,"src/imagenes/candado.png");
        
        jButton1.setContentAreaFilled(false);
        jButton1.setOpaque(false);
        this.setLocationRelativeTo(null);
       
        
       // btnIngresar.setIcon(setIcon("/Imagenes/inicio.png", btnIngresar));
    }
    
   /* @Override
    public Image getIconImage(){
        
    Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("/src/imagenes/UXx.png"));
    return retValue;
}*/
    
    public final Icon setIcon(String url, JButton boton){
    
        ImageIcon icon = new ImageIcon( getClass().getResource(url));
        
        int ancho = boton.getWidth();
        int alto = boton.getHeight();
        
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho,alto,Image.SCALE_DEFAULT));
        
        return icono;
      
    }
MetodosSQL metodos = new MetodosSQL();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtContrasena = new javax.swing.JPasswordField();
        checkMostrarContrasena = new javax.swing.JCheckBox();
        btnRegistrar = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 204));
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 4, true));
        jPanel1.setForeground(new java.awt.Color(0, 51, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuario.setBackground(new java.awt.Color(153, 255, 255));
        txtUsuario.setForeground(new java.awt.Color(51, 51, 51));
        txtUsuario.setText("ingrese su usuario");
        txtUsuario.setBorder(null);
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusLost(evt);
            }
        });
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 220, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 220, 20));

        txtContrasena.setBackground(new java.awt.Color(153, 255, 255));
        txtContrasena.setForeground(new java.awt.Color(51, 51, 51));
        txtContrasena.setText("contraseña");
        txtContrasena.setBorder(null);
        txtContrasena.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContrasenaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContrasenaFocusLost(evt);
            }
        });
        jPanel1.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 220, 30));

        checkMostrarContrasena.setBackground(new java.awt.Color(255, 255, 255));
        checkMostrarContrasena.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        checkMostrarContrasena.setText("Mostrar contraseña");
        checkMostrarContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMostrarContrasenaActionPerformed(evt);
            }
        });
        jPanel1.add(checkMostrarContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, -1));

        btnRegistrar.setBackground(new java.awt.Color(0, 51, 153));
        btnRegistrar.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("No tienes cuenta? Registrate!");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 280, 40));

        btnIngresar.setBackground(new java.awt.Color(0, 51, 153));
        btnIngresar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Iniciar Sesión");
        btnIngresar.setBorder(null);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 280, 40));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 220, 20));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 280, 140));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 80, 50));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 80, 50));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Inicio de Sesión  ");
        jButton1.setBorder(null);
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 220, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 550));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

        
       String b_usuario = metodos.BuscarUsuarioRegistrado(txtUsuario.getText(), String.valueOf(txtContrasena.getPassword()));
       if(txtUsuario.getText().equals("root")&& String.valueOf(txtContrasena.getPassword()).equals("root")){
       JOptionPane.showMessageDialog(this, "Bienvenido como administrador");
       try{
       
       FrmModulos v = new FrmModulos(this, true);
       v.LbUser.setText("ADMINISTRADOR");
       v.setVisible(true);
       this.dispose();
       }catch(Exception e){
    e.printStackTrace();
    }
       
       
   }else if(b_usuario.equals("usuario encontrado")) {
       //String Buscar_Nombre = metodos.BuscarNombre(txtUsuario.getText());
       
       //JOptionPane.showMessageDialog(this, "Bienevido(a) \n"+Buscar_Nombre);
       try{
       
       FrmModulos v = new FrmModulos(this,true);
       FrmModulos.LbUser.setText(txtUsuario.getText());
      
       v.setVisible(true);
       this.dispose();
       }catch(Exception e){
    e.printStackTrace();
    }
       
       
   }else{
       JOptionPane.showMessageDialog(this, "Usuario no registrado");
   }
   
   
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void checkMostrarContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMostrarContrasenaActionPerformed
       if(checkMostrarContrasena.isSelected()){
           txtContrasena.setEchoChar((char)0);
           
       }else{
           txtContrasena.setEchoChar('*');
       }
    }//GEN-LAST:event_checkMostrarContrasenaActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        
        FrmRegistroUsuario ventana = new FrmRegistroUsuario(this,true);
        ventana.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
         
        if(txtUsuario.getText().trim().toLowerCase().equals("ingrese"+" "+"su"+" "+"usuario"))
        {
            txtUsuario.setText("");
            txtUsuario.setForeground(Color.black);
        }
        
        
    }//GEN-LAST:event_txtUsuarioFocusGained

    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
        if(txtUsuario.getText().trim().equals("") || 
                txtUsuario.getText().trim().toLowerCase().equals("ingrese"+" "+"su"+" "+"usuario"))
        {
            txtUsuario.setText("ingrese"+" "+"su"+" "+"usuario");
            txtUsuario.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtUsuarioFocusLost

    private void txtContrasenaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContrasenaFocusLost
        String pass = String.valueOf(txtContrasena.getPassword());

        if(pass.trim().equals("") ||
            pass.trim().toLowerCase().equals("contraseña"))
        {
            txtContrasena.setText("contraseña");
            txtContrasena.setForeground(new Color(153,153,153));

        }
    }//GEN-LAST:event_txtContrasenaFocusLost

    private void txtContrasenaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContrasenaFocusGained
        String pass = String.valueOf(txtContrasena.getPassword());

        if(pass.trim().toLowerCase().equals("contraseña"))
        {
            txtContrasena.setText("");
            txtContrasena.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtContrasenaFocusGained
    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new FrmLogin().setVisible(true);
            }
        });
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JCheckBox checkMostrarContrasena;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
