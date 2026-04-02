import java.util.Scanner;
import java.time.LocalDate;

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

            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea pendiente

            switch (opcion) {
                case 1:
                    // Agregar una nueva tarea
                    System.out.print("Ingresa el título de la tarea: ");
                    String tituloAgregar = scanner.nextLine();

                    System.out.print("Ingresa la descripción: ");
                    String descripcion = scanner.nextLine();

                    System.out.print("Ingresa la fecha de entrega (YYYY-MM-DD): ");
                    String fechaStr = scanner.nextLine();
                    LocalDate fecha = LocalDate.parse(fechaStr);

                    System.out.println("Ingresa la prioridad:");
                    System.out.println("  1. Urgente");
                    System.out.println("  2. Alta");
                    System.out.println("  3. Media");
                    System.out.println("  4. Baja");
                    System.out.print("Opción: ");
                    int opPrioridad = scanner.nextInt();
                    scanner.nextLine();

                    Prioridad prioridad;
                    switch (opPrioridad) {
                        case 1: prioridad = Prioridad.URGENTE; break;
                        case 2: prioridad = Prioridad.ALTA;    break;
                        case 3: prioridad = Prioridad.MEDIA;   break;
                        case 4: prioridad = Prioridad.BAJA;    break;
                        default:
                            System.out.println("Prioridad no válida. Se asignará BAJA.");
                            prioridad = Prioridad.BAJA;
                    }

                    Tarea nuevaTarea = new Tarea(tituloAgregar, descripcion, fecha, prioridad);
                    sistema.agregar_tarea(nuevaTarea);
                    System.out.println("Tarea agregada con éxito.");
                    break;

                case 2:
                    // Eliminar una tarea
                    System.out.print("Ingresa el título de la tarea a eliminar: ");
                    String tituloEliminar = scanner.nextLine();
                    sistema.eliminar_tarea(tituloEliminar);
                    break;

                case 3:
                    // Mostrar todas las tareas
                    System.out.println("\nLista de tareas:");
                    sistema.mostrar_tareas();
                    break;

                case 4:
                    // Completar una tarea
                    System.out.print("Ingresa el título de la tarea a completar: ");
                    String tituloCompletar = scanner.nextLine();
                    sistema.marcar_completa(tituloCompletar);
                    break;

                case 5:
                    // Buscar una tarea
                    System.out.print("Ingresa el título de la tarea a buscar: ");
                    String tituloBuscar = scanner.nextLine();
                    sistema.buscar_tarea(tituloBuscar);
                    break;

                case 6:
                    System.out.println("¡Adiós!");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 6);

        scanner.close();
    }
}
