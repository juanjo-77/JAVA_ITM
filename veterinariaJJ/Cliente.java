package veterinariaJJ;

import java.util.Date;

public class Cliente extends Usuario {
    private String codigoCliente;
    private Date fechaNacimiento;
    private Mascota mascota;

    public Cliente(String nombre, String apellido, String tipoDocumento, String numDocumento,
                   int telefono, String correo, String direccion, Date fechaRegistro,
                   String codigoCliente, Date fechaNacimiento, Mascota mascota) {
        super(nombre, apellido, tipoDocumento, numDocumento, telefono, correo, direccion, fechaRegistro);
        this.codigoCliente = codigoCliente;
        this.fechaNacimiento = fechaNacimiento;
        this.mascota = mascota;
    }

    public String getCodigoCliente() { return codigoCliente; }
    public void setCodigoCliente(String codigoCliente) { this.codigoCliente = codigoCliente; }

    public Date getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(Date fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public Mascota getMascota() { return mascota; }
    public void setMascota(Mascota mascota) { this.mascota = mascota; }
}
