package dd.ejercicio2;

public class AtencionMedica implements CategoriaPrestacion {
    @Override
    public float costoParaHospital(Hospital hospital) {
        return hospital.costoParaAtencionMedica();
    }

    @Override
    public float costoParaClinica(Clinica clinica) {
        return clinica.costoParaAtencionMedica();
    }

    @Override
    public float costoParaSanatorio(Sanatorio sanatorio) {
        return sanatorio.costoParaAtencionMedica();
    }
}
