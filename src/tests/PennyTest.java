import java.util.Calendar;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

public class PennyTest {
    private static int currYear;
    private Penny testPenny;

    @Test
    public void testPennyConstructors() {
        currYear = (Calendar.getInstance()).get(Calendar.YEAR);
        try {
            testPenny = new Penny();
        }
        catch (Exception e) {
            fail("Penny() constructor caused exception: "+e.getMessage());
        }
        try {
            testPenny = new Penny(currYear);
        }
        catch (Exception e) {
            fail("Penny() constructor caused exception: "+e.getMessage());
        }
        assertTrue(true);
    }
}
