package sample;
import com.goit.sample.DateSorter;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Collection;

public class DateSorterTest {
    @Test
    public void testSortDates() {
        DateSorter dateSorter = new DateSorter();

        List<LocalDate> unsortedDates = new ArrayList<>();
        unsortedDates.add(LocalDate.of(2004, 7, 1));
        unsortedDates.add(LocalDate.of(2005, 1, 2));
        unsortedDates.add(LocalDate.of(2007, 1, 1));
        unsortedDates.add(LocalDate.of(2032, 5, 3));

        Collection<LocalDate> sortedDates = dateSorter.sortDates(unsortedDates);

        List<LocalDate> expectedDates = new ArrayList<>();
        expectedDates.add(LocalDate.of(2005, 1, 2));
        expectedDates.add(LocalDate.of(2007, 1, 1));
        expectedDates.add(LocalDate.of(2032, 5, 3));
        expectedDates.add(LocalDate.of(2004, 7, 1));

        assertEquals(expectedDates, new ArrayList<>(sortedDates));
    }
}