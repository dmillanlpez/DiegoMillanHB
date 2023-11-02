public class Pantalon extends Vestimenta{

    // Pantalon: estilo, tipoTejido

    // Constructor
    public Pantalon(int codigo, String nombre, double precio, String marca, String talla, String color, String estilo, String tipoTejido) {
        super(codigo, nombre, precio, marca, talla, color);
        this.estilo = estilo;
        this.tipoTejido = tipoTejido;
    }

    // Metodo
    @Override
    public void mostrarMarca() {
        System.out.println("Estos pantalones son de marca: " + estilo);
    }

    // Atributos
    private String estilo;
    private String tipoTejido;
}
