/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Usuario
 */
public final class Gato extends Animal {

    public Gato() {
    }

    public Gato(String nombre, String alimento, String raza, Integer edad) {
        super(nombre, alimento, raza, edad);
    }

    public void alimentarce() {
        System.out.println("El " + raza + " " + nombre + " se alimenta de: " + alimento);
    }

}
