package ejercicio_extra_04.entidades;

import ejercicio_extra_04.enumeraciones.EstadoCivil;
import ejercicio_extra_04.enumeraciones.Seccion;
import java.time.LocalDate;

public final class PersonalDeServicio extends Persona {

    private LocalDate anioDeIncorporacion;
    private Integer numeroDespacho;
    private Seccion seccion;
    
    public PersonalDeServicio() {
    }
    
    public PersonalDeServicio(LocalDate anioDeIncorporacion, Integer numeroDespacho, Seccion seccion, String nombre, String apellido, Integer numId, EstadoCivil estadoCivil) {
        super(nombre, apellido, numId, estadoCivil);
        this.anioDeIncorporacion = anioDeIncorporacion;
        this.numeroDespacho = numeroDespacho;
        this.seccion = seccion;
    }

    @Override
    public void crearPersona() {
        System.out.println("Creando personal de servicio....");
        super.crearPersona();
        System.out.println("Ingrese el año de incorporación(aaaa/mm/dd)");
        System.out.print("Año --> ");
        int year = leer.nextInt();
        System.out.println("Mes --> ");
        int month = leer.nextInt();
        System.out.println("Día --> ");
        int day = leer.nextInt();
        this.anioDeIncorporacion = LocalDate.of(year, month, day);
        this.numeroDespacho = (int) (Math.random() * 1000 + 1);
        System.out.println("Ingrese a la sección que pertenece");
        Seccion[] secciones = Seccion.values();
        for (int i = 0; i < secciones.length; i++) {
            System.out.println((i + 1) + "- " + secciones[i].getValor());
        }
        int opc = leer.nextInt()-1;
        while (opc < 0 || opc > 4) {
            System.out.println("Ingrese una opción válida");
            opc = leer.nextInt();
        }
        this.seccion = secciones[opc];
        
    }

    public void cambiarDespacho() {
        System.out.println("¿Seguro que deseas cambiar el número de despacho?(S/N)");
        char opc = leer.next().toUpperCase().charAt(0);
        if (opc == 'S') {
            this.numeroDespacho = (int) (Math.random() * 1000 + 1);
            System.out.println("Número de despacho actualizado con éxito");
        }
        
    }

    public void cambiarSeccion() {
        System.out.println("Ingrese la nueva sección asignada");
        Seccion[] secciones = Seccion.values();
        for (int i = 0; i < secciones.length; i++) {
            System.out.println((i + 1) + "- " + secciones[i].getValor());
        }
        int opc = leer.nextInt()-1;
        if (secciones[opc].equals(this.seccion)) {
            System.out.println("No has seleccionado una seccion distinta");
        } else {
            this.seccion = secciones[opc];
            System.out.println("Sección actualizado con éxito :)");
        }
    }
    
    public LocalDate getAnioDeIncorporacion() {
        return anioDeIncorporacion;
    }
    
    public void setAnioDeIncorporacion(LocalDate anioDeIncorporacion) {
        this.anioDeIncorporacion = anioDeIncorporacion;
    }
    
    public Integer getNumeroDespacho() {
        return numeroDespacho;
    }
    
    public void setNumeroDespacho(Integer numeroDespacho) {
        this.numeroDespacho = numeroDespacho;
    }
    
    public Seccion getSeccion() {
        return seccion;
    }
    
    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Año de Incorporación: " + anioDeIncorporacion.toString() + ", Número de Despacho: " + numeroDespacho + ", Sección: " + seccion.getValor();
    }
    
}
