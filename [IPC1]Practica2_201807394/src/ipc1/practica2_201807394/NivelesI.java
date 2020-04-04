
package ipc1.practica2_201807394;

import static ipc1.practica2_201807394.IPC1Practica2_201807394.cNiveles;
import static ipc1.practica2_201807394.IPC1Practica2_201807394.listaNiveles;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;


public class NivelesI extends javax.swing.JFrame {


    public NivelesI() {
        initComponents();
        this.setLocationRelativeTo(null);
        for(int i=0; i<cNiveles;i++){
            jComboBox1.addItem(String.valueOf(listaNiveles[i].getNo()));
        }
    }
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Manu\\Desktop\\imas\\pez.jpg");        
        return retValue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtxtDisMax = new javax.swing.JTextField();
        jtxtDisPan = new javax.swing.JTextField();
        jtxtVelCor = new javax.swing.JTextField();
        jtxtTNivel = new javax.swing.JTextField();
        jtxtTSum = new javax.swing.JTextField();
        jtxtPunSel = new javax.swing.JTextField();
        jtxtPunSelSum = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));
        setResizable(false);

        jLabel1.setText("Nivel a Editar");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Distancia Maxima: ");

        jLabel3.setText("Distancia Pantalla:");

        jLabel4.setText("Velocidad Corriente:");

        jLabel5.setText("Tiempo Nivel:");

        jLabel6.setText("Tiempo Sumergir: ");

        jLabel7.setText("Puntos por Selección: ");

        jLabel8.setText("Puntos por Selección Sumergir:");

        jButton1.setText("Editar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu1.setText("Regresar");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxtDisMax)
                            .addComponent(jtxtDisPan)
                            .addComponent(jtxtVelCor)
                            .addComponent(jtxtTNivel)
                            .addComponent(jtxtTSum)
                            .addComponent(jtxtPunSel)
                            .addComponent(jtxtPunSelSum, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))))
                .addGap(12, 12, 12)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtDisMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtxtDisPan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtxtVelCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtxtTNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtxtTSum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jtxtPunSel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jtxtPunSelSum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        dispose();
        Inicio in = new Inicio();
        in.setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        sel = jComboBox1.getSelectedIndex();
        
        jtxtDisMax.setText(String.valueOf(listaNiveles[sel].getDis_max()));
        jtxtDisPan.setText(String.valueOf(listaNiveles[sel].getDis_pan()));
        jtxtVelCor.setText(String.valueOf(listaNiveles[sel].getVel_cor()));
        jtxtTNivel.setText(String.valueOf(listaNiveles[sel].getT_nivel()));
        jtxtTSum.setText(String.valueOf(listaNiveles[sel].getT_sumergir()));
        jtxtPunSel.setText(String.valueOf(listaNiveles[sel].getP_sel()));
        jtxtPunSelSum.setText(String.valueOf(listaNiveles[sel].getP_sel_sumergir()));
                
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int dismax, dispan, velcor, tniv, tsum, psel, pselsum;
        
        dismax = Integer.parseInt(jtxtDisMax.getText());
        dispan = Integer.parseInt(jtxtDisPan.getText());
        velcor = Integer.parseInt(jtxtVelCor.getText());
        tniv = Integer.parseInt(jtxtTNivel.getText());
        tsum = Integer.parseInt(jtxtTSum.getText());
        psel = Integer.parseInt(jtxtPunSel.getText());
        pselsum = Integer.parseInt(jtxtPunSelSum.getText());
                        
        
        if(jtxtDisMax.getText().equals("") || jtxtDisPan.getText().equals("") || jtxtVelCor.getText().equals("") || 
           jtxtTNivel.getText().equals("") || jtxtTSum.getText().equals("") || jtxtPunSel.getText().equals("") ||
           jtxtPunSelSum.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Uno de los campos vacios, llenarlo", "Rio Rapido", JOptionPane.WARNING_MESSAGE);
        }else{
            listaNiveles[sel].setDis_max(dismax);
            listaNiveles[sel].setDis_pan(dispan);
            listaNiveles[sel].setVel_cor(velcor);
            listaNiveles[sel].setT_nivel(tniv);
            listaNiveles[sel].setT_sumergir(tsum);
            listaNiveles[sel].setP_sel(psel);
            listaNiveles[sel].setP_sel_sumergir(pselsum);
            JOptionPane.showMessageDialog(null, "Nivel Editado con Exito", "Rio Rapido", JOptionPane.INFORMATION_MESSAGE);
            dispose();
            Inicio i = new Inicio();
            i.setVisible(true);
        }        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    int sel;
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
            java.util.logging.Logger.getLogger(NivelesI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NivelesI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NivelesI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NivelesI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NivelesI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField jtxtDisMax;
    private javax.swing.JTextField jtxtDisPan;
    private javax.swing.JTextField jtxtPunSel;
    private javax.swing.JTextField jtxtPunSelSum;
    private javax.swing.JTextField jtxtTNivel;
    private javax.swing.JTextField jtxtTSum;
    private javax.swing.JTextField jtxtVelCor;
    // End of variables declaration//GEN-END:variables
}
