
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

public class Liga {
    private String nombre;
    ArrayList <Object> equipos;
    Scanner sc = new Scanner(System.in);
    
    public Liga(){
        equipos = new ArrayList();
        
    }
    public boolean buscarEquipo(String nombre){
        for (int i=0;i < equipos.size();i++){
            Equipo equipo = (Equipo) equipos.get(i);
            if(equipo.getNombre().equals(nombre)){
                return true;
            }
        }
        return false;
    }
    public void editarEquipo(){
        System.out.println("************ Equipos en la liga: ************");
        for(int i=0;i<equipos.size();i++){
            Equipo equipo = (Equipo) equipos.get(i);
            System.out.println(i + ".- " + equipo.getNombre());
        }
        int indexEquipo= sc.nextInt();
        if(equipos.size() > indexEquipo){
            System.out.println("********Equipo Encontrado********\nDatos para Modificar:");
            System.out.println("1.- Editar Nombre");
            System.out.println("2.- Sobre Jugadores");
            System.out.println("3.- Sobre Directivos");
            Equipo equipoSeleccionado = (Equipo) equipos.get(indexEquipo);
            switch(sc.nextInt()){
                case 1:
                    System.out.println("Nombre Antiguo:" + equipoSeleccionado.getNombre());
                    System.out.println("Ingrese el Nuevo Nombre......");
                    equipoSeleccionado.setNombre(sc.nextLine());
                    break;
                case 2:
                    System.out.println("1.- Eliminar Jugador");
                    System.out.println("2.- Agregar Jugador");
                    System.out.println("3.- Transferir Jugador");
                    switch(sc.nextInt()){
                        case 1:
                            System.out.println("Ingrese Id. de Jugador...");
                            String id = sc.nextLine();
                            for(int i=0;i<equipoSeleccionado.getJugadores().size();i++){
                                Jugador jugador =(Jugador) equipoSeleccionado.getJugadores().get(i);
                                if(jugador.getNumIdentidad().equals(id)){
                                    equipoSeleccionado.getJugadores().remove(i);
                                }
                            }
                            break;
                        case 2:
                            Jugador jugador = new Jugador();
                            System.out.println("Ingrese el nombre:");
                            jugador.setNombre(sc.nextLine());
                            System.out.println("Ingrese el Id.:");
                            jugador.setNumIdentidad(sc.nextLine());
                            System.out.println("Ingrese la edad:");
                            jugador.setEdad(sc.nextInt());
                            System.out.println("Ingrese el genero:");
                            jugador.setGenero(sc.nextLine());
                            System.out.println("Ingrese el sueldo inicial:");
                            jugador.setSueldo(sc.nextDouble());
                            System.out.println("Ingrese la direccion de Residencia:");
                            jugador.setDireccionResidencia(sc.nextLine());
                            System.out.println("Ingrese la posicion de juego:");
                            jugador.setPosJuego(sc.nextLine());
                            jugador.setEquipoPertenece(equipoSeleccionado.getNombre());
                            equipoSeleccionado.agregarJugador(jugador);
                            jugador = null;
                            break;
                        case 3:
                            System.out.println("Ingrese el equipo al que pertenece el jugador a transferir....");
                            String equipoOrigen = sc.nextLine();
                            if(buscarEquipo(equipoOrigen)){
                                for(int i=0;i<equipos.size();i++){
                                    Equipo e = (Equipo) equipos.get(i);
                                    if (e.getNombre().equals(equipoOrigen)){
                                        System.out.println("Seleccione el jugador a transferir");
                                        for(int j=0;j<e.getJugadores().size();j++){
                                            Jugador ju = (Jugador) e.getJugadores().get(j);
                                            System.out.println(j + ".-" +ju.getNombre());
                                        }
                                        int juSeleccionado = sc.nextInt();
                                        if(e.getJugadores().size() > juSeleccionado ){
                                            Jugador oJugador = new Jugador();
                                            oJugador = (Jugador) e.getJugadores().get(juSeleccionado);
                                            System.out.println("Ingrese el nombre del equipo a hacer transferencia");
                                            String equipoDestino = sc.nextLine();
                                            if(buscarEquipo(equipoDestino)){
                                                for(int k=0;k<equipos.size();k++){
                                                    Equipo eq = (Equipo) equipos.get(k);
                                                    if (eq.getNombre().equals(equipoDestino)){
                                                        eq.agregarJugador(oJugador);
                                                        e.getJugadores().remove(juSeleccionado);
                                                        oJugador = null;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }else{
                                System.out.println("El Equipo mencionado no existe");
                            }
                            
                            break;
                    }
                    
                    break;
                case 3:
                    break;
            }
        } else {
        }
    }
    
    public void eliminarEquipo(String equipoEliminar){
        if(buscarEquipo(equipoEliminar)){
            for (int i=0;i < equipos.size();i++){
                Equipo oEquipo = (Equipo) equipos.get(i);
                if(oEquipo.getNombre().equals(equipoEliminar)){
                    equipos.remove(i);
                }
            }
        }
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Object> getEquipos() {
        return equipos;
    }
    
    public void agregarEquipo(Object equipoAgregar){
        equipos.add(equipoAgregar);
    }
    
    
    
}
