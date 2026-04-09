import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    @Test
    void testSort_BasicSorting() {
        int[] arr = {72, 56, 24, 70, 60};
        int[] expected = {24, 56, 60, 70, 72};

        TrainConsistManagementApp.PassengerBogieSorter.bubbleSort(arr);

        assertArrayEquals(expected, arr);
    }

    @Test
    void testSort_AlreadySortedArray() {
        int[] arr = {24, 56, 60, 70, 72};
        int[] expected = {24, 56, 60, 70, 72};

        TrainConsistManagementApp.PassengerBogieSorter.bubbleSort(arr);

        assertArrayEquals(expected, arr);
    }

    @Test
    void testSort_DuplicateValues() {
        int[] arr = {72, 56, 56, 24};
        int[] expected = {24, 56, 56, 72};

        TrainConsistManagementApp.PassengerBogieSorter.bubbleSort(arr);

        assertArrayEquals(expected, arr);
    }

    @Test
    void testSort_SingleElementArray() {
        int[] arr = {50};
        int[] expected = {50};

        TrainConsistManagementApp.PassengerBogieSorter.bubbleSort(arr);

        assertArrayEquals(expected, arr);
    }

    @Test
    void testSort_AllEqualValues() {
        int[] arr = {40, 40, 40};
        int[] expected = {40, 40, 40};

        TrainConsistManagementApp.PassengerBogieSorter.bubbleSort(arr);

        assertArrayEquals(expected, arr);
    }
}