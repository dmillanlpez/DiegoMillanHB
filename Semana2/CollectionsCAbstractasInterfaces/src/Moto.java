import java.util.Calendar;

public class Moto extends Vehiculo implements Combustion{

    /* e) Clase Moto: Crea una clase Moto que herede de Vehiculo e implemente la interfaz Combustion. Agrega atributos
        específicos para las motos de combustión, como cilindrada y tipoMotor. Implementa los métodos abstractos de la
        clase abstracta y los de la interfaz.
     */

    // Constructor
    public Moto(int id, String placa, String marca, String modelo, int año, double costo, int cilindrada, String tipoMotor) {
        super(id, placa, marca, modelo, año, costo);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    // Metodos
    @Override
    public void recargarCombustible() {
        System.out.println("Recargando el combustible de la moto: " + getMarca() + " " + getModelo());
    }

    @Override
    public int calcularAntiguedad() {
        int añoActual = Calendar.getInstance().get(Calendar.YEAR);
        return añoActual - getAño();
    }

    // Atributos
    private int cilindrada;
    private String tipoMotor;


}
