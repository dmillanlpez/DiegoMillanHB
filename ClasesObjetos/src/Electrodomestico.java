public class Electrodomestico {

    // Constructor sin parametros
    public Electrodomestico() {
    }

    // Constructor con parametros
    public Electrodomestico(int codigoId, String marca, String modelo, int consumo, String color) {
        this.codigoId = codigoId;
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
        this.color = color;
    }

    // Getters y setters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getConsumo() {
        return consumo;
    }

    // Atributos
    private int codigoId;
    private String marca;
    private String modelo;
    private int consumo;
    private String color;
}
