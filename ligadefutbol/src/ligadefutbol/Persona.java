/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author DESanchezA
 */
public class Persona{
    private String nombre;
    private String numIdentidad;
    private String ocupacion;
    private int edad;
    private double sueldo;
    private String genero;
    private String direccionResidencia;
    ArrayList<String> telefonos;
    
    
        
    public Persona() {
        telefonos = new ArrayList<String>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumIdentidad() {
        return numIdentidad;
    }

    public void setNumIdentidad(String numIdentidad) {
        this.numIdentidad = numIdentidad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    
    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    
    
    public void agregarTelefono(String telefono){
        telefonos.add(telefono);
    }
    public ArrayList<String> getTelefonos(){
        return this.telefonos;
    }
    
    
    
}
    
    
    
    

