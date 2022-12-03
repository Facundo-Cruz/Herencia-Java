package ejercicio_04;

import ejercicio_04.entidades.Circulo;
import ejercicio_04.entidades.Rectangulo;

public class Ejercicio_04 {

    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(5, 10);
        Circulo c1 = new Circulo(5);
        
        System.out.println("Rectángulo:");
        r1.calcularArea();
        r1.calcularPerimetro();

        System.out.println("Circulo:");
        c1.calcularArea();
        c1.calcularPerimetro();
        
    }

}
