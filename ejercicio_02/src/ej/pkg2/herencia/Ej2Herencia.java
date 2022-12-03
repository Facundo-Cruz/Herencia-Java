package ej.pkg2.herencia;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Television;
import java.util.ArrayList;

public class Ej2Herencia {

    public static void main(String[] args) {
        
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList();
        
        Lavadora lavadora = new Lavadora();

        Television televisor = new Television();

        lavadora.crearLavadora();
        lavadora.precioFinal();
        System.out.println("El precio final de la Lavadora es de: " + lavadora.getPrecio());

        System.out.println("");

        televisor.crearTelevisor();
        televisor.precioFinal();
        System.out.println("El precio final del Televisor es de: " + televisor.getPrecio());

    }

}
