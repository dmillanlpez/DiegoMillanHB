public class Main {
    public static void main(String[] args) {

        /*Desarrolla una aplicación para organizar tareas en un proyecto. Utiliza la recursividad para crear una estructura jerárquica
        de tareas. Cada tarea puede tener subtareas asociadas, y estas subtareas también pueden tener sus propias subtareas, creando
        así una estructura de "árbol de tareas".

        El programa debe permitir al usuario agregar tareas principales y subtareas de manera recursiva. Además, debe ofrecer la capacidad
        de visualizar la estructura completa de tareas con sus respectivas subtareas.
         */

        TareaApp manager = new TareaApp();

        Tarea desarrollo = new Tarea("Desarrollo de la Aplicacion");
        desarrollo.addSubtarea(new Tarea("Creacion de Diagramas"));
        desarrollo.addSubtarea(new Tarea("Desarrollo del Prototipo"));

        Tarea implementaciones = new Tarea("Creacion del Código");
        implementaciones.addSubtarea(new Tarea("Desarrollo del Front-End"));
        implementaciones.addSubtarea(new Tarea("Desarrollo del Back-End"));

        Tarea pruebas = new Tarea("Pruebas y Depuracion");
        pruebas.addSubtarea(new Tarea("Ejecucion de Pruebas Unitarias"));
        pruebas.addSubtarea(new Tarea("Correccion de Errores"));

        Tarea despliegue = new Tarea("Despliegue y Mantenimiento");
        despliegue.addSubtarea(new Tarea("Configuracion de Servidores"));
        despliegue.addSubtarea(new Tarea("Monitoreo Post-Lanzamiento"));

        // Agregando las diversas tareas al manager
        manager.anadirTarea(desarrollo);
        manager.anadirTarea(implementaciones);
        manager.anadirTarea(pruebas);
        manager.anadirTarea(despliegue);

        // Mostrar las tareas
        manager.displayTareas();

    }
}