package ar.edu.unahur.obj2.w2j.usuarios;
import java.util.List;
 
import ar.edu.unahur.obj2.w2j.contenidos.Contenido;
import ar.edu.unahur.obj2.w2j.planes.iPlan;
public class Usuario {

    private iPlan plan;
    private List<Contenido> contenidosVistos;

    public double costoMensual() {
        return plan.calcularCosto(contenidosVistos);
    }

}
