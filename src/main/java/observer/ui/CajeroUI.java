package observer.ui;

import observer.model.CuentaBancaria;
import observer.model.Observer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class CajeroUI {

    private List<Observer> observers;

    CajeroUI(List<Observer> observers) {
        this.observers = observers;
    }

    public void iniciar() {
        CuentaBancaria cuenta = new CuentaBancaria(0, this.observers);

        JFrame dialog = new JFrame("Cajero Automático");
        JButton button = new JButton("Depositar $1000");
        button.setFont(new Font("Dialog", Font.PLAIN, 20));
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cuenta.depositar(1000);
            }
        });

        dialog.add(button);
        dialog.setSize(250, 150);
        dialog.setLocation(600, 200);
        dialog.setVisible(true);

    }

}
