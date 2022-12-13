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
public final class PoliDeportivo extends Edificio {
    private String nombre;
    private boolean techado;

    public PoliDeportivo() {
        crearEdificio();
    }

    public PoliDeportivo(String nombre, boolean techado, double alto, double ancho, double largo) {
        super(alto, ancho, largo);
        this.nombre = nombre;
        this.techado = techado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }
    
    @Override
    public void crearEdificio() {
        super.crearEdificio();
        System.out.println("Ingrese el nombre del poliDeportivo");
        this.nombre = leer.next();
        System.out.println("¿Es techado?(S/N)");
        this.techado = leer.next().equalsIgnoreCase("S");
        
    }
    
    @Override
    public void calcularSuperficie() {
        double superficice = super.getAncho() * super.getLargo();
        System.out.println("La superficie del poli es " + superficice + " m^2");
    }

    @Override
    public void calcularVolumen() {
        double volumen = super.getAlto() * super.getAncho() * super.getLargo();
        System.out.println("El volumen del poli es " + volumen + " m^3");
    }
    
}
