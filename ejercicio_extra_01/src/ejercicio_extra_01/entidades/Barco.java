package ejercicio_extra_01.entidades;

public class Barco {

    protected String matricula;
    protected Double eslora;
    protected int anioDeFabricacion;

    public Barco() {
    }

    public Barco(String matricula, Double eslora, int anioDeFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioDeFabricacion = anioDeFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getEslora() {
        return eslora;
    }

    public void setEslora(Double eslora) {
        this.eslora = eslora;
    }

    public int getAnioDeFabricacion() {
        return anioDeFabricacion;
    }

    public void setAnioDeFabricacion(int anioDeFabricacion) {
        this.anioDeFabricacion = anioDeFabricacion;
    }

    public void crearBarco() {
        char c1 = (char) (int) (Math.random() * 25 + 65);
        char c2 = (char) (int) (Math.random() * 25 + 65);
        char c3 = (char) (int) (Math.random() * 25 + 65);
        this.matricula = "" + c1 + 3 + c2 + c3 + 2 + (int) (Math.random() * 10);
        this.eslora = (Math.random() * 15 + 5);
        this.anioDeFabricacion = (int) (Math.random() * 72 + 1950);
    }

    @Override
    public String toString() {
        return "Matricula: " + matricula + ", Eslora: " + eslora + ", Año de Fabricacion=" + anioDeFabricacion;
    }

}
