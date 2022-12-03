package Entidades;

public final class Perro extends Animal {

    public Perro() {
    }

    public Perro(String nombre, String alimento, String raza, Integer edad) {
        super(nombre, alimento, raza, edad);
    }

    public void alimentarce() {
        System.out.println("El " + raza + " " + nombre + " se alimenta de: " + alimento);
    }
}
