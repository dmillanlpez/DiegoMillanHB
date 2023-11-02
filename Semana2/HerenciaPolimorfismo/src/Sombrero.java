public class Sombrero extends Vestimenta{

    // Sombrero: tipo, tamaño

    // Constructor
    public Sombrero(int codigo, String nombre, double precio, String marca, String talla, String color, String tipo, String tamanyo) {
        super(codigo, nombre, precio, marca, talla, color);
        this.tipo = tipo;
        this.tamanyo = tamanyo;
    }

    // Metodo
    @Override
    public void mostrarMarca() {
        System.out.println("Este sombrero es de marca: " + tipo);
    }

    // Atributos
    private String tipo;
    private String tamanyo;
}
