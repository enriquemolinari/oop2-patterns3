package dd.ejercicio1;

import org.junit.jupiter.api.Test;

import static dd.ejercicio1.Jugada.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JugadaTest {

    @Test
    void testPiedraLeGanaATijera() {
        String resultado = new Jugada().jugar(PIEDRA, TIJERA);
        assertEquals(Jugada.GANASTE, resultado);
    }

    @Test
    void testPiedraPierdeConPapel() {
        String resultado = new Jugada().jugar(PIEDRA, PAPEL);
        assertEquals(Jugada.PERDISTE, resultado);
    }

    @Test
    void testPiedraEmpataConPiedra() {
        String resultado = new Jugada().jugar(PIEDRA, PIEDRA);
        assertEquals(Jugada.EMPATE, resultado);
    }

    @Test
    void testPapelEmpataConPapel() {
        String resultado = new Jugada().jugar(PAPEL, PAPEL);
        assertEquals(Jugada.EMPATE, resultado);
    }

    @Test
    void testPapelPierdeConTijera() {
        String resultado = new Jugada().jugar(PAPEL, TIJERA);
        assertEquals(Jugada.PERDISTE, resultado);
    }

    @Test
    void testPapelLeGanaAPiedra() {
        String resultado = new Jugada().jugar(PAPEL, PIEDRA);
        assertEquals(Jugada.GANASTE, resultado);
    }

    @Test
    void testTijeraEmpataConTijera() {
        String resultado = new Jugada().jugar(TIJERA, TIJERA);
        assertEquals(Jugada.EMPATE, resultado);
    }

    @Test
    void testTijeraPierdeConPiedra() {
        String resultado = new Jugada().jugar(TIJERA, PIEDRA);
        assertEquals(Jugada.PERDISTE, resultado);
    }

    @Test
    void testTijeraLeGanaAPapel() {
        String resultado = new Jugada().jugar(TIJERA, PAPEL);
        assertEquals(Jugada.GANASTE, resultado);
    }
}
