package observer.model;

import java.util.List;

public class CuentaBancaria extends Observable {

    private double monto;

    public CuentaBancaria(double monto, List<Observer> observers) {
        super(observers);
        this.monto = monto;
    }

    public void depositar(double monto) {
        this.monto += monto;
        this.notificar(String.valueOf(this.monto));
    }

    public String saldo() {
        return "$" + monto;
    }
}
