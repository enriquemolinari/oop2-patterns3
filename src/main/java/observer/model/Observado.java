package observer.model;

import java.util.List;

public abstract class Observado {
    private List<Observer> observers;

    public Observado(List<Observer> observers) {
        this.observers = observers;
    }

    public void agregarObserver(Observer observer) {
        observers.add(observer);
    }

    protected final void notificar(double monto) {
        for (Observer observer : observers) {
            observer.update(monto);
        }
    }
}
