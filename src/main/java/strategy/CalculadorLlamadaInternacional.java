package strategy;

public class CalculadorLlamadaInternacional implements CalculadorLlamada {
    private float costoXMinuto;

    public CalculadorLlamadaInternacional(float costoXMinuto) {
        this.costoXMinuto = costoXMinuto;
    }

    @Override
    public double costo(double duracion) {
        double costo = 1.5F * duracion;
        if (duracion > 20) {
            costo = costo - (costo * 0.05F);
        }
        return costo;
    }
}
