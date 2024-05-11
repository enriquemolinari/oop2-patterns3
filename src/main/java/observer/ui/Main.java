package observer.ui;

import javax.swing.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().start();
            }
        });
    }

    private void start() {
        new CajeroUI(List.of(new SwingMonitorDeCuenta(),
                new ConsoleMonitor(),
                new EmailMonitor())).iniciar();
    }
}
