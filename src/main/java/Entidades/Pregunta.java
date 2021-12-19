package Entidades;

import java.util.List;

public class Pregunta {

    private String descripcion;
    private List<Opcion> opciones;

    public Pregunta() {
    }

    public Pregunta(String descripcion, List<Opcion> opciones) {
        this.descripcion = descripcion;
        this.opciones = opciones;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Opcion> getOpciones() {
        return opciones;
    }

    public void setOpciones(List<Opcion> opciones) {
        this.opciones = opciones;
    }
}
