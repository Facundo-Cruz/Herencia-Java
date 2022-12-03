/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Usuario
 */
public final class Lavadora extends Electrodomestico {

    private Double carga;

    public Lavadora() {

    }

    public Lavadora(Double carga, Double precio, Double peso, String color, Character consumoEnergetico) {
        super(precio, peso, color, consumoEnergetico);
        this.carga = carga;
    }

    public Double getCarga() {
        return carga;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
    }

    /**
     * este método llama a crearElectrodomestico() de la clase padre, lo
     * utilizamos para llenar los atributos heredados del padre y después
     * llenamos el atributo propio de la lavadora.
     */
    public void crearLavadora() {
        System.out.println("Vamos a crear la Lavadora");
        
        crearElectrodomestico();

        System.out.println("Ingrese la carga de la lavadora");
        this.carga = leer.nextDouble();

        while (this.carga < 1) {
            System.out.println("Vuelva a ingresar el Carga");
            this.carga = leer.nextDouble();
        }

    }

    /**
     * este método será heredado y se le sumará la siguiente funcionalidad. Si
     * tiene una carga mayor de 30 kg, aumentará el precio en $500, si la carga
     * es menor o igual, no se incrementará el precio. Este método debe llamar
     * al método padre y añadir el código necesario. Recuerda que las
     * condiciones que hemos visto en la clase Electrodoméstico también deben
     * afectar al precio.
     */
    @Override
    public void precioFinal() {
        super.precioFinal();
        if (this.carga > 30) {
            this.precio += 500;
        }
    }
}
