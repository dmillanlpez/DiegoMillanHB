public class Reptil extends Animal {

    // "Reptil" con atributos adicionales: longitud, tipo de escamas, tipo de veneno, hábitat.

    // Creacion constructor
    public Reptil(int id, String nombre, int edad, String tipoPiel, String tipoAlimentacion, Double longitud, String tipoEscamas, String tipoVeneno, String habitat) {
        super(id, nombre, edad, tipoPiel, tipoAlimentacion);
        this.longitud = longitud;
        this.tipoEscamas = tipoEscamas;
        this.tipoVeneno = tipoVeneno;
        this.habitat = habitat;
    }

    // "Reptil": sobrescribir el método saludar de la clase madre y colocar el mensaje "Hola, soy un reptil".
    @Override
    public void saludar(){
        System.out.println("Hola, soy un reptil.");
    }

    // Atributos
    private Double longitud;
    private String tipoEscamas;
    private String tipoVeneno;
    private String habitat;
}
