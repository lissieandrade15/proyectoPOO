
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
public class Torneo {
    private String nombreTorneo;
    ArrayList<Object> equiposJugando;
    ArrayList <Object> tablaDePosiciones;
    Liga oLiga = new Liga();
    
    public Torneo(){
        equiposJugando = new ArrayList<>();
        tablaDePosiciones = new ArrayList<>();
    }

    public String getNombreTorneo() {
        return nombreTorneo;
    }

    public void setNombreTorneo(String nombreTorneo) {
        this.nombreTorneo = nombreTorneo;
    }

    public ArrayList<Object> getEquiposJugando() {
        return equiposJugando;
    }

    public void agregarEquipo(Object equipo) {
        this.equiposJugando.add(equipo);
    }

    public void eliminarEquipo(String nombreEquipo){
        
        for (int i=0; i < equiposJugando.size();i++){
            Equipo equipo = (Equipo) equiposJugando.get(i);
            if(equipo.getNombre().equalsIgnoreCase(nombreEquipo)){
                equiposJugando.remove(i);
            }
        }
    }
    
    public ArrayList<Object> getTablaDePosiciones() {
        return tablaDePosiciones;
    }

    public void crearTablaDePosiciones() {
        Equipo mayor = new Equipo();
        while(tablaDePosiciones.size() < equiposJugando.size()){
            for(int i=0; i < equiposJugando.size();i++){
                Equipo actual = (Equipo) equiposJugando.get(i);
                    if(actual.getPuntos() > mayor.getPuntos()){
                        mayor = actual;
                    } 
            }
            tablaDePosiciones.add(mayor);
        }
    }
    
    public void generarTabla(){
        for(int i=0; i<tablaDePosiciones.size();i++){
            Equipo equipoTabla = (Equipo) tablaDePosiciones.get(i);
            System.out.println(i + ".- Equipo: " + equipoTabla.getNombre() + " Puntos: " + equipoTabla.getPuntos());
        }
    }
    
    public void iniciarTorneo1(){
        generarCalendarioConVuelta();
    }
    
        public void iniciarTorneo2(){
        generarCalendarioSinVuelta();
    }
    
    public void generarCalendarioConVuelta(){
        for(int i=0;i<getEquiposJugando().size();i++){
            Equipo actual = (Equipo) getEquiposJugando().get(i);
            for (int j=0; j<getEquiposJugando().size();j++){
                Equipo e = (Equipo) getEquiposJugando().get(j);
              if((j != i)) { //(!(e.buscarOpositor(actual.getNombre()))) &&  //condicion si se desea no hacer vuelta
                  actual.agregarOpositor(e.getNombre());
              } 
            }
        }
    }
    
    public void generarCalendarioSinVuelta(){
        for(int i=0;i<getEquiposJugando().size();i++){
            Equipo actual = (Equipo) getEquiposJugando().get(i);
            for (int j=0; j<getEquiposJugando().size();j++){
                Equipo e = (Equipo) getEquiposJugando().get(j);
              if((j != i) && (!(e.buscarOpositor(actual.getNombre())))) { //(!(e.buscarOpositor(actual.getNombre()))) &&  //condicion si se desea no hacer vuelta
                  actual.agregarOpositor(e.getNombre());
              } 
            }
        }
    }
}
