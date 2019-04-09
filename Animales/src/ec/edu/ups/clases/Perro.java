/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import ec.edu.ups.interfaces.Acciones;

/**
 *
 * @author Byron PC
 */
public class Perro extends Animal implements Acciones {

    @Override //Sobbreescritura de metodos Polimorfismo
    public void comer() {
        System.out.println("Clase Perro: ");
        System.out.println("\t El perro " + this.getNombre() + " està comiendo"); //Hereda de animal e implementa acciones

    }

    @Override
    public void dormir() {
        System.out.println("\t El perro tiene " + this.getEdad() + " año");
    }

    @Override
    public void moverse() {
        System.out.println("\t El perro pesa " + this.getPeso() + " kilos");
    }

    @Override
    public void jugar() {
        System.out.println("\t El perro juega mucho porque tiene " + this.getEdad() + " año");
    }

    @Override
    public void reproducirse() {
        System.out.println("\t El perro se reproduce diferente porque es " + this.getSexo());
    }

}
