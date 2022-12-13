package ejercicio_extra_04.enumeraciones;

public enum Departamento {
   LENGUAJES(1,"Lenguajes"), MATEMATICAS(2,"Matemática"), ARQUITECTURA(3,"Arquitectura"), 
    INGENIERIA(4,"Ingenieria"), ABOGACIA(5,"Abogacía"); 
    
    private Integer codigo;
    private String valor;

    private Departamento(Integer codigo, String valor) {
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
