import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RegistroMascota <T>{

    // Constructor
    public RegistroMascota(){
        this.registro = new ArrayList<>();
    }

    // Metodos
    public void agregarMascotas(Mascota<T> mascota){
        registro.add(mascota);
    }

    public List<Mascota<T>> buscarPorNombres(String nombre){
        List<Mascota<T>> mascotasEncontradas = new ArrayList<>();
        for(Mascota<T> mascota : registro){
            if(mascota.getNombre().equalsIgnoreCase(nombre)){
                mascotasEncontradas.add(mascota);
            }
        }
        return mascotasEncontradas;
    }

    public int cantidadTotalMascotas() {
        return registro.size();
    }

    public void generarDatosAleatorios(int cantidad) {
        Random random = new Random();
        String[] nombres = {"Mafalda", "Tobi", "Luna", "Kat", "Gato", "Misi-fu", "Leda", "Lu", "Terremoto", "Lu"};
        String[] especies = {"Perro", "Gato", "Reptil", "Ave"};

        for (int i = 0; i < cantidad; i++) {
            String nombre = nombres[random.nextInt(nombres.length)];
            int edad = random.nextInt(15) + 1; // Edad aleatoria entre 1 y 15 años
            T especie = (T) especies[random.nextInt(especies.length)];
            Mascota<T> mascota = new Mascota<>(nombre, edad, especie);
            agregarMascotas(mascota);
        }
    }


    public List<Mascota<T>> buscarEspecie(T especie) {
        List<Mascota<T>> mascotasEncontradas = new ArrayList<>();
        for (Mascota<T> mascota : registro) {
            if (mascota.getEspecie().equals(especie)) {
                mascotasEncontradas.add(mascota);
            }
        }
        return mascotasEncontradas;
    }






    // Atributo
    private List<Mascota<T>> registro;

}
