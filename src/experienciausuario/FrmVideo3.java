/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experienciausuario;
import static experienciausuario.FrmVideo.JLUsuario;
import static experienciausuario.FrmVideo.oracleVid1;
import static experienciausuario.FrmVideo.oracleVid2;
import static experienciausuario.FrmVideo.oracleVid3;
import static experienciausuario.FrmVideo2.JLNotaM1;
import static experienciausuario.FrmVideo2.jTabbedPane1;
import static experienciausuario.FrmVideo2.video1;
import static experienciausuario.FrmVideo2.video2;
import static experienciausuario.FrmVideo2.video3;
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
public class FrmVideo3 extends javax.swing.JFrame {
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
    
    public FrmVideo3() {
        
        //JbMax.setEnabled(false);
        
        initComponents();
        
       
       
        jTabbedPane1.setSelectedIndex(3);
        JBVideo1.setEnabled(true);
        JBVideo2.setEnabled(false);
        JBVideo3.setEnabled(false);
        
        JBExamen.setEnabled(false);
        
        setLocationRelativeTo(null);
        //setTitle("Java Swing Video con FX");
        setResizable(false);
        //setLocationRelativeTo(null);
        JBVideo1.setOpaque(false);
        JBVideo1.setContentAreaFilled(false);
        JBVideo1.setBorderPainted(false);
        
        JBVideo2.setOpaque(false);
        JBVideo2.setContentAreaFilled(false);
        JBVideo2.setBorderPainted(false);
        
        JBVideo3.setOpaque(false);
        JBVideo3.setContentAreaFilled(false);
        JBVideo3.setBorderPainted(false);
        
     
        
        JBExamen.setOpaque(false);
        JBExamen.setContentAreaFilled(false);
        JBExamen.setBorderPainted(false);
        
        
     
        createScene1();
        createScene2();
        createScene3();
        
        
        JPanelVideo1.setLayout(new BorderLayout());
        JPanelVideo1.add(jfxPanel1,BorderLayout.CENTER); 
        
        JPanelVideo2.setLayout(new BorderLayout());
        JPanelVideo2.add(jfxPanel2,BorderLayout.CENTER);
        
        JPanelVideo3.setLayout(new BorderLayout());
        JPanelVideo3.add(jfxPanel3,BorderLayout.CENTER);
        
        JPanelVideo4.setLayout(new BorderLayout());
        JPanelVideo4.add(jfxPanel4,BorderLayout.CENTER);
        
        JPanelVideo5.setLayout(new BorderLayout());
        JPanelVideo5.add(jfxPanel5,BorderLayout.CENTER);
       
        
       
        
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel11,"src/imagenes/video1.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel12,"src/imagenes/video1.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel13,"src/imagenes/video1.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(JLExamen2,"src/imagenes/examen.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(JLLogo,"src/imagenes/videologo.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(JLVolumen,"src/imagenes/volumen.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(JLVolumen1,"src/imagenes/volumen.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(JLVolumen3,"src/imagenes/volumen.png");
        
        rsscalelabel.RSScaleLabel.setScaleLabel(JLPlay,"src/imagenes/play.png");
        JBPlay1.setContentAreaFilled(false);
        rsscalelabel.RSScaleLabel.setScaleLabel(JLPause,"src/imagenes/pause.png");
        JBPause1.setContentAreaFilled(false);
        
        rsscalelabel.RSScaleLabel.setScaleLabel(JLPlay1,"src/imagenes/play.png");
        JBPlay2.setContentAreaFilled(false);
        rsscalelabel.RSScaleLabel.setScaleLabel(JLPause1,"src/imagenes/pause.png");
        JBPause2.setContentAreaFilled(false);
        
        rsscalelabel.RSScaleLabel.setScaleLabel(JLPlay2,"src/imagenes/play.png");
        JBPlay3.setContentAreaFilled(false);
        rsscalelabel.RSScaleLabel.setScaleLabel(JLPause2,"src/imagenes/pause.png");
        JBPause3.setContentAreaFilled(false);
        
        
        
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
                    
                    File file = new File("src/videos/M3 Video 1.mp4");                                  
                    oracleVid1 = new MediaPlayer(new Media(file.toURI().toString()) );
                  
                    jfxPanel1.setScene(new Scene(new Group(new MediaView(oracleVid1))));  
                    
                    oracleVid1.setVolume(0);//volumen
                    oracleVid1.play();
             }
        });   asiganarTiempo1() ; 
    }
    
    private void createScene2(){
        Platform.runLater(new Runnable() {
             @Override
             public void run() {     
                
                File file = new File("src/videos/M3 Video 2.mp4");                                  
                   oracleVid2 = new MediaPlayer(new Media(file.toURI().toString()) );
                  
                   jfxPanel2.setScene(new Scene(new Group(new MediaView(oracleVid2))));       
                    oracleVid2.setVolume(0);//volumen
                    oracleVid2.play();
             } 
        });   asiganarTiempo2() ; 
        
    }
    
    private void createScene3(){
        Platform.runLater(new Runnable() {
             @Override
             public void run() {     
                
                File file = new File("src/videos/M3 Video 3.mp4");                                  
                  
                oracleVid3 = new MediaPlayer(new Media(file.toURI().toString()) );
                  
                   jfxPanel3.setScene(new Scene(new Group(new MediaView(oracleVid3))));  
                    oracleVid3.setVolume(0);//volumen
                    oracleVid3.play();
                 
                } 
        });asiganarTiempo3() ; 
        
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
            Logger.getLogger(FrmVideo3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
 
 
 void asiganarTiempo2() {
        try {
            Thread.sleep(1000);
           
            double sec = oracleVid2.getTotalDuration().toSeconds();
            int val = (int) sec;
      
            Slider2.setMaximum(val);

            JLTiempoTotal2.setText(obtenerMinutos(val) + "");
            hilo2.start();
            
        } catch (InterruptedException ex) {
            Logger.getLogger(FrmVideo3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
 
    
 
 void asiganarTiempo3() {
        try {
            Thread.sleep(1000);
            
            double sec = oracleVid3.getTotalDuration().toSeconds();
            int val = (int) sec;
      
            Slider3.setMaximum(val);

            JLTiempoTotal3.setText(obtenerMinutos(val) + "");
            hilo3.start();
            
        } catch (InterruptedException ex) {
            Logger.getLogger(FrmVideo3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
 
  
 
 
 
    
 
 public void actualizarBarraYTiempo1() {

        double sec = oracleVid1.getCurrentTime().toSeconds();
        int val = (int) sec;
        Slider1.setValue(val);

        JLTiempo1.setText(obtenerMinutos(val));
        
        
        if(JLTiempo1.getText().equals(JLTiempoTotal1.getText())){
            JBVideo2.setEnabled(true);
        oracleVid1.seek(oracleVid1.getStartTime());
        
        }
        
    }
 
 public void actualizarBarraYTiempo2() {

        double sec = oracleVid2.getCurrentTime().toSeconds();
        int val = (int) sec;
        Slider2.setValue(val);

        JLTiempo2.setText(obtenerMinutos(val));
         
         
        if(JLTiempo2.getText().equals(JLTiempoTotal2.getText())){
        JBVideo3.setEnabled(true);
        oracleVid2.seek(oracleVid2.getStartTime());  
        }
        
    }
 
 public void actualizarBarraYTiempo3() {

        double sec = oracleVid3.getCurrentTime().toSeconds();
        int val = (int) sec;
        Slider3.setValue(val);

        JLTiempo3.setText(obtenerMinutos(val));
         
         
        if(JLTiempo3.getText().equals(JLTiempoTotal3.getText())){
        JBExamen.setEnabled(true);
        oracleVid3.seek(oracleVid3.getStartTime());  
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
    Thread hilo2 = new Thread() {
        @Override
        public void run() {
            try {
                while (true) {
                    Thread.sleep(1000);
                    
                    actualizarBarraYTiempo2();
                    
                }
            } catch (InterruptedException e) {
            }
        }
    };
    
    Thread hilo3 = new Thread() {
        @Override
        public void run() {
            try {
                while (true) {
                    Thread.sleep(1000);
                    
                    actualizarBarraYTiempo3();
                    
                }
            } catch (InterruptedException e) {
            }
        }
    };
    
               
    
   
    
    
  
     
     
     
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelFondo = new javax.swing.JPanel();
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
        JPanelVideo2 = new javax.swing.JPanel();
        Slider2 = new javax.swing.JSlider();
        JBPlay2 = new javax.swing.JButton();
        JBPause2 = new javax.swing.JButton();
        JLTiempo2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JLTiempoTotal2 = new javax.swing.JLabel();
        JLVolumen1 = new javax.swing.JLabel();
        jSlider2 = new javax.swing.JSlider();
        JLPause1 = new javax.swing.JLabel();
        JLPlay1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        JPanelVideo3 = new javax.swing.JPanel();
        Slider3 = new javax.swing.JSlider();
        JBPause3 = new javax.swing.JButton();
        JBPlay3 = new javax.swing.JButton();
        JLTiempo3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        JLTiempoTotal3 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        JLVolumen = new javax.swing.JLabel();
        JLPause2 = new javax.swing.JLabel();
        JLPlay2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        JPanelVideo4 = new javax.swing.JPanel();
        JLLogo = new javax.swing.JLabel();
        JPanelVideo5 = new javax.swing.JPanel();
        JLNotaM1 = new javax.swing.JLabel();
        JLNotaM2 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        JPVideo9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        JBVideo3 = new javax.swing.JButton();
        JPVideo10 = new javax.swing.JPanel();
        JBExamen = new javax.swing.JButton();
        JLExamen2 = new javax.swing.JLabel();
        JPVideo11 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        JBVideo1 = new javax.swing.JButton();
        JPVideo12 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        JBVideo2 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPanelFondo.setBackground(new java.awt.Color(255, 255, 255));
        JPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Lista  de Reproduccion");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, 70));

        JPanelFondo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 110));

        jPanel4.setBackground(new java.awt.Color(153, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Bienvenido(a) a nuestro segundo modulo ");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 520, 40));

        JLUsuario.setBackground(new java.awt.Color(0, 0, 0));
        JLUsuario.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JLUsuario.setText("12");
        jPanel4.add(JLUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 180, 40));

        JPanelFondo.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 1020, 100));

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

        JPanelVideo2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Slider2.setValue(0);
        Slider2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Slider2MouseReleased(evt);
            }
        });
        JPanelVideo2.add(Slider2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 960, 30));

        JBPlay2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPlay2ActionPerformed(evt);
            }
        });
        JPanelVideo2.add(JBPlay2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 30, 30));

        JBPause2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPause2ActionPerformed(evt);
            }
        });
        JPanelVideo2.add(JBPause2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, 30, 30));

        JLTiempo2.setForeground(new java.awt.Color(255, 255, 255));
        JLTiempo2.setText("00:00:00");
        JPanelVideo2.add(JLTiempo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 560, 60, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("/");
        JPanelVideo2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 560, 10, 30));

        JLTiempoTotal2.setForeground(new java.awt.Color(255, 255, 255));
        JLTiempoTotal2.setText("00:00:00");
        JPanelVideo2.add(JLTiempoTotal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 560, 50, 30));
        JPanelVideo2.add(JLVolumen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 564, 30, 30));

        jSlider2.setValue(100);
        jSlider2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jSlider2MouseReleased(evt);
            }
        });
        JPanelVideo2.add(jSlider2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 566, 190, -1));

        JLPause1.setText("jLabel5");
        JPanelVideo2.add(JLPause1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, 30, 30));

        JLPlay1.setText("jLabel5");
        JPanelVideo2.add(JLPlay1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 30, 30));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));
        JPanelVideo2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 960, 100));

        jTabbedPane1.addTab("tab2", JPanelVideo2);

        JPanelVideo3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Slider3.setValue(0);
        Slider3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Slider3MouseReleased(evt);
            }
        });
        JPanelVideo3.add(Slider3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 960, 30));

        JBPause3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPause3ActionPerformed(evt);
            }
        });
        JPanelVideo3.add(JBPause3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, 30, 30));

        JBPlay3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPlay3ActionPerformed(evt);
            }
        });
        JPanelVideo3.add(JBPlay3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 30, 30));

        JLTiempo3.setForeground(new java.awt.Color(255, 255, 255));
        JLTiempo3.setText("00:00:00");
        JPanelVideo3.add(JLTiempo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 560, 60, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("/");
        JPanelVideo3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 560, 10, 30));

        JLTiempoTotal3.setForeground(new java.awt.Color(255, 255, 255));
        JLTiempoTotal3.setText("00:00:00");
        JPanelVideo3.add(JLTiempoTotal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 560, 50, 30));

        jSlider1.setValue(100);
        jSlider1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jSlider1MouseReleased(evt);
            }
        });
        JPanelVideo3.add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 566, 190, -1));
        JPanelVideo3.add(JLVolumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 564, 30, 30));

        JLPause2.setText("jLabel5");
        JPanelVideo3.add(JLPause2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, 30, 30));

        JLPlay2.setText("jLabel5");
        JPanelVideo3.add(JLPlay2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 30, 30));

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));
        JPanelVideo3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 960, 100));

        jTabbedPane1.addTab("tab3", JPanelVideo3);

        JPanelVideo4.setBackground(new java.awt.Color(51, 51, 51));
        JPanelVideo4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        JPanelVideo4.add(JLLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 580, 270));

        jTabbedPane1.addTab("tab4", JPanelVideo4);

        JPanelVideo5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("tab5", JPanelVideo5);

        JPanelFondo.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 960, 670));

        JLNotaM1.setText("1");
        JPanelFondo.add(JLNotaM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 30, 20));

        JLNotaM2.setText("1");
        JPanelFondo.add(JLNotaM2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 30, 20));

        jPanel13.setBackground(new java.awt.Color(153, 255, 255));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPVideo9.setBackground(new java.awt.Color(0, 102, 255));
        JPVideo9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        JPVideo9.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 40, 40));

        JBVideo3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JBVideo3.setForeground(new java.awt.Color(255, 255, 255));
        JBVideo3.setText("Beneficios de utilizar diseño UX UI en conjutno");
        JBVideo3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        JBVideo3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                JBVideo3MouseMoved(evt);
            }
        });
        JBVideo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBVideo3MouseExited(evt);
            }
        });
        JBVideo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVideo3ActionPerformed(evt);
            }
        });
        JPVideo9.add(JBVideo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 70));

        jPanel13.add(JPVideo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 350, 70));

        JPVideo10.setBackground(new java.awt.Color(0, 102, 255));
        JPVideo10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JBExamen.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBExamen.setForeground(new java.awt.Color(255, 255, 255));
        JBExamen.setText("Examen");
        JBExamen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBExamen.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        JBExamen.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                JBExamenMouseMoved(evt);
            }
        });
        JBExamen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBExamenMouseExited(evt);
            }
        });
        JBExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBExamenActionPerformed(evt);
            }
        });
        JPVideo10.add(JBExamen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 120));
        JPVideo10.add(JLExamen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 100, 90));

        jPanel13.add(JPVideo10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, -1, 120));

        JPVideo11.setBackground(new java.awt.Color(0, 102, 255));
        JPVideo11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        JPVideo11.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 40, 40));

        JBVideo1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JBVideo1.setForeground(new java.awt.Color(255, 255, 255));
        JBVideo1.setText("¿Cual es el papel del diseño UX en el M.D?");
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
        JPVideo11.add(JBVideo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 70));

        jPanel13.add(JPVideo11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 350, 70));

        JPVideo12.setBackground(new java.awt.Color(0, 102, 255));
        JPVideo12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        JPVideo12.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 40, 40));

        JBVideo2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JBVideo2.setForeground(new java.awt.Color(255, 255, 255));
        JBVideo2.setText("Diferencias fundamentales entre diseño UX y UI");
        JBVideo2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        JBVideo2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                JBVideo2MouseMoved(evt);
            }
        });
        JBVideo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBVideo2MouseExited(evt);
            }
        });
        JBVideo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVideo2ActionPerformed(evt);
            }
        });
        JPVideo12.add(JBVideo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 70));

        jPanel13.add(JPVideo12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 350, 70));

        jPanel7.setBackground(new java.awt.Color(255, 0, 0));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("<html>NOTA: Los videos estas hechos para verse de forma secuencial, por ende debes terminar de ver cada video por completo para poder avanzar al siguiente.<html>");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 110));

        jPanel13.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 210, 130));

        JPanelFondo.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, 610));

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

    private void Slider2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Slider2MouseReleased
        int val = Slider2.getValue();
        oracleVid2.seek(Duration.seconds(val));
    }//GEN-LAST:event_Slider2MouseReleased

    private void JBPlay2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPlay2ActionPerformed
        oracleVid2.setVolume(7);
        oracleVid2.play();
            
    }//GEN-LAST:event_JBPlay2ActionPerformed

    private void Slider3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Slider3MouseReleased
        int val = Slider3.getValue();
        oracleVid3.seek(Duration.seconds(val));
    }//GEN-LAST:event_Slider3MouseReleased

    private void JBPlay3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPlay3ActionPerformed
        oracleVid3.setVolume(7);
        oracleVid3.play();
    }//GEN-LAST:event_JBPlay3ActionPerformed

    private void JBPause1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPause1ActionPerformed
        oracleVid1.pause();
    }//GEN-LAST:event_JBPause1ActionPerformed

    private void JBPause2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPause2ActionPerformed
        oracleVid2.pause();
    }//GEN-LAST:event_JBPause2ActionPerformed

    private void JBPause3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPause3ActionPerformed
       oracleVid3.pause();
    }//GEN-LAST:event_JBPause3ActionPerformed

    private void jSlider1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider1MouseReleased
        
        oracleVid3.setVolume(jSlider1.getValue()/10 );
         
    }//GEN-LAST:event_jSlider1MouseReleased

    private void jSlider2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider2MouseReleased
         oracleVid2.setVolume(jSlider2.getValue()/10 );
    }//GEN-LAST:event_jSlider2MouseReleased

    private void jSlider3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider3MouseReleased
         oracleVid1.setVolume(jSlider3.getValue()/10 );
    }//GEN-LAST:event_jSlider3MouseReleased

    private void JBVideo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVideo2ActionPerformed
        jTabbedPane1.setSelectedIndex(1);
        oracleVid1.stop();
        oracleVid3.stop();
    }//GEN-LAST:event_JBVideo2ActionPerformed

    private void JBVideo2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBVideo2MouseExited
        JPVideo12.setBackground(new Color(0,102,255));
    }//GEN-LAST:event_JBVideo2MouseExited

    private void JBVideo2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBVideo2MouseMoved
       JPVideo12.setBackground(new Color(0,51,153)); 
    }//GEN-LAST:event_JBVideo2MouseMoved

    private void JBVideo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVideo1ActionPerformed
        jTabbedPane1.setSelectedIndex(0);
        oracleVid1.stop();
        oracleVid2.stop();
        oracleVid3.stop();       
    }//GEN-LAST:event_JBVideo1ActionPerformed

    private void JBVideo1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBVideo1MouseExited
        JPVideo11.setBackground(new Color(0,102,255));
    }//GEN-LAST:event_JBVideo1MouseExited

    private void JBVideo1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBVideo1MouseMoved
        JPVideo11.setBackground(new Color(0,51,153)); 
    }//GEN-LAST:event_JBVideo1MouseMoved

    private void JBExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBExamenActionPerformed
        oracleVid1.stop();
        oracleVid2.stop();
        oracleVid3.stop();
        
        FrmExamen3 ventana = new FrmExamen3();
        ventana.setVisible(true);
        FrmExamen3.JLUser.setText(JLUsuario.getText());
        FrmExamen3.JLNM1.setText(JLNotaM1.getText());
        FrmExamen3.JLNM2.setText(JLNotaM2.getText());
        this.setVisible(false);
    }//GEN-LAST:event_JBExamenActionPerformed

    private void JBExamenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBExamenMouseExited
       JPVideo10.setBackground(new Color(0,102,255));
    }//GEN-LAST:event_JBExamenMouseExited

    private void JBExamenMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBExamenMouseMoved
        JPVideo10.setBackground(new Color(0,51,153));
    }//GEN-LAST:event_JBExamenMouseMoved

    private void JBVideo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVideo3ActionPerformed
       jTabbedPane1.setSelectedIndex(2);
        
        oracleVid1.stop();
        oracleVid2.stop();
    }//GEN-LAST:event_JBVideo3ActionPerformed

    private void JBVideo3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBVideo3MouseExited
        JPVideo9.setBackground(new Color(0,102,255));
    }//GEN-LAST:event_JBVideo3MouseExited

    private void JBVideo3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBVideo3MouseMoved
        JPVideo9.setBackground(new Color(0,51,153));  
    }//GEN-LAST:event_JBVideo3MouseMoved

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
            java.util.logging.Logger.getLogger(FrmVideo3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVideo3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVideo3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVideo3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVideo3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBExamen;
    private javax.swing.JButton JBPause1;
    private javax.swing.JButton JBPause2;
    private javax.swing.JButton JBPause3;
    private javax.swing.JButton JBPlay1;
    private javax.swing.JButton JBPlay2;
    private javax.swing.JButton JBPlay3;
    private javax.swing.JButton JBVideo1;
    private javax.swing.JButton JBVideo2;
    private javax.swing.JButton JBVideo3;
    private javax.swing.JLabel JLExamen2;
    private javax.swing.JLabel JLLogo;
    public static javax.swing.JLabel JLNotaM1;
    public static javax.swing.JLabel JLNotaM2;
    private javax.swing.JLabel JLPause;
    private javax.swing.JLabel JLPause1;
    private javax.swing.JLabel JLPause2;
    private javax.swing.JLabel JLPlay;
    private javax.swing.JLabel JLPlay1;
    private javax.swing.JLabel JLPlay2;
    private javax.swing.JLabel JLTiempo1;
    private javax.swing.JLabel JLTiempo2;
    private javax.swing.JLabel JLTiempo3;
    private javax.swing.JLabel JLTiempoTotal1;
    private javax.swing.JLabel JLTiempoTotal2;
    private javax.swing.JLabel JLTiempoTotal3;
    public static javax.swing.JLabel JLUsuario;
    private javax.swing.JLabel JLVolumen;
    private javax.swing.JLabel JLVolumen1;
    private javax.swing.JLabel JLVolumen2;
    private javax.swing.JLabel JLVolumen3;
    private javax.swing.JPanel JPVideo10;
    private javax.swing.JPanel JPVideo11;
    private javax.swing.JPanel JPVideo12;
    private javax.swing.JPanel JPVideo9;
    private javax.swing.JPanel JPanelFondo;
    private javax.swing.JPanel JPanelVideo1;
    private javax.swing.JPanel JPanelVideo2;
    private javax.swing.JPanel JPanelVideo3;
    private javax.swing.JPanel JPanelVideo4;
    private javax.swing.JPanel JPanelVideo5;
    private javax.swing.JSlider Slider1;
    private javax.swing.JSlider Slider2;
    private javax.swing.JSlider Slider3;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JSlider jSlider3;
    public static javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
