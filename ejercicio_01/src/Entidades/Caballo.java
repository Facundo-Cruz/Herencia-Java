package Entidades;

public final class Caballo extends Animal {

    public Caballo() {
    }

    public Caballo(String nombre, String alimento, String raza, Integer edad) {
        super(nombre, alimento, raza, edad);
    }

    @Override
    public void alimentarce() {
        System.out.println("El " + raza + " " + nombre + " se alimenta de: " + alimento);
    }

}
