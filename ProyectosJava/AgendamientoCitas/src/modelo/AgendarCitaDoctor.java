package modelo;
import java.util.Date;

public class AgendarCitaDoctor implements IProgramarCita {
    private int id;
    private Paciente paciente;
    private Doctor doctor;
    private Date fecha;
    private String hora;

    public AgendarCitaDoctor(Paciente paciente, Doctor doctor){
        this.paciente = paciente;
        this.doctor = doctor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public void programarCita(Date fecha, String hora) {

    }
}
