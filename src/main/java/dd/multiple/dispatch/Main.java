package dd.multiple.dispatch;

interface Personaje {
    void atacar(Arma arma, Escudo escudo);
}

interface Arma {
    void usarPor(Guerrero guerrero, Escudo escudo);

    void usarPor(Mago mago, Escudo escudo);
}

interface Escudo {
    void defender(Guerrero guerrero, Espada espada);

    void defender(Guerrero guerrero, Baston baston);

    void defender(Mago mago, Espada espada);

    void defender(Mago mago, Baston baston);
}

public class Main {
    public static void main(String[] args) {
        Personaje atacante = new Guerrero();
        Arma arma = new Espada();
        Escudo defensa = new EscudoMadera();

        atacante.atacar(arma, defensa);
    }
}

class Guerrero implements Personaje {
    @Override
    public void atacar(Arma arma, Escudo escudo) {
        // 1er salto: Ya sabemos que somos un Guerrero. Se lo decimos al arma.
        arma.usarPor(this, escudo);
    }
}

class Mago implements Personaje {
    @Override
    public void atacar(Arma arma, Escudo escudo) {
        // 1er salto: Ya sabemos que somos un Mago.
        arma.usarPor(this, escudo);
    }
}

class Espada implements Arma {
    @Override
    public void usarPor(Guerrero guerrero, Escudo escudo) {
        // 2do salto: Ya sabemos que es Guerrero y Espada. Se lo decimos al escudo.
        escudo.defender(guerrero, this);
    }

    @Override
    public void usarPor(Mago mago, Escudo escudo) {
        escudo.defender(mago, this);
    }
}

class Baston implements Arma {
    @Override
    public void usarPor(Guerrero guerrero, Escudo escudo) {
        escudo.defender(guerrero, this);
    }

    @Override
    public void usarPor(Mago mago, Escudo escudo) {
        escudo.defender(mago, this);
    }
}

class EscudoMadera implements Escudo {
    @Override
    public void defender(Guerrero guerrero, Espada espada) {
        System.out.println("Guerrero golpea Escudo de Madera con Espada: El escudo se astilla.");
    }

    @Override
    public void defender(Guerrero guerrero, Baston baston) {
        System.out.println("Guerrero golpea Escudo de Madera con Bastón: Golpe contundente bloqueado.");
    }

    @Override
    public void defender(Mago mago, Espada espada) {
        System.out.println("Mago ataca Escudo de Madera con Espada: Daño leve.");
    }

    @Override
    public void defender(Mago mago, Baston baston) {
        System.out.println("Mago dispara magia con Bastón al Escudo de Madera: ¡El escudo se quema!");
    }
}

// Falta EscudoMagico