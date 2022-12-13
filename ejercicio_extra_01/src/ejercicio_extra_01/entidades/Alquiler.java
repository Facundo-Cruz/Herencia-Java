package ejercicio_extra_01.entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Alquiler {

    private String nombre;
    private int documento;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private int posicionAmarre;
    private int posicionContador = 1;
    private Barco barco;

    public Alquiler() {
        this.posicionAmarre = posicionContador++;
        crearAlquiler();
    }

    public Alquiler(String nombre, int documento, LocalDate fechaAlquiler, LocalDate fechaDevolucion, Barco barco) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionContador++;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public int getPosicionContador() {
        return posicionContador;
    }

    public void setPosicionContador(int posicionContador) {
        this.posicionContador = posicionContador;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public void crearAlquiler() {
        String[] nombres = {"Pepe", "Agus", "Felix", "Lauti", "Pilar", "Giuli", "Meli", "Tuki", "Master"};
        int x = (int) (Math.random() * nombres.length);
        this.nombre = nombres[x];
        this.documento = (int) (Math.random() * 20000000 + 25000000);
        int day = (int) (Math.random() * 30);

        this.fechaAlquiler = LocalDate.now();
        
        this.fechaDevolucion = LocalDate.now();
        this.fechaDevolucion = this.fechaDevolucion.plusDays(day);
        
    }

    @Override
    public String toString() {
        return "Alquiler [" + "Nombre: " + nombre + ", DNI: " + documento + ", \nFecha de Alquiler: " + fechaAlquiler + ", \nFecha de Devolucion: " + fechaDevolucion + ",\nPosicion de Amarre: " + posicionAmarre + "] \nBarco ---> " + barco;
    }

}
