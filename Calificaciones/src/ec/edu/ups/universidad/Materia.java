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
public class Materia {
////////////////////////////////////////////////////////////////////////////////
                                 //Declaracion de metodos// 
    

    private int codigo;
    private String nombre;
    private int numeroCredito;
    private int numeroHora;
    private int nivel;
    private Grupo grupo;
    private Profesor profesor;
/////////////////////////////////////////////////////////////    
      //CONSTRUCTOR
    public Materia(int codigo, String nombre, int numeroCredito, int numeroHora, int nivel, Profesor profesor, Grupo grupo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.numeroCredito = numeroCredito;
        this.numeroHora = numeroHora;
        this.nivel = nivel;
        this.profesor = profesor;
        this.grupo = grupo;
    }
////////////////////////////////////////////////////////////////////////////////
                              //Método ToString//
     @Override
    public String toString() {
        return "\n    Materia: " + "\n     Codigo:" + codigo + "\n     Nombre: " + nombre + "\n     Numero de creditos: " + numeroCredito
                + "\n     Numero de horas: " + numeroHora + "\n     Nivel: " + nivel + "\n     Grupo: " + grupo + "\n     Profesor: " + profesor;
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

    public int getNumeroCredito() {
        return numeroCredito;
    }

    public void setNumeroCredito(int numeroCredito) {
        this.numeroCredito = numeroCredito;
    }

    public int getNumeroHora() {
        return numeroHora;
    }

    public void setNumeroHora(int numeroHora) {
        this.numeroHora = numeroHora;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
////////////////////////////////////////////////////////////////////////////////
  

}
