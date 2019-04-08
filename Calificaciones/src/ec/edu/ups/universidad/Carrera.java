/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.universidad;

import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Array;

/**
 *
 * @author Byron PC
 */
public class Carrera {
    ////////////////////////////////////////////////////////////////////////////////
    //Declaracion de metodos// 


    private int codigo;
    private String nombre;
    private List<Materia> materias;
    private int numeroSemestre;
    private int numeroEstudiantes;
    private String titulo;
////////////////////////////////////////////////////////////////////////////////
                              //Método ToString//
    
    @Override
    public String toString() {
        return "\n  Carrera:" + "\n   Codigo: " + codigo + "\n   Nombre: " + nombre + "\n   Materias: " + materias + "\n   Numeros de semestres: " + numeroSemestre
                + "\n   Numero de estudiantes: " + numeroEstudiantes + "\n   Titulo: " + titulo;
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

    public Carrera(){
         materias=new ArrayList<>();
     }
    
    public void agregarMateria(Materia materia){
        materias.add(materia);
    }
    
    public Carrera(int codigo, String nombre, int numeroSemestre, int numeroEstudiantes, String Titulo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.numeroSemestre = numeroSemestre;
        this.numeroEstudiantes = numeroEstudiantes;
        this.titulo = Titulo;
        materias = new ArrayList<>();
                
    }
    
}
