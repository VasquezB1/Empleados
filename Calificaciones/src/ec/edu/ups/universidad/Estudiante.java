/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.universidad;

/**
 *
 * @author Byron PC
 */
public class Estudiante {
    ////////////////////////////////////////////////////////////////////////////////
    //Declaracion de metodos// 

    private Carrera carrera;
////////////////////////////////////////////////////////////////////////////////
                              //Método ToString//
    
    @Override
    public String toString() {
        return "Estudiante{" + "carrera=" + carrera + '}';
    }
////////////////////////////////////////////////////////////////////////////////
                                //Get and Set//
          
    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
    
    
}
