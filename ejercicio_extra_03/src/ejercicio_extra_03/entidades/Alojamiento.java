package ejercicio_extra_03.entidades;

import java.util.Scanner;

public class Alojamiento {
   Scanner leer = new Scanner(System.in).useDelimiter("\n");
   protected String nombre;
   protected String gerente;
   protected String localidad; 
   protected String direccion;

    public Alojamiento() {
    }

    public Alojamiento(String nombre, String gerente, String localidad, String direccion) {
        this.nombre = nombre;
        this.gerente = gerente;
        this.localidad = localidad;
        this.direccion = direccion;
    }
    
    public void crearAlojamiento(){
        System.out.println("Ingrese el nombre");
        this.nombre = leer.next();
        System.out.println("Ingrese el nombre del gerente");
        this.gerente = leer.next();
        System.out.println("Ingrese la localidad");
        this.localidad = leer.next();
        System.out.println("Ingrese la direccion");
        this.direccion = leer.next();
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Alojamiento{" + "nombre=" + nombre + ", gerente=" + gerente + ", localidad=" + localidad + ", direccion=" + direccion + '}';
    }

  

    

    
    
    
   
}
