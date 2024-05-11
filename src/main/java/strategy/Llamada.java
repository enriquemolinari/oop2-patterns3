package strategy;

import java.util.HashMap;
import java.util.Map;

enum TipoLlamada {
    NACIONAL,
    INTERNACIONAL
}

class Llamada {
    private TipoLlamada tipo;
    private double duracion;
    private Map<String, CalculadorLlamada> estrategiasCalculo = new HashMap<>();

    public Llamada(TipoLlamada tipo, double duracion) {
        this.tipo = tipo;
        this.duracion = duracion;
        this.estrategiasCalculo.put(TipoLlamada.INTERNACIONAL.name(),
                new CalculadorLlamadaInternacional(1.5F));
        this.estrategiasCalculo.put(TipoLlamada.NACIONAL.name(),
                new CalculadorLlamadaNacional(1.1F));
    }

    public double calcularCosto() {
        assertTipoLLamadaValido();
        return this.estrategiasCalculo.get(this.tipo.name()).costo(this.duracion);
    }

    private void assertTipoLLamadaValido() {
        if (!this.estrategiasCalculo.containsKey(this.tipo.name())) {
            throw new RuntimeException("Tipo de llamada inexistente");
        }
    }
}