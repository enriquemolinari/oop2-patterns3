package observer.ui;

import observer.model.Observer;

public class ConsoleUI implements Observer {
    @Override
    public void update(double monto) {
        System.out.println("Monto actualizado: " + monto);
    }
}
