package veterinariaJJ;

public class Veterinario extends Usuario {
    private String especialidad;
    private float salario;
    private int experiencia; // años

    public Veterinario(String nombre, String apellido, String tipoDocumento, String numDocumento,
                       int telefono, String correo, String direccion, java.util.Date fechaRegistro,
                       String especialidad, float salario, int experiencia) {
        super(nombre, apellido, tipoDocumento, numDocumento, telefono, correo, direccion, fechaRegistro);
        this.especialidad = especialidad;
        this.salario = salario;
        this.experiencia = experiencia;
    }

    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }

    public float getSalario() { return salario; }
    public void setSalario(float salario) { this.salario = salario; }

    public int getExperiencia() { return experiencia; }
    public void setExperiencia(int experiencia) { this.experiencia = experiencia; }
}
