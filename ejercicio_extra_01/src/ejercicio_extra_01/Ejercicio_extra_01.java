package ejercicio_extra_01;

import ejercicio_extra_01.entidades.*;
import static java.time.temporal.ChronoUnit.DAYS;

import java.util.ArrayList;

public class Ejercicio_extra_01 {

    public static void main(String[] args) {
        ArrayList<Alquiler> alquileres = new ArrayList();
        Alquiler a1 = new Alquiler();
        a1.setBarco(new Yate());
        Alquiler a2 = new Alquiler();
        a2.setBarco(new Velero());
        Alquiler a3 = new Alquiler();
        a3.setBarco(new BarcoAMotor());
        alquileres.add(a1);
        alquileres.add(a2);
        alquileres.add(a3);
        for (Alquiler aux : alquileres) {
            int modulo = 10;
            long dias = DAYS.between(aux.getFechaAlquiler(), aux.getFechaDevolucion());
            System.out.println(aux);
            if (aux.getBarco() instanceof Velero) {
                Velero v1 = (Velero) aux.getBarco();
                modulo += v1.getNumeroDeMastiles();
                
            }else if (aux.getBarco() instanceof BarcoAMotor) {
                BarcoAMotor b1 = (BarcoAMotor) aux.getBarco();
                modulo += b1.getCV();
            }else if (aux.getBarco() instanceof Yate) {
                Yate y1 = (Yate) aux.getBarco();
                modulo += y1.getNumeroDeCamarotes();
                modulo += y1.getCV();
            }
            modulo *= aux.getBarco().getEslora();
            System.out.println("El precio a pagar por "+ dias + " días es $"+modulo);
            System.out.println("------------------------------------------------------------------------------------");
        }
    }

}
