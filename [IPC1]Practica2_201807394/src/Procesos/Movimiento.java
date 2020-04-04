
package Procesos;

import javax.swing.JLabel;


public class Movimiento extends Thread{
    
    int p, ps, altura, ancho;
    JLabel lbl;
    public Movimiento(int p, int ps, JLabel lbl1){
        this.p = p;
        this.ps = ps;
        this.lbl = lbl1;
        this.altura = lbl.getY();
        this.ancho = lbl.getX();
    }

    @Override
    public void run(){
        for(int i=0; i<p;i++){            
            lbl.setLocation(ancho,altura-i);
            try {                
                Movimiento.sleep(ps*20);
            } catch (InterruptedException ex) {
                
            }
        }
    }
}
