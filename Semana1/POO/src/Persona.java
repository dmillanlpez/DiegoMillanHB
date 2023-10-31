public class Persona {

    /*Crear una clase Persona, que tenga los siguientes atributos: id, nombre, edad, dirección y número de teléfono
      (tener en cuenta todos sus atributos, constructores y métodos getters y setters). */

    public Persona(int id, String nombre, int edad, String direccion, int numTelefono) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.numTelefono = numTelefono;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(int numTelefono) {
        this.numTelefono = numTelefono;
    }

    // Atributos
    private int id;
    private String nombre;
    private int edad;
    private String direccion;
    private int numTelefono;
}
