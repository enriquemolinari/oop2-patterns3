package dd.ejercicio1;

import java.util.Objects;

public abstract class ElementoJuego {
    private String representacion;

    public ElementoJuego(String representacion) {
        this.representacion = representacion;
    }

    public boolean empataCon(ElementoJuego elementoJuego) {
        return this.equals(elementoJuego);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ElementoJuego that)) return false;
        return Objects.equals(representacion, that.representacion);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(representacion);
    }

    @Override
    public String toString() {
        return representacion;
    }

    abstract boolean leGanaA(ElementoJuego eleccionComputadora);

    abstract boolean pierdeConPapel();

    abstract boolean pierdeConPiedra();

    abstract boolean pierdeConTijera();
}
