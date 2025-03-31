import java.util.Calendar;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

public class DollarTest {
    private static int currYear;
    private Dollar testDollar;

    @Test
    public void testDollarConstructors() {
        currYear = (Calendar.getInstance()).get(Calendar.YEAR);
        try {
            testDollar = new Dollar();
        }
        catch (Exception e) {
            fail("Dollar() constructor caused exception: "+e.getMessage());
        }
        try {
            testDollar = new Dollar(currYear);
        }
        catch (Exception e) {
            fail("Dollar() constructor caused exception: "+e.getMessage());
        }
        assertTrue(true);
    }
}
