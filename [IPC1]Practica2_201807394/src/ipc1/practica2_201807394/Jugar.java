
package ipc1.practica2_201807394;

import Procesos.*;
import static ipc1.practica2_201807394.IPC1Practica2_201807394.*;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Jugar extends javax.swing.JFrame {

    /* Variables a utilizar durante el transcurso del juego */
    //Posiciones Iniciales
    int x1, x2, y, posy;
    //Datos de Nivel
    int noNivel, disMax, velCor, psum, psums;
    public static int puntos;
    //Objetos de Threads
    public static Cronometro cr;
    public static Movimiento mv1, mv2;
    public static Sumergir sum1, sum2;
    //Parametros para los threads
    int par, tSum, tNiv;
    //Contadores
    int cNivel, cPersonajes, cImg, cSeleccion;
    //Verificaciones de Seleccion del jugador
    public static int visible, t;
    int[] imgYa = new int[cPersonaje];
    String correcta;
    //Objeto para numeros random
    Random rdm = new Random();
    
    public Jugar() {        
        initComponents();
        setLocationRelativeTo(null);
        Imagen I = new Imagen();
        panelJuego.add(I);
        panelJuego.repaint();
        cNivel=0;
        cPersonajes=0;
        cImg=0;
        cSeleccion = 0;
        visible = 1;
        puntos=0;
        t=1;        
        x1 = 43;
        x2 = 184;
        y = 190;
        NuevoNivel();
    }
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Manu\\Desktop\\imas\\pez.jpg");        
        return retValue;
    }
    
    public void NuevoNivel(){
        if(cNivel==cNiveles){
            //Terminar Juego
            Finalizador();
        }else{
            noNivel = listaNiveles[cNivel].getNo();
            disMax = listaNiveles[cNivel].getDis_max();
            velCor = listaNiveles[cNivel].getVel_cor();
            psum = listaNiveles[cNivel].getP_sel();
            psums = listaNiveles[cNivel].getP_sel_sumergir();

            par = listaNiveles[cNivel].getVel_cor() * listaNiveles[cNivel].getT_sumergir();
            tSum = listaNiveles[cNivel].getT_sumergir();
            tNiv = listaNiveles[cNivel].getT_nivel();

            cNivel+=1;

            AsignacionDet();
        }        
    }
    
    public void AsignacionDet(){
        jNoLvl.setText(String.valueOf(noNivel));
        jPuntaje.setText(String.valueOf(puntos));
        jDisMax.setText(String.valueOf(disMax));
        jVelCor.setText(String.valueOf(velCor));
        
        
        jControlesSel.setText("Selección: " + selizq + " | " + selder);
        jControlPausa.setText("Pausa: " + pau);
        jControlReiniciar.setText("Reiniciar: " + rei);
        jControlSalir.setText("Salir: " + sal);
        
        //Creacion de personajes y su movimiento
        NumRan();
        cr = new Cronometro(tNiv, jTRes);
        Hilos();
        cr.start();
    }
    
    public void Hilos(){        
        mv1 = new Movimiento(par, tSum, anIzq);
        mv2 = new Movimiento(par, tSum, anDer);
        sum1 = new Sumergir(tSum, anIzq);
        sum2 = new Sumergir(tSum, anDer);
        mv2.start();
        mv1.start();
        sum1.start();
        sum2.start();
    }
    
    public void MostrarPersonaje(int t){
        switch (cPersonajes) {
            case 0:
                {
                    Image img = new ImageIcon(listaPersonaje[t].getRuta_imagen()).getImage();
                    ImageIcon imgi = new ImageIcon(img.getScaledInstance(60, 80, Image.SCALE_SMOOTH));
                    anIzq.setIcon(imgi);
                    correcta = "IZQ";
                    cPersonajes+=1;
                    break;
                }
            case 1:
                {
                    Image img = new ImageIcon(listaPersonaje[t].getRuta_imagen()).getImage();
                    ImageIcon imgi = new ImageIcon(img.getScaledInstance(60, 80, Image.SCALE_SMOOTH));
                    anDer.setIcon(imgi);
                    cPersonajes+=1;
                    break;
                }
            default:
                if(correcta.equals("IZQ")){
                    Image img = new ImageIcon(listaPersonaje[t].getRuta_imagen()).getImage();
                    ImageIcon imgi = new ImageIcon(img.getScaledInstance(60, 80, Image.SCALE_SMOOTH));
                    anIzq.setIcon(imgi);
                    correcta = "DER";
                }else{
                    Image img = new ImageIcon(listaPersonaje[t].getRuta_imagen()).getImage();
                    ImageIcon imgi = new ImageIcon(img.getScaledInstance(60, 80, Image.SCALE_SMOOTH));
                    anDer.setIcon(imgi);
                    correcta = "IZQ";
                }   break;
        }
    }
    
    public void NumRan(){
        int t = (int)(rdm.nextDouble()*cPersonaje+0);
        MostrarPersonaje(t);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelJuego = new javax.swing.JPanel();
        anDer = new javax.swing.JLabel();
        anIzq = new javax.swing.JLabel();
        panelDesc = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jNoLvl = new javax.swing.JLabel();
        jTRes = new javax.swing.JLabel();
        jPuntaje = new javax.swing.JLabel();
        jDisMax = new javax.swing.JLabel();
        jVelCor = new javax.swing.JLabel();
        jControlesSel = new javax.swing.JLabel();
        jControlPausa = new javax.swing.JLabel();
        jControlSalir = new javax.swing.JLabel();
        jControlReiniciar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        anDer.setText("             ");

        anIzq.setText("          ");

        javax.swing.GroupLayout panelJuegoLayout = new javax.swing.GroupLayout(panelJuego);
        panelJuego.setLayout(panelJuegoLayout);
        panelJuegoLayout.setHorizontalGroup(
            panelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJuegoLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(anIzq, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(anDer, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        panelJuegoLayout.setVerticalGroup(
            panelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJuegoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anIzq, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anDer, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setText("NIVEL: ");

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel2.setText("TIEMPO RESTANTE: ");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("PUNTOS: ");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("DISTANCIA MÁXIMA");

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel5.setText("VELOCIDAD CORRIENTE: ");

        jLabel6.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel6.setText("CONTROLES: ");

        jLabel7.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel7.setText("¡¡¡Recuerda los animales!!!");

        jNoLvl.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jNoLvl.setText("-----");

        jTRes.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTRes.setText("-----");

        jPuntaje.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jPuntaje.setText("-----");

        jDisMax.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jDisMax.setText("-----");

        jVelCor.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jVelCor.setText("-----");

        jControlesSel.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jControlesSel.setText("-----");

        jControlPausa.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jControlPausa.setText("-----");

        jControlSalir.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jControlSalir.setText("-----");

        jControlReiniciar.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jControlReiniciar.setText("-----");

        javax.swing.GroupLayout panelDescLayout = new javax.swing.GroupLayout(panelDesc);
        panelDesc.setLayout(panelDescLayout);
        panelDescLayout.setHorizontalGroup(
            panelDescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDescLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDescLayout.createSequentialGroup()
                        .addGroup(panelDescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTRes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPuntaje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jDisMax, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jVelCor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jNoLvl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelDescLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(panelDescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jControlReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelDescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jControlPausa, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jControlesSel, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jControlSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel7))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panelDescLayout.setVerticalGroup(
            panelDescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDescLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jNoLvl))
                .addGap(18, 18, 18)
                .addGroup(panelDescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTRes))
                .addGap(18, 18, 18)
                .addGroup(panelDescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPuntaje))
                .addGap(18, 18, 18)
                .addGroup(panelDescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jDisMax))
                .addGap(18, 18, 18)
                .addGroup(panelDescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jVelCor))
                .addGap(18, 18, 18)
                .addGroup(panelDescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jControlesSel))
                .addGap(18, 18, 18)
                .addComponent(jControlPausa)
                .addGap(18, 18, 18)
                .addComponent(jControlSalir)
                .addGap(18, 18, 18)
                .addComponent(jControlReiniciar)
                .addGap(28, 28, 28)
                .addComponent(jLabel7)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelJuego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelDesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void Reinicio(){
        cr.stop();
        mv1.stop();
        mv2.stop();
        sum1.stop();
        sum2.stop();
        cPersonajes = 0;
        cSeleccion=0;
        anDer.setIcon(null);
        anIzq.setIcon(null);
        if(t==0){
            Finalizador();
        }else{
            NuevoNivel();
        }        
    }
    
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        int tecla = evt.getKeyCode();
        NumRanPos();
        if(tecla==SeleccionDer){
            if(cSeleccion==cPersonaje){
                Reinicio();
            }else if(t==0){
                Finalizador();
            }else{
                mv1.stop();
                mv2.stop();
                sum1.stop();
                sum2.stop();
                if(correcta.equals("DER")){
                    if(visible==0){
                        puntos += psums;
                    }else if(visible==1){
                        puntos += psum;
                    }
                }
                jPuntaje.setText(String.valueOf(puntos));
                anDer.setLocation(x2, posy);
                NumRanPos();
                anIzq.setLocation(x1, posy);
                visible=1;
                cSeleccion+=1;
                NumRan();
                Hilos();                    
            }     
        }else if(tecla==SeleccionIzq){
            if(cSeleccion==cPersonaje){
                //Luego de que aparezcan todos los personajes                    
                Reinicio();
            }else if(t==0){
                Finalizador();
            }else{
                mv1.stop();
                mv2.stop();
                sum1.stop();
                sum2.stop();
                if(correcta.equals("IZQ")){
                    if(visible==0){
                        puntos += psums;
                    }else if(visible==1){
                        puntos += psum;
                    }
                }
                jPuntaje.setText(String.valueOf(puntos));        
                anDer.setLocation(x2, posy);
                NumRanPos();
                anIzq.setLocation(x1, posy);
                visible=1;           
                cSeleccion+=1;
                NumRan();
                Hilos();

            }
        }else if(tecla==Pausa){
            mv1.suspend();
            mv2.suspend();
            sum1.suspend();
            sum2.suspend();
            cr.suspend();
            int msj = JOptionPane.showConfirmDialog(null, "PAUSA. Para continuar presionar SI, Para salir presionar NO", "Rio Rapido", JOptionPane.YES_NO_OPTION);
            if(msj!=JOptionPane.YES_OPTION){
                dispose();
                Inicio ini = new Inicio();
                ini.setVisible(true);
            }else{
                mv1.resume();
                mv2.resume();
                cr.resume();
            }
        }else if(tecla==Salir){
            dispose();
            Inicio in = new Inicio();
            in.setVisible(true);
        }else if(tecla==Reiniciar){
            mv1.suspend();
            mv2.suspend();
            sum1.suspend();
            sum2.suspend();
            cr.suspend();
            JOptionPane.showMessageDialog(null, "Se reiniciara la partida", "Rio Rapido", JOptionPane.OK_OPTION);
            dispose();
            Jugar res = new Jugar();
            res.setVisible(true);
        }        
    }//GEN-LAST:event_formKeyPressed

    public void Finalizador(){
        dispose();
        FinalizarJuego fin = new FinalizarJuego(puntos);
        fin.setVisible(true);
    }    

    public void NumRanPos(){        
        int t = (int)(rdm.nextDouble()*y+100);
        posy=t;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anDer;
    private javax.swing.JLabel anIzq;
    private javax.swing.JLabel jControlPausa;
    private javax.swing.JLabel jControlReiniciar;
    private javax.swing.JLabel jControlSalir;
    private javax.swing.JLabel jControlesSel;
    private javax.swing.JLabel jDisMax;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jNoLvl;
    private javax.swing.JLabel jPuntaje;
    private javax.swing.JLabel jTRes;
    private javax.swing.JLabel jVelCor;
    private javax.swing.JPanel panelDesc;
    private javax.swing.JPanel panelJuego;
    // End of variables declaration//GEN-END:variables
    
    //Colocar imagen para el panel de fondo
    public class Imagen extends javax.swing.JPanel{
        public Imagen(){
            this.setSize(300, 400);            
        }
        
        public void paint(Graphics grafico){
            Dimension height = getSize();
            ImageIcon img = new ImageIcon(getClass().getResource("/ipc1/practica2_201807394/Fondo.jpg"));
            grafico.drawImage(img.getImage(), 0, 0, height.width, height.height, null);
            
            setOpaque(false);
            super.paintComponent(grafico);
        }                
    }
    
}
