package ejercicio_extra_04.enumeraciones;

public enum Cursos {
    DESARROLLO_PERSONAL(1,"Desarrollo Personal"),INFORMATICA(2,"Informática"),
    ARTES_VISUALES(3,"Artes Visuales"),MARKETING_DIGITAL(4,"Marketing Digital"),
    PROGRAMACION_JAVA(5,"Programación en Java");
    
    private Integer codigo;
    private String valor;

    private Cursos(Integer codigo, String valor) {
        this.codigo = codigo;
        this.valor = valor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
