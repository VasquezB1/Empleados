/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.universidad;

import java.util.ArrayList;

/**
 *
 * @author Byron PC
 */
public class Sede {
////////////////////////////////////////////////////////////////////////////////
                          //Declaracion de metodos// 


    private int codigo;
    private String nombre;
    private String direccion;
    private String telefono;
    private ArrayList<Carrera> carrera;
////////////////////////////////////////////////////////////////////////////////
                              //Método ToString//
    
    @Override
    public String toString() {
        return "Sede{" + "codigo=" + codigo + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", carrera=" + carrera + '}';
    }
////////////////////////////////////////////////////////////////////////////////
                                //Get and Set//
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Carrera> getCarrera() {
        return carrera;
    }

    public void setCarrera(ArrayList<Carrera> carrera) {
        this.carrera = carrera;
    }

}
