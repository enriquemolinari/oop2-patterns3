package dd.ejercicio2;

public class Hospital implements Prestador {
    static final int GRATIS = 0;
    private static final float COSTO_MATERIAL_HOSPITAL = 35000;

    @Override
    public float costo(CategoriaPrestacion categoriaPrestacion) {
        return categoriaPrestacion.costoParaHospital(this);
    }

    @Override
    public float costoParaAtencionMedica() {
        return GRATIS;
    }

    @Override
    public float costoParaInternacion() {
        return COSTO_MATERIAL_HOSPITAL;
    }
}
