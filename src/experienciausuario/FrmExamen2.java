
package experienciausuario;

import Preguntas_Y_Respuestas.Preguntas;
import Preguntas_Y_Respuestas.Respuestas;
import static experienciausuario.FrmExamen.JLUser;
import static experienciausuario.FrmModulos.jButton2;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static experienciausuario.FrmModulos.JLNotaModulo1;
import static experienciausuario.FrmModulos.jButton3;


public class FrmExamen2 extends javax.swing.JFrame {

    
    public FrmExamen2() {
        initComponents();
        setLocationRelativeTo(null);
        rsscalelabel.RSScaleLabel.setScaleLabel(JLExamen,"src/imagenes/exam.png");
        question.setText(p.getPregunta2(posicion));
        
        String[]a= r.setRespuestas2(posicion);
        BtGrup.clearSelection();
        RbOpcion1.setText(a[0]);
        RbOpcion2.setText(a[1]);
        RbOpcion3.setText(a[2]);
        RbOpcion4.setText(a[3]);
        RbOpcion1.requestFocus();
        BtRegresar.setEnabled(false);
        BtFin.setEnabled(false);
        JbAvanzar.setEnabled(false);
        JLUser.setVisible(false);
    }
    int posicion = 0;
    int i=1;
    Respuestas r = new Respuestas();
    Preguntas p = new Preguntas();
    Object[] select = {"","","","",""};
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtGrup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        JLUser = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        question = new javax.swing.JLabel();
        RbOpcion1 = new javax.swing.JRadioButton();
        RbOpcion2 = new javax.swing.JRadioButton();
        RbOpcion3 = new javax.swing.JRadioButton();
        RbOpcion4 = new javax.swing.JRadioButton();
        BtRegresar = new javax.swing.JButton();
        Btsiguiente = new javax.swing.JButton();
        BtFin = new javax.swing.JButton();
        txtNota = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        JLExamen = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableExamen = new javax.swing.JTable();
        JbVerificar = new javax.swing.JButton();
        JbAvanzar = new javax.swing.JButton();
        JLNM1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));
        jPanel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pon a prueba lo aprendido!");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 350, 30));

        JLUser.setText("jLabel3");
        jPanel1.add(JLUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 110, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 90));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Pregunta 1 ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 31, -1, -1));

        question.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel2.add(question, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 66, 510, 40));

        BtGrup.add(RbOpcion1);
        RbOpcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbOpcion1ActionPerformed(evt);
            }
        });
        jPanel2.add(RbOpcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        BtGrup.add(RbOpcion2);
        RbOpcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbOpcion2ActionPerformed(evt);
            }
        });
        jPanel2.add(RbOpcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        BtGrup.add(RbOpcion3);
        RbOpcion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbOpcion3ActionPerformed(evt);
            }
        });
        jPanel2.add(RbOpcion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        BtGrup.add(RbOpcion4);
        RbOpcion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbOpcion4ActionPerformed(evt);
            }
        });
        jPanel2.add(RbOpcion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        BtRegresar.setBackground(new java.awt.Color(0, 51, 153));
        BtRegresar.setForeground(new java.awt.Color(255, 255, 255));
        BtRegresar.setText("Pregunta Anterior");
        BtRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtRegresarActionPerformed(evt);
            }
        });
        jPanel2.add(BtRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 140, 30));

        Btsiguiente.setBackground(new java.awt.Color(0, 51, 153));
        Btsiguiente.setForeground(new java.awt.Color(255, 255, 255));
        Btsiguiente.setText("Siguiente Pregunta ");
        Btsiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtsiguienteActionPerformed(evt);
            }
        });
        jPanel2.add(Btsiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 150, 30));

        BtFin.setBackground(new java.awt.Color(0, 51, 153));
        BtFin.setForeground(new java.awt.Color(255, 255, 255));
        BtFin.setText("Finzalizar Examen");
        BtFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtFinActionPerformed(evt);
            }
        });
        jPanel2.add(BtFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 140, 40));
        jPanel2.add(txtNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 102, 23));

        jPanel4.setBackground(new java.awt.Color(0, 51, 153));
        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 20, 450));
        jPanel2.add(JLExamen, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 210, 220));

        jTabbedPane1.addTab("tab1", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTableExamen.setBackground(new java.awt.Color(0, 51, 153));
        JTableExamen.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JTableExamen.setForeground(new java.awt.Color(255, 255, 255));
        JTableExamen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "?", "?", "?"
            }
        ));
        JTableExamen.setGridColor(new java.awt.Color(0, 0, 0));
        JTableExamen.setRowHeight(50);
        jScrollPane1.setViewportView(JTableExamen);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 123, 540, 280));

        JbVerificar.setBackground(new java.awt.Color(0, 51, 153));
        JbVerificar.setForeground(new java.awt.Color(255, 255, 255));
        JbVerificar.setText("verificar");
        JbVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbVerificarActionPerformed(evt);
            }
        });
        jPanel3.add(JbVerificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        JbAvanzar.setBackground(new java.awt.Color(0, 51, 153));
        JbAvanzar.setForeground(new java.awt.Color(255, 255, 255));
        JbAvanzar.setText("avanzar modulo");
        JbAvanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbAvanzarActionPerformed(evt);
            }
        });
        jPanel3.add(JbAvanzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, -1, -1));

        jTabbedPane1.addTab("tab2", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 800, 510));
        getContentPane().add(JLNM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtsiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtsiguienteActionPerformed
        String n=null;
        if (posicion == 3) {
            Btsiguiente.setEnabled(false);
            BtFin.setEnabled(true);
            
        }
        if(posicion <5){
        BtRegresar.setEnabled(true);
        posicion++;
        i++;
        n = Integer.toString(i);
        jLabel1.setText("Pregunta "+n);
        question.setText(p.getPregunta2(posicion));
        String[]a= r.setRespuestas2(posicion);
        BtGrup.clearSelection();
        RbOpcion1.setText(a[0]);
        RbOpcion2.setText(a[1]);
        RbOpcion3.setText(a[2]);
        RbOpcion4.setText(a[3]);
        RbOpcion1.requestFocus();
        
        
    }else{
            Toolkit.getDefaultToolkit().beep();
            
        }
    }//GEN-LAST:event_BtsiguienteActionPerformed

    private void BtRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtRegresarActionPerformed
         String n;
        if(posicion >0){
            posicion --;
            i--;
            n = Integer.toString(i);
            jLabel1.setText("Pregunta "+n);
        }else{
        BtRegresar.setEnabled(false);
        }
        if (posicion >-1) {
        Btsiguiente.setEnabled(true);
        question.setText(p.getPregunta2(posicion));
        String[]a = r.setRespuestas2(posicion);
        BtGrup.clearSelection();
        RbOpcion1.setText(a[0]);
        RbOpcion2.setText(a[1]);
        RbOpcion3.setText(a[2]);
        RbOpcion4.setText(a[3]);
        RbOpcion1.requestFocus();
    }else{
    
            
        }
            
    }//GEN-LAST:event_BtRegresarActionPerformed

    private void BtFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtFinActionPerformed
        jTabbedPane1.setSelectedIndex(1);
        
    }//GEN-LAST:event_BtFinActionPerformed

    private void RbOpcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbOpcion1ActionPerformed
       select[posicion] = RbOpcion1.getText();
    }//GEN-LAST:event_RbOpcion1ActionPerformed

    private void RbOpcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbOpcion2ActionPerformed
        select[posicion] = RbOpcion2.getText();
    }//GEN-LAST:event_RbOpcion2ActionPerformed

    private void RbOpcion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbOpcion3ActionPerformed
        select[posicion] = RbOpcion3.getText();
    }//GEN-LAST:event_RbOpcion3ActionPerformed

    private void RbOpcion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbOpcion4ActionPerformed
       select[posicion] = RbOpcion4.getText();
    }//GEN-LAST:event_RbOpcion4ActionPerformed

    private void JbVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbVerificarActionPerformed
        int calificacion = 0;
        String nota ;
       
        String  NombreColumnas []={"Como te fue","Puntaje","# de pregunta"};
        String   data[][]= new String [5][3];    
        for (int i = 0; i < 5; i++) {
            if(select[i].equals(r.getRespuesta2(i))){
                calificacion = calificacion + 2;
                
                
                 r.getRespuesta2(i);
                 
                   
                   data[i][1]="2";
                   data[i][0]="Acertaste"; // guardahasta dondees correcto imprime lo que acerte
            }else{
                    data[i][1]="0";
                   data[i][0]="Te equivocaste";
            }
            
            data[0][2]="pregunta 1";
            data[1][2]="pregunta 2";
            data[2][2]="pregunta 3";
            data[3][2]="pregunta 4";
            data[4][2]="pregunta 5";
            
           //data[i][0]=""+r;// gaurda hasta donde escorrecto y elnumero se repite imprime todo
          
           JTableExamen.setModel(new DefaultTableModel(data,NombreColumnas));
           
        }
     
        

        JOptionPane.showMessageDialog(null,"Tu calificaicion es: "+calificacion);

        if(calificacion>=0){

            nota = Integer.toString(calificacion);
            txtNota.setText(nota);

            //ventana.setVisible(true);
            //FrmModulos.txtNotaResivida.setText(txtNota.getText());
            // this.dispose();
           JbAvanzar.setEnabled(true);
        }
    }//GEN-LAST:event_JbVerificarActionPerformed

    private void JbAvanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbAvanzarActionPerformed
             FrmModulos v = new FrmModulos(this,true);
             v.setVisible(true);
             
             FrmModulos.LbUser.setText(JLUser.getText());
             FrmModulos.JLNotaModulo1.setText(JLNM1.getText());
             if(JLNotaModulo1.getText().equals("7") || JLNotaModulo1.getText().equals("8") || JLNotaModulo1.getText().equals("9") || JLNotaModulo1.getText().equals("10") ){
                jButton2.setEnabled(true);
        }
             FrmModulos.JLNotaMidulo2.setText(txtNota.getText());
             if(v.JLNotaMidulo2.getText().equals("7") || v.JLNotaMidulo2.getText().equals("8") || v.JLNotaMidulo2.getText().equals("9") || v.JLNotaMidulo2.getText().equals("10") ){
                jButton3.setEnabled(true);
        }
             this.dispose();
    }//GEN-LAST:event_JbAvanzarActionPerformed

    
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
            java.util.logging.Logger.getLogger(FrmExamen2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmExamen2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmExamen2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmExamen2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmExamen2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtFin;
    private javax.swing.ButtonGroup BtGrup;
    private javax.swing.JButton BtRegresar;
    private javax.swing.JButton Btsiguiente;
    private javax.swing.JLabel JLExamen;
    public static javax.swing.JLabel JLNM1;
    public static javax.swing.JLabel JLUser;
    private javax.swing.JTable JTableExamen;
    private javax.swing.JButton JbAvanzar;
    private javax.swing.JButton JbVerificar;
    private javax.swing.JRadioButton RbOpcion1;
    private javax.swing.JRadioButton RbOpcion2;
    private javax.swing.JRadioButton RbOpcion3;
    private javax.swing.JRadioButton RbOpcion4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JLabel question;
    private javax.swing.JLabel txtNota;
    // End of variables declaration//GEN-END:variables
}
