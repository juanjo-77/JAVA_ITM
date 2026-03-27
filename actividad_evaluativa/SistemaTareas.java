public class SistemaTareas {
    private Nodo cabeza;  // 1. Declaración de la cabeza de la lista

    // 2. Constructor del SistemaTareas
    public SistemaTareas() {
        cabeza = null; // Inicializa la cabeza como null, es decir, la lista está vacía al principio.
    }

    // 3. Método para agregar una nueva tarea
    public void agregarTarea(String titulo, Prioridad prioridad) {
        // Crea una nueva tarea con el título y prioridad dados
        Tarea nuevaTarea = new Tarea(titulo, prioridad);
        // Crea un nuevo nodo que contiene la tarea creada
        Nodo nuevoNodo = new Nodo(nuevaTarea);

        // Si la lista está vacía, el nuevo nodo se convierte en la cabeza de la lista
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            // Si no está vacía, recorre la lista hasta el último nodo
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente; // Se mueve al siguiente nodo
            }
            // Enlaza el último nodo con el nuevo nodo
            actual.siguiente = nuevoNodo;
        }
    }

    // 4. Método para eliminar una tarea dada su título
    public void eliminarTarea(String titulo) {
        // Si la lista está vacía, no hace nada
        if (cabeza == null) return;

        // Si la tarea que se quiere eliminar es la cabeza, la cabeza se mueve al siguiente nodo
        if (cabeza.tarea.titulo.equalsIgnoreCase(titulo)) {
            cabeza = cabeza.siguiente; // Se actualiza la cabeza para eliminar la tarea
            return;
        }

        // Si la tarea no es la cabeza, recorre la lista buscando la tarea por su título
        Nodo actual = cabeza;
        while (actual.siguiente != null) {
            // Si encuentra el título, elimina el nodo correspondiente
            if (actual.siguiente.tarea.titulo.equalsIgnoreCase(titulo)) {
                actual.siguiente = actual.siguiente.siguiente; // Elimina el nodo de la lista
                return;
            }
            actual = actual.siguiente; // Se mueve al siguiente nodo
        }
    }

    // 5. Método para mostrar todas las tareas
    public void mostrarTareas() {
        Nodo actual = cabeza;

        // Si la lista está vacía, muestra un mensaje
        if (actual == null) {
            System.out.println("No hay tareas.");
            return;
        }

        // Recorre la lista y muestra cada tarea
        while (actual != null) {
            System.out.println(actual.tarea); // Muestra la tarea que está en el nodo actual
            actual = actual.siguiente; // Se mueve al siguiente nodo
        }
        

    }

    // 6. Método para marcar una tarea como completada y eliminarla
    public void completarTarea(String titulo) {
        // Si la lista está vacía, no hace nada
        if (cabeza == null) return;

        // Si la tarea que se quiere completar es la cabeza, marca como completada y mueve la cabeza al siguiente nodo
        if (cabeza.tarea.titulo.equalsIgnoreCase(titulo)) {
            cabeza.tarea.completada = true; // Marca la tarea como completada
            cabeza = cabeza.siguiente; // Elimina la tarea (al mover la cabeza)
            return;
        }

        // Si la tarea no es la cabeza, recorre la lista buscando la tarea por su título
        Nodo actual = cabeza;
        while (actual.siguiente != null) {
            // Si encuentra la tarea por su título, la marca como completada y elimina el nodo
            if (actual.siguiente.tarea.titulo.equalsIgnoreCase(titulo)) {
                actual.siguiente.tarea.completada = true; // Marca la tarea como completada
                actual.siguiente = actual.siguiente.siguiente; // Elimina el nodo de la lista
                return;
            }
            actual = actual.siguiente; // Se mueve al siguiente nodo
        }
    }

    // 7. Método para buscar una tarea por su título
    public Tarea buscarTarea(String titulo) {
        Nodo actual = cabeza;

        // Recorre la lista buscando la tarea
        while (actual != null) {
            // Si encuentra la tarea por su título, la devuelve
            if (actual.tarea.titulo.equalsIgnoreCase(titulo)) {
                return actual.tarea;
            }
            actual = actual.siguiente; // Se mueve al siguiente nodo
        }

        // Si no encuentra la tarea, devuelve null
        return null;
    }
}