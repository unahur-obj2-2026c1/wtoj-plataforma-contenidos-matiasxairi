package ar.edu.unahur.obj2.w2j.contenidos;

public abstract class Contenido{

    private String titulo;
    protected Double costoBase;

    public Contenido(Double costoBase, String titulo) {
        this.costoBase = costoBase;
        this.titulo = titulo;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public Double getCostoBase() {
        return costoBase;
    }

    public abstract  Double getCosto() ;

}
