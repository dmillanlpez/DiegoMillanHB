public class Ave extends Animal{

    // Ave" con atributos adicionales: envergadura de alas, tipo de vuelo, color de plumaje, tipo de pico.

    // Creacion constructor


    public Ave(int id, String nombre, int edad, String tipoPiel, String tipoAlimentacion, Double envergaduraAlas, String tipoVuelo, String colorPlumaje, String tipoPico) {
        super(id, nombre, edad, tipoPiel, tipoAlimentacion);
        this.envergaduraAlas = envergaduraAlas;
        this.tipoVuelo = tipoVuelo;
        this.colorPlumaje = colorPlumaje;
        this.tipoPico = tipoPico;
    }

    // "Ave": sobrescribir el método saludar de la clase madre y colocar el mensaje "Hola, soy un ave".
    @Override
    public void saludar(){
        System.out.println("Hola, soy un ave.");
    }

    // Atributos
    private Double envergaduraAlas;
    private String tipoVuelo;
    private String colorPlumaje;
    private String tipoPico;
}
