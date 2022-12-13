
package ejercicio_extra_03.entidades;

/**
 *
 * @author Facundo
 */
public final class Hotel_5 extends Hotel_4{
    private Integer cantSalCon;
    private Integer cantSuite;
    private Integer cantLim;

    public Hotel_5() {
    }

    public Hotel_5(Integer cantSalCon, Integer cantSuite, Integer cantLim, Character tipoGimnasio, String nombreRestaurante, Integer capacidadRestaurante, Integer cantHabitaciones, Integer numDeCamas, Integer numDePisos, Integer precioHabitacion, String nombre, String gerente, String localidad, String direccion) {
        super(tipoGimnasio, nombreRestaurante, capacidadRestaurante, cantHabitaciones, numDeCamas, numDePisos, precioHabitacion, nombre, gerente, localidad, direccion);
        this.cantSalCon = cantSalCon;
        this.cantSuite = cantSuite;
        this.cantLim = cantLim;
    }
    
    @Override
    public void calcularPrecio(){
        super.calcularPrecio();
        this.precioHabitacion += (cantLim*15);
    }
    
    @Override
    public void crearAlojamiento(){
        
        super.crearAlojamiento();
        System.out.println("Ingrese la cantidad de salones de conferencia");
        this.cantSalCon = leer.nextInt();
        System.out.println("Ingrese la cantidad de suites");
        this.cantSuite = leer.nextInt();
        System.out.println("Ingrese la cantidad de limusinas");
        this.cantLim = leer.nextInt();
        
    }
    

    public Integer getCantSalCon() {
        return cantSalCon;
    }

    public void setCantSalCon(Integer cantSalCon) {
        this.cantSalCon = cantSalCon;
    }

    public Integer getCantSuite() {
        return cantSuite;
    }

    public void setCantSuite(Integer cantSuite) {
        this.cantSuite = cantSuite;
    }

    public Integer getCantLim() {
        return cantLim;
    }

    public void setCantLim(Integer cantLim) {
        this.cantLim = cantLim;
    }

    @Override
    public String toString() {
        return super.toString()+"Hotel_5{" + "cantSalCon=" + cantSalCon + ", cantSuite=" + cantSuite + ", cantLim=" + cantLim + '}';
    }
    
}
