package ejercicio_extra_03.entidades;

public class Hotel_4 extends Hotel {

    protected Character tipoGimnasio;
    protected String nombreRestaurante;
    protected Integer capacidadRestaurante;

    @Override
    public void crearAlojamiento() {

        super.crearAlojamiento();
        System.out.println("Ingrese el tipo de gimnasio (A/B)");
        Character gym = leer.next().toUpperCase().charAt(0);
        while (gym != 'A' && gym != 'B') {
            System.out.println("Caracter inválido, vuelve a intentarlo.(A/B)");
            gym = leer.next().toUpperCase().charAt(0);
        }
        this.tipoGimnasio = gym;
        System.out.println("Ingrese el nombre del restaurante");
        this.nombreRestaurante = leer.next();
        System.out.println("Ingrese la capacidad del restaurante");
        this.capacidadRestaurante = leer.nextInt();
        
    }
    
    public void calcularPrecio() {
        this.precioHabitacion += this.numDeCamas;
        //55 30 
        if (capacidadRestaurante > 50) { 
            this.precioHabitacion += 50;
        } else if(this.capacidadRestaurante >= 30){
            this.precioHabitacion += 30;
        } else{
            this.precioHabitacion += 10;
        }
        if (this.tipoGimnasio == 'A') {
            this.precioHabitacion += 50;
        }else{
            this.precioHabitacion += 30;
        }
        
        
    }

    public Hotel_4() {

    }

    public Hotel_4(Character tipoGimnasio, String nombreRestaurante, Integer capacidadRestaurante, Integer cantHabitaciones, Integer numDeCamas, Integer numDePisos, Integer precioHabitacion, String nombre, String gerente, String localidad, String direccion) {
        super(cantHabitaciones, numDeCamas, numDePisos, precioHabitacion, nombre, gerente, localidad, direccion);
        this.tipoGimnasio = tipoGimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public Character getTipoGimnasio() {
        return tipoGimnasio;
    }

    public void setTipoGimnasio(Character tipoGimnasio) {
        this.tipoGimnasio = tipoGimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public Integer getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(Integer capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    @Override
    public String toString() {
        return super.toString() + "Hotel_4{" + "tipoGimnasio=" + tipoGimnasio + ", nombreRestaurante=" + nombreRestaurante + ", capacidadRestaurante=" + capacidadRestaurante + '}';
    }

}
