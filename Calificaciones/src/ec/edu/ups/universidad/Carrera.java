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
public class Carrera {
    ////////////////////////////////////////////////////////////////////////////////
    //Declaracion de metodos// 


    private int codigo;
    private String nombre;
    private ArrayList<Materia> materia;
    private int numeroSemestre;
    private int numeroEstudiantes;
    private String titulo;
////////////////////////////////////////////////////////////////////////////////
                              //Método ToString//
    
    @Override
    public String toString() {
        return "Carrera{" + "codigo=" + codigo + ", nombre=" + nombre + ", materia=" + materia + ", numeroSemestre=" + numeroSemestre + ", numeroEstudiantes=" + numeroEstudiantes + ", titulo=" + titulo + '}';
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

    public ArrayList<Materia> getMateria() {
        return materia;
    }

    public void setMateria(ArrayList<Materia> materia) {
        this.materia = materia;
    }

    public int getNumeroSemestre() {
        return numeroSemestre;
    }

    public void setNumeroSemestre(int numeroSemestre) {
        this.numeroSemestre = numeroSemestre;
    }

    public int getNumeroEstudiantes() {
        return numeroEstudiantes;
    }

    public void setNumeroEstudiantes(int numeroEstudiantes) {
        this.numeroEstudiantes = numeroEstudiantes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
