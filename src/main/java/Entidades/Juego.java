package Entidades;

import java.util.List;

public class Juego {

    private Boolean estaJugando;
    private List<Ronda> rondas;

    public Juego() {
    }

    public Juego(Boolean estaJugando, List<Ronda> rondas) {
        this.estaJugando = estaJugando;
        this.rondas = rondas;
    }

    public Boolean getEstaJugando() {
        return estaJugando;
    }

    public void setEstaJugando(Boolean estaJugando) {
        this.estaJugando = estaJugando;
    }

    public List<Ronda> getRondas() {
        return rondas;
    }

    public void setRondas(List<Ronda> rondas) {
        this.rondas = rondas;
    }
}
