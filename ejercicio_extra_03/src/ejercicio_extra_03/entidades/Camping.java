package ejercicio_extra_03.entidades;

public final class Camping extends ExtraHotelero{
    private Integer capacidadMaxDeCarpas;
    private Integer cantidadDeBanios;
    private boolean restaurante;

    public Camping() {
    }

    public Camping(Integer capacidadMaxDeCarpas, Integer cantidadDeBanios, boolean restaurante, boolean privado, Integer metrosCuadrados, String nombre, String gerente, String localidad, String direccion) {
        super(privado, metrosCuadrados, nombre, gerente, localidad, direccion);
        this.capacidadMaxDeCarpas = capacidadMaxDeCarpas;
        this.cantidadDeBanios = cantidadDeBanios;
        this.restaurante = restaurante;
    }
    
    @Override
    public void crearAlojamiento(){
        super.crearAlojamiento();
        System.out.println("Ingrese la capacidad maxima de carpas");
        this.capacidadMaxDeCarpas = leer.nextInt();
        System.out.println("Ingrese la cantidad de baños");
        this.cantidadDeBanios = leer.nextInt();
        System.out.println("¿Tiene restaurante?(S/N)");
        this.restaurante = leer.next().equalsIgnoreCase("S");
    }

    public Integer getCapacidadMaxDeCarpas() {
        return capacidadMaxDeCarpas;
    }

    public void setCapacidadMaxDeCarpas(Integer capacidadMaxDeCarpas) {
        this.capacidadMaxDeCarpas = capacidadMaxDeCarpas;
    }

    public Integer getCantidadDeBanios() {
        return cantidadDeBanios;
    }

    public void setCantidadDeBanios(Integer cantidadDeBanios) {
        this.cantidadDeBanios = cantidadDeBanios;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public String toString() {
        return super.toString()+"Camping{" + "capacidadMaxDeCarpas=" + capacidadMaxDeCarpas + ", cantidadDeBanios=" + cantidadDeBanios + ", restaurante=" + restaurante + '}';
    }
    
}
