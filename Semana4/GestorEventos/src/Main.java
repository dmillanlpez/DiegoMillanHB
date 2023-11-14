import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        /* Imagina que estás construyendo una aplicación para gestionar eventos en una agenda. Cada evento tiene un nombre,
        una fecha y una categoría (por ejemplo, "Reunión", "Conferencia", "Taller"). Implementa las siguientes operaciones
        utilizando Streams y Optionals:

        Filtra los eventos que están programados para una fecha específica.

        Agrupa los eventos por categoría y cuenta cuántos eventos hay en cada categoría.

        Encuentra el evento más próximo en el tiempo utilizando Optionals.
         */

        List<Eventos> eventos = Arrays.asList(
                new Eventos("Reunion Teams", LocalDate.of(2023, 11, 15), "Reunion"),
                new Eventos("Conferencia TechCrunch", LocalDate.of(2023, 11, 18), "Conferencia"),
                new Eventos("Taller Desarrollo", LocalDate.of(2023, 11, 20), "Taller"),
                new Eventos("Reunion RedHat", LocalDate.of(2023, 11, 15), "Reunion"),
                new Eventos("Conferencia Adobe", LocalDate.of(2023, 12, 16), "Conferencia")
        );

        // Filtrar los eventos programados para una fecha especifica
        LocalDate fechaEspecifica = LocalDate.of(2023,11,20);
        List<Eventos> fechaEventos = eventos.stream()
                .filter(n -> n.getFecha().equals(fechaEspecifica))
                .collect(Collectors.toList());

        System.out.println("Eventos para la fecha: " + fechaEspecifica + ":");
        fechaEventos.forEach(e -> System.out.println(e.getNombre() + " - " + e.getCategoria()));

        System.out.println("-------------------------------------");

        // Agrupar eventos por categoria y contar cuantos hay por cada categoria
        Map<String, Long> eventosPorCategoria = eventos.stream()
                .collect(Collectors.groupingBy(Eventos::getCategoria, Collectors.counting()));

        System.out.println("Numero de eventos por categoria:");
        eventosPorCategoria.forEach((categoria, cantidad) ->
                System.out.println(categoria + ": " + cantidad));

        System.out.println("-------------------------------------");

        // Encontrar el evento mas proximo a mi fecha
        LocalDate fechaActual = LocalDate.now();
        Optional<Eventos> eventoProximo = eventos.stream()
                .filter(n -> n.getFecha().isAfter(fechaActual))
                .min(Comparator.comparing(Eventos::getFecha));

        System.out.println("El evento mas proximo a la fecha actual es: ");
        eventoProximo.ifPresent(n -> System.out.println(n.getNombre() + " - " + n.getFecha()));
    }
}