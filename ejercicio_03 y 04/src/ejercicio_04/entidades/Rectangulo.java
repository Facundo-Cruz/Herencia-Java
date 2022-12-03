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
public class Rectangulo implements calculosFormas {

    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        double area = this.base * this.altura;
        System.out.println("El área es " + Math.round(area*100)/100);
    }

    @Override
    public void calcularPerimetro() {
        double perimetro = (this.base + this.altura) * 2;
        System.out.println("El perimetro es " + Math.round(perimetro*100)/100);
    }

}
