public abstract class Vehiculo {

    /* a) Clase Abstracta Vehiculo: Crear una clase abstracta llamada Vehiculo con los siguientes atributos: id, placa, marca,
        modelo, año, costo. Establecer un método abstracto para calcular la antigüedad del vehiculo.
     */

    // Constructor
    public Vehiculo(int id, String placa, String marca, String modelo, int año, double costo) {
        this.id = id;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.costo = costo;
    }

    // Metodo abstracto para calcular la antiguedad
    public abstract int calcularAntiguedad();

    // Getters y setters


    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    public double getCosto() {
        return costo;
    }

    // Atributos
    private int id;
    private String placa;
    private String marca;
    private String modelo;
    private int año;
    private double costo;
}
