package strategy;

public class CalculadorLlamadaNacional implements CalculadorLlamada {
    private float costoXMinuto;

    public CalculadorLlamadaNacional(float costoXMinuto) {
        this.costoXMinuto = costoXMinuto;
    }

    @Override
    public double costo(double duracion) {
        double costo = this.costoXMinuto * duracion;
        if (duracion > 30) {
            costo = costo - (costo * 0.05F);
        }
        return costo;
    }
}
