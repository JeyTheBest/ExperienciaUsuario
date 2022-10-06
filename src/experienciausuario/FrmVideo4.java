/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experienciausuario;

import static experienciausuario.FrmVideo.JLUsuario;
import static experienciausuario.FrmVideo3.JLNotaM1;
import static experienciausuario.FrmVideo3.JLNotaM2;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author javie
 */
public class FrmVideo4 extends javax.swing.JFrame {
    int Posicion =0;
    String NumeroVideo =null;
    JFXPanel jfxPanel1 = new JFXPanel();  
    JFXPanel jfxPanel2 = new JFXPanel();  
    JFXPanel jfxPanel3 = new JFXPanel();
    JFXPanel jfxPanel4 = new JFXPanel();
    JFXPanel jfxPanel5 = new JFXPanel();

    public static MediaPlayer oracleVid1;
    public static MediaPlayer oracleVid2;
    public static MediaPlayer oracleVid3;
    public static MediaPlayer oracleVid4;
    public static MediaPlayer oracleVid5;
    
    public FrmVideo4() {
        
        //JbMax.setEnabled(false);
        
        initComponents();
        
       
       
        jTabbedPane1.setSelectedIndex(1);
        JBVideo1.setEnabled(true);
        
        
        JBVideo6.setEnabled(false);
        
        setLocationRelativeTo(null);
        //setTitle("Java Swing Video con FX");
        setResizable(false);
        //setLocationRelativeTo(null);
        JBVideo1.setOpaque(false);
        JBVideo1.setContentAreaFilled(false);
        JBVideo1.setBorderPainted(false);
        
       
        
        
        
     
        
        JBVideo6.setOpaque(false);
        JBVideo6.setContentAreaFilled(false);
        JBVideo6.setBorderPainted(false);
        
        
     
        createScene1();
        
        
        
        JPanelVideo1.setLayout(new BorderLayout());
        JPanelVideo1.add(jfxPanel1,BorderLayout.CENTER); 
        
        
        
        JPanelVideo4.setLayout(new BorderLayout());
        JPanelVideo4.add(jfxPanel4,BorderLayout.CENTER);
        
        
       
        
       
        
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel1,"src/imagenes/video1.png");
        
