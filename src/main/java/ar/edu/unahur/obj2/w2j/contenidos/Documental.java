package ar.edu.unahur.obj2.w2j.contenidos;

public class Documental extends Contenido {

    private Idra idra;

    public Documental(Double costo, String titulo, Idra idra) {
        super(costo, titulo);
        this.idra = idra;
    }

    @Override
    public Double getCosto() {
        return costoBase + idra.getCanon();
    }
}