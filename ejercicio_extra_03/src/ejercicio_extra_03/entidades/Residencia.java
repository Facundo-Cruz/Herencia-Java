package ejercicio_extra_03.entidades;

public class Residencia extends ExtraHotelero {

    private Integer cantHabitaciones;
    private boolean Gremio;
    private boolean campoDeportivo;

    public Residencia() {
    }

    public Residencia(Integer cantHabitaciones, boolean Gremio, boolean campoDeportivo, boolean privado, Integer metrosCuadrados, String nombre, String gerente, String localidad, String direccion) {
        super(privado, metrosCuadrados, nombre, gerente, localidad, direccion);
        this.cantHabitaciones = cantHabitaciones;
        this.Gremio = Gremio;
        this.campoDeportivo = campoDeportivo;
    }

    public void crearAlojamiento() {
        super.crearAlojamiento();
        System.out.println("Ingrese la cantidad de habitaciones");
        this.cantHabitaciones = leer.nextInt();
        System.out.println("¿Tiene descuento de gremio?(S/N)");
        this.Gremio = leer.next().equalsIgnoreCase("S");
        System.out.println("¿Tiene campo deportivo?(S/N)");
        this.campoDeportivo = leer.next().equalsIgnoreCase("S");
    }

    public Integer getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(Integer cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isGremio() {
        return Gremio;
    }

    public void setGremio(boolean Gremio) {
        this.Gremio = Gremio;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public String toString() {
        return super.toString() + "Residencia{" + "cantHabitaciones=" + cantHabitaciones + ", Gremio=" + Gremio + ", campoDeportivo=" + campoDeportivo + '}';
    }

}
