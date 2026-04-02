public class SistemaTareas {
    private Nodo cabeza; // 1. Declaración de la cabeza de la lista

    // 2. Constructor del SistemaTareas
    public SistemaTareas() {
        cabeza = null; // Inicializa la cabeza como null, es decir, la lista está vacía al principio.
    }

    // Método auxiliar para determinar si la tarea A va antes que la tarea B
    // Criterio 1: fecha de entrega (más próxima primero)
    // Criterio 2: si fechas iguales, mayor prioridad primero
    private boolean vaAntes(Tarea a, Tarea b) {
        if (a.getFechaEntrega().isBefore(b.getFechaEntrega())) {
            return true;
        } else if (a.getFechaEntrega().isEqual(b.getFechaEntrega())) {
            return a.getPrioridad().getValor() > b.getPrioridad().getValor();
        }
        return false;
    }

    // 3. Método para agregar una nueva tarea (ordenada por fecha y prioridad)
    public void agregar_tarea(Tarea tarea) {
        Nodo nuevoNodo = new Nodo(tarea);

        // Si la lista está vacía o la nueva tarea va antes que la cabeza
        if (cabeza == null || vaAntes(tarea, cabeza.tarea)) {
            nuevoNodo.siguiente = cabeza;
            cabeza = nuevoNodo;
        } else {
            // Recorre la lista para encontrar la posición correcta
            Nodo actual = cabeza;
            while (actual.siguiente != null && !vaAntes(tarea, actual.siguiente.tarea)) {
                actual = actual.siguiente;
            }
            nuevoNodo.siguiente = actual.siguiente;
            actual.siguiente = nuevoNodo;
        }
    }

    // 4. Método para eliminar una tarea dado su título — devuelve la tarea eliminada
    public Tarea eliminar_tarea(String titulo) {
        // Si la lista está vacía
        if (cabeza == null) {
            System.out.println("No se encontró la tarea.");
            return null;
        }

        // Si la tarea que se quiere eliminar es la cabeza
        if (cabeza.tarea.getTitulo().equalsIgnoreCase(titulo)) {
            Tarea eliminada = cabeza.tarea;
            cabeza = cabeza.siguiente;
            System.out.println("La tarea " + eliminada.getTitulo() + " ha sido eliminada correctamente.");
            return eliminada;
        }

        // Si la tarea no es la cabeza, recorre la lista buscando por título
        Nodo actual = cabeza;
        while (actual.siguiente != null) {
            if (actual.siguiente.tarea.getTitulo().equalsIgnoreCase(titulo)) {
                Tarea eliminada = actual.siguiente.tarea;
                actual.siguiente = actual.siguiente.siguiente;
                System.out.println("La tarea " + eliminada.getTitulo() + " ha sido eliminada correctamente.");
                return eliminada;
            }
            actual = actual.siguiente;
        }

        System.out.println("No se encontró la tarea.");
        return null;
    }

    // 5. Método para mostrar todas las tareas
    public void mostrar_tareas() {
        Nodo actual = cabeza;

        if (actual == null) {
            System.out.println("No hay tareas.");
            return;
        }

        while (actual != null) {
            System.out.println(actual.tarea);
            System.out.println("--------------------");
            actual = actual.siguiente;
        }
    }

    // 6. Método para buscar una tarea por título
    public Tarea buscar_tarea(String titulo) {
        Nodo actual = cabeza;

        while (actual != null) {
            if (actual.tarea.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println(actual.tarea);
                return actual.tarea;
            }
            actual = actual.siguiente;
        }

        System.out.println("La tarea no fue encontrada.");
        return null;
    }

    // 7. Método para marcar una tarea como completada y eliminarla
    // Reutiliza buscar_tarea y eliminar_tarea tal como recomienda el PDF
    public Tarea marcar_completa(String titulo) {
        Tarea tarea = buscar_tarea(titulo);
        if (tarea != null) {
            tarea.setEstado("Completa");
            eliminar_tarea(titulo);
        }
        return tarea;
    }
}
