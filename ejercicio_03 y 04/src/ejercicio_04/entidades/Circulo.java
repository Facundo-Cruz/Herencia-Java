/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_04.entidades;

import ejercicio_04.calculosFormas;

/**
 *
 * @author Facundo
 */
public class Circulo implements calculosFormas{
    
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        double area = PI_CONSTANTE * Math.pow(radio, 2);
        System.out.println("El área es "+ Math.round(area*100)/100);
    }

    @Override
    public void calcularPerimetro() {
        double perimetro = PI_CONSTANTE * (radio*2);
        System.out.println("El perimetro es "+ Math.round(perimetro*100)/100);
    }
    
}
