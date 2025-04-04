import java.util.Calendar;

public class Quarter extends Coin {
    
    public Quarter() {
        this(Calendar.getInstance().get(Calendar.YEAR));
    }
    
    public Quarter(int year) {
        super(QUARTER_VALUE, year);
    }
}
