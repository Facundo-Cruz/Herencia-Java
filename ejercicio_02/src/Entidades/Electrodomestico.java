package Entidades;

import java.util.Scanner;

/**
 * Crear una superclase llamada Electrodoméstico con los siguientes atributos:
 * precio, color, consumo energético (letras entre A y F) y peso.
 *
 * @author Usuario
 */
public abstract class Electrodomestico {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected Double precio, peso;
    protected String color;
    protected Character consumoEnergetico;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, Double peso, String color, Character consumoEnergetico) {
        this.precio = precio;
        this.peso = peso;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Character getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(Character consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    /**
     * comprueba que la letra es correcta, sino es correcta usara la letra F por
     * defecto. Este método se debe invocar al crear el objeto y no será
     * visible.
     *
     * @param letra
     */
    public void comprobarConsumoEnergetico(Character consumoEnergetico) {
        if (consumoEnergetico > 'F' || consumoEnergetico < 'A') {
            this.consumoEnergetico = 'F';
        }
    }

    /**
     * comprueba que el color es correcto, y si no lo es, usa el color blanco
     * por defecto. Los colores disponibles para los electrodomésticos son
     * blanco, negro, rojo, azul y gris. No importa si el nombre está en
     * mayúsculas o en minúsculas. Este método se invocará al crear el objeto y
     * no será visible.
     *
     * @param color
     */
    public void comprobarColor(String color) {
        if (!color.equalsIgnoreCase("Blanco") || !color.equalsIgnoreCase("Negro")
                || !color.equalsIgnoreCase("Rojo") || !color.equalsIgnoreCase("Azul")
                || !color.equalsIgnoreCase("Gris")) {
            this.color = "Blanco";
        }
    }

    /**
     * le pide la información al usuario y llena el electrodoméstico, también
     * llama los métodos para comprobar el color y el consumo. Al precio se le
     * da un valor base de $1000.
     */
    public void crearElectrodomestico() {
        this.precio = 1000d;

        System.out.println("Ingrese el Color del electrodomestico");
        this.color = leer.next();

        comprobarColor(getColor());

        System.out.println("Ingrese el consumo Energetico ([A] / [B] / [C] / [D] / [E] / [F])");
        this.consumoEnergetico = leer.next().toUpperCase().charAt(0);

        comprobarConsumoEnergetico(getConsumoEnergetico());

        System.out.println("Ingrese el Peso del Electrodomestico");
        this.peso = leer.nextDouble();
        while (this.peso < 1) {
            System.out.println("Vuelva a ingresar el Peso");
            this.peso = leer.nextDouble();
        }
    }

    /**
     * según el consumo energético y su tamaño, aumentará el valor del precio.
     * Esta es la lista de precios:
     */
    public void precioFinal() {

        switch (this.consumoEnergetico) {
            case 'A':
                this.precio += 1000d;
                break;
            case 'B':
                this.precio += 800d;
                break;
            case 'C':
                this.precio += 600d;
                break;
            case 'D':
                this.precio += 500d;
                break;
            case 'E':
                this.precio += 300d;
                break;
            case 'F':
                this.precio += 100d;
                break;
        }

        if (this.peso > 80) {
            this.precio += 1000;
        } else if (this.peso > 50) {
            this.precio += 800;
        } else if (this.peso > 20) {
            this.precio += 500;
        } else {
            this.precio += 100;
        }

    }
}
