package dd.ejercicio2;

public interface Prestador {
    float costo(CategoriaPrestacion categoriaPrestacion);

    float costoParaAtencionMedica();

    float costoParaInternacion();
}
