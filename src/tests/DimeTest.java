import java.util.Calendar;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

public class DimeTest {
    private static int currYear;
    private Dime testDime;

    @Test
    public void testDimeConstructors() {
        currYear = (Calendar.getInstance()).get(Calendar.YEAR);
        try {
            testDime = new Dime();
        }
        catch (Exception e) {
            fail("Dime() constructor caused exception: "+e.getMessage());
        }
        try {
            testDime = new Dime(currYear);
        }
        catch (Exception e) {
            fail("Dime() constructor caused exception: "+e.getMessage());
        }
        assertTrue(true);
    }
}
