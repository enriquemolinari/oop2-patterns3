package dd.ejercicio1;

public class Tijera extends ElementoJuego {
    public Tijera() {
        super("Tijera");
    }

    @Override
    public boolean leGanaA(ElementoJuego eleccionComputadora) {
        return eleccionComputadora.pierdeConTijera();
    }

    @Override
    public boolean pierdeConPapel() {
        return false;
    }

    @Override
    public boolean pierdeConPiedra() {
        return true;
    }

    @Override
    public boolean pierdeConTijera() {
        return false;
    }
}
