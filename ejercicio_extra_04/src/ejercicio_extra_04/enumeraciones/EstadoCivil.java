package ejercicio_extra_04.enumeraciones;

public enum EstadoCivil {
    SOLTERO(1,"Soltero/a"), CASADO(2,"Casado/a"), DE_NOVIO(3,"De novio/a"), 
    DIVORCIADO(4,"Divorciado/a"), VIUDO(5,"Viudo/a"); 
    
    private Integer codigo;
    private String valor;

    private EstadoCivil(Integer codigo, String valor) {
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
