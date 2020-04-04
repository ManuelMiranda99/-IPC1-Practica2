
package Procesos;

import ipc1.practica2_201807394.FinalizarJuego;
import ipc1.practica2_201807394.Jugar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Cronometro extends Thread{
    
    int tiempo;
    JLabel label;
    public Cronometro(int tiempo, JLabel label){
        this.tiempo = tiempo;
        this.label = label;
    }
    
    @Override
    public void run(){
        for(int i=0;i<=tiempo;i++){
            label.setText(String.valueOf(tiempo-i));
            try {
                Cronometro.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Cronometro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
        Jugar.t = 0;
        Jugar.mv1.stop();
        Jugar.mv2.stop();
        Jugar.sum1.stop();
        Jugar.sum2.stop();
        JOptionPane.showMessageDialog(null, "Se acabo el tiempo", "Rio Rapido", JOptionPane.INFORMATION_MESSAGE);
        FinalizarJuego fin = new FinalizarJuego(Jugar.puntos);        
    }
}
