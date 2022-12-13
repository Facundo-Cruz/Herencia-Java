package ejercicio_extra_03;

import ejercicio_extra_03.entidades.Alojamiento;
import ejercicio_extra_03.entidades.Camping;
import ejercicio_extra_03.entidades.Hotel;
import ejercicio_extra_03.entidades.Hotel_4;
import ejercicio_extra_03.entidades.Hotel_5;
import ejercicio_extra_03.entidades.Residencia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import ejercicio_extra_03.comparadores.Comparadores;

public class Ejercicio_extra_03 {

    public static void main(String[] args) {
        ArrayList<Alojamiento> alojamientos = new ArrayList();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opc;
        do {
            System.out.println(".:MENU:.");
            System.out.println("1- Crear alojamiento");
            System.out.println("2- Mostrar alojamientos");
            System.out.println("3- Mostrar hoteles según el precio");
            System.out.println("4- Mostrar campings con restaurante");
            System.out.println("5- Mostrar las residencias con descuento");
            System.out.println("6- Salir");
            opc = leer.nextInt();
            switch (opc) {

                case 1:
                    System.out.println(".:MENU:.");
                    System.out.println("1- Hotel 4 estrellas");
                    System.out.println("2- Hotel 5 estrellas");
                    System.out.println("3- Camping");
                    System.out.println("4- Residencia");
                    int opc2 = leer.nextInt();
                    switch (opc2) {
                        case 1:
                            Hotel_4 h1 = new Hotel_4();
                            h1.crearAlojamiento();
                            h1.calcularPrecio();
                            alojamientos.add(h1);
                            break;
                        case 2:
                            Hotel_5 h2 = new Hotel_5();
                            h2.crearAlojamiento();
                            h2.calcularPrecio();
                            alojamientos.add(h2);
                            break;
                        case 3:
                            Camping c1 = new Camping();
                            c1.crearAlojamiento();
                            alojamientos.add(c1);
                            break;
                        case 4:
                            Residencia r1 = new Residencia();
                            r1.crearAlojamiento();
                            alojamientos.add(r1);

                            break;
                        default:
                            System.out.println("Has ingresado una opción inválida");
                    }
                    break;
                case 2:
                    for (Alojamiento aux : alojamientos) {
                        System.out.println(aux);
                        System.out.println("----------------------------------------------------------------------");
                    }
                    break;

                case 3:
                    ArrayList<Hotel> hoteles = new ArrayList();
                    for (Alojamiento aux : alojamientos) {
                        if (aux instanceof Hotel) {
                            hoteles.add((Hotel) aux);
                        }
                    }
                    Collections.sort(hoteles, Comparadores.compararPrecioHotel);
                    for (Hotel aux : hoteles) {
                        System.out.println(aux);
                        System.out.println("----------------------------------------------------------------------");
                    }
                    break;
                case 4:
                    for (Alojamiento aux : alojamientos) {
                        if (aux instanceof Camping) {
                            if (((Camping) aux).isRestaurante()) {
                                System.out.println(aux);
                                System.out.println("----------------------------------------------------------------------");

                            }
                        }
                    }
                    break;
                case 5:
                    for (Alojamiento aux : alojamientos) {
                        if (aux instanceof Residencia) {
                            if (((Residencia) aux).isGremio()) {
                                System.out.println(aux);
                                System.out.println("----------------------------------------------------------------------");

                            }
                        }
                    }
                    break;
                case 6:
                    System.out.println("Finalizando programa.......");
                    break;
                default:
                    System.out.println("Ingrese una opción valida....");
            }
        } while (opc != 6);

    }

}
