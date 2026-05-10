# Observer, Double Dispatch y Strategy

## Observer:

- **Propósito**: Define una dependencia de uno a muchos entre objetos de forma tal que cuando un objeto cambie se
  notifique a todos los objetos que dependen de él.
- **Push vs Pull model**: Observen que el método `Observable.notificar` recibe un `String` por parámetro. Éste es el
  modelo push ya que es el observado quien envía la información que cambió a los observadores. En en el modelo pull
  solo se lo notifica (sin pasar parámetros) pero cada observer debe conocer al observado de modo tal de pedirle aquello
  que cambió.
- El modelo pull acopla los observadores a los observados. El observer debe conocer qué método del observado
  debe
  invocar. Y además los observados deben exponer mediante un método aquel estado que cambió (getter? y el
  encapsulamiento?).
- El método push hace menos reusables a los observadores porque siempre necesitan algun tipo fijo en la firma
  de `notificar`. Podriamos usar un `Map` como parámetro en lugar de un `String` lo cual lo haría un poco más
  flexible.
-

## Double Dispatch

- El double dispatch permite a un objeto llamar a un método en otro objeto, pasando como argumento al primer objeto.
  Esto
  permite que el segundo objeto pueda realizar una operación específica basada en el tipo del primer objeto.
- El patron de diseño Visitor es una generalización del double dispatch.

### Ejercicio 1

- Implementamos el juego "Piedra, Papel, Tijera" usando Double Dispatch.
- Repo de partida: https://github.com/Jaterli/piedra_papel_tijera

### Ejercicio 2

- Fuente: LIFIA (UNLP)

- Empresa de medicina prepaga que brinda servicios. Las prestaciones de consultas medicas e internación. Una internación
  comprende un monto de dinero en concepto de gastos de internación y un monto de dinero en concepto de
  materiales utilizados. Una consulta tiene un monto de dinero en concepto de honorarios médicos. La prepaga trabaja con
  solo tres tipos de prestadores: hospitales, clinicas y sanatorios. A fin de mes los prestadores
  le facturan a la prepaga por los asociados que atendieron segun las prestaciones que se hayan realizado.

Las prestaciones cuestan diferente segun el tipo de prestador que las realice, la table de precios es la siguiente:

| Prestacion  | Hospital           | Clinica                     | Sanatorio                                    |
|-------------|--------------------|-----------------------------|----------------------------------------------|
| Consulta    | Gratuito           | $20000                      | $15000                                       |
| Internacion | Costo del Material | $50000 + gastos internacion | $40000 + costo material + gastos internacion |

### Ejercicio Golondrinas

- Máximo Prieto y Hernan Wilkinson:
    - Webinar: https://www.youtube.com/watch?v=bVC1OLOJIQQ
    - https://github.com/pablolucero/golondrinas-double-dispatch

### ¿Y si tengo doble dispatch, puedo tener triple o cuadruple dispatch?

- Sí, pero no es común. El double dispatch es el caso más común de múltiples dispatch. El triple o cuádruple dispatch se
  refiere a situaciones donde se necesitan tres o cuatro objetos para determinar qué método se debe invocar.
- Lenguajes como [Julia](http://julialang.org/) soportan múltiples dispatch de forma nativa, lo que permite a los
  desarrolladores definir métodos que se seleccionan en función de los tipos de múltiples argumentos.
- Revisar el branch `solucion-dd-ejercicio1` para comparar contra opciones en lenguajes con multiple dispatch nativo.
  Aca un pequeño repo con un ejemplo en [Julia](https://github.com/enriquemolinari/oop2-multiple-dispatch-con-julia).

## Strategy:

- **Propósito**: Permite definir una familia de algoritmos, colocar cada uno de ellos en una clase separada y hacer
  que sus objetos sean intercambiables. Mmmm... ¿no es simplemente polimorfismo?