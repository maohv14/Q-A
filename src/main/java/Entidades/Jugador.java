package Entidades;

public class Jugador {

    private String nombre;
    private int dineroAcumulado;


    public Jugador() {
    }

    public Jugador(String nombre, int dineroAcumulado) {
        this.nombre = nombre;
        this.dineroAcumulado = dineroAcumulado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDineroAcumulado() {return dineroAcumulado;}

    public void setDineroAcumulado(int dineroAcumulado) {this.dineroAcumulado = dineroAcumulado;}
}
