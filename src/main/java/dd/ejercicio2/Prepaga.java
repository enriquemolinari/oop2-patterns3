package dd.ejercicio2;

import java.util.List;

public class Prepaga {

    private static final double GASTOS_INTERNACION_CLINICA = 15000;
    private static final double COSTO_MATERIAL_HOSPITAL = 35000;
    private static final double GASTOR_INTERNACION_SANATORIO = 10000;
    private static final double COSTO_MATERIAL_SANATORIO = 25000;

    public double facturar(List<Prestacion> prestaciones) {
        var total = 0.0D;
        for (Prestacion prestacion : prestaciones) {
            var tipoPrestador = prestacion.tipoPrestador();
            var tipoPrestacion = prestacion.tipoPrestacion();

            if (tipoPrestacion == TipoPrestacion.CONSULTA_MEDICA && tipoPrestador == TipoPrestador.CLINICA) {
                total += 20000;
            } else if (tipoPrestacion == TipoPrestacion.CONSULTA_MEDICA && tipoPrestador == TipoPrestador.HOSPITAL) {
                total += 0;
            } else if (tipoPrestacion == TipoPrestacion.CONSULTA_MEDICA && tipoPrestador == TipoPrestador.SANATORIO) {
                total += 15000;
            } else if (tipoPrestacion == TipoPrestacion.INTERNACION && tipoPrestador == TipoPrestador.CLINICA) {
                total += 50000 + GASTOS_INTERNACION_CLINICA;
            } else if (tipoPrestacion == TipoPrestacion.INTERNACION && tipoPrestador == TipoPrestador.HOSPITAL) {
                total += COSTO_MATERIAL_HOSPITAL;
            } else if (tipoPrestacion == TipoPrestacion.INTERNACION && tipoPrestador == TipoPrestador.SANATORIO) {
                total += 40000 + COSTO_MATERIAL_SANATORIO + GASTOR_INTERNACION_SANATORIO;
            }
        }
        return total;
    }
}
