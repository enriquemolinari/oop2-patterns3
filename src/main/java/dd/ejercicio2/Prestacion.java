package dd.ejercicio2;

public class Prestacion {
    private CategoriaPrestacion prestacion;
    private Prestador prestador;

    public Prestacion(Prestador prestador, CategoriaPrestacion prestacion) {
        this.prestacion = prestacion;
        this.prestador = prestador;
    }

    public float costo() {
        return this.prestador.costo(this.prestacion);
    }
}
