package dd.ejercicio2;

public class Prestacion {
    private CategoriaPrestacion prestacion;
    private Prestador prestador;

    public Prestacion(Prestador prestador, CategoriaPrestacion prestacion) {
        this.prestacion = prestacion;
        this.prestador = prestador;
    }

    public Prestador tipoPrestador() {
        return this.prestador;
    }

    public CategoriaPrestacion tipoPrestacion() {
        return this.prestacion;
    }
}
