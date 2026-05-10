package dd.ejercicio1;

public class Papel extends ElementoJuego {
    public Papel() {
        super("Papel");
    }

    @Override
    public boolean leGanaA(ElementoJuego eleccionComputadora) {
        return eleccionComputadora.pierdeConPapel();
    }

    @Override
    public boolean pierdeConPapel() {
        return false;
    }

    @Override
    public boolean pierdeConPiedra() {
        return false;
    }

    @Override
    public boolean pierdeConTijera() {
        return true;
    }
}
