import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppointmentServiceTest {

    AppointmentService service = new AppointmentService();

    @Test
    void testDoubleBooking() {
        boolean first = service.bookAppointment("10:00", "User1");
        boolean second = service.bookAppointment("10:00", "User2");

        assertTrue(first);
        assertFalse(second);
    }

    @Test
    void testInvalidTimeSlot() {
        assertThrows(IllegalArgumentException.class, () -> {
            service.bookAppointment("25:00", "User");
        });
    }
}