package Entidades;

public class Opcion {

    private Boolean esCorrecta;
    private String descripcion;

    public Opcion() {
    }

    public Opcion(Boolean esCorrecta, String descripcion) {
        this.esCorrecta = esCorrecta;
        this.descripcion = descripcion;
    }

    public Boolean getEsCorrecta() {
        return esCorrecta;
    }

    public void setEsCorrecta(Boolean esCorrecta) {
        this.esCorrecta = esCorrecta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
