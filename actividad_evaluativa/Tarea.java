public class Tarea {
    String titulo;
    Prioridad prioridad;
    boolean completada;

    public Tarea(String titulo, Prioridad prioridad){
        this.titulo = titulo;
        this.prioridad = prioridad;
        this.completada = false;
    }
    
        @Override
        public String toString() {
            return "Tarea [Título: " + titulo + ", Prioridad: " + prioridad + ", Completada: " + completada + "]";
        }

}
