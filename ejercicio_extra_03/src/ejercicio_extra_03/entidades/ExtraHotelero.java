/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_extra_03.entidades;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class ExtraHotelero extends Alojamiento {
    protected boolean privado;
    protected Integer metrosCuadrados;

    public ExtraHotelero() {
    }

    public ExtraHotelero(boolean privado, Integer metrosCuadrados, String nombre, String gerente, String localidad, String direccion) {
        super(nombre, gerente, localidad, direccion);
        this.privado = privado;
        this.metrosCuadrados = metrosCuadrados;
    }
    
    @Override
    public void crearAlojamiento(){
        super.crearAlojamiento();
        System.out.println("¿Es privado?(S/N)");
        this.privado = leer.next().equalsIgnoreCase("S");
        System.out.println("¿Cuántos metros cuadrados tiene?");
        this.metrosCuadrados = leer.nextInt();
    }
    
    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public Integer getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(Integer metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    @Override
    public String toString() {
        return super.toString()+"ExtraHotelero{" + "privado=" + privado + ", metrosCuadrados=" + metrosCuadrados + '}';
    }

    
    
}
