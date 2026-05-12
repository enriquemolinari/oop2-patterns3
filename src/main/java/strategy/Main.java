package strategy;

public class Main {
    public static void main(String[] args) {
        var llamada1 = new Llamada(TipoLlamada.NACIONAL, 15);
        var llamada2 = new Llamada(TipoLlamada.INTERNACIONAL, 12);
        System.out.println("Costo de la llamada nacional: $" + llamada1.calcularCosto());
        System.out.println("Costo de la llamada internacional: $" + llamada2.calcularCosto());

//        var llamada = new Llamada(new Internacional(...));
//        llamada.calcularCosto();

//        var authenticacion = new Authenticar(new ViaGoogle(...), ... )
//        authenticacion.proceder();
//        var authenticacion = new Authenticar(new ViaGithub(...), ... )
//        authenticacion.proceder();
//        var authenticacion = new Authenticar(new UserAndPass(...), ... )
//        authenticacion.proceder();
    }
}
