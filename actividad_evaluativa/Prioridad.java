public class Prioridad {
    private String nombre;
    private int valor;

    public Prioridad(String nombre, int valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    // Prioridades predefinidas (equivalente a los objetos del PDF)
    public static final Prioridad URGENTE = new Prioridad("Urgente", 4);
    public static final Prioridad ALTA    = new Prioridad("Alta", 3);
    public static final Prioridad MEDIA   = new Prioridad("Media", 2);
    public static final Prioridad BAJA    = new Prioridad("Baja", 1);
}
