public class main {

    public static void main(String[] args) {

        /* Imagina que estás desarrollando un sistema de reservas de vuelos para una aerolínea. Los usuarios pueden realizar reservas de
        vuelos proporcionando información como su nombre, destino, fecha de viaje y número de asientos deseados. Tu tarea es implementar
        una función de reserva de vuelos que valide los datos ingresados y maneje excepciones si los datos son incorrectos o si no hay
        suficientes asientos disponibles en el vuelo.

        Debes crear una excepción personalizada, por ejemplo, ReservaInvalidaException, que se lance en situaciones excepcionales,
        como cuando un usuario intenta reservar más asientos de los disponibles o si falta información esencial. La excepción
        personalizada debe proporcionar un mensaje claro sobre la causa del error.
         */

        ReservaVuelo reserva = new ReservaVuelo("Diego", "Suecia", "2023-12-25", 2);
        ReservaVuelo reserva1 = new ReservaVuelo("Catherine", "Francia", "2023-05-25", 5);
        int asientosDisponibles = 3;

        try {
            reserva.reservarVuelo(asientosDisponibles);
        } catch (ReservaInvalidaException e) {
            System.err.println("Error al realizar la reserva de Diego: " + e.getMessage());
        }

        try {
            reserva1.reservarVuelo(asientosDisponibles);
        } catch (ReservaInvalidaException e) {
            System.err.println("Error al realizar la reserva de Catherine: " + e.getMessage());
        }
    }
}
