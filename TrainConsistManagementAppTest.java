import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.*;

import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    // Helper method
    private int calculateTotalSeats(List<Bogie> list) {
        return list.stream()
                .map(b -> b.getCapacity())
                .reduce(0, Integer::sum);
    }

    @Test
    void testReduce_TotalSeatCalculation() {
        List<Bogie> list = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56)
        );

        int result = calculateTotalSeats(list);

        assertEquals(128, result);
    }

    @Test
    void testReduce_MultipleBogiesAggregation() {
        List<Bogie> list = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("First Class", 24)
        );

        int result = calculateTotalSeats(list);

        assertEquals(152, result);
    }

    @Test
    void testReduce_SingleBogieCapacity() {
        List<Bogie> list = Arrays.asList(
                new Bogie("Sleeper", 72)
        );

        int result = calculateTotalSeats(list);

        assertEquals(72, result);
    }

    @Test
    void testReduce_EmptyBogieList() {
        List<Bogie> list = new ArrayList<>();

        int result = calculateTotalSeats(list);

        assertEquals(0, result);
    }

    @Test
    void testReduce_CorrectCapacityExtraction() {
        List<Bogie> list = Arrays.asList(
                new Bogie("Sleeper", 70),
                new Bogie("AC Chair", 30)
        );

        int result = calculateTotalSeats(list);

        assertEquals(100, result);
    }

    @Test
    void testReduce_AllBogiesIncluded() {
        List<Bogie> list = Arrays.asList(
                new Bogie("A", 10),
                new Bogie("B", 20),
                new Bogie("C", 30)
        );

        int result = calculateTotalSeats(list);

        assertEquals(60, result);
    }

    @Test
    void testReduce_OriginalListUnchanged() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 72));

        int sizeBefore = list.size();

        calculateTotalSeats(list);

        assertEquals(sizeBefore, list.size());
    }
}