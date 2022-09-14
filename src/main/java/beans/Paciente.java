package beans;
public class Paciente {
    private int cedula_paciente;
    private String contrasena;
    private String nombre;
    private String apellido;
    private int edad;
    private String genero;
    private String correo;
    private String regimen;

    public Paciente(int cedula_paciente, String contrasena, String nombre, String apellido, int edad, String genero, String correo, String regimen) {
        this.cedula_paciente = cedula_paciente;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.correo = correo;
        this.regimen = regimen;
    }

    public int getCedula_paciente() {
        return cedula_paciente;
    }

    public void setCedula_paciente(int cedula_paciente) {
        this.cedula_paciente = cedula_paciente;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRegimen() {
        return regimen;
    }

    public void setRegimen(String regimen) {
        this.regimen = regimen;
    }

    @Override
    public String toString() {
        return "Paciente{" + "cedula_paciente=" + cedula_paciente + ", contrasena=" + contrasena + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", genero=" + genero + ", correo=" + correo + ", regimen=" + regimen + '}';
    }
    
    
    
    
}
