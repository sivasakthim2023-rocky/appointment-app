import java.util.*;

public class AppointmentService {

    private Map<String, String> appointments = new HashMap<>();

    public boolean bookAppointment(String timeSlot, String user) {

        if (!isValidTime(timeSlot)) {
            throw new IllegalArgumentException("Invalid time slot");
        }

        if (appointments.containsKey(timeSlot)) {
            return false; // prevent double booking
        }

        appointments.put(timeSlot, user);
        return true;
    }

    private boolean isValidTime(String time) {
        try {
            int hour = Integer.parseInt(time.split(":")[0]);
            return hour >= 9 && hour <= 17;
        } catch (Exception e) {
            return false;
        }
    }

    // ✅ ADD THIS MAIN METHOD
    public static void main(String[] args) throws Exception {
    System.out.println("Appointment App Running...");

    while (true) {
        Thread.sleep(10000); // keep running
    }
}
}