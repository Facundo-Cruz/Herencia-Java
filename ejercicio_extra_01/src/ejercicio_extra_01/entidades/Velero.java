package ejercicio_extra_01.entidades;

public final class Velero extends Barco {

    private int numeroDeMastiles;

    public Velero() {
        crearBarco();
    }

    public Velero(int numeroDeMastiles, String matricula, Double eslora, int anioDeFabricacion) {
        super(matricula, eslora, anioDeFabricacion);
        this.numeroDeMastiles = numeroDeMastiles;
    }

    public int getNumeroDeMastiles() {
        return numeroDeMastiles;
    }

    public void setNumeroDeMastiles(int numeroDeMastiles) {
        this.numeroDeMastiles = numeroDeMastiles;
    }

    @Override
    public void crearBarco() {
        super.crearBarco();
        this.numeroDeMastiles = (int) (Math.random() * 5);
    }

    @Override
    public String toString() {

        return "Tipo: Velero " + super.toString() + ", Numero de Mastiles: " + numeroDeMastiles;
    }

}
