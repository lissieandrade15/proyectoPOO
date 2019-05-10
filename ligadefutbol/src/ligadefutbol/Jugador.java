/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DESanchezA
 */
public class Jugador extends Persona {
    private String posJuego;
    private String equipoPertenece;
    private int golesAnotados;
    private int tarjetasRojas;
    private int tarjetasAmarillas;
    private int partidosJugados;
    private int faltasRecibidas;

    public Jugador() {
        super.setOcupacion("Jugador");
    }

    public String getPosJuego() {
        return posJuego;
    }

    public void setPosJuego(String posJuego) {
        this.posJuego = posJuego;
    }

    public String getEquipoPertenece() {
        return equipoPertenece;
    }

    public void setEquipoPertenece(String equipoPertenece) {
        this.equipoPertenece = equipoPertenece;
    }

    public int getGolesAnotados() {
        return golesAnotados;
    }

    public void setGolesAnotados(int golesAnotados) {
        this.golesAnotados = golesAnotados;
    }

    public int getTarjetasRojas() {
        return tarjetasRojas;
    }

    public void setTarjetasRojas(int tarjetasRojas) {
        this.tarjetasRojas = tarjetasRojas;
    }

    public int getTarjetasAmarillas() {
        return tarjetasAmarillas;
    }

    public void setTarjetasAmarillas(int tarjetasAmarillas) {
        this.tarjetasAmarillas = tarjetasAmarillas;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getFaltasrecibidas() {
        return faltasRecibidas;
    }

    public void setFaltasrecibidas(int faltasrecibidas) {
        this.faltasRecibidas = faltasrecibidas;
    }
    
    
}
