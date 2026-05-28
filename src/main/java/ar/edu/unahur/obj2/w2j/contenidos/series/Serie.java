package ar.edu.unahur.obj2.w2j.contenidos.series;

import java.util.List;

import ar.edu.unahur.obj2.w2j.contenidos.Contenido;

public class Serie extends Contenido {

    private List<Temporada> temporadas;

    public Serie(Double costo, String titulo, List<Temporada> temporadas) {
        super(costo, titulo);
        this.temporadas = temporadas;
    }

    public List<Temporada> getTemporadas() {
        return temporadas;
    }

    @Override
    public Double getCosto() {
        return costoBase + temporadas.stream().mapToDouble(t -> t.costoPromedio()).average().orElse(0.0);
    }

    // @Override
    // public Double getCosto() {
    //     Integer cantEpisodios = temporadas.stream().mapToInt(t -> t.cantidadEpisodios()).sum();
    //     Double costoTotal = temporadas.stream().mapToDouble(t -> t.costoTotal()).sum();
    //     return costoBase + (costoTotal / cantEpisodios);
    // }





    
    
 
}
