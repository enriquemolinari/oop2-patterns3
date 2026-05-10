package dd.ejercicio1;

public class Jugada {
    public static final String GANASTE = "¡Ganaste!";
    public static final String PERDISTE = "¡Perdiste!";
    public static final String EMPATE = "¡Es un empate!";

    public String jugar(ElementoJuego eleccionUsuario, ElementoJuego eleccionComputadora) {
        if (eleccionUsuario.empataCon(eleccionComputadora)) {
            return EMPATE;
        }
        if (eleccionUsuario.leGanaA(eleccionComputadora)) {
            return GANASTE;
        }
        return PERDISTE;
    }
}
