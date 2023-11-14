import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        /*Crea una aplicación que maneje información sobre empleados. Cada empleado tiene un nombre, un salario y una categoría
        (por ejemplo, "Desarrollador", "Analista", "Gerente"). Implementa las siguientes operaciones utilizando Streams y Optionals:

        Filtra los empleados cuyo salario sea mayor a cierto valor específico.

        Agrupa los empleados por categoría y calcula el salario promedio para cada categoría.

        Encuentra al empleado con el salario más alto utilizando Optionals.

         */

        // Creacion de la lista
        List<Empleados> empleadosList = Arrays.asList(
                new Empleados("Diego",30000,"Desarrollador"),
                new Empleados("Catherine", 32000,"Administrativa"),
                new Empleados("Carmen",50000,"Admin"),
                new Empleados("Ana",18000,"Analista")
        );

        // Filtrar empleados cuyo salario sea mayor a cierto valor especifico
        double salarioMinimo = 30000;
        List<Empleados> empleadosFiltrado = empleadosList.stream()
                .filter(n -> n.getSalario() >= salarioMinimo)
                .collect(Collectors.toList());

        System.out.println("Empleados con salario mayor a " + salarioMinimo + ":");
        empleadosFiltrado.forEach(e -> System.out.println(e.getNombre() + " - " + e.getSalario()));

        System.out.println("-----------------------------");

        // Agrupar los empleados por categorias y calcular el salario medio por categoria
        Map<String, Double> salarioPromedioCategoria = empleadosList.stream()
                .collect(Collectors.groupingBy(Empleados::getCategoria,
                        Collectors.averagingDouble(Empleados::getSalario)));

        System.out.println("Salario promedio por categoria:");

        salarioPromedioCategoria.forEach((categoria, salarioPromedio) ->
                System.out.println(categoria + ": " + salarioPromedio));

        System.out.println("-----------------------------");

        // Encontrar empleado con el sueldo mas alto
        Optional<Empleados> empleadoSalarioMaximo = empleadosList.stream()
                .max(Comparator.comparing(Empleados::getSalario));

        System.out.println("Empleado con el salario mas alto: ");
        empleadoSalarioMaximo.ifPresent(n -> System.out.println(n.getNombre() + " -- " +  n.getSalario()));
    }
}