
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DESanchezA
 */
public class Equipo {
    private String nombre;
    private int goles;
    private int puntos;
    ArrayList<Object> jugadores;
    ArrayList<Object> directivos;
    String localidadJuego;
    ArrayList<String> opositores = new ArrayList<>();
    public Equipo (){
        directivos = new ArrayList<>();
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public ArrayList<Object> getJugadores() {
        return jugadores;
    }

    public void agregarJugador(Object jugador) {
        this.jugadores.add(jugador);
    }

    public ArrayList<Object> getDirectivos() {
        return directivos;
    }

    public void agregarDirectivo(Object directivo) {
        this.directivos.add(directivo);
    }


    public String getLocalidadJuego() {
        return localidadJuego;
    }

    public void setLocalidadJuego(String localidadJuego) {
        this.localidadJuego = localidadJuego;
    }
    
    public boolean buscarOpositor(String opositor){
        for (int i=0; i<opositores.size();i++){
            if(opositores.get(i).equals(opositor)){
                return true;
            }
        }
        return false;
    }
    
    public void agregarOpositor(String opositor){
        this.opositores.add(opositor);
    }

    public ArrayList<String> getOpositores() {
        return opositores;
    }
    
    
}
