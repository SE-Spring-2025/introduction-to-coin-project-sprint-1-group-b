import java.util.Calendar;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

public class QuarterTest {
    private static int currYear;
    private Quarter testQuarter;

    @Test
    public void testQuarterConstructors() {
        currYear = (Calendar.getInstance()).get(Calendar.YEAR);
        try {
            testQuarter = new Quarter();
        }
        catch (Exception e) {
            fail("Quarter() constructor caused exception: "+e.getMessage());
        }
        try {
            testQuarter = new Quarter(currYear);
        }
        catch (Exception e) {
            fail("Quarter() constructor caused exception: "+e.getMessage());
        }
        assertTrue(true);
    }
}
