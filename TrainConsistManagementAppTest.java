import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    @Test
    void testException_ValidCapacityCreation() {
        assertDoesNotThrow(() -> {
            new PassengerBogie("Sleeper", 72);
        });
    }

    @Test
    void testException_NegativeCapacityThrowsException() {
        Exception ex = assertThrows(InvalidCapacityException.class, () -> {
            new PassengerBogie("Sleeper", -10);
        });

        assertEquals("Capacity must be greater than zero", ex.getMessage());
    }

    @Test
    void testException_ZeroCapacityThrowsException() {
        Exception ex = assertThrows(InvalidCapacityException.class, () -> {
            new PassengerBogie("AC Chair", 0);
        });

        assertEquals("Capacity must be greater than zero", ex.getMessage());
    }

    @Test
    void testException_ExceptionMessageValidation() {
        Exception ex = assertThrows(InvalidCapacityException.class, () -> {
            new PassengerBogie("First Class", 0);
        });

        assertEquals("Capacity must be greater than zero", ex.getMessage());
    }

    @Test
    void testException_ObjectIntegrityAfterCreation() throws Exception {
        PassengerBogie b = new PassengerBogie("Sleeper", 72);

        assertEquals("Sleeper", b.getName());
        assertEquals(72, b.getCapacity());
    }

    @Test
    void testException_MultipleValidBogiesCreation() {
        assertDoesNotThrow(() -> {
            new PassengerBogie("Sleeper", 72);
            new PassengerBogie("AC Chair", 56);
            new PassengerBogie("First Class", 24);
        });
    }
}