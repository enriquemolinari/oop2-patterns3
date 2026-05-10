package dd.ejercicio2;

public class Clinica implements Prestador {
    private static final float GASTOS_INTERNACION_CLINICA = 15000;

    @Override
    public float costo(CategoriaPrestacion categoriaPrestacion) {
        return categoriaPrestacion.costoParaClinica(this);
    }

    @Override
    public float costoParaAtencionMedica() {
        return 20000;
    }

    @Override
    public float costoParaInternacion() {
        return 50000 + GASTOS_INTERNACION_CLINICA;
    }
}
