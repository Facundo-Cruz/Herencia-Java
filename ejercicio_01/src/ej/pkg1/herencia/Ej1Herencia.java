package ej.pkg1.herencia;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

public class Ej1Herencia {

    public static void main(String[] args) {

        Animal perro1 = new Perro("Chiquito", "Croquetas de Pollo", "Callejero", 10);

        perro1.alimentarce();

        System.out.println("");

        Gato gato1 = new Gato("Lola", "Pescado y ratones", "Naranjoso", 5);

        gato1.alimentarce();

        System.out.println("");

        Animal caballo1 = new Caballo("Filomena", "Pasto", "Negro", 3);

        caballo1.alimentarce();
    }

}
