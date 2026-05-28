package ar.edu.unahur.obj2.w2j.planes;
import java.util.List;

import ar.edu.unahur.obj2.w2j.contenidos.Contenido;

public class PlanPremium implements iPlan {

    private Double precioFijo;

    public PlanPremium(Double precioFijo) {
        this.precioFijo = precioFijo;
    }

    @Override
    public Double calcularCosto(List<Contenido> contenidosVistos) {
        return precioFijo;
    }
}

    

