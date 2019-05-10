
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DESanchezA
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Torneo torneo = new Torneo();
        Equipo equipo1 = new Equipo();
        Equipo equipo2 = new Equipo();
        Equipo equipo3 = new Equipo();
        Equipo equipo5 = new Equipo();
        Equipo equipo4 = new Equipo();
        Liga liga = new Liga();
        
        equipo1.setNombre("111111");
        equipo2.setNombre("222222");
        equipo3.setNombre("333333");
        equipo4.setNombre("444444");
        equipo5.setNombre("555555");
        
        torneo.agregarEquipo(equipo1);
        torneo.agregarEquipo(equipo2);
        torneo.agregarEquipo(equipo3);
        torneo.agregarEquipo(equipo4);
        torneo.agregarEquipo(equipo5);
        
        
        
        torneo.iniciarTorneo2();
        System.out.println("*********Calendario sin Vuelta*********\n");
        for(int y=0;y<torneo.getEquiposJugando().size();y++){
            Equipo eq = (Equipo) torneo.getEquiposJugando().get(y);
            for(int z=0;z<eq.getOpositores().size();z++){
                System.out.println(eq.getNombre() + " Vs. " + eq.getOpositores().get(z));
            }
        }
    }
    
}
