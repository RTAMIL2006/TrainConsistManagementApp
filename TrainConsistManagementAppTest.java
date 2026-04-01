import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.*;

import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    private List<Bogie> createSampleData() {
        return Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("First Class", 24)
        );
    }

    @Test
    void testLoopFilteringLogic() {
        List<Bogie> list = createSampleData();

        List<Bogie> result = new ArrayList<>();
        for (Bogie b : list) {
            if (b.getCapacity() > 60) {
                result.add(b);
            }
        }

        assertEquals(1, result.size());
    }

    @Test
    void testStreamFilteringLogic() {
        List<Bogie> list = createSampleData();

        List<Bogie> result = list.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        assertEquals(1, result.size());
    }

    @Test
    void testLoopAndStreamResultsMatch() {
        List<Bogie> list = createSampleData();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : list) {
            if (b.getCapacity() > 60) {
                loopResult.add(b);
            }
        }

        List<Bogie> streamResult = list.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        assertEquals(loopResult.size(), streamResult.size());
    }

    @Test
    void testExecutionTimeMeasurement() {
        long start = System.nanoTime();
        long end = System.nanoTime();

        long elapsed = end - start;

        assertTrue(elapsed >= 0);
    }

    @Test
    void testLargeDatasetProcessing() {
        List<Bogie> list = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            list.add(new Bogie("Sleeper", i % 100));
        }

        List<Bogie> result = list.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        assertNotNull(result);
    }
}