
package ipc1.practica2_201807394;

public class Jugadores {
    
    String nombre;
    int puntuacion;
    public Jugadores(String nombre, int puntuacion){
        this.nombre = nombre;
        this.puntuacion = puntuacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }
}
