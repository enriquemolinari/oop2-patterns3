package strategy;

public class CalculadorLlamadaNacional implements CalculadorLlamada {
    private float costoXMinuto;

    public CalculadorLlamadaNacional(float costoXMinuto) {
        this.costoXMinuto = costoXMinuto;
    }

    @Override
    public float costo(float duracion) {
        float costo = this.costoXMinuto * duracion;
        if (duracion > 30) {
            costo *= 0.9;
        }
        return costo;
    }
}
