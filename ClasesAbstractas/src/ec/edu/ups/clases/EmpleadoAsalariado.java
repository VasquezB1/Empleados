/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.Date;

/**
 *
 * @author Byron PC
 */
public final class EmpleadoAsalariado extends Empleado {

    public EmpleadoAsalariado() {
    }

    public EmpleadoAsalariado(int codigo, String cedula, String nombre, Date fechaContratacion, double salario) {
        super(codigo, cedula, nombre, fechaContratacion, salario);
    }

    /**
     * Método que permite calcular el salario final del empleado asalariado
     *
     * El método tiene la siguiente especificación: si el empleado tiene más de
     * 5 años trabajando en la empresa a su salario base se le aumenta 50
     * dolares por cada año extra caso contrario su salario final es su salario
     * base
     *
     * @return salario final del empleado
     */
    public double calcularSalarioFinal() {
        /*
         */
        Date fechaFin = new Date();
        Date fechaInicio = super.getFechaContratacion();
        long tiempoMilisegundos = fechaFin.getTime() - fechaInicio.getTime();
        long tiempoTranscurridoEnAnios = (tiempoMilisegundos / (3600 * 24 * 1000)) / 365;
        //System.out.println("Tiempo transcurrido " + tiempoTranscurridoEnAnios);

        if (tiempoTranscurridoEnAnios >= 5) {
            int aniosComision = (int) (tiempoTranscurridoEnAnios - 5);
            if (aniosComision > 1) {
                return super.getSalario() + (aniosComision * 50);
            } else {
                return super.getSalario() + 50;
            }
        } else {
            return super.getSalario();
        }

    }

    @Override
    public String toString() {
        //super.toString trae los datos de la clase padre y uno mas lo qu son unicos de la clase hija
        return super.toString() + "Empleado Asalariado = [ SalarioFinal " + this.calcularSalarioFinal() + "]";
    }
}
