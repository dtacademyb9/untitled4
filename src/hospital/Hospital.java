package hospital;

import java.util.*;

public class Hospital {

    private Set<Doctor> doctors = new HashSet<>();
    private Set<Patient> patients = new HashSet<>();
    private List<Appointment> appointments = new ArrayList<>();
    private Queue<Patient> emergencyQueue = new LinkedList<>();
    private Stack<String> roomStack = new Stack<>();
    private Map<String, String> roomAllocationMap = new HashMap<>();

    public Hospital() {
        // Initialize roomStack with some room numbers for the sake of the example
        for (int i = 1; i <= 10; i++) {
            roomStack.push("Room " + i);
        }
    }

    public void addDoctor(Doctor doctor) {

        doctors.add(doctor);
        System.out.println("Doctor added successfully.");
    }

    public void addPatient(Patient patient) {

        patients.add(patient);
        System.out.println("Patient added successfully.");
    }

    public void scheduleAppointment(Appointment appointment) {
//        if (appointment == null || !doctors.contains(appointment.getDoctor()) || !patients.contains(appointment.getPatient())) {
//            System.out.println("Invalid appointment details");
//            return;
//        }
        appointments.add(appointment);
        System.out.println("Appointment scheduled successfully.");
    }

    public void attendEmergency(Patient patient) {
//        if (patient == null || !patients.contains(patient)) {
//            System.out.println("Invalid patient details");
//            return;
//        }
        emergencyQueue.add(patient);
        System.out.println("Patient added to emergency queue.");
    }

    public void allocateRoom(Patient patient) {
//        if (patient == null || !patients.contains(patient) || roomAllocationMap.containsKey(patient.getId())) {
//            System.out.println("Invalid patient details or patient already allocated a room");
//            return;
//        }
        if (roomStack.isEmpty()) {
            System.out.println("No rooms available");
            return;
        }
        String room = roomStack.pop();
        roomAllocationMap.put(patient.getId(), room);
        System.out.println("Room allocated successfully to patient ID: " + patient.getId());
    }

    public void releaseRoom(String patientId) {
//        if (patientId == null || !roomAllocationMap.containsKey(patientId)) {
//            System.out.println("Invalid patient ID or room not allocated to this patient");
//            return;
//        }
        String room = roomAllocationMap.remove(patientId);
        roomStack.push(room);
        System.out.println("Room released successfully.");
    }

    public void viewDoctors() {
//        if (doctors.isEmpty()) {
//            System.out.println("No doctors available");
//            return;
//        }
        doctors.forEach(System.out::println);
    }

    public void viewPatients() {
//        if (patients.isEmpty()) {
//            System.out.println("No patients available");
//            return;
//        }
        patients.forEach(System.out::println);
    }

    public void viewAppointments() {
//        if (appointments.isEmpty()) {
//            System.out.println("No appointments scheduled");
//            return;
//        }
        appointments.forEach(System.out::println);
    }

    public void viewEmergencyQueue() {
//        if (emergencyQueue.isEmpty()) {
//            System.out.println("No patients in the emergency queue");
//            return;
//        }
        emergencyQueue.forEach(System.out::println);
    }

    public void viewRoomAllocations() {
//        if (roomAllocationMap.isEmpty()) {
//            System.out.println("No rooms allocated");
//            return;
//        }
        roomAllocationMap.forEach((patientId, room) ->
                System.out.println("Patient ID: " + patientId + ", Room: " + room)
        );
    }
}
