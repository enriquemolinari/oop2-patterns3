package dd.multiple.sobrecarga;

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

        Arbitro arbitro = new Arbitro();
        // ¿Qué crees que va a imprimir esto?
        arbitro.resolverAtaque(atacante, arma, defensa);
    }
}

class Arbitro {
    // Sobrecarga 1: Gerrero con EscuedoMadera
    public void resolverAtaque(Guerrero g, Espada e, EscudoMadera em) {
        System.out.println("Guerrero ataca con Espada: El escudo de madera se astilla.");
    }

    // Sobrecarga 2: Guerrero con baston
    public void resolverAtaque(Guerrero g, Baston b, EscudoMadera em) {
        System.out.println("Guerrero ataca con Baston: El escudo de madera absorbe el golpe.");
    }

    // Sobrecarga 3: Mago con espada
    public void resolverAtaque(Mago m, Espada e, EscudoMadera em) {
        System.out.println("Mago ataca con Espada: El escudo de madera se raja por el impacto.");
    }

    // Sobrecarga 4: Mago con baston
    public void resolverAtaque(Mago m, Baston b, EscudoMadera em) {
        System.out.println("Mago ataca con Baston: El escudo de madera vibra y se mantiene firme.");
    }

    // Genérico
    public void resolverAtaque(Personaje p, Arma a, Escudo e) {
        System.out.println("Ataque genérico: El escudo resiste el impacto.");
    }
}

class Guerrero implements Personaje {

}

class Mago implements Personaje {
}

class Espada implements Arma {

}

class Baston implements Arma {

}

class EscudoMadera implements Escudo {
}
