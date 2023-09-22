package hospital;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        // Creating a hospital
        Hospital hospital = new Hospital();

        // Creating and adding doctors
        Doctor doctor1 = new Doctor("D1", "Dr. Smith", "Cardiology");
        Doctor doctor2 = new Doctor("D2", "Dr. Johnson", "Neurology");
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);

        // Viewing the list of doctors
        System.out.println("List of Doctors:");
        hospital.viewDoctors();

        // Creating and adding patients
        Patient patient1 = new Patient("P1", "John Doe", "Heart Issues");
        Patient patient2 = new Patient("P2", "Jane Doe", "Migraine");
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Viewing the list of patients
        System.out.println("\nList of Patients:");
        hospital.viewPatients();

        // Scheduling appointments
        Appointment appointment1 = new Appointment(patient1, doctor1, LocalTime.of(10,0));
        Appointment appointment2 = new Appointment(patient2, doctor2, LocalTime.of(11,0));
        hospital.scheduleAppointment(appointment1);
        hospital.scheduleAppointment(appointment2);

        // Viewing the list of appointments
        System.out.println("\nList of Appointments:");
        hospital.viewAppointments();

        // Attending to emergency
        hospital.attendEmergency(patient1);
        hospital.attendEmergency(patient2);

        // Viewing the emergency queue
        System.out.println("\nEmergency Queue:");
        hospital.viewEmergencyQueue();

        // Allocating and releasing rooms
        hospital.allocateRoom(patient1);
        hospital.allocateRoom(patient2);

        // Viewing the room allocations
        System.out.println("\nRoom Allocations:");
        hospital.viewRoomAllocations();

        // Releasing rooms
        hospital.releaseRoom(patient1.getId());
        hospital.releaseRoom(patient2.getId());

        // Viewing the room allocations after releasing rooms
        System.out.println("\nRoom Allocations after releasing rooms:");
        hospital.viewRoomAllocations();
    }
}
