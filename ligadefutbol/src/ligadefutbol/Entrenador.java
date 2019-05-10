/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author DESanchezA
 */
public class Entrenador extends Persona {
    private String equipoEntrena;
    
    public Entrenador() {
        super.setOcupacion("Entrenador");
        super.setSueldo(super.getSueldo() + 5000);
    }

    public String getEquipoEntrena() {
        return equipoEntrena;
    }

    public void setEquipoEntrena(String equipoEntrena) {
        this.equipoEntrena = equipoEntrena;
    }
    
    
}
