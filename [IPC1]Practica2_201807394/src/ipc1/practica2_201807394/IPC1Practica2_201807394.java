
package ipc1.practica2_201807394;

import java.awt.event.KeyEvent;

public class IPC1Practica2_201807394 {

    //Lista y Contador de Niveles
    public static Niveles listaNiveles[] = new Niveles[1000];
    public static int cNiveles = 0, carga=0;
    
    //Lista y Contador de Personajes
    public static Personaje listaPersonaje[] = new Personaje[1000];
    public static int cPersonaje = 0;
    
    //Lista y Contador de Jugadores
    public static Jugadores listaJugadores[] = new Jugadores[1000];
    public static int cJugadores=0;
    
    //Lista de Teclas
    public static int SeleccionDer = KeyEvent.VK_RIGHT;    
    public static int SeleccionIzq = KeyEvent.VK_LEFT;
    public static int Pausa = KeyEvent.VK_P;
    public static int Salir = KeyEvent.VK_O;
    public static int Reiniciar = KeyEvent.VK_I;
    public static char selder, selizq, pau, sal, rei;
    
    
    public static void main(String[] args) {       
        selder = '>';
        selizq = '<';
        pau = 'P';
        sal = 'O';
        rei = 'I';
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
    }
    
}