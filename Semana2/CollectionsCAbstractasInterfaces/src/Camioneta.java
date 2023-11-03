import java.util.Calendar;

public class Camioneta extends Vehiculo implements Combustion {

    /* d) Clase Camioneta: Crea una clase Camioneta que herede de Vehiculo e implemente la interfaz Combustion. Agrega
        atributos específicos para las camionetas de combustión, como capacidadTanque y consumoCombustible. Implementa los
        métodos abstractos de la clase abstracta y los de la interfaz.
     */

    // Constructor
    public Camioneta(int id, String placa, String marca, String modelo, int año, double costo, Double capacidadTanque, Double consumoCombustible) {
        super(id, placa, marca, modelo, año, costo);
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
    }

    // Metodos
    @Override
    public void recargarCombustible() {
        System.out.println("Recargando el combustible de la camioneta: " + getMarca() + " " + getModelo());
    }

    @Override
    public int calcularAntiguedad() {
        int añoActual = Calendar.getInstance().get(Calendar.YEAR);
        return añoActual - getAño();
    }

    // Atributos
    private Double capacidadTanque;
    private Double consumoCombustible;


}
