public class Camiseta extends Vestimenta{


    // Camiseta: manga, cuello

    // Constructor
    public Camiseta(int codigo, String nombre, double precio, String marca, String talla, String color, String manga, String cuello) {
        super(codigo, nombre, precio, marca, talla, color);
        this.manga = manga;
        this.cuello = cuello;
    }

    // Metodo
    @Override
    public void mostrarMarca() {
        System.out.println("Esta camiseta es de marca: " + manga);
    }

    // Atributos
    private String manga;
    private String cuello;
}
