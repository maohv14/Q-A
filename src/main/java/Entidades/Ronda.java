package Entidades;

public class Ronda {

    private Jugador jugador;

    public Ronda() {
    }

    public Ronda(Jugador jugador) {
        this.jugador = jugador;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
}
