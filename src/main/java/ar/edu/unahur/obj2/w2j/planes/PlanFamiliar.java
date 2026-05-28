package ar.edu.unahur.obj2.w2j.planes;
import java.util.List;

import ar.edu.unahur.obj2.w2j.contenidos.Contenido;

public class PlanFamiliar implements iPlan {

    private PlanBasico planBasico;

    public PlanFamiliar(PlanBasico planBasico) {
        this.planBasico = planBasico;
    }

    @Override
    public Double calcularCosto(List<Contenido> contenidosVistos) {

        Double costoBase = planBasico.calcularCosto(contenidosVistos);

        return costoBase * 0.85;
    }
}