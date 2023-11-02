public class Vestimenta {

    /*  Crear una clase llamada Vestimenta con los atributos: código, nombre, precio, marca, talla y color (con sus métodos y
        constructores correspondientes).
     */

    // Constructor
    public Vestimenta(int codigo, String nombre, double precio, String marca, String talla, String color) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.talla = talla;
        this.color = color;
    }

    // Metodo
    public void mostrarMarca(){
        System.out.println("Esta prenda es de marca: " + marca);
    }

    // Getters y setters


    // Atributos
    private int codigo;
    private String nombre;
    private double precio;
    private String marca;
    private String talla;
    private String color;
}
