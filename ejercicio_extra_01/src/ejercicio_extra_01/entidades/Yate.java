package ejercicio_extra_01.entidades;

public final class Yate extends Barco {

    private int numeroDeCamarotes;
    private double CV;

    public Yate(int numeroDeCamarotes, double CV, String matricula, Double eslora, int anioDeFabricacion) {
        super(matricula, eslora, anioDeFabricacion);
        this.numeroDeCamarotes = numeroDeCamarotes;
        this.CV = CV;
    }

    
    public Yate() {
        crearBarco();
    }

    public int getNumeroDeCamarotes() {
        return numeroDeCamarotes;
    }

    public void setNumeroDeCamarotes(int numeroDeCamarotes) {
        this.numeroDeCamarotes = numeroDeCamarotes;
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
        this.numeroDeCamarotes = (int) (Math.random() * 5 + 3);
        this.CV = Math.random() * 1000 + 500;
    }

    @Override
    public String toString() {
        return "Tipo: Yate, "+super.toString() + ", Numero De Camarotes=" + numeroDeCamarotes +", CV: "+CV+ " ]";
    }

}
