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
public final class Television extends Electrodomestico {

    private Double pulgadas;
    private Boolean TDT = false;

    public Television() {
    }

    public Television(Double pulgadas, Boolean TDT, Double precio, Double peso, String color, Character consumoEnergetico) {
        super(precio, peso, color, consumoEnergetico);
        this.pulgadas = pulgadas;
        this.TDT = TDT;
    }

    public Double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(Double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public Boolean getTDT() {
        return TDT;
    }

    public void setTDT(Boolean TDT) {
        this.TDT = TDT;
    }

    /**
     * este método llama a crearElectrodomestico() de la clase padre, lo
     * utilizamos para llenar los atributos heredados del padre y después
     * llenamos los atributos del televisor.
     */
    public void crearTelevisor() {
        System.out.println("Vamos a crear una Television");
        crearElectrodomestico();

        System.out.println("Ingrese las pulgadas de la pantalla");
        this.pulgadas = leer.nextDouble();

        System.out.println("Tiene TDT ? [SI] / [NO]");
        if (leer.next().equalsIgnoreCase("Si")) {
            this.TDT = true;
        }
    }

    /**
     * este método será heredado y se le sumará la siguiente funcionalidad. Si
     * el televisor tiene una resolución mayor de 40 pulgadas, se incrementará
     * el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
     * $500. Recuerda que las condiciones que hemos visto en la clase
     * Electrodomestico también deben afectar al precio.
     */
    public void precioFinal() {
        super.precioFinal();

        if (this.pulgadas > 40) {
            this.precio *= 1.3;
        }

        if (TDT) {
            this.precio += 500;
        }
    }
}
