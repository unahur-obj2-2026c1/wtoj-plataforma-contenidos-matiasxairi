package ar.edu.unahur.obj2.w2j.contenidos;

public abstract class Contenido{

    private String titulo;
    protected Double costo;

    public Contenido(Double costo, String titulo) {
        this.costo = costo;
        this.titulo = titulo;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public Double getCosto() {
        return costo;
    }


}
