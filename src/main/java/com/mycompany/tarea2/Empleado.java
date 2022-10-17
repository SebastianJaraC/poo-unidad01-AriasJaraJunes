package com.mycompany.tarea2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author andyj
 */
public class Empleado {

    String nombre;
    int horasTrabajadas;
    double costoHora;
    int yearIngreso;
    int lim1= 0;
    int lim2= 0;
    int lim3= 0;


    public String mostrarInfo() {
        String retorno = "El empleado se llama: " + this.nombre
                + " su numero de horas trabajadas es: " + this.horasTrabajadas
                + " y costo por hora de su trabajo es: " + this.costoHora + "$"
                + " y el ano que ingreso a trabajar es: " + this.yearIngreso;

        return retorno;

    }

    public double calculoIngresos(int yearActual) {
        double retorno = 0;
        int anosTrabajados = 0;
        double porcentajeAnos = 0;
        anosTrabajados = yearActual - this.yearIngreso;
        porcentajeAnos = anosTrabajados * 0.02;
        retorno = (this.costoHora * this.horasTrabajadas) + ((this.costoHora
                * this.horasTrabajadas) * porcentajeAnos);

        return retorno;

    }

    public double bonohorasExtra() {
        double retorno = 0;
        int horaExtras = 0;
        if (this.horasTrabajadas > 160) {
            horaExtras = (this.horasTrabajadas - 160);
            retorno = ((horaExtras * 2) * this.costoHora);

        }
        return retorno;

    }

    public double calcularImpuestos(int lim1, int lim2, int lim3) {
        double retorno = 0;
        double ingresos = this.costoHora * this.horasTrabajadas;
        if (ingresos > 0 && ingresos <= 0) {
            retorno = 0;
        } else if (ingresos > lim1 & ingresos <= lim2) {
            retorno = ingresos * 0.05;
        } else if (ingresos > lim2 & ingresos <= lim3) {
            retorno = ingresos * 0.12;
        } else if (ingresos > lim3) {
            retorno = ingresos * 0.25;
        }
        return retorno;
    }

    public double calcularTotal(int lim1, int lim2, int lim3) {
        int horasExtras = 0;
        double retorno = 0.0d;
        double impuestos = 0.0d;
        double bono = 0.0d;
        double ingresos = this.costoHora * this.horasTrabajadas  ;
        if (ingresos > 0 && ingresos <= 0) {
            retorno = 0;
        } else if (ingresos > lim1 & ingresos <= lim2) {
            retorno = ingresos * 0.05;
        } else if (ingresos > lim2 & ingresos <= lim3) {
            retorno = ingresos * 0.12;
        } else if (ingresos > lim3) {
            retorno = ingresos * 0.25;
        }
        retorno = this.calculoIngresos(yearIngreso) +  this.bonohorasExtra() -
                this.calcularImpuestos(lim1, lim2, lim3);
        
        return retorno;
    }
}
