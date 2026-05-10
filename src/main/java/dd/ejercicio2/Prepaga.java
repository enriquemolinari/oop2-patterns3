package dd.ejercicio2;

import java.util.List;

public class Prepaga {
    
    public double facturar(List<Prestacion> prestaciones) {
        var total = 0.0D;
        for (Prestacion prestacion : prestaciones) {
            total += prestacion.costo();
        }
        return total;
    }
}
