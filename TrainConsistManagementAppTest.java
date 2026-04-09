import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    @Test
    void testBinarySearch_BogieFound() {
        String[] arr = {"BG101","BG205","BG309","BG412","BG550"};
        assertTrue(TrainConsistManagementApp.BogieSearch.binarySearch(arr, "BG309"));
    }

    @Test
    void testBinarySearch_BogieNotFound() {
        String[] arr = {"BG101","BG205","BG309","BG412","BG550"};
        assertFalse(TrainConsistManagementApp.BogieSearch.binarySearch(arr, "BG999"));
    }

    @Test
    void testBinarySearch_FirstElementMatch() {
        String[] arr = {"BG101","BG205","BG309","BG412","BG550"};
        assertTrue(TrainConsistManagementApp.BogieSearch.binarySearch(arr, "BG101"));
    }

    @Test
    void testBinarySearch_LastElementMatch() {
        String[] arr = {"BG101","BG205","BG309","BG412","BG550"};
        assertTrue(TrainConsistManagementApp.BogieSearch.binarySearch(arr, "BG550"));
    }

    @Test
    void testBinarySearch_SingleElementArray() {
        String[] arr = {"BG101"};
        assertTrue(TrainConsistManagementApp.BogieSearch.binarySearch(arr, "BG101"));
    }

    @Test
    void testBinarySearch_EmptyArray() {
        String[] arr = {};
        assertFalse(TrainConsistManagementApp.BogieSearch.binarySearch(arr, "BG101"));
    }

    @Test
    void testBinarySearch_UnsortedInputHandled() {
        String[] arr = {"BG309","BG101","BG550","BG205","BG412"};
        assertTrue(TrainConsistManagementApp.BogieSearch.binarySearch(arr, "BG205"));
    }
}