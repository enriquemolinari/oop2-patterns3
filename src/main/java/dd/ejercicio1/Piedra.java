package dd.ejercicio1;

public class Piedra extends ElementoJuego {
    public Piedra() {
        super("Piedra");
    }

    @Override
    public boolean leGanaA(ElementoJuego eleccionComputadora) {
        return eleccionComputadora.pierdeConPiedra();
    }

    @Override
    public boolean pierdeConPapel() {
        return true;
    }

    @Override
    public boolean pierdeConPiedra() {
        return false;
    }

    @Override
    public boolean pierdeConTijera() {
        return false;
    }
}
