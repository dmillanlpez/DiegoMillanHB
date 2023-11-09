public class ReservaVuelo {

    /* Los usuarios pueden realizar
       reservas de vuelos proporcionando información como su nombre, destino, fecha de viaje y número de asientos deseados.
     */

    // Constructores
    public ReservaVuelo(String nombre, String destino, String fechaViaje, int numAsientos) {
        this.nombre = nombre;
        this.destino = destino;
        this.fechaViaje = fechaViaje;
        this.numAsientos = numAsientos;
    }
    public ReservaVuelo() {
    }

    // Metodo
    public void reservarVuelo(int asientosDisponibles) throws ReservaInvalidaException {
        if (nombre == null || destino == null || fechaViaje == null) {
            throw new ReservaInvalidaException("Falta informacion esencial para poder completar la reserva.");
        }

        if (numAsientos <= 0) {
            throw new ReservaInvalidaException("Tienes que reservar al menos un asiento.");
        }

        if (numAsientos > asientosDisponibles) {
            throw new ReservaInvalidaException("No hay mas asientos disponibles.");
        }

        System.out.println("Reserva exitosa para " + nombre);
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFechaViaje() {
        return fechaViaje;
    }

    public void setFechaViaje(String fechaViaje) {
        this.fechaViaje = fechaViaje;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    // Atributos
    private String nombre;
    private String destino;
    private String fechaViaje;
    private int numAsientos;

}
