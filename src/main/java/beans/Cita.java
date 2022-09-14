
package beans;

import java.sql.Date;

public class Cita {
    
    private int id_cita;
    private int cedula_paciente;
    private int cedula_medico;
    private Date fecha_cita;
    private boolean asistencia;
    private String observaciones;
    private boolean reprogramada;
    private boolean pago_cuota;

    public Cita(int id_cita, int cedula_paciente, int cedula_medico, Date fecha_cita, boolean asistencia, String observaciones, boolean reprogramada, boolean pago_cuota) {
        this.id_cita = id_cita;
        this.cedula_paciente = cedula_paciente;
        this.cedula_medico = cedula_medico;
        this.fecha_cita = fecha_cita;
        this.asistencia = asistencia;
        this.observaciones = observaciones;
        this.reprogramada = reprogramada;
        this.pago_cuota = pago_cuota;
    }

    public int getId_cita() {
        return id_cita;
    }

    public void setId_cita(int id_cita) {
        this.id_cita = id_cita;
    }

    public int getCedula_paciente() {
        return cedula_paciente;
    }

    public void setCedula_paciente(int cedula_paciente) {
        this.cedula_paciente = cedula_paciente;
    }

    public int getCedula_medico() {
        return cedula_medico;
    }

    public void setCedula_medico(int cedula_medico) {
        this.cedula_medico = cedula_medico;
    }

    public Date getFecha_cita() {
        return fecha_cita;
    }

    public void setFecha_cita(Date fecha_cita) {
        this.fecha_cita = fecha_cita;
    }

    public boolean isAsistencia() {
        return asistencia;
    }

    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public boolean isReprogramada() {
        return reprogramada;
    }

    public void setReprogramada(boolean reprogramada) {
        this.reprogramada = reprogramada;
    }

    public boolean isPago_cuota() {
        return pago_cuota;
    }

    public void setPago_cuota(boolean pago_cuota) {
        this.pago_cuota = pago_cuota;
    }

    @Override
    public String toString() {
        return "Cita{" + "id_cita=" + id_cita + ", cedula_paciente=" + cedula_paciente + ", cedula_medico=" + cedula_medico + ", fecha_cita=" + fecha_cita + ", asistencia=" + asistencia + ", observaciones=" + observaciones + ", reprogramada=" + reprogramada + ", pago_cuota=" + pago_cuota + '}';
    }    
}
