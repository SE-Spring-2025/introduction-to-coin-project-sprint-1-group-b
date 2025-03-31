import java.util.Calendar;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

public class HalfDollarTest {
    private static int currYear;
    private HalfDollar testHalfDollar;

    @Test
    public void testHalfDollarConstructors() {
        currYear = (Calendar.getInstance()).get(Calendar.YEAR);
        try {
            testHalfDollar = new HalfDollar();
        }
        catch (Exception e) {
            fail("HalfDollar() constructor caused exception: "+e.getMessage());
        }
        try {
            testHalfDollar = new HalfDollar(currYear);
        }
        catch (Exception e) {
            fail("HalfDollar() constructor caused exception: "+e.getMessage());
        }
        assertTrue(true);
    }
}
