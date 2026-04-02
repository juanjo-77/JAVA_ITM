import java.time.LocalDate;

public class Tarea {
    private String titulo;
    private String descripcion;
    private LocalDate fecha_entrega;
    private Prioridad prioridad;
    private String estado;

    public Tarea(String titulo, String descripcion, LocalDate fecha_entrega, Prioridad prioridad) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha_entrega = fecha_entrega;
        this.prioridad = prioridad;
        this.estado = "Pendiente";
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public LocalDate getFechaEntrega() { return fecha_entrega; }
    public void setFechaEntrega(LocalDate fecha_entrega) { this.fecha_entrega = fecha_entrega; }

    public Prioridad getPrioridad() { return prioridad; }
    public void setPrioridad(Prioridad prioridad) { this.prioridad = prioridad; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public String toString() {
        return "Título: " + titulo +
               "\nDescripción: " + descripcion +
               "\nFecha de entrega: " + fecha_entrega +
               "\nPrioridad: " + prioridad.getNombre();
    }
}
