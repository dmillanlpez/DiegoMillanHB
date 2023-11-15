import java.util.List;

public class Main {
    public static void main(String[] args) {


        /*Una concesionaria de vehículos necesita un sistema para administrar su inventario de autos. Crea una clase Auto
        con atributos como marca, modelo, año, y precio. Implementa una clase utilitaria InventarioAutos con métodos genéricos
        para realizar las siguientes operaciones:

        Agregar Autos al Inventario: Utiliza un método genérico para agregar autos al inventario de la concesionaria.

        Buscar Autos por Marca o Año: Implementa métodos genéricos que permitan buscar autos por marca o año dentro del inventario.

        Calcular el Valor Total del Inventario: Desarrolla un método genérico que calcule el valor total de todos los
        autos en el inventario.

         */

        InventarioAutos inventario = new InventarioAutos();

        Auto auto1 = new Auto("Peugeot", "C4", 2010, 14000.0);
        Auto auto2 = new Auto("BMW", "MW", 2023, 75000.0);
        Auto auto3 = new Auto("Toyota", "Camry", 2022, 25000.0);
        Auto auto4 = new Auto("Honda", "Civic", 2022, 22000.0);

        inventario.agregarAuto(auto1);
        inventario.agregarAuto(auto2);
        inventario.agregarAuto(auto3);
        inventario.agregarAuto(auto4);


        List<Auto> autosToyota = inventario.buscarPorMarca("Toyota");
        System.out.println("Autos Toyota que han sido encontrados: " + autosToyota.size());

        List<Auto> autos2022 = inventario.buscarPorAno(2022);
        System.out.println("Autos del año 2022 que han sido encontrados: " + autos2022.size());

        double valorTotal = inventario.calcularValorTotal();
        System.out.println("Valor total del inventario actual: " + valorTotal + " Euros");
    }
}