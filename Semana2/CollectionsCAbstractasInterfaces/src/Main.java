import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /* Un sistema de gestión de vehículos necesita ser desarrollado para una futura implementación para una tienda de venta de
        autos. Se requiere utilizar para su implementación tanto clases abstractas como interfaces para modelar este sistema.

        a) Clase Abstracta Vehiculo: Crear una clase abstracta llamada Vehiculo con los siguientes atributos: id, placa, marca,
        modelo, año, costo. Establecer un método abstracto para calcular la antigüedad del vehiculo. (Done)

        b) Interfaces: Crea dos interfaces llamadas Electrico y Combustion con métodos abstractos cargarEnergia() y
        recargarCombustible() respectivamente. En ambos casos, cuando se implementen en sus respectivas clases, deben
        mostrar un mensaje de qué tipo de recarga están haciendo. (Done)

        c) Clase Auto: Crea una clase Auto que herede de Vehiculo e implemente la interfaz Electrico. Agrega atributos
        específicos para los autos eléctricos, como capacidadBateria (en mah) y autonomia (en hs). Implementa los métodos
        abstractos de la clase abstracta Vehiculo y los de la interfaz Electrico. (Done)

        d) Clase Camioneta: Crea una clase Camioneta que herede de Vehiculo e implemente la interfaz Combustion. Agrega
        atributos específicos para las camionetas de combustión, como capacidadTanque y consumoCombustible. Implementa los
        métodos abstractos de la clase abstracta y los de la interfaz. (Done)

        e) Clase Moto: Crea una clase Moto que herede de Vehiculo e implemente la interfaz Combustion. Agrega atributos
        específicos para las motos de combustión, como cilindrada y tipoMotor. Implementa los métodos abstractos de la
        clase abstracta y los de la interfaz.(Done)

        --------------------------------------------------------

        f) Main: En el programa principal, crea objetos de diferentes tipos de vehículos (autos eléctricos, camionetas de
        combustión, motos de combustión) y añádelos a un ArrayList de tipo Vehiculo. Muestra información sobre cada uno de
        ellos, incluyendo el calculo de la antigüedad y la recarga de energía o combustible según corresponda.

        g) Polimorfismo: Recorrer el ArrayList de Vehículos y mostrar la información de cada uno de ellos.

        Nota: Recuerda que la antigüedad de un vehículo se calcula restando del año actual el año de fabricación del auto.
        Por ejemplo: 2023 - 2018= 5 años de antigüedad
         */

        // Add arraylist
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        // Creacion de los vehiculos
        Auto autoElectrico = new Auto(1,"1234XTR", "Peugeot", "Flash",2015,3250.99,50000,15);
        Camioneta camionetaComb = new Camioneta(2,"15430PTR", "Fiat", "C4", 2009,8560.99,100.05,15.03);
        Moto motoComb = new Moto(3, "547391AAb", "Honda", "RT600", 2021, 12000.0, 600, "4 tiempos");

        // Agregar vehículos al ArrayList
        vehiculos.add(autoElectrico);
        vehiculos.add(camionetaComb);
        vehiculos.add(motoComb);

        // Recorrer y mostrar información de todos los vehículos
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("Vehículo: " + vehiculo.getMarca() + " " + vehiculo.getModelo());
            System.out.println("Años de antigüedad: " + vehiculo.calcularAntiguedad());
            System.out.println("------------------------------");
        }




    }
}