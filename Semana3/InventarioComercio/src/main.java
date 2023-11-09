import java.util.Scanner;

public class main {

    /* Ejercicio Nº 2 - Manejo de Inventarios en un Comercio - Individual

       Imagina que estás desarrollando un sistema de gestión de inventarios para un comercio minorista. Los usuarios pueden agregar productos al
       inventario proporcionando información como el nombre del producto, el precio y la cantidad disponible. Tu tarea es implementar una función que
       maneje
       la gestión de inventarios, validando los datos ingresados y manejando excepciones en caso de errores o datos inválidos.

       Trata de ser lo más descriptivo posible en cada mensaje de excepción (en caso de que ésta sea opersonalizada) o de utilizar los tipos correctos de
       excepción en cada caso.     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Gestion de Inventario");
        System.out.print("Nombre del producto: ");
        String nombre = scanner.nextLine();

        System.out.print("Precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.print("Cantidad disponible: ");
        int cantidad = scanner.nextInt();

        // Crear un producto
        Producto producto = new Producto(nombre, precio, cantidad);

        System.out.println("Producto creado:");
        System.out.println(producto);

        // Agregar inventario
        System.out.print("Cantidad a agregar al inventario || 0 para no agregar nada : ");
        int cantidadAAgregar = scanner.nextInt();

        try {
            producto.agregarInventario(cantidadAAgregar);
            System.out.println("Inventario actualizado:");
            System.out.println(producto);
        } catch (InventarioInvalidoException e) {
            System.out.println("Error al agregar inventario: " + e.getMessage());
        }

        // Vender productos
        System.out.print("Cantidad a vender: ");
        int cantidadAVender = scanner.nextInt();

        try {
            producto.vender(cantidadAVender);
            System.out.println("Venta realizada. Inventario actualizado:");
            System.out.println(producto);
        } catch (InventarioInvalidoException e) {
            System.out.println("Error al vender el producto: " + e.getMessage());
        }
    }
}
