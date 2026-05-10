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
        double total = prepaga.facturar(List.of(new Prestacion(new Clinica(), new AtencionMedica())));
        assertEquals(20000, total);
    }

    @Test
    void testFacturaConsultaEnHospital() {
        double total = prepaga.facturar(List.of(new Prestacion(new Hospital(), new AtencionMedica())));
        assertEquals(0, total);
    }

    @Test
    void testFacturaConsultaEnSanatorio() {
        double total = prepaga.facturar(List.of(new Prestacion(new Sanatorio(), new AtencionMedica())));
        assertEquals(15000, total);
    }

    @Test
    void testFacturaInternacionEnClinica() {
        double total = prepaga.facturar(List.of(new Prestacion(new Clinica(), new Internacion())));
        assertEquals(65000, total);
    }

    @Test
    void testFacturaInternacionEnHospital() {
        double total = prepaga.facturar(List.of(new Prestacion(new Hospital(), new Internacion())));
        assertEquals(35000, total);
    }

    @Test
    void testFacturaInternacionEnSanatorio() {
        double total = prepaga.facturar(List.of(new Prestacion(new Sanatorio(), new Internacion())));
        assertEquals(75000, total);
    }

    @Test
    void testAcumulaImportesDeMultiplesPrestaciones() {
        List<Prestacion> prestaciones = List.of(
                new Prestacion(new Clinica(), new AtencionMedica()),
                new Prestacion(new Hospital(), new Internacion()),
                new Prestacion(new Sanatorio(), new Internacion())
        );

        double total = prepaga.facturar(prestaciones);
        assertEquals(130000, total);
    }
}
