package ejercicio_extra_01.entidades;

public final class BarcoAMotor extends Barco {

    private double CV;

    public BarcoAMotor() {
        crearBarco();
    }

    public BarcoAMotor(double CV, String matricula, Double eslora, int anioDeFabricacion) {
        super(matricula, eslora, anioDeFabricacion);
        this.CV = CV;
    }

    public double getCV() {
        return CV;
    }

    public void setCV(double CV) {
        this.CV = CV;
    }

    @Override
    public void crearBarco() {
        super.crearBarco();
        this.CV = Math.random() * 1000 + 500;
    }

    @Override
    public String toString() {
        
        return "Tipo: Barco A Motor, " + super.toString() + ", CV=" + CV;
    }

}
