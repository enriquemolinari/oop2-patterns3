package dd.ejercicio2;

public class Sanatorio implements Prestador {
    private static final float GASTOR_INTERNACION_SANATORIO = 10000;
    private static final float COSTO_MATERIAL_SANATORIO = 25000;

    @Override
    public float costo(CategoriaPrestacion categoriaPrestacion) {
        return categoriaPrestacion.costoParaSanatorio(this);
    }

    @Override
    public float costoParaAtencionMedica() {
        return 15000;
    }

    @Override
    public float costoParaInternacion() {
        return 40000 + COSTO_MATERIAL_SANATORIO + GASTOR_INTERNACION_SANATORIO;
    }
}
