package observer.ui;

import observer.model.Observer;

public class ConsoleMonitor implements Observer {
    @Override
    public void actualizar(String info) {
        System.out.println("En consola: " + info);
    }
}
