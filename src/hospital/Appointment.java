package hospital;

import java.time.LocalTime;

public class Appointment {
    private Patient patient;
    private Doctor doctor;
    private LocalTime appointmentTime;

    public Appointment(Patient patient, Doctor doctor, LocalTime appointmentTime) {
        this.patient = patient;
        this.doctor = doctor;
        this.appointmentTime = appointmentTime;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public LocalTime getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(LocalTime appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "patient=" + patient +
                ", doctor=" + doctor +
                ", appointmentTime=" + appointmentTime +
                '}';
    }
}
