package veterinariaJJ;

import java.util.Date;

public class Consulta {
    private Date fecha;
    private String tratamiento;
    private float costo;
    private String diagnostico;
    private Mascota mascota;
    private Veterinario veterinario;

    public Consulta(Date fecha, String tratamiento, float costo, String diagnostico,
                    Mascota mascota, Veterinario veterinario) {
        this.fecha = fecha;
        this.tratamiento = tratamiento;
        this.costo = costo;
        this.diagnostico = diagnostico;
        this.mascota = mascota;
        this.veterinario = veterinario;
    }

    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }

    public String getTratamiento() { return tratamiento; }
    public void setTratamiento(String tratamiento) { this.tratamiento = tratamiento; }

    public float getCosto() { return costo; }
    public void setCosto(float costo) { this.costo = costo; }

    public String getDiagnostico() { return diagnostico; }
    public void setDiagnostico(String diagnostico) { this.diagnostico = diagnostico; }

    public Mascota getMascota() { return mascota; }
    public void setMascota(Mascota mascota) { this.mascota = mascota; }

    public Veterinario getVeterinario() { return veterinario; }
    public void setVeterinario(Veterinario veterinario) { this.veterinario = veterinario; }
}
