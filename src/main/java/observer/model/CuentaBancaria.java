package observer.model;

import java.util.List;

public class CuentaBancaria extends Observado {

    private double monto;

    public CuentaBancaria(List<Observer> observers, double monto) {
        super(observers);
        this.monto = monto;
    }

    public void depositar(double monto) {
        this.monto += monto;
        this.notificar(this.monto);
    }

    public String saldo() {
        return "$" + monto;
    }
}
