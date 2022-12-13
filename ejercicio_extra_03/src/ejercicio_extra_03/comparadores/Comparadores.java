
package ejercicio_extra_03.comparadores;

import ejercicio_extra_03.entidades.Hotel;
import java.util.Comparator;


public class Comparadores {
    public static Comparator<Hotel> compararPrecioHotel = new Comparator<Hotel>() {
        @Override
        public int compare(Hotel t, Hotel t1) {
            return t1.getPrecioHabitacion().compareTo(t.getPrecioHabitacion());
        }
    };
}
