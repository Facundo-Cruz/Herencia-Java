package ejercicio_extra_04;

import ejercicio_extra_04.entidades.Estudiante;
import ejercicio_extra_04.entidades.Persona;
import ejercicio_extra_04.entidades.PersonalDeServicio;
import ejercicio_extra_04.entidades.Profesor;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_extra_04 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Persona> personas = new ArrayList();
        ArrayList<Estudiante> estudiantes = new ArrayList();
        ArrayList<PersonalDeServicio> personalDeServicio = new ArrayList();
        ArrayList<Profesor> profesores = new ArrayList();
        int opc;

        do {
            System.out.println("1- Crear estudiante");
            System.out.println("2- Crear profesor");
            System.out.println("3- Crear personal de servicio");
            System.out.println("4- Mostrar personas");
            System.out.println("5- Actualizar datos");
            System.out.println("6- Salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    Estudiante e1 = new Estudiante();
                    e1.crearPersona();
                    personas.add(e1);
                    estudiantes.add(e1);
                    break;
                case 2:
                    Profesor p1 = new Profesor();
                    p1.crearPersona();
                    personas.add(p1);
                    profesores.add(p1);
                    break;
                case 3:
                    PersonalDeServicio ps1 = new PersonalDeServicio();
                    ps1.crearPersona();
                    personas.add(ps1);
                    personalDeServicio.add(ps1);
                    break;
                case 4:
                    for (Persona aux : personas) {
                        System.out.println(aux);
                        System.out.println("====================================================================================================");
                    }
                    break;
                case 5:
                    System.out.println("1- Actualizar estudiante");
                    System.out.println("2- Actualizar profesor");
                    System.out.println("3- Actualizar personal de servicio");
                    int opc2 = leer.nextInt();
                    switch (opc2) {
                        case 1:
                            if (estudiantes.isEmpty()) {
                                System.out.println("Lo sentimos, todavía no hay estudiantes en la facultad");
                            } else {
                                int count = 1;
                                System.out.println("Ingrese el numero de estudiante a modificar\n");
                                for (Estudiante aux : estudiantes) {
                                    System.out.println("Estudiante " + count);
                                    System.out.println(aux);
                                    System.out.println("========================================================================");
                                    count++;
                                }
                                int opc3 = leer.nextInt() - 1;
                                while (opc3 < 0 || opc3 > estudiantes.size() - 1) {
                                    System.out.println("Ingrese una opción válida");
                                    opc3 = leer.nextInt() - 1;
                                }
                                System.out.println("1- Actualizar estado civil");
                                System.out.println("2- Actualizar cursos matriculados");
                                int opc4 = leer.nextInt();
                                switch (opc4) {
                                    case 1:
                                        estudiantes.get(opc3).cambiarEstadoCivil();
                                        break;
                                    case 2:
                                        estudiantes.get(opc3).matricularCurso();
                                        break;
                                    default:
                                        System.out.println("Has ingresado una opcíon inválida");
                                }
                            }
                            break;
                        case 2:
                            if (profesores.isEmpty()) {
                                System.out.println("Lo sentimos, todavía no hay profesores en la facultad");
                            } else {
                                int count = 1;
                                System.out.println("Ingrese el numero de profesor a modificar\n");
                                for (Profesor aux : profesores) {
                                    System.out.println("Profesor " + count);
                                    System.out.println(aux);
                                    System.out.println("========================================================================");
                                    count++;
                                }
                                int opc3 = leer.nextInt() - 1;
                                while (opc3 < 0 || opc3 > estudiantes.size() - 1) {
                                    System.out.println("Ingrese una opción válida");
                                    opc3 = leer.nextInt() - 1;
                                }
                                System.out.println("1- Actualizar estado civil");
                                System.out.println("2- Actualizar departamento");
                                int opc4 = leer.nextInt();
                                switch (opc4) {
                                    case 1:
                                        profesores.get(opc3).cambiarEstadoCivil();
                                        break;
                                    case 2:
                                        profesores.get(opc3).cambiarDepartamento();
                                        break;
                                    default:
                                        System.out.println("Has ingresado una opcíon inválida");
                                }
                            }
                            break;
                        case 3:
                            if (personalDeServicio.isEmpty()) {
                                System.out.println("Lo sentimos, todavía no hay personal de servicio en la facultad");
                            } else {
                                int count = 1;
                                System.out.println("Ingrese el numero de personal de servicio a modificar\n");
                                for (PersonalDeServicio aux : personalDeServicio) {
                                    System.out.println("Personal de Servicio " + count);
                                    System.out.println(aux);
                                    System.out.println("========================================================================");
                                    count++;
                                }
                                int opc3 = leer.nextInt() - 1;
                                while (opc3 < 0 || opc3 > estudiantes.size() - 1) {
                                    System.out.println("Ingrese una opción válida");
                                    opc3 = leer.nextInt() - 1;
                                }
                                System.out.println("1- Actualizar estado civil");
                                System.out.println("2- Actualizar sección");
                                System.out.println("3- Actualizar despacho");
                                int opc4 = leer.nextInt();
                                switch (opc4) {
                                    case 1:
                                        personalDeServicio.get(opc3).cambiarEstadoCivil();
                                        break;
                                    case 2:
                                        personalDeServicio.get(opc3).cambiarSeccion();
                                        break;
                                    case 3:
                                        personalDeServicio.get(opc3).cambiarDespacho();
                                        break;
                                    default:
                                        System.out.println("Has ingresado una opcíon inválida");
                                }
                            }
                            break;
                        default:
                            System.out.println("Has ingresado una opcíon inválida");
                    }
                    break;
                case 6:
                    System.out.println("adiós......");

                    break;
                default:
                    throw new AssertionError();
            }
            System.out.println("----------------------------------------------------------------------------------------------------");
        } while (opc != 6);

    }

}
