package ejercicio_extra_04.entidades;

import ejercicio_extra_04.enumeraciones.EstadoCivil;
import java.util.Scanner;

public class Persona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected String nombre;
    protected String apellido;
    protected Integer numId;
    private static Integer contadorId = 0;
    protected EstadoCivil estadoCivil;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer numId, EstadoCivil estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numId = numId;
        this.estadoCivil = estadoCivil;
    }
    
    public void crearPersona(){
        System.out.println("Ingrese el nombre");
        this.nombre = leer.next();
        System.out.println("Ingrese el apellido");
        this.apellido = leer.next();
        this.numId = ++contadorId;
        System.out.println("Ingrese su estado civil");
        EstadoCivil[] vector = EstadoCivil.values();
        for (int i = 0; i < vector.length; i++) {
            System.out.println(i + 1 + "- " + vector[i].getValor());
        }
        int opc = leer.nextInt()-1;
        while (opc < 0 || opc > vector.length-1) {
            System.out.println("Has ingresado un número incorrecto, vuelve a intentarlo");
            opc = leer.nextInt()-1;
        }
        this.estadoCivil = vector[opc];
    }
    public void cambiarEstadoCivil() {
        System.out.println("Ingrese su estado ciivl acutal");
        EstadoCivil[] vector = EstadoCivil.values();
        for (int i = 0; i < vector.length; i++) {
            System.out.println(i + 1 + "- " + vector[i].getValor());
        }
        int opc = leer.nextInt()-1;
        if (opc >= 0 && opc <= vector.length-1) {
            this.estadoCivil = vector[opc];
            System.out.println("Estado civil actualizado con éxito");
        }else{
            System.out.println("Has ingresado un número incorrecto");
        }
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getNumId() {
        return numId;
    }

    public void setNumId(Integer numId) {
        this.numId = numId;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Apellido: " + apellido + ", Numero de Id: " + numId + ", Estado Civil: " + estadoCivil;
    }
    
    
}
