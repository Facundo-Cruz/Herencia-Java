package ejercicio_extra_04.entidades;

import ejercicio_extra_04.enumeraciones.Departamento;
import ejercicio_extra_04.enumeraciones.EstadoCivil;
import java.time.LocalDate;
import java.time.Month;

public final class Profesor extends Persona{
    private LocalDate anioDeIncorporacion;
    private Integer numeroDespacho;
    private Departamento departamento;

    public Profesor() {
    }
    
    public Profesor(LocalDate anioDeIncorporacion, Integer numeroDespacho, String nombre, String apellido, Integer numId, EstadoCivil estadoCivil, Departamento departamento) {
        super(nombre, apellido, numId, estadoCivil);
        this.anioDeIncorporacion = anioDeIncorporacion;
        this.numeroDespacho = numeroDespacho;
        this.departamento = departamento;
    }
    
    @Override
    public void crearPersona(){
        System.out.println("Creando profesor.....");
        super.crearPersona();
        System.out.println("Ingrese su fecha de incorporación(AAAA/MM/DD)");
        System.out.print("Año --> ");
        int year = leer.nextInt();
        System.out.print("\nMes --> ");
        int month = leer.nextInt();
        System.out.println("\nDía --> ");
        int day = leer.nextInt();
        this.anioDeIncorporacion = LocalDate.of(year,month, day);
        this.numeroDespacho = (int)(Math.random()*1000+1);
        System.out.println("\nIngrese el departamento al que pertenece");
        Departamento[] departamentos = Departamento.values();
        for (int i = 0; i < departamentos.length; i++) {
            System.out.println((i+1) + "- " + departamentos[i]);
        }
        int opc = leer.nextInt()-1;
        while (opc<0||opc>departamentos.length-1) {
            System.out.println("El número ingresado no corresponde a ningún departamento, vuelve a intentarlo");
            opc = leer.nextInt()-1;
        }
        this.departamento = departamentos[opc];
        
        
    }
    public void cambiarDepartamento(){
        Departamento[] departamentos = Departamento.values();
        System.out.println("Ingrese el nuevo departamento");
        for (int i = 0; i < departamentos.length; i++) {
            System.out.println((i+1) + "- " + departamentos[i]);
        }
        int opc = leer.nextInt()-1;
        if (this.departamento.equals(departamentos[opc])) {
            System.out.println("Has ingresado el mismo departamento :/");
        }else{
            this.departamento = departamentos[opc];
            System.out.println("Nuevo departamento asignado con éxito :)");
        }
    }
    
    public LocalDate getAnioDeIncorporacion() {
        return anioDeIncorporacion;
    }

    public void setAnioDeIncorporacion(LocalDate anioDeIncorporacion) {
        this.anioDeIncorporacion = anioDeIncorporacion;
    }

    public Integer getNumeroDespacho() {
        return numeroDespacho;
    }

    public void setNumeroDespacho(Integer numeroDespacho) {
        this.numeroDespacho = numeroDespacho;
    }

    public Departamento getDepartamentoAsignado() {
        return departamento;
    }

    public void setDepartamentoAsignado(Departamento DepartamentoAsignado) {
        this.departamento = DepartamentoAsignado;
    }

    @Override
    public String toString() {
        return super.toString()+ ", Año de Incorporación: " + anioDeIncorporacion.toString() + ", Número de Despacho: " + numeroDespacho + ", Departamento: " + departamento.getValor() ;
    }
    
    
    
    
    
    
}
