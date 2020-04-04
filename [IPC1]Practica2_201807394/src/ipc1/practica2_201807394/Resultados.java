
package ipc1.practica2_201807394;

import static ipc1.practica2_201807394.IPC1Practica2_201807394.cJugadores;
import static ipc1.practica2_201807394.IPC1Practica2_201807394.listaJugadores;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.table.DefaultTableModel;

public class Resultados extends javax.swing.JFrame {

    String aux1, aux2;
    String header[] = {"Nombre", "Puntuacion"};
    String data[][] = new String[cJugadores][2];        
    
    public Resultados() {
        initComponents();
        setLocationRelativeTo(null);
        Llenado();
    }
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Manu\\Desktop\\imas\\pez.jpg");        
        return retValue;
    }
        
    public void Llenado(){        
        
        //Llenado de mi arreglo data
        for(int i=0;i<cJugadores;i++){
            data[i][1] = String.valueOf(listaJugadores[i].getPuntuacion());
            data[i][0] = listaJugadores[i].getNombre();
        }
        
        Ordenamiento();
        
        jTable1.setModel(new DefaultTableModel(data, header));
    }
    
    public void Ordenamiento(){
        for(int i=1;i<cJugadores;i++){
            for(int j=0;j<cJugadores-1;j++){
                if(Integer.parseInt(data[j][1])<Integer.parseInt(data[j+1][1])){
                    aux1 = data[j][1];
                    aux2 = data[j][0];
                    data[j][1] = data[j+1][1];
                    data[j][0] = data[j+1][0];
                    data[j+1][1] = aux1;
                    data[j+1][0] = aux2;
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Puntuacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setEnabled(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
        }

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        dispose();
        Inicio in = new Inicio();
        in.setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
