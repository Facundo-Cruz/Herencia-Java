
package ejercicio_extra_03.entidades;

import java.util.Scanner;


public class Hotel extends Alojamiento{
    
    protected Integer cantHabitaciones;
    protected Integer numDeCamas;
    protected Integer numDePisos;
    protected Integer precioHabitacion = 50;
    
    
    public Hotel() {
    }

    public Hotel(Integer cantHabitaciones, Integer numDeCamas, Integer numDePisos, Integer precioHabitacion, String nombre, String gerente, String localidad, String direccion) {
        super(nombre, gerente, localidad, direccion);
        this.cantHabitaciones = cantHabitaciones;
        this.numDeCamas = numDeCamas;
        this.numDePisos = numDePisos;
        this.precioHabitacion = precioHabitacion;
    }

    @Override
    public void crearAlojamiento(){
        super.crearAlojamiento();
        System.out.println("Ingrese la cantidad de habitaciones");
        this.cantHabitaciones = leer.nextInt();
        System.out.println("Ingrese el numero de camas");
        this.numDeCamas = leer.nextInt();
        System.out.println("Ingrese numero de pisos");
        this.numDePisos = leer.nextInt();
    }

    public Integer getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(Integer cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public Integer getNumDeCamas() {
        return numDeCamas;
    }

    public void setNumDeCamas(Integer numDeCamas) {
        this.numDeCamas = numDeCamas;
    }

    public Integer getNumDePisos() {
        return numDePisos;
    }

    public void setNumDePisos(Integer numDePisos) {
        this.numDePisos = numDePisos;
    }

    public Integer getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(Integer precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    @Override
    public String toString() {
        return super.toString()+"Hotel{" + "cantHabitaciones=" + cantHabitaciones + ", numDeCamas=" + numDeCamas + ", numDePisos=" + numDePisos + ", precioHabitacion=" + precioHabitacion + '}';
    }

   
  
    
    
    
}
