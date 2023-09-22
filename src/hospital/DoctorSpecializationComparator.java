package hospital;

import java.util.Comparator;

public class DoctorSpecializationComparator implements Comparator<Doctor> {
    @Override
    public int compare(Doctor d1, Doctor d2) {
        return d1.getSpecialization().compareTo(d2.getSpecialization());
    }
}
