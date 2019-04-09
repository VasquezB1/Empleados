/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.interfaz;

import ec.edu.ups.clases.Perro;

/**
 *
 * @author Byron PC
 */
public class Principall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perro p =new Perro();
/////////////////////////////////////////////////////////////////////////////////
//Declaracion de Variables de la clase Perro
        p.setNombre("Babas");
        p.setEdad(1);
        p.setPeso(2.5);
        p.setSexo("Macho");
////////////////////////////////////////////////////////////////////////////////        
//Imprimir metodos
        p.comer();
        p.dormir();
        p.moverse();
        p.jugar();
        p.reproducirse();
    }
    
}
