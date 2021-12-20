package Entidades;


import java.util.ArrayList;
import java.util.Scanner;

public class Ronda extends Pregunta{

    private int rCorrecta;
    private int si_No;
    private int puntos;

    public Ronda() {
    }

    public int getrCorrecta() {return rCorrecta;}

    public void setrCorrecta(int rCorrecta) {this.rCorrecta = rCorrecta;}

    public int getSi_No() {return si_No;}

    public void setSi_No(int si_No) {this.si_No = si_No;}

    public int getPuntos() {return puntos;}

    public void setPuntos(int puntos) {this.puntos = puntos;}

    public void hacerPregunta(Pregunta pregunta){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la letra de la respuesta que considere correcta, Ingresala en minuscula");
        System.out.println("");
        System.out.println(pregunta.getPreguntaNum()+". "+pregunta.getDescripcion()+"  Tema: "+pregunta.getTema());

        System.out.println(pregunta.getOpcion1());
        System.out.println(pregunta.getOpcion2());
        System.out.println(pregunta.getOpcion3());
        System.out.println(pregunta.getOpcion4());

        pregunta.setRespuestaJugador(scanner.nextLine());

        if(pregunta.getRespuestaJugador().equals(pregunta.getRespuestaCorrect())){
            System.out.println("Es Correcto");
            setrCorrecta(1);
            sumarPuntos();
        } else {
            System.out.println("Es Incorrecto");
            setrCorrecta(0);
            puntosaCero();
        }
    }

    public void sumarPuntos(){
        int acumulado = getPuntos();
        acumulado += 10;
        setPuntos(acumulado);

    }

    // El puntaje se vuelve cero
    public void puntosaCero(){
        setPuntos(0);
    }

    //Generar un Numero aleatorio
    public int generarNumeroAleatorio(){
        int numeroAleatorio = (int)(Math.random()*4+0);
        return numeroAleatorio;
    }

    public void continuarSi_No(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ahora tienes: "+ getPuntos() +" Puntos");
        System.out.println("¿Deseas continuar jugando?, recuerda que si la siguiente pregunta se responde incorrecta tu dinero sera 0$ y habra finalizado el juego");
        System.out.println("Si deseas continuar marca 1 de lo contrario marca 2");

        setSi_No(scanner.nextInt());
    }

    //Convertir puntos en dinero
    public void puntosPorDinero(Jugador jugador){
        int dinero;
        dinero = getPuntos() * 100000;
        jugador.setDineroAcumulado(dinero);
    }

    //Terminar el juego
    public void finJuego(){
        System.out.println("Juego terminado");
    }


    public void ganador(){
        System.out.println("Has acumulado un monto de: "+ getPuntos()+ " Puntos");
    }

    //Salida voluntaria del juego
    public void retirada(){System.out.println("Buena descesion, te llevas un total de "+ getPuntos()+ " Puntos");
    }

    //Logica de las las 3 primeras rodas
    public void rondaLogica(ArrayList<Pregunta> arrayList){
        if(getrCorrecta() == 1 && getSi_No() == 1){
            hacerPregunta(arrayList.get(generarNumeroAleatorio()));
            if (getrCorrecta() == 1){
                continuarSi_No();
                if (getrCorrecta() == 1 && getSi_No() == 2){
                    retirada();
                }
            }
        }else {
            if(getrCorrecta() == 0){
                finJuego();
                setrCorrecta(0);
            }
        }
    }


    public void primeraRonda(ArrayList<Pregunta> preguntamFacil){
        hacerPregunta(preguntamFacil.get(generarNumeroAleatorio()));
        if (getrCorrecta() == 1){
            continuarSi_No();
            if(getrCorrecta() == 1 && getSi_No() == 2){
                retirada();
            }
        }else {
            if(getrCorrecta() == 0){
                setrCorrecta(0);
                finJuego();
            }
        }
    }

    public void segundaRonda(ArrayList<Pregunta> preguntaFacil){
        rondaLogica(preguntaFacil);
    }

    public void terceraRonda(ArrayList<Pregunta> preguntaModerada){
        rondaLogica(preguntaModerada);
    }

    public void cuartaRonda(ArrayList<Pregunta> preguntaDificil){
        rondaLogica(preguntaDificil);
    }

    //Ultima ronda
    public void quintaRonda (ArrayList<Pregunta> preguntaExperto){
        if(getrCorrecta() == 1 && getSi_No() == 1){
            hacerPregunta(preguntaExperto.get(generarNumeroAleatorio()));
            if (getrCorrecta() == 1){
                ganador();
            }
        }else {
            if (getrCorrecta() == 0) {
                setrCorrecta(0);
                finJuego();
            }
        }
    }
}
