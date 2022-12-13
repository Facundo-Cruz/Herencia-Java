package ejercicio_extra_04.enumeraciones;

public enum Seccion {
    BIBLOTECA(1,"Biblioteca"), DECANATO(2,"Decanato"), SECRETARIA(3,"Secretaría"), 
    BUFFET(4,"Buffet"), COMEDOR_UNIVERSITARIO(5,"Comedor Universitario"); 
    
    private Integer codigo;
    private String valor;

    private Seccion(Integer codigo, String valor) {
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
