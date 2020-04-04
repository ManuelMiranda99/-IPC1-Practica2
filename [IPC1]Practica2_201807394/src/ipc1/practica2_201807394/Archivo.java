
package ipc1.practica2_201807394;

import static ipc1.practica2_201807394.IPC1Practica2_201807394.*;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;
import javax.swing.JOptionPane;

public class Archivo extends javax.swing.JFrame {

    
    public Archivo() {
        initComponents();
        this.setLocationRelativeTo(null);
        FileNameExtensionFilter filtro = new FileNameExtensionFilter(".play","play");
        jFileChooser1.setFileFilter(filtro);
        jFileChooser1.setAcceptAllFileFilterUsed(false);
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
        jFileChooser1 = new javax.swing.JFileChooser();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);

        jLabel1.setText("Seleccione el archivo:");

        jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser1ActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        dispose();
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed
        String comando = evt.getActionCommand();        
        if(comando.equals(JFileChooser.APPROVE_SELECTION)){
            File ar = jFileChooser1.getSelectedFile();
            try {                           
                BufferedReader leer = new BufferedReader(new FileReader(ar.getAbsolutePath()));
                
                String linea = leer.readLine();
                while(linea != null){
                    
                    String[] partes = linea.split("\\*\\*");
                    
                    if(partes[0].equals("NIVEL")){
                        listaNiveles[cNiveles] = new Niveles(partes[1], partes[2], partes[3], partes[4], partes[5], partes[6], partes[7], partes[8]);
                        cNiveles+=1;
                    }else if(partes[0].equals("PERSONAJE")){
                        listaPersonaje[cPersonaje] = new Personaje(partes[1], partes[2]);
                        cPersonaje+=1;
                    }
                    
                    linea = leer.readLine();
                }
                
                if(cNiveles<3 || cPersonaje<10){
                    JOptionPane.showMessageDialog(null, "Niveles o Personajes muy pocos. Mínimo ingresar 3 niveles y 10 personajes", "Río Rápido", JOptionPane.WARNING_MESSAGE);
                    cNiveles=0;
                    cPersonaje=0;
                    for(int i=0;i<10;i++){
                        listaNiveles[i] = null;
                        listaPersonaje[i] = null;
                    }
                }else{
                    carga = 1;
                
                    JOptionPane.showMessageDialog(null, "Carga Relizada con Exito", "Rio Rapido", JOptionPane.INFORMATION_MESSAGE);

                    dispose();
                    Inicio i = new Inicio();
                    i.setVisible(true);
                }                
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }else if(comando.equals(JFileChooser.CANCEL_SELECTION)){
            dispose();
            Inicio inicio = new Inicio();
            inicio.setVisible(true);
        }
    }//GEN-LAST:event_jFileChooser1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Archivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Archivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Archivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Archivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Archivo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
