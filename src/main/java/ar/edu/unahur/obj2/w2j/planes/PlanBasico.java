package ar.edu.unahur.obj2.w2j.planes;
import java.util.List;

import ar.edu.unahur.obj2.w2j.contenidos.Contenido;
public class PlanBasico implements iPlan {

    private Double precioFijo;
    private Integer limiteContenido;

    public PlanBasico(Double precioFijo, Integer limiteContenido) {
        this.precioFijo = precioFijo;
        this.limiteContenido = limiteContenido;
    }

    @Override
    public Double calcularCosto(List<Contenido> contenidosVistos) {

        Double excedente = contenidosVistos.stream().skip(limiteContenido).mapToDouble(c -> c.getCosto()).sum();

        return precioFijo + excedente;
    }
}