        rsscalelabel.RSScaleLabel.setScaleLabel(JLExamen,"src/imagenes/examen.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(JLLogo,"src/imagenes/videologo.png");
        
        rsscalelabel.RSScaleLabel.setScaleLabel(JLVolumen3,"src/imagenes/volumen.png");
        
       rsscalelabel.RSScaleLabel.setScaleLabel(JLPlay,"src/imagenes/play.png");
        JBPlay1.setContentAreaFilled(false);
        rsscalelabel.RSScaleLabel.setScaleLabel(JLPause,"src/imagenes/pause.png");
        JBPause1.setContentAreaFilled(false);
        
        
        
       
        
        
        
    }
    public final Icon setIcon(String url, JButton boton){
    
        ImageIcon icon = new ImageIcon( getClass().getResource(url));
        
        int ancho = boton.getWidth();
        int alto = boton.getHeight();
        
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho,alto,Image.SCALE_DEFAULT));
        
        return icono;
      
    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    private void createScene1(){
        Platform.runLater(new Runnable() {
             @Override
             public void run() {  
                    
                    File file = new File("src/videos/M4 Video 1.mp4");                                  
                    oracleVid1 = new MediaPlayer(new Media(file.toURI().toString()) );
                  
                    jfxPanel1.setScene(new Scene(new Group(new MediaView(oracleVid1))));  
                    
                    oracleVid1.setVolume(0);//volumen
                    oracleVid1.play();
             }
        });   asiganarTiempo1() ; 
    }
    
  
   
    
    
    
    
    
 
    
 void asiganarTiempo1() {
        try {
            Thread.sleep(1000);
           
            double sec = oracleVid1.getTotalDuration().toSeconds();
            int val = (int) sec;
      
            Slider1.setMaximum(val);

            JLTiempoTotal1.setText(obtenerMinutos(val) + "");
            hilo.start();
         
        } catch (InterruptedException ex) {
            Logger.getLogger(FrmVideo4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
 
 
 
    
 
 
 
  
 
 
 
    
 
 public void actualizarBarraYTiempo1() {

        double sec = oracleVid1.getCurrentTime().toSeconds();
        int val = (int) sec;
        Slider1.setValue(val);

        JLTiempo1.setText(obtenerMinutos(val));
        
        
        if(JLTiempo1.getText().equals(JLTiempoTotal1.getText())){
            JBVideo6.setEnabled(true);
        oracleVid1.seek(oracleVid1.getStartTime());
        
        }
        
    }
 
 
 

 
 


    
    public String obtenerMinutos(int val) {
        int horas = 0;
        int minutos = 0;

        while (val > 59) {
            if (val > 59) {
                val -= 60;
                minutos++;
            }
            if (minutos > 59) {
                minutos -= 60;
                horas++;
            }
        }
        String hor = horas + "";
        String min = minutos + "";
        String sec = val + "";
        if (horas < 10) {
            hor = "0" + hor;
        }
        if (minutos < 10) {
            min = "0" + min;
        }
        if (val < 10) {
            sec = "0" + sec;
        }
        return hor + ":" + min + ":" + sec;
    }

    
    
    Thread hilo = new Thread() {
        @Override
        public void run() {
            try {  
                while (true) {
                    Thread.sleep(1000);
                    actualizarBarraYTiempo1();
                    
                }
            } catch (InterruptedException e) {
            }
        }
    };
   
    
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelFondo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        JPVideo6 = new javax.swing.JPanel();
        JBVideo6 = new javax.swing.JButton();
        JLExamen = new javax.swing.JLabel();
        JPVideo1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JBVideo1 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        JLUsuario = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        JPanelVideo1 = new javax.swing.JPanel();
        JBPlay1 = new javax.swing.JButton();
        Slider1 = new javax.swing.JSlider();
        JLTiempo1 = new javax.swing.JLabel();
        JLTiempoTotal1 = new javax.swing.JLabel();
        JBPause1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        JLVolumen3 = new javax.swing.JLabel();
        jSlider3 = new javax.swing.JSlider();
        JLPause = new javax.swing.JLabel();
        JLPlay = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        JLVolumen2 = new javax.swing.JLabel();
        JPanelVideo4 = new javax.swing.JPanel();
        JLLogo = new javax.swing.JLabel();
        JLNotaM2 = new javax.swing.JLabel();
        JLNotaM1 = new javax.swing.JLabel();
        JLNotaM3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPanelFondo.setBackground(new java.awt.Color(255, 255, 255));
        JPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPVideo6.setBackground(new java.awt.Color(0, 102, 255));
        JPVideo6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JBVideo6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBVideo6.setForeground(new java.awt.Color(255, 255, 255));
        JBVideo6.setText("Examen");
        JBVideo6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBVideo6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        JBVideo6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                JBVideo6MouseMoved(evt);
            }
        });
        JBVideo6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBVideo6MouseExited(evt);
            }
        });
        JBVideo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVideo6ActionPerformed(evt);
            }
        });
        JPVideo6.add(JBVideo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 120));
        JPVideo6.add(JLExamen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 100, 90));

        jPanel1.add(JPVideo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, -1, 120));

        JPVideo1.setBackground(new java.awt.Color(0, 102, 255));
        JPVideo1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        JPVideo1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 40, 40));

        JBVideo1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JBVideo1.setForeground(new java.awt.Color(255, 255, 255));
        JBVideo1.setText("Proceso de diseño UI");
        JBVideo1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        JBVideo1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                JBVideo1MouseMoved(evt);
            }
        });
        JBVideo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBVideo1MouseExited(evt);
            }
        });
        JBVideo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVideo1ActionPerformed(evt);
            }
        });
        JPVideo1.add(JBVideo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 70));

        jPanel1.add(JPVideo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 350, 70));

        jPanel7.setBackground(new java.awt.Color(255, 0, 0));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("<html>NOTA: Los videos estas hechos para verse de forma secuencial, por ende debes terminar de ver cada video por completo para poder avanzar al siguiente.<html>");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 110));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 210, 130));

        JPanelFondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 350, 600));

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Lista  de Reproduccion");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, 70));

        JPanelFondo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 140));

        jPanel4.setBackground(new java.awt.Color(153, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Bienvenido(a) a nuestro cuarto modulo ");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 520, 40));

        JLUsuario.setBackground(new java.awt.Color(0, 0, 0));
        JLUsuario.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JLUsuario.setText("12");
        jPanel4.add(JLUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 180, 40));

        JPanelFondo.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 1020, 90));

        JPanelVideo1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JBPlay1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPlay1ActionPerformed(evt);
            }
        });
        JPanelVideo1.add(JBPlay1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 30, 30));

        Slider1.setValue(0);
        Slider1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Slider1MouseReleased(evt);
            }
        });
        JPanelVideo1.add(Slider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 960, 30));

        JLTiempo1.setForeground(new java.awt.Color(255, 255, 255));
        JLTiempo1.setText("00:00:00");
        JPanelVideo1.add(JLTiempo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 560, 60, 30));

        JLTiempoTotal1.setForeground(new java.awt.Color(255, 255, 255));
        JLTiempoTotal1.setText("00:00:00");
        JPanelVideo1.add(JLTiempoTotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 560, 50, 30));

        JBPause1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPause1ActionPerformed(evt);
            }
        });
        JPanelVideo1.add(JBPause1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, 30, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("/");
        JPanelVideo1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 560, 10, 30));
        JPanelVideo1.add(JLVolumen3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 564, 30, 30));

        jSlider3.setValue(100);
        jSlider3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jSlider3MouseReleased(evt);
            }
        });
        JPanelVideo1.add(jSlider3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 566, 190, -1));

        JLPause.setText("jLabel5");
        JPanelVideo1.add(JLPause, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, 30, 30));

        JLPlay.setText("jLabel5");
        JPanelVideo1.add(JLPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 30, 30));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(JLVolumen2);

        JPanelVideo1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 960, 100));

        jTabbedPane1.addTab("tab1", JPanelVideo1);

        JPanelVideo4.setBackground(new java.awt.Color(51, 51, 51));
        JPanelVideo4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        JPanelVideo4.add(JLLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 580, 270));

        jTabbedPane1.addTab("tab4", JPanelVideo4);

        JPanelFondo.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 960, 670));

        JLNotaM2.setText("1");
        JPanelFondo.add(JLNotaM2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 30, 20));

        JLNotaM1.setText("1");
        JPanelFondo.add(JLNotaM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 30, 20));

        JLNotaM3.setText("1");
        JPanelFondo.add(JLNotaM3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 30, 20));

        getContentPane().add(JPanelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Slider1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Slider1MouseReleased
        int val = Slider1.getValue();
        oracleVid1.seek(Duration.seconds(val));
    }//GEN-LAST:event_Slider1MouseReleased

    private void JBPlay1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPlay1ActionPerformed
        oracleVid1.setVolume(7);
        oracleVid1.play();
        
        
    }//GEN-LAST:event_JBPlay1ActionPerformed

    private void JBVideo6MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBVideo6MouseMoved
         JPVideo6.setBackground(new Color(0,51,153));        
    }//GEN-LAST:event_JBVideo6MouseMoved

    private void JBVideo6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBVideo6MouseExited
        JPVideo6.setBackground(new Color(0,102,255));
    }//GEN-LAST:event_JBVideo6MouseExited

    private void JBVideo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVideo6ActionPerformed
        oracleVid1.stop();
        FrmExamen4 ventana = new FrmExamen4();
        ventana.setVisible(true);
        FrmExamen4.JLUser.setText(JLUsuario.getText());
        FrmExamen4.JLNM1.setText(JLNotaM1.getText());
        FrmExamen4.JLNM2.setText(JLNotaM2.getText());
        FrmExamen4.JLNM3.setText(JLNotaM3.getText());
        
        this.setVisible(false);
  
    }//GEN-LAST:event_JBVideo6ActionPerformed

    private void JBVideo1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBVideo1MouseExited
        JPVideo1.setBackground(new Color(0,102,255));
    }//GEN-LAST:event_JBVideo1MouseExited

    private void JBVideo1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBVideo1MouseMoved
        JPVideo1.setBackground(new Color(0,51,153)); 
    }//GEN-LAST:event_JBVideo1MouseMoved

    private void JBVideo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVideo1ActionPerformed
        jTabbedPane1.setSelectedIndex(0);
        oracleVid1.stop();
        
        
    }//GEN-LAST:event_JBVideo1ActionPerformed

    private void JBPause1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPause1ActionPerformed
        oracleVid1.pause();
    }//GEN-LAST:event_JBPause1ActionPerformed

    private void jSlider3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider3MouseReleased
         oracleVid1.setVolume(jSlider3.getValue()/10 );
    }//GEN-LAST:event_jSlider3MouseReleased

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
            java.util.logging.Logger.getLogger(FrmVideo4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVideo4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVideo4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVideo4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVideo4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBPause1;
    private javax.swing.JButton JBPlay1;
    private javax.swing.JButton JBVideo1;
    private javax.swing.JButton JBVideo6;
    private javax.swing.JLabel JLExamen;
    private javax.swing.JLabel JLLogo;
    public static javax.swing.JLabel JLNotaM1;
    public static javax.swing.JLabel JLNotaM2;
    public static javax.swing.JLabel JLNotaM3;
    private javax.swing.JLabel JLPause;
    private javax.swing.JLabel JLPlay;
    private javax.swing.JLabel JLTiempo1;
    private javax.swing.JLabel JLTiempoTotal1;
    public static javax.swing.JLabel JLUsuario;
    private javax.swing.JLabel JLVolumen2;
    private javax.swing.JLabel JLVolumen3;
    private javax.swing.JPanel JPVideo1;
    private javax.swing.JPanel JPVideo6;
    private javax.swing.JPanel JPanelFondo;
    private javax.swing.JPanel JPanelVideo1;
    private javax.swing.JPanel JPanelVideo4;
    private javax.swing.JSlider Slider1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSlider jSlider3;
    public static javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
