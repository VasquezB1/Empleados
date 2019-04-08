/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.universidad;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Byron PC
 */
public class Estudiante extends Persona{
    ////////////////////////////////////////////////////////////////////////////////
    //Declaracion de metodos// 

    private Carrera carrera;
    private List<HistorialCalificacion>calificacion;

////////////////////////////////////////////////////////////////////////////////
                              //Método ToString//
    
    @Override
    public String toString() {
        return "Estudiante: " + "\n Nombre: "+ this.getNombre() + "\n Cedula: " + this.getCedula() + "\n Codigo: " + this.getCodigo() + "\n Direccion: " 
                + this.getDireccion()+ "\n Telefono: " + this.getTelefono() +"\n Carrera: " + carrera + "\n calificaciones: " + calificacion ;
    }
////////////////////////////////////////////////////////////////////////////////
                                //Get and Set//
          
    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
    
    public void agregarHistorialCalificacion(HistorialCalificacion calificacion){
         this.calificacion.add(calificacion);
    }
////////////////////////////////////////////////////////////////////////////////
////////////////1RE MÉTODO
    public Estudiante(int codigo) {
        super(codigo);
    }
/////////////////////////////////////////////////////////////////////////////////
////////////////2DO MÉTODO
    public Estudiante(int codigo, String nombre, String cedula) {
        super(codigo, nombre, cedula);
    }
////////////////////////////////////////////////////////////////////////////////
////////////////3R MÉTODO
    public Estudiante(int codigo, String nombre, String cedula, String telefono, String direccion, String correo) {
        super(codigo, nombre, cedula, telefono, direccion, correo);
        this.carrera = carrera;
        calificacion = new ArrayList<>();
    }
    
    
    
}
