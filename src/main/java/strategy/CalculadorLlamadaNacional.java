package strategy;

public class CalculadorLlamadaNacional implements CalculadorLlamada {
    public static final float DESCUENTO = 0.05F;
    public static final int MAX_DURACION_SIN_DESCUENTO = 30;
    private float costoXMinuto;

    public CalculadorLlamadaNacional(float costoXMinuto) {
        this.costoXMinuto = costoXMinuto;
    }

    @Override
    public double costo(double duracion) {
        double costo = this.costoXMinuto * duracion;
        if (duracion > MAX_DURACION_SIN_DESCUENTO) {
            costo = costo - (costo * DESCUENTO);
        }
        return costo;
    }
}
