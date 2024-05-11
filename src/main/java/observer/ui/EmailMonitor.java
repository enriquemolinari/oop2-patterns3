package observer.ui;

import observer.model.Observer;

public class EmailMonitor implements Observer {
    public static final int MONTO_ALTO = 4000;

    @Override
    public void actualizar(String info) {
        if (Float.valueOf(info) > MONTO_ALTO) {
            System.out.println("Enviando email...");
        }
    }
}
