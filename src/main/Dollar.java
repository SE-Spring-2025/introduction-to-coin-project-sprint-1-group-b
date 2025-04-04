import java.util.Calendar;

public class Dollar extends Coin {

    public Dollar() {
        this(Calendar.getInstance().get(Calendar.YEAR));
    }
    
    public Dollar(int year) {
        super(DOLLAR_VALUE, year);
    }
}
