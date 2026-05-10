package dd.multiple.switchcase;

//sealed interface Personaje permits Guerrero, Mago {
//}
//
//sealed interface Arma permits Espada, Baston {
//}
//
//sealed interface Escudo permits EscudoMadera, EscudoMagico {
//}

interface Personaje {
}

interface Arma {
}

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

            case Ataque(Guerrero g, Baston b, EscudoMadera em) ->
                    System.out.println("Guerrero ataca con Espada: El escudo de madera se astilla brutalmente.");

            case Ataque(Guerrero g, Baston b, EscudoMagico em) ->
                    System.out.println("Guerrero golpea con Bastón el Escudo Mágico: El escudo absorbe el golpe físico sin problema.");

            case Ataque(Guerrero g, Espada es, EscudoMagico em) ->
                    System.out.println("Guerrero golpea con Bastón el Escudo Mágico: El escudo absorbe el golpe físico sin problema.");

            case Ataque(Mago m, Baston b, EscudoMadera em) ->
                    System.out.println("Mago dispara fuego con Bastón: ¡El escudo de madera arde en cenizas!");

            case Ataque(Mago m, Baston cualquierArma, EscudoMagico em) ->
                    System.out.println("Un Mago ataca un Escudo Mágico: Sus energías chocan creando chispas.");

            case Ataque(Mago m, Espada es, EscudoMadera em) ->
                    System.out.println("Mago dispara fuego con Bastón: ¡El escudo de madera arde en cenizas!");

            case Ataque(Mago m, Espada es, EscudoMagico em) ->
                    System.out.println("Mago dispara fuego con Bastón: ¡El escudo de madera arde en cenizas!");

            // El caso default solo necesario si NO uso sealed classes
            default -> {
                System.out.println("Ataque genérico: El escudo resiste el impacto.");
            }
        }
    }
}

record Ataque(Personaje personaje, Arma arma, Escudo escudo) {
}

final class Guerrero implements Personaje {
}

final class Mago implements Personaje {
}

final class Espada implements Arma {
}

final class Baston implements Arma {
}

final class EscudoMadera implements Escudo {
}

final class EscudoMagico implements Escudo {
}