package ejercicio_extra_04.entidades;

import ejercicio_extra_04.enumeraciones.Cursos;
import ejercicio_extra_04.enumeraciones.EstadoCivil;
import java.util.ArrayList;

public final class Estudiante extends Persona {

    private ArrayList<Cursos> cursosMatriculados;

    public Estudiante() {
    }

    public Estudiante(ArrayList<Cursos> cursosMatriculados, String nombre, String apellido, Integer numId, EstadoCivil estadoCivil) {
        super(nombre, apellido, numId, estadoCivil);
        this.cursosMatriculados = cursosMatriculados;
    }

    @Override
    public void crearPersona() {
        this.cursosMatriculados = new ArrayList();
        System.out.println("Creando estudiante.....");
        super.crearPersona();
        System.out.println("Ingrese los cursos en los que haya sido matriculado");
        int resp = 0;
        Cursos[] cursos = Cursos.values();
        while (resp != cursos.length+1) {
            for (int i = 0; i < cursos.length; i++) {
                System.out.println((i + 1) + "- " + cursos[i].getValor());
            }
            System.out.println((cursos.length+1) + "- Salir");
            resp = leer.nextInt()-1;
            while (resp<0||resp>cursos.length) {
                System.out.println("Ingrese un valor válido");
                leer.nextInt();
            }
            if (resp == 5) {
                System.out.println("saliendo....");
                break;
            }
            boolean var = true;
            for (Cursos aux : cursosMatriculados) {
                if (aux.equals(cursos[resp])) {
                    var = false;
                    break;
                }
            }
            if (var) {
                this.cursosMatriculados.add(cursos[resp]);
                System.out.println("Curso matriculado con éxito");
            }else{
                System.out.println("Ya has sido matriculado en este curso antes");
            }
            
        }
    }

    public void matricularCurso() {
        Cursos[] cursos = Cursos.values();
        System.out.println("Ingrese el curso a matricular");
        for (int i = 0; i < cursos.length; i++) {
            System.out.println((i + 1) + "- " + cursos[i].getValor());
        }
        int opc = leer.nextInt()-1;
        boolean var = true;
        for (Cursos aux : this.cursosMatriculados) {
            if (aux.equals(cursos[opc])) {
                var = false;
            }
        }
        if (var) {
            this.cursosMatriculados.add(cursos[opc]);
            System.out.println("Curso matriculado con éxito");
        } else {
            System.out.println("El curso seleccionado ya ha sido matriculado antes.");
        }
    }

    public ArrayList<Cursos> getCursosMatriculados() {
        return cursosMatriculados;
    }

    public void setCursosMatriculados(ArrayList<Cursos> cursosMatriculados) {
        this.cursosMatriculados = cursosMatriculados;
    }

    @Override
    public String toString() {
        String cursos = "[";
        for (int i = 0; i < cursosMatriculados.size(); i++) {
            if (i == cursosMatriculados.size() - 1) {
                cursos = cursos + (cursosMatriculados.get(i).getValor() + "]");
            } else {
                cursos = cursos + (cursosMatriculados.get(i).getValor() + ", ");
            }
        }
        return super.toString() + "\n Cursos Matriculados ---> " + cursos;
    }

}
