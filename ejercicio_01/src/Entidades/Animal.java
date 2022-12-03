package Entidades;

public abstract class Animal {

    protected String nombre, alimento, raza;
    protected Integer edad;

    public Animal() {
    }

    public Animal(String nombre, String alimento, String raza, Integer edad) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.raza = raza;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", alimento=" + alimento + ", raza=" + raza + ", edad=" + edad + '}';
    }

    public abstract void alimentarce();
}
