import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia del sistema de tareas
        SistemaTareas sistema = new SistemaTareas();
        
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Mostrar un menú interactivo
        int opcion;
        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Eliminar tarea");
            System.out.println("3. Mostrar todas las tareas");
            System.out.println("4. Completar tarea");
            System.out.println("5. Buscar tarea por título");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            
            opcion = scanner.nextInt();  // Leer la opción seleccionada por el usuario
            scanner.nextLine(); // Consumir el salto de línea pendiente

            switch (opcion) {
                case 1:
                    // Agregar una nueva tarea
                    System.out.print("Ingresa el título de la tarea: ");
                    String tituloAgregar = scanner.nextLine();
                    System.out.print("Ingresa la prioridad (ALTA, MEDIA, BAJA): ");
                    String prioridadAgregar = scanner.nextLine().toUpperCase();
                    Prioridad prioridad = Prioridad.valueOf(prioridadAgregar);
                    sistema.agregarTarea(tituloAgregar, prioridad);
                    System.out.println("Tarea agregada con éxito.");
                    break;

                case 2:
                    // Eliminar una tarea
                    System.out.print("Ingresa el título de la tarea a eliminar: ");
                    String tituloEliminar = scanner.nextLine();
                    sistema.eliminarTarea(tituloEliminar);
                    System.out.println("Tarea eliminada (si existía).");
                    break;

                case 3:
                    // Mostrar todas las tareas
                    System.out.println("\nLista de tareas:");
                    sistema.mostrarTareas();
                    break;

                case 4:
                    // Completar una tarea
                    System.out.print("Ingresa el título de la tarea a completar: ");
                    String tituloCompletar = scanner.nextLine();
                    sistema.completarTarea(tituloCompletar);
                    System.out.println("Tarea completada (si existía).");
                    break;

                case 5:
                    // Buscar una tarea
                    System.out.print("Ingresa el título de la tarea a buscar: ");
                    String tituloBuscar = scanner.nextLine();
                    Tarea tareaEncontrada = sistema.buscarTarea(tituloBuscar);
                    if (tareaEncontrada != null) {
                        System.out.println("Tarea encontrada: " + tareaEncontrada);
                    } else {
                        System.out.println("Tarea no encontrada.");
                    }
                    break;

                case 6:
                    // Salir del programa
                    System.out.println("¡Adiós!");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 6);  // El programa sigue hasta que el usuario elige salir

        scanner.close();  // Cerrar el scanner
    }
}