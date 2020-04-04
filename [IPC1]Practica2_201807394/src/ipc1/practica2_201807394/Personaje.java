
package ipc1.practica2_201807394;


public class Personaje {
    
    String nombre, ruta_imagen;
    public Personaje(String nombre, String ruta_imagen){
        this.nombre = nombre;
        this.ruta_imagen = ruta_imagen;
    }    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuta_imagen() {
        return ruta_imagen;
    }

    public void setRuta_imagen(String ruta_imagen) {
        this.ruta_imagen = ruta_imagen;
    }
    
}
