package Entidades;

public class Jugador {

    //private String id;
    private String nombre;
    //private int puntaje;
    private int dineroAcumulado;


    public Jugador() {
    }

    public Jugador(String nombre, int dineroAcumulado) {
        //this.id = id;
        this.nombre = nombre;
        this.dineroAcumulado = dineroAcumulado;
    }

    /*public String getId() {
        return id;

        }


    public void setId(String id) {
        this.id = id;
    }*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getDineroAcumulado() {return dineroAcumulado;}

    public void setDineroAcumulado(int dineroAcumulado) {this.dineroAcumulado = dineroAcumulado;}
}
