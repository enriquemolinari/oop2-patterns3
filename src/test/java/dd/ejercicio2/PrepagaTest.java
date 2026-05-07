package dd.ejercicio2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrepagaTest {

    private final Prepaga prepaga = new Prepaga();

    @Test
    void testNoFacturaNadaSiNoHayPrestaciones() {
        double total = prepaga.facturar(List.of());
        assertEquals(0, total);
    }

    @Test
    void testFacturaConsultaEnClinica() {
        double total = prepaga.facturar(List.of(new Prestacion(TipoPrestador.CLINICA, TipoPrestacion.CONSULTA_MEDICA)));
        assertEquals(20000, total);
    }

    @Test
    void testFacturaConsultaEnHospital() {
        double total = prepaga.facturar(List.of(new Prestacion(TipoPrestador.HOSPITAL, TipoPrestacion.CONSULTA_MEDICA)));
        assertEquals(0, total);
    }

    @Test
    void testFacturaConsultaEnSanatorio() {
        double total = prepaga.facturar(List.of(new Prestacion(TipoPrestador.SANATORIO, TipoPrestacion.CONSULTA_MEDICA)));
        assertEquals(15000, total);
    }

    @Test
    void testFacturaInternacionEnClinica() {
        double total = prepaga.facturar(List.of(new Prestacion(TipoPrestador.CLINICA, TipoPrestacion.INTERNACION)));
        assertEquals(65000, total);
    }

    @Test
    void testFacturaInternacionEnHospital() {
        double total = prepaga.facturar(List.of(new Prestacion(TipoPrestador.HOSPITAL, TipoPrestacion.INTERNACION)));
        assertEquals(35000, total);
    }

    @Test
    void testFacturaInternacionEnSanatorio() {
        double total = prepaga.facturar(List.of(new Prestacion(TipoPrestador.SANATORIO, TipoPrestacion.INTERNACION)));
        assertEquals(75000, total);
    }

    @Test
    void testAcumulaImportesDeMultiplesPrestaciones() {
        List<Prestacion> prestaciones = List.of(
                new Prestacion(TipoPrestador.CLINICA, TipoPrestacion.CONSULTA_MEDICA),
                new Prestacion(TipoPrestador.HOSPITAL, TipoPrestacion.INTERNACION),
                new Prestacion(TipoPrestador.SANATORIO, TipoPrestacion.INTERNACION)
        );

        double total = prepaga.facturar(prestaciones);
        assertEquals(130000, total);
    }

}
