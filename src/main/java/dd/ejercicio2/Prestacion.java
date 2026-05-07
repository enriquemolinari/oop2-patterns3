package dd.ejercicio2;

public class Prestacion {
    private TipoPrestacion prestacion;
    private TipoPrestador prestador;

    public Prestacion(TipoPrestador prestador, TipoPrestacion prestacion) {
        this.prestacion = prestacion;
        this.prestador = prestador;
    }

    public TipoPrestador tipoPrestador() {
        return this.prestador;
    }

    public TipoPrestacion tipoPrestacion() {
        return this.prestacion;
    }
}
