import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    @Test
    void testSearch_ThrowsExceptionWhenEmpty() {
        String[] arr = {};
        assertThrows(IllegalStateException.class, () ->
                TrainConsistManagementApp.BogieSearch.linearSearch(arr, "BG101"));
    }

    @Test
    void testSearch_AllowsSearchWhenDataExists() {
        String[] arr = {"BG101","BG205"};
        assertDoesNotThrow(() ->
                TrainConsistManagementApp.BogieSearch.linearSearch(arr, "BG101"));
    }

    @Test
    void testSearch_BogieFoundAfterValidation() {
        String[] arr = {"BG101","BG205","BG309"};
        assertTrue(TrainConsistManagementApp.BogieSearch.linearSearch(arr, "BG205"));
    }

    @Test
    void testSearch_BogieNotFoundAfterValidation() {
        String[] arr = {"BG101","BG205","BG309"};
        assertFalse(TrainConsistManagementApp.BogieSearch.linearSearch(arr, "BG999"));
    }

    @Test
    void testSearch_SingleElementValidCase() {
        String[] arr = {"BG101"};
        assertTrue(TrainConsistManagementApp.BogieSearch.linearSearch(arr, "BG101"));
    }
}