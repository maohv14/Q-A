package Entidades;

import java.util.List;

public class Pregunta {

    private int preguntaNum;
    private String descripcion;
    private String tema;
    private String respuestaCorrect;
    private String opcion1;
    private String opcion2;
    private String opcion3;
    private String opcion4;
    private String respuestaJugador;


    public Pregunta(int preguntaNum, String descripcion, String tema, String respuestaCorrect, String opcion1, String opcion2, String opcion3, String opcion4){
        this.preguntaNum = preguntaNum;
        this.descripcion = descripcion;
        this.tema = tema;
        this.respuestaCorrect = respuestaCorrect;
        this.opcion1 = opcion1;
        this.opcion2 = opcion2;
        this.opcion3 = opcion3;
        this.opcion4 = opcion4;

    }
    public Pregunta() {
    }

    public int getPreguntaNum() {return preguntaNum;}

    public void setPreguntaNum(int preguntaNum) {this.preguntaNum = preguntaNum;}

    public String getDescripcion() {return descripcion;}

    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}

    public String getTema() {return tema;}

    public void setTema(String tema) {this.tema = tema;}

    public String getRespuestaCorrect() {return respuestaCorrect;}

    public void setRespuestaCorrect(String respuestaCorrect) {this.respuestaCorrect = respuestaCorrect;}

    public String getOpcion1() {return opcion1;}

    public void setOpcion1(String opcion1) {this.opcion1 = opcion1;}

    public String getOpcion2() {return opcion2;}

    public void setOpcion2(String opcion2) {this.opcion2 = opcion2;}

    public String getOpcion3() {return opcion3;}

    public void setOpcion3(String opcion3) {this.opcion3 = opcion3;}

    public String getOpcion4() {return opcion4;}

    public void setOpcion4(String opcion4) {this.opcion4 = opcion4;}

    public String getRespuestaJugador() {return respuestaJugador;}

    public void setRespuestaJugador(String respuestaJugador) {this.respuestaJugador = respuestaJugador;}
}


