
package ipc1.practica2_201807394;

public class Niveles {
    
    int no, dis_max, dis_pan, vel_cor, t_nivel, t_sumergir, p_sel, p_sel_sumergir;
    public Niveles(String no, String dismax, String dispan, String velcor, String tnivel, 
                    String tsumergir, String psel, String pselsumergir){
        
        this.no = Integer.parseInt(no);
        this.dis_max = Integer.parseInt(dismax);
        this.dis_pan = Integer.parseInt(dispan);
        this.vel_cor = Integer.parseInt(velcor);
        this.t_nivel = Integer.parseInt(tnivel);
        this.t_sumergir = Integer.parseInt(tsumergir);
        this.p_sel = Integer.parseInt(psel);
        this.p_sel_sumergir = Integer.parseInt(pselsumergir);
        
    }

    public int getNo() {
        return no;
    }

    public int getDis_max() {
        return dis_max;
    }

    public void setDis_max(int dis_max) {
        this.dis_max = dis_max;
    }

    public int getDis_pan() {
        return dis_pan;
    }

    public void setDis_pan(int dis_pan) {
        this.dis_pan = dis_pan;
    }

    public int getVel_cor() {
        return vel_cor;
    }

    public void setVel_cor(int vel_cor) {
        this.vel_cor = vel_cor;
    }

    public int getT_nivel() {
        return t_nivel;
    }

    public void setT_nivel(int t_nivel) {
        this.t_nivel = t_nivel;
    }

    public int getT_sumergir() {
        return t_sumergir;
    }

    public void setT_sumergir(int t_sumergir) {
        this.t_sumergir = t_sumergir;
    }

    public int getP_sel() {
        return p_sel;
    }

    public void setP_sel(int p_sel) {
        this.p_sel = p_sel;
    }

    public int getP_sel_sumergir() {
        return p_sel_sumergir;
    }

    public void setP_sel_sumergir(int p_sel_sumergir) {
        this.p_sel_sumergir = p_sel_sumergir;
    }
    
    
}
