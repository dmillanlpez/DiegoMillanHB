import java.util.Calendar;

public class Auto extends Vehiculo implements Electrico{

    /* c) Clase Auto: Crea una clase Auto que herede de Vehiculo e implemente la interfaz Electrico. Agrega atributos
        específicos para los autos eléctricos, como capacidadBateria (en mah) y autonomia (en hs). Implementa los métodos
        abstractos de la clase abstracta Vehiculo y los de la interfaz Electrico.
     */

    // Constructor
    public Auto(int id, String placa, String marca, String modelo, int año, double costo, int capacidadBateria, int autonomia) {
        super(id, placa, marca, modelo, año, costo);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    // Metodos
    @Override
    public void cargarEnergia() {
        System.out.println("Cargando la bateria del auto: " + getMarca() + " " + getModelo());
    }

    @Override
    public int calcularAntiguedad() {
        int anoActual = Calendar.getInstance().get(Calendar.YEAR);
        return anoActual - getAño();
    }

    // Atributo electrico
    private int capacidadBateria;
    private int autonomia;


}
