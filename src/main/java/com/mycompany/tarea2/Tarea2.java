/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.tarea2;

/**
 *
 * @author andyj
 */
public class Tarea2 {

    public static void main(String[] args) {

        var empleado1 = new Empleado();

        empleado1.nombre = "Javier";
        empleado1.costoHora = 8;
        empleado1.horasTrabajadas = 8;
        empleado1.yearIngreso = 2019;

        var empleado2 = new Empleado();

        empleado2.nombre = "Daniela";
        empleado2.costoHora = 10;
        empleado2.horasTrabajadas = 6;
        empleado2.yearIngreso = 2015;

        var empleado3 = new Empleado();

        empleado3.nombre = "Sofia";
        empleado3.costoHora = 9;
        empleado3.horasTrabajadas = 8;
        empleado3.yearIngreso = 2021;

        System.out.println("El empleado se llama: " + empleado1.nombre
                + " su numero de horas trabajadas es: " +
                empleado1.horasTrabajadas
                + " y costo por hora de trabajo es: " + 
                empleado1.costoHora + "$"
                + " y el ano que ingreso a trabajar es: " + 
                empleado1.yearIngreso + " y su ingreso total es de: " +
                empleado1.calcularTotal(4000, 5000, 6000) + " $" );

        System.out.println("El empleado se llama: " + empleado2.nombre
                + " su numero de horas trabajadas es: " + 
                empleado2.horasTrabajadas
                + " y costo por hora de trabajo es: " +
                empleado2.costoHora + "$"
                + " y el ano que ingreso a trabajar es: " + 
                empleado2.yearIngreso + " y su ingreso total es de: " + 
                empleado2.calcularTotal(2000, 3000, 5000) + " $" );
        
        System.out.println("El empleado " + empleado3.nombre
                + " tiene un numero de horas de: " + empleado3.horasTrabajadas
                + " y su costo por hora de trabajo es: " + empleado3.costoHora +
                "$" + " su ano de ingreso fue el: " + empleado3.yearIngreso + 
                " y su ingreso total es de: " + 
                empleado3.calcularTotal(1000, 2000, 3000) + 
                " $" );

    }
}
