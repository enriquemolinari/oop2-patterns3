package dd.multiple.switchcase;

// 1. Personajes
interface Personaje {
}

// 2. Armas
interface Arma {
}

// 3. Escudos
interface Escudo {
}

public class Main {
    public static void main(String[] args) {
        Personaje atacante = new Guerrero();
        Arma arma = new Espada();
        Escudo defensa = new EscudoMadera();

        SistemaDeCombate combate = new SistemaDeCombate();

        // Magia moderna:
        combate.resolverAtaque(atacante, arma, defensa);
        // Imprime: "Guerrero ataca con Espada: El escudo de madera se astilla brutalmente."
    }
}

class SistemaDeCombate {

    public void resolverAtaque(Personaje p, Arma a, Escudo e) {
        Ataque ataqueActual = new Ataque(p, a, e);

        //incoporrado en Java 21
        switch (ataqueActual) {
            // Combinaciones específicas
            case Ataque(Guerrero g, Espada es, EscudoMadera em) ->
                    System.out.println("Guerrero ataca con Espada: El escudo de madera se astilla brutalmente.");

            case Ataque(Mago m, Baston b, EscudoMadera em) ->
                    System.out.println("Mago dispara fuego con Bastón: ¡El escudo de madera arde en cenizas!");

            case Ataque(Guerrero g, Baston b, EscudoMagico em) ->
                    System.out.println("Guerrero golpea con Bastón el Escudo Mágico: El escudo absorbe el golpe físico sin problema.");

            // Podemos agrupar casos genéricos si no nos importa el arma específica
            case Ataque(Mago m, Arma cualquierArma, EscudoMagico em) ->
                    System.out.println("Un Mago ataca un Escudo Mágico: Sus energías chocan creando chispas.");

            // El caso "catch-all" (default) para las combinaciones que no declaramos explícitamente
            default -> {
                System.out.println("Ataque genérico: El escudo resiste el impacto.");
            }
        }
    }
}

record Ataque(Personaje personaje, Arma arma, Escudo escudo) {
}

record Guerrero() implements Personaje {
}

record Mago() implements Personaje {
}

record Espada() implements Arma {
}

record Baston() implements Arma {
}

record EscudoMadera() implements Escudo {
}

record EscudoMagico() implements Escudo {
}