import java.util.ArrayList;

public class Producto {

    /* Un administrador de una tienda de electrónica necesita un programa para gestionar los productos en su inventario. Para ello,
    necesita la creación de una clase Producto que cuente con los siguientes datos: código, nombre, marca, tipo, precio costo,
    precio venta, cantidad en stock.
     */

    // Constructor
    public Producto(int codigo, String nombre, String marca, String tipo, double precioCosto, double precioVenta, int cantidadStock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.tipo = tipo;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
        this.cantidadStock = cantidadStock;
    }

    // Metodos
    public static Producto encontrarProductoMasCaro(ArrayList<Producto> inventario) {
        if (inventario.isEmpty()) {
            return null; // Devuelve null si el inventario está vacío
        }

        Producto productoMasCaro = inventario.get(0); // Suponemos que el primer producto es el más caro inicialmente

        for (Producto producto : inventario) {
            if (producto.getPrecioVenta() > productoMasCaro.getPrecioVenta()) {
                productoMasCaro = producto;
            }
        }

        return productoMasCaro;
    }

    public static Producto encontrarProductoMasBaratoCosto(ArrayList<Producto> inventario) {
        if (inventario.isEmpty()) {
            return null; // Devuelve null si el inventario está vacío
        }

        Producto productoMasBaratoCosto = inventario.get(0); // Suponemos que el primer producto es el más barato inicialmente

        for (Producto producto : inventario) {
            if (producto.getPrecioCosto() < productoMasBaratoCosto.getPrecioCosto()) {
                productoMasBaratoCosto = producto;
            }
        }

        return productoMasBaratoCosto;
    }

    public static Producto encontrarProductoMayorStock(ArrayList<Producto> inventario) {
        if (inventario.isEmpty()) {
            return null; // Devuelve null si el inventario está vacío
        }

        Producto productoMayorStock = inventario.get(0); // Suponemos que el primer producto tiene el mayor stock inicialmente

        for (Producto producto : inventario) {
            if (producto.getCantidadStock() > productoMayorStock.getCantidadStock()) {
                productoMayorStock = producto;
            }
        }

        return productoMayorStock;
    }


    // Getters y setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    // Atributos
    private int codigo;
    private String nombre;
    private String marca;
    private String tipo;
    private double precioCosto;
    private double precioVenta;
    private int cantidadStock;
}
