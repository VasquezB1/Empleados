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
 * Si el empleado realizo ventas entre 500 y 1000 dolares
 * se le otorga una comision del 10% sobre las ventas totales
 * 
 * Si el empleado realizo ventas entre 1001 y 5000 dolares
 * se le otorga una comision del 15% sobre las ventas totales
 * 
 * Si el empleado realizo ventas superiores a 5000 dolares
 * se le otorga una comision del 20% sobre las ventas totales
 */

public final class EmpleadoComision extends Empleado {
 private double ventasMensuales;

    public EmpleadoComision() {
    }

    public EmpleadoComision(double ventasMensuales) {
        this.ventasMensuales = ventasMensuales;
    }

    public EmpleadoComision(double ventasMensuales, int codigo, String cedula, String nombre, Date fechaContratacion, double salario) {
        super(codigo, cedula, nombre, fechaContratacion, salario);
        this.ventasMensuales = ventasMensuales;
    }

    public EmpleadoComision(int codigo, String cedula, String nombre, Date fechaContratacion, double salario) {
        super(codigo, cedula, nombre, fechaContratacion, salario);
    }

    public double getVentasMensuales() {
        return ventasMensuales;
    }

    public void setVentasMensuales(double ventasMensuales) {
        this.ventasMensuales = ventasMensuales;
    }

    /**
     * Método calcularSalarioFinal
     *
     * Si el empleado realizó ventas superiores entre $500 y $1000 se le otorga
     * una comisión del 10% sobre las ventas mensuales.
     *
     * Si el empleado realizó ventas superiores entre $1001 y $5000 se le otorga
     * una comisión del 15% sobre las ventas mensuales.
     *
     * Si el empleado realizó ventas superiores superiores a $5001 se le otorga
     * una comisión del 20% sobre las ventas mensuales.
     *
     * @return salario final del empleado
     */
    public double calcularSalarioFinal() {
        if (ventasMensuales >= 500 && ventasMensuales <= 1000) {
            return super.getSalario() + (ventasMensuales * 0.10);
        } else if (ventasMensuales > 1000 && ventasMensuales <= 5000) {
            return super.getSalario() + (ventasMensuales * 0.15);
        } else if (ventasMensuales > 5000) {
            return super.getSalario() + (ventasMensuales * 0.20);
        } else {
            return super.getSalario();
        }
    }

    @Override
    public String toString() {
       return super.toString() + "EmpleadoComision = [ SalarioFinal " + this.calcularSalarioFinal()+"]"  ;
    }
    

}
