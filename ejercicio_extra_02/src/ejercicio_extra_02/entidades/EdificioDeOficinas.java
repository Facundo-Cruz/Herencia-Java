/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_extra_02.entidades;

/**
 *
 * @author Facundo
 */
public final class EdificioDeOficinas extends Edificio {

    private int numeroDeOficinas;
    private int cantidadDePersonas;
    private int numeroDePisos;

    public EdificioDeOficinas() {
        crearEdificio();
    }

    public EdificioDeOficinas(int numeroDeOficinas, int cantidadDePersonas, int numeroDePisos, double alto, double ancho, double largo) {
        super(alto, ancho, largo);
        this.numeroDeOficinas = numeroDeOficinas;
        this.cantidadDePersonas = cantidadDePersonas;
        this.numeroDePisos = numeroDePisos;
    }

    public int getNumeroDeOficinas() {
        return numeroDeOficinas;
    }

    public void setNumeroDeOficinas(int numeroDeOficinas) {
        this.numeroDeOficinas = numeroDeOficinas;
    }

    public int getCantidadDePersonas() {
        return cantidadDePersonas;
    }

    public void setCantidadDePersonas(int cantidadDePersonas) {
        this.cantidadDePersonas = cantidadDePersonas;
    }

    public int getNumeroDePisos() {
        return numeroDePisos;
    }

    public void setNumeroDePisos(int numeroDePisos) {
        this.numeroDePisos = numeroDePisos;
    }

    @Override
    public void crearEdificio() {
        super.crearEdificio();
        System.out.println("Ingrese el número de oficinas");
        this.numeroDeOficinas = leer.nextInt();
        System.out.println("Ingrese la cantidad de personas por oficina");
        this.cantidadDePersonas = leer.nextInt();
        System.out.println("Ingrese el número de pisos");
        this.numeroDePisos = leer.nextInt();
    }
    
    public void cantPersonas(){
        
        int totalPersonas = this.cantidadDePersonas * this.numeroDeOficinas;
        System.out.println("El total de personas por piso es " + totalPersonas);
        System.out.println("El total de personas en el edificio es " + totalPersonas * this.numeroDePisos);
        
    }
    @Override
    public void calcularSuperficie() {
        double superficice = super.getAncho() * super.getLargo() * this.numeroDePisos;
        System.out.println("La superficie del edificio es " + superficice + " m^2");
    }

    @Override
    public void calcularVolumen() {
        double volumen = super.getAlto() * super.getAncho() * super.getLargo();
        System.out.println("El volumen del edificio es " + volumen + " m^3");
    }

}
