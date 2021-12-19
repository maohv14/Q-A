package Entidades;

import java.util.List;

public class Categoria {

    private String categoria;
    private List<Pregunta> preguntas;

    public Categoria() {
    }

    public Categoria(String categoria, List<Pregunta> preguntas) {
        this.categoria = categoria;
        this.preguntas = preguntas;
    }

    public String getCategoria() {
        return categoria;
    }

    public List<Pregunta> getPreguntas() {
        return preguntas;
    }
}
