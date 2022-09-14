package beans;
public class Medico {
    private int cedula_medico;
    private String contrasena;
    private String nombre;
    private String apellido;
    private String correo;
    private String especialidad;
    private boolean disponibilidad;

    public Medico(int cedula_medico, String contrasena, String nombre, String apellido, String correo, String especialidad, boolean disponibilidad) {
        this.cedula_medico = cedula_medico;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.especialidad = especialidad;
        this.disponibilidad = disponibilidad;
    }

    public int getCedula_medico() {
        return cedula_medico;
    }

    public void setCedula_medico(int cedula_medico) {
        this.cedula_medico = cedula_medico;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "Medico{" + "cedula_medico=" + cedula_medico + ", contrasena=" + contrasena + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", especialidad=" + especialidad + ", disponibilidad=" + disponibilidad + '}';
    }
    
    
    
}
