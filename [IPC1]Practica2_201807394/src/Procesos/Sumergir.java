
package Procesos;

import ipc1.practica2_201807394.Jugar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;


public class Sumergir extends Thread{
    
    int t;
    JLabel label;
    public Sumergir(int t, JLabel label){        
        this.t = t;
        this.label = label;        
    }
    
    @Override
    public void run(){
        for(int i=0;i<t;i++){
            try {
                Sumergir.sleep(1000);
            } catch (InterruptedException ex) {
                
            }
        }
        label.setIcon(null);
        Jugar.visible = 0;
    }
}
