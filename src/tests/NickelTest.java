import java.util.Calendar;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

public class NickelTest {
    private static int currYear;
    private Nickel testNickel;

    @Test
    public void testNickelConstructors() {
        currYear = (Calendar.getInstance()).get(Calendar.YEAR);
        try {
            testNickel = new Nickel();
        }
        catch (Exception e) {
            fail("Nickel() constructor caused exception: "+e.getMessage());
        }
        try {
            testNickel = new Nickel(currYear);
        }
        catch (Exception e) {
            fail("Nickel() constructor caused exception: "+e.getMessage());
        }
        assertTrue(true);
    }
}
