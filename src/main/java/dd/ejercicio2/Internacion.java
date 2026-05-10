package dd.ejercicio2;

public class Internacion implements CategoriaPrestacion {
    @Override
    public float costoParaHospital(Hospital hospital) {
        return hospital.costoParaInternacion();
    }

    @Override
    public float costoParaClinica(Clinica clinica) {
        return clinica.costoParaInternacion();
    }

    @Override
    public float costoParaSanatorio(Sanatorio sanatorio) {
        return sanatorio.costoParaInternacion();
    }
}
