package dd.ejercicio2;

public interface CategoriaPrestacion {
    float costoParaHospital(Hospital hospital);

    float costoParaClinica(Clinica clinica);

    float costoParaSanatorio(Sanatorio sanatorio);
}